class com.google.common.base.Splitter$5 implements java.lang.Iterable<java.lang.String> {
  final com.google.common.base.Splitter this$0;

  final java.lang.CharSequence val$sequence;

  com.google.common.base.Splitter$5(com.google.common.base.Splitter, java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field this$0:Lcom/google/common/base/Splitter;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field val$sequence:Ljava/lang/CharSequence;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public java.util.Iterator<java.lang.String> iterator();
    Code:
       0: aload_0
       1: getfield      #20                 // Field this$0:Lcom/google/common/base/Splitter;
       4: aload_0
       5: getfield      #22                 // Field val$sequence:Ljava/lang/CharSequence;
       8: invokestatic  #32                 // Method com/google/common/base/Splitter.access$000:(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)Ljava/util/Iterator;
      11: areturn

  public java.lang.String toString();
    Code:
       0: ldc           #38                 // String ,
       2: invokestatic  #44                 // Method com/google/common/base/Joiner.on:(Ljava/lang/String;)Lcom/google/common/base/Joiner;
       5: astore_1
       6: new           #46                 // class java/lang/StringBuilder
       9: dup
      10: invokespecial #47                 // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: bipush        91
      17: invokevirtual #51                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      20: pop
      21: aload_1
      22: aload_2
      23: aload_0
      24: invokevirtual #55                 // Method com/google/common/base/Joiner.appendTo:(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;
      27: astore_1
      28: aload_1
      29: bipush        93
      31: invokevirtual #51                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      34: pop
      35: aload_1
      36: invokevirtual #57                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      39: areturn
}
