class com.google.common.base.AbstractIterator$1 {
  static final int[] $SwitchMap$com$google$common$base$AbstractIterator$State;

  static {};
    Code:
       0: invokestatic  #18                 // Method com/google/common/base/AbstractIterator$State.values:()[Lcom/google/common/base/AbstractIterator$State;
       3: arraylength
       4: newarray       int
       6: putstatic     #20                 // Field $SwitchMap$com$google$common$base$AbstractIterator$State:[I
       9: getstatic     #20                 // Field $SwitchMap$com$google$common$base$AbstractIterator$State:[I
      12: getstatic     #24                 // Field com/google/common/base/AbstractIterator$State.READY:Lcom/google/common/base/AbstractIterator$State;
      15: invokevirtual #28                 // Method com/google/common/base/AbstractIterator$State.ordinal:()I
      18: iconst_1
      19: iastore
      20: getstatic     #20                 // Field $SwitchMap$com$google$common$base$AbstractIterator$State:[I
      23: getstatic     #31                 // Field com/google/common/base/AbstractIterator$State.DONE:Lcom/google/common/base/AbstractIterator$State;
      26: invokevirtual #28                 // Method com/google/common/base/AbstractIterator$State.ordinal:()I
      29: iconst_2
      30: iastore
      31: return
      32: astore_0
      33: goto          20
      36: astore_0
      37: return
    Exception table:
       from    to  target type
           9    20    32   Class java/lang/NoSuchFieldError
          20    31    36   Class java/lang/NoSuchFieldError
}
