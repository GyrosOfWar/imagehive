import torch

from lapis_service import app

from flask import jsonify, request
from lavis.models import load_model_and_preprocess
from PIL import Image

device = torch.device("cuda" if torch.cuda.is_available() else "cpu")

@app.route("/caption", methods=["POST"])
def caption_image():
    file = request.files['image']
    rgb_image = Image.open(file.stream).convert("RGB")

    model, vis_processors, _ = load_model_and_preprocess(name="blip_caption", model_type="base_coco", is_eval=True, device=device)
    preprocessed_image = vis_processors["eval"](rgb_image).unsqueeze(0).to(device)
    generated_caption = model.generate({"image": preprocessed_image})

    return jsonify(caption=generated_caption)