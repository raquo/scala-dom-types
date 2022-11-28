package com.raquo.domtypes.old

import com.raquo.domtypes.old

package object defs {

  /** Use these types if you don't care to distinguish between dom.Element subclasses. */
  object sameRefTags {
    type DocumentTags[T[_ <: N], N] = old.defs.tags.DocumentTags[T, N, N, N, N, N, N, N, N]
    type GroupingTags[T[_ <: N], N] = old.defs.tags.GroupingTags[T, N, N, N, N, N, N, N, N, N, N, N]
    type TextTags[T[_ <: N], N] = old.defs.tags.TextTags[T, N, N, N, N, N, N]
    type FormTags[T[_ <: N], N] = old.defs.tags.FormTags[T, N, N, N, N, N, N, N, N, N, N, N, N]
    type SectionTags[T[_ <: N], N] = old.defs.tags.SectionTags[T, N, N, N, N]
    type EmbedTags[T[_ <: N], N] = old.defs.tags.EmbedTags[T, N, N, N, N, N, N, N, N, N, N, N, N, N]
    type TableTags[T[_ <: N], N] = old.defs.tags.TableTags[T, N, N, N, N, N, N, N]
    type MiscTags[T[_ <: N], N] = old.defs.tags.MiscTags[T, N, N, N, N, N, N, N]
  }
}
