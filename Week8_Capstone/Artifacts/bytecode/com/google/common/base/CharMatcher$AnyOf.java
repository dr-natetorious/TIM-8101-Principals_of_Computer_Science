final class com.google.common.base.CharMatcher$AnyOf extends com.google.common.base.CharMatcher {
  public com.google.common.base.CharMatcher$AnyOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method com/google/common/base/CharMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: invokeinterface #18,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      11: invokevirtual #24                 // Method java/lang/String.toCharArray:()[C
      14: putfield      #26                 // Field chars:[C
      17: aload_0
      18: getfield      #26                 // Field chars:[C
      21: invokestatic  #32                 // Method java/util/Arrays.sort:([C)V
      24: return

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #38                 // class java/lang/Character
       5: invokespecial #41                 // Method com/google/common/base/CharMatcher.apply:(Ljava/lang/Character;)Z
       8: ireturn

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #26                 // Field chars:[C
       4: iload_1
       5: invokestatic  #48                 // Method java/util/Arrays.binarySearch:([CC)I
       8: iflt          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_0
       1: getfield      #26                 // Field chars:[C
       4: astore        4
       6: aload         4
       8: arraylength
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_2
      13: iload_3
      14: if_icmpge     32
      17: aload_1
      18: aload         4
      20: iload_2
      21: caload
      22: invokevirtual #56                 // Method java/util/BitSet.set:(I)V
      25: iload_2
      26: iconst_1
      27: iadd
      28: istore_2
      29: goto          12
      32: return

  public java.lang.String toString();
    Code:
       0: new           #58                 // class java/lang/StringBuilder
       3: dup
       4: ldc           #60                 // String CharMatcher.anyOf(\"
       6: invokespecial #63                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
       9: astore_3
      10: aload_0
      11: getfield      #26                 // Field chars:[C
      14: astore        4
      16: aload         4
      18: arraylength
      19: istore_2
      20: iconst_0
      21: istore_1
      22: iload_1
      23: iload_2
      24: if_icmpge     46
      27: aload_3
      28: aload         4
      30: iload_1
      31: caload
      32: invokestatic  #67                 // Method com/google/common/base/CharMatcher.access$100:(C)Ljava/lang/String;
      35: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: iload_1
      40: iconst_1
      41: iadd
      42: istore_1
      43: goto          22
      46: aload_3
      47: ldc           #73                 // String \")
      49: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_3
      54: invokevirtual #74                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      57: areturn
}
