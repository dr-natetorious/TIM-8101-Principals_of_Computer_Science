abstract class com.google.common.base.AbstractIterator<T> implements java.util.Iterator<T> {
  protected com.google.common.base.AbstractIterator();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #24                 // Field com/google/common/base/AbstractIterator$State.NOT_READY:Lcom/google/common/base/AbstractIterator$State;
       8: putfield      #26                 // Field state:Lcom/google/common/base/AbstractIterator$State;
      11: return

  protected abstract T computeNext();

  protected final T endOfData();
    Code:
       0: aload_0
       1: getstatic     #41                 // Field com/google/common/base/AbstractIterator$State.DONE:Lcom/google/common/base/AbstractIterator$State;
       4: putfield      #26                 // Field state:Lcom/google/common/base/AbstractIterator$State;
       7: aconst_null
       8: areturn

  public final boolean hasNext();
    Code:
       0: aload_0
       1: getfield      #26                 // Field state:Lcom/google/common/base/AbstractIterator$State;
       4: getstatic     #32                 // Field com/google/common/base/AbstractIterator$State.FAILED:Lcom/google/common/base/AbstractIterator$State;
       7: if_acmpeq     15
      10: iconst_1
      11: istore_1
      12: goto          17
      15: iconst_0
      16: istore_1
      17: iload_1
      18: invokestatic  #56                 // Method com/google/common/base/Preconditions.checkState:(Z)V
      21: getstatic     #60                 // Field com/google/common/base/AbstractIterator$1.$SwitchMap$com$google$common$base$AbstractIterator$State:[I
      24: aload_0
      25: getfield      #26                 // Field state:Lcom/google/common/base/AbstractIterator$State;
      28: invokevirtual #64                 // Method com/google/common/base/AbstractIterator$State.ordinal:()I
      31: iaload
      32: tableswitch   { // 1 to 2
                     1: 63
                     2: 61
               default: 56
          }
      56: aload_0
      57: invokespecial #66                 // Method tryToComputeNext:()Z
      60: ireturn
      61: iconst_0
      62: ireturn
      63: iconst_1
      64: ireturn

  public final T next();
    Code:
       0: aload_0
       1: invokevirtual #68                 // Method hasNext:()Z
       4: ifne          15
       7: new           #70                 // class java/util/NoSuchElementException
      10: dup
      11: invokespecial #71                 // Method java/util/NoSuchElementException."<init>":()V
      14: athrow
      15: aload_0
      16: getstatic     #24                 // Field com/google/common/base/AbstractIterator$State.NOT_READY:Lcom/google/common/base/AbstractIterator$State;
      19: putfield      #26                 // Field state:Lcom/google/common/base/AbstractIterator$State;
      22: aload_0
      23: getfield      #38                 // Field next:Ljava/lang/Object;
      26: astore_1
      27: aload_0
      28: aconst_null
      29: putfield      #38                 // Field next:Ljava/lang/Object;
      32: aload_1
      33: areturn

  public final void remove();
    Code:
       0: new           #74                 // class java/lang/UnsupportedOperationException
       3: dup
       4: invokespecial #75                 // Method java/lang/UnsupportedOperationException."<init>":()V
       7: athrow
}
