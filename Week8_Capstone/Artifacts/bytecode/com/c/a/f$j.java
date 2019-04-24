final class com.c.a.f$j<T> implements android.animation.TypeEvaluator<com.c.a.a> {
  public static final com.c.a.f$j a;

  static {};
    Code:
       0: new           #2                  // class com/c/a/f$j
       3: dup
       4: invokespecial #18                 // Method "<init>":()V
       7: putstatic     #20                 // Field a:Lcom/c/a/f$j;
      10: return

  com.c.a.f$j();
    Code:
       0: aload_0
       1: invokespecial #22                 // Method java/lang/Object."<init>":()V
       4: return

  public final com.c.a.a a(float, com.c.a.a, com.c.a.a);
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
      15: invokevirtual #38                 // Method com/c/a/a.b:(Lcom/c/a/a;)Lcom/c/a/a;
      18: fload_1
      19: invokestatic  #44                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      22: checkcast     #46                 // class java/lang/Number
      25: invokevirtual #49                 // Method com/c/a/a.a:(Ljava/lang/Number;)Lcom/c/a/a;
      28: invokevirtual #52                 // Method com/c/a/a.c:(Lcom/c/a/a;)Lcom/c/a/a;
      31: areturn

  public java.lang.Object evaluate(float, java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: fload_1
       2: aload_2
       3: checkcast     #35                 // class com/c/a/a
       6: aload_3
       7: checkcast     #35                 // class com/c/a/a
      10: invokevirtual #56                 // Method a:(FLcom/c/a/a;Lcom/c/a/a;)Lcom/c/a/a;
      13: areturn
}
