final class com.google.common.base.CharMatcher$ForPredicate extends com.google.common.base.CharMatcher {
  com.google.common.base.CharMatcher$ForPredicate(com.google.common.base.Predicate<? super java.lang.Character>);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method com/google/common/base/CharMatcher."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #19                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #21                 // class com/google/common/base/Predicate
      12: putfield      #23                 // Field predicate:Lcom/google/common/base/Predicate;
      15: return

  public boolean apply(java.lang.Character);
    Code:
       0: aload_0
       1: getfield      #23                 // Field predicate:Lcom/google/common/base/Predicate;
       4: aload_1
       5: invokestatic  #19                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       8: invokeinterface #31,  2           // InterfaceMethod com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
      13: ireturn

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #33                 // class java/lang/Character
       5: invokevirtual #35                 // Method apply:(Ljava/lang/Character;)Z
       8: ireturn

  public boolean matches(char);
    Code:
       0: aload_0
       1: getfield      #23                 // Field predicate:Lcom/google/common/base/Predicate;
       4: iload_1
       5: invokestatic  #41                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
       8: invokeinterface #31,  2           // InterfaceMethod com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
      13: ireturn

  public java.lang.String toString();
    Code:
       0: new           #45                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #46                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #48                 // String CharMatcher.forPredicate(
      11: invokevirtual #52                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #23                 // Field predicate:Lcom/google/common/base/Predicate;
      20: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #57                 // String )
      27: invokevirtual #52                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: invokevirtual #59                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn
}
