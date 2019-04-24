final class com.c.a.f$g<T> implements android.animation.TypeEvaluator<com.c.a.d> {
  final com.c.a.f a;

  com.c.a.f$g(com.c.a.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field a:Lcom/c/a/f;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: return

  public final com.c.a.d a(float, com.c.a.d, com.c.a.d);
    Code:
       0: aload_2
       1: ldc           #25                 // String startValue
       3: invokestatic  #31                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_3
       7: ldc           #33                 // String endValue
       9: invokestatic  #31                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_2
      13: aload_3
      14: aload_2
      15: invokevirtual #38                 // Method com/c/a/d.a:(Lcom/c/a/d;)Lcom/c/a/d;
      18: fload_1
      19: invokestatic  #44                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      22: checkcast     #46                 // class java/lang/Number
      25: invokevirtual #49                 // Method com/c/a/d.a:(Ljava/lang/Number;)Lcom/c/a/d;
      28: invokevirtual #51                 // Method com/c/a/d.b:(Lcom/c/a/d;)Lcom/c/a/d;
      31: aload_0
      32: getfield      #18                 // Field a:Lcom/c/a/f;
      35: invokestatic  #55                 // Method com/c/a/f.q:(Lcom/c/a/f;)Lcom/c/a/d;
      38: invokevirtual #38                 // Method com/c/a/d.a:(Lcom/c/a/d;)Lcom/c/a/d;
      41: areturn

  public java.lang.Object evaluate(float, java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: fload_1
       2: aload_2
       3: checkcast     #35                 // class com/c/a/d
       6: aload_3
       7: checkcast     #35                 // class com/c/a/d
      10: invokevirtual #59                 // Method a:(FLcom/c/a/d;Lcom/c/a/d;)Lcom/c/a/d;
      13: areturn
}
