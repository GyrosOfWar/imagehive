import type {CSSProperties} from "react"
import {Children} from "react"

export interface RenderProps {
  style: CSSProperties
  className?: string
}

export const defaultBreakpoints = {
  default: 4,
  1536: 4,
  1024: 2,
  640: 1,
}

type RenderColumnFn = (
  content: React.ReactNode[],
  props: RenderProps,
  idx: number
) => React.ReactNode

export interface Props {
  className?: string
  columnClassName?: string
  renderColumn?: RenderColumnFn
  columnCount: number
  testId: string
}

const Masonry: React.FC<React.PropsWithChildren<Props>> = ({
  className,
  columnClassName,
  children,
  renderColumn,
  columnCount,
  testId,
}) => {
  const columnItems = (): React.ReactNode[][] => {
    const cols: React.ReactNode[][] = new Array(columnCount)
    const items = Children.toArray(children)
    for (let i = 0; i < items.length; i++) {
      const columnIndex = i % columnCount
      if (!cols[columnIndex]) {
        cols[columnIndex] = []
      }

      cols[columnIndex].push(items[i])
    }

    return cols
  }

  const renderColumnDefault: RenderColumnFn = (content, props, idx) => (
    <div key={idx} {...props}>
      {content}
    </div>
  )

  const renderColumns = () => {
    const cols = columnItems()
    const columnWidth = `${100 / cols.length}%`
    const columnProps = {
      style: {
        width: columnWidth,
      },
      className: columnClassName,
    }

    return cols.map((content, i) =>
      renderColumn
        ? renderColumn(content, columnProps, i)
        : renderColumnDefault(content, columnProps, i)
    )
  }

  return (
    <div className={className} data-test-id={testId}>
      {renderColumns()}
    </div>
  )
}

export default Masonry
