final class com.google.common.base.Joiner$3 extends java.util.AbstractList<java.lang.Object> {
  final java.lang.Object val$first;

  final java.lang.Object[] val$rest;

  final java.lang.Object val$second;

  com.google.common.base.Joiner$3(java.lang.Object[], java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field val$rest:[Ljava/lang/Object;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field val$first:Ljava/lang/Object;
      10: aload_0
      11: aload_3
      12: putfield      #23                 // Field val$second:Ljava/lang/Object;
      15: aload_0
      16: invokespecial #26                 // Method java/util/AbstractList."<init>":()V
      19: return

  public java.lang.Object get(int);
    Code:
       0: iload_1
       1: tableswitch   { // 0 to 1
                     0: 38
                     1: 33
               default: 24
          }
      24: aload_0
      25: getfield      #19                 // Field val$rest:[Ljava/lang/Object;
      28: iload_1
      29: iconst_2
      30: isub
      31: aaload
      32: areturn
      33: aload_0
      34: getfield      #23                 // Field val$second:Ljava/lang/Object;
      37: areturn
      38: aload_0
      39: getfield      #21                 // Field val$first:Ljava/lang/Object;
      42: areturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #19                 // Field val$rest:[Ljava/lang/Object;
       4: arraylength
       5: iconst_2
       6: iadd
       7: ireturn
}
