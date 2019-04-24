final class com.google.common.base.CharMatcher$BitSetMatcher extends com.google.common.base.CharMatcher$NamedFastMatcher {
  com.google.common.base.CharMatcher$BitSetMatcher(java.util.BitSet, java.lang.String, com.google.common.base.CharMatcher$1);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #33                 // Method "<init>":(Ljava/util/BitSet;Ljava/lang/String;)V
       6: return

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #29                 // Field table:Ljava/util/BitSet;
       4: iload_1
       5: invokevirtual #39                 // Method java/util/BitSet.get:(I)Z
       8: ireturn

  void setBits(java.util.BitSet);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #29                 // Field table:Ljava/util/BitSet;
       5: invokevirtual #44                 // Method java/util/BitSet.or:(Ljava/util/BitSet;)V
       8: return
}
