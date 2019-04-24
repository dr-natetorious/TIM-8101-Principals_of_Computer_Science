final class android.support.v4.f.b$1 implements java.util.concurrent.Callable<android.support.v4.f.b$c> {
  final android.content.Context a;

  final android.support.v4.f.a b;

  final int c;

  final java.lang.String d;

  android.support.v4.f.b$1(android.content.Context, android.support.v4.f.a, int, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field a:Landroid/content/Context;
       5: aload_0
       6: aload_2
       7: putfield      #25                 // Field b:Landroid/support/v4/f/a;
      10: aload_0
      11: iload_3
      12: putfield      #27                 // Field c:I
      15: aload_0
      16: aload         4
      18: putfield      #29                 // Field d:Ljava/lang/String;
      21: aload_0
      22: invokespecial #32                 // Method java/lang/Object."<init>":()V
      25: return

  public android.support.v4.f.b$c a();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/content/Context;
       4: aload_0
       5: getfield      #25                 // Field b:Landroid/support/v4/f/a;
       8: aload_0
       9: getfield      #27                 // Field c:I
      12: invokestatic  #37                 // Method android/support/v4/f/b.a:(Landroid/content/Context;Landroid/support/v4/f/a;I)Landroid/support/v4/f/b$c;
      15: astore_1
      16: aload_1
      17: getfield      #42                 // Field android/support/v4/f/b$c.a:Landroid/graphics/Typeface;
      20: ifnull        38
      23: invokestatic  #45                 // Method android/support/v4/f/b.a:()Landroid/support/v4/g/g;
      26: aload_0
      27: getfield      #29                 // Field d:Ljava/lang/String;
      30: aload_1
      31: getfield      #42                 // Field android/support/v4/f/b$c.a:Landroid/graphics/Typeface;
      34: invokevirtual #50                 // Method android/support/v4/g/g.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      37: pop
      38: aload_1
      39: areturn

  public java.lang.Object call();
    Code:
       0: aload_0
       1: invokevirtual #54                 // Method a:()Landroid/support/v4/f/b$c;
       4: areturn
}
