abstract class android.support.v7.app.h extends android.support.v7.app.g {
  final android.content.Context a;

  final android.view.Window b;

  final android.view.Window$Callback c;

  final android.view.Window$Callback d;

  final android.support.v7.app.f e;

  android.support.v7.app.a f;

  android.view.MenuInflater g;

  boolean h;

  boolean i;

  boolean j;

  boolean k;

  boolean l;

  static {};
    Code:
       0: getstatic     #45                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmpge     13
       8: iconst_1
       9: istore_0
      10: goto          15
      13: iconst_0
      14: istore_0
      15: iload_0
      16: putstatic     #47                 // Field n:Z
      19: getstatic     #47                 // Field n:Z
      22: ifeq          48
      25: getstatic     #49                 // Field m:Z
      28: ifne          48
      31: new           #6                  // class android/support/v7/app/h$1
      34: dup
      35: invokestatic  #55                 // Method java/lang/Thread.getDefaultUncaughtExceptionHandler:()Ljava/lang/Thread$UncaughtExceptionHandler;
      38: invokespecial #59                 // Method android/support/v7/app/h$1."<init>":(Ljava/lang/Thread$UncaughtExceptionHandler;)V
      41: invokestatic  #62                 // Method java/lang/Thread.setDefaultUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
      44: iconst_1
      45: putstatic     #49                 // Field m:Z
      48: iconst_1
      49: newarray       int
      51: dup
      52: iconst_0
      53: ldc           #63                 // int 16842836
      55: iastore
      56: putstatic     #65                 // Field o:[I
      59: return

  android.support.v7.app.h(android.content.Context, android.view.Window, android.support.v7.app.f);
    Code:
       0: aload_0
       1: invokespecial #69                 // Method android/support/v7/app/g."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #71                 // Field a:Landroid/content/Context;
       9: aload_0
      10: aload_2
      11: putfield      #73                 // Field b:Landroid/view/Window;
      14: aload_0
      15: aload_3
      16: putfield      #75                 // Field e:Landroid/support/v7/app/f;
      19: aload_0
      20: aload_0
      21: getfield      #73                 // Field b:Landroid/view/Window;
      24: invokevirtual #81                 // Method android/view/Window.getCallback:()Landroid/view/Window$Callback;
      27: putfield      #83                 // Field c:Landroid/view/Window$Callback;
      30: aload_0
      31: getfield      #83                 // Field c:Landroid/view/Window$Callback;
      34: instanceof    #11                 // class android/support/v7/app/h$b
      37: ifeq          50
      40: new           #85                 // class java/lang/IllegalStateException
      43: dup
      44: ldc           #87                 // String AppCompat has already installed itself into the Window
      46: invokespecial #90                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      49: athrow
      50: aload_0
      51: aload_0
      52: aload_0
      53: getfield      #83                 // Field c:Landroid/view/Window$Callback;
      56: invokevirtual #93                 // Method a:(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
      59: putfield      #95                 // Field d:Landroid/view/Window$Callback;
      62: aload_0
      63: getfield      #73                 // Field b:Landroid/view/Window;
      66: aload_0
      67: getfield      #95                 // Field d:Landroid/view/Window$Callback;
      70: invokevirtual #99                 // Method android/view/Window.setCallback:(Landroid/view/Window$Callback;)V
      73: aload_1
      74: aconst_null
      75: getstatic     #65                 // Field o:[I
      78: invokestatic  #104                // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/support/v7/widget/bp;
      81: astore_1
      82: aload_1
      83: iconst_0
      84: invokevirtual #107                // Method android/support/v7/widget/bp.b:(I)Landroid/graphics/drawable/Drawable;
      87: astore_2
      88: aload_2
      89: ifnull        100
      92: aload_0
      93: getfield      #73                 // Field b:Landroid/view/Window;
      96: aload_2
      97: invokevirtual #111                // Method android/view/Window.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
     100: aload_1
     101: invokevirtual #113                // Method android/support/v7/widget/bp.a:()V
     104: return

  public android.support.v7.app.a a();
    Code:
       0: aload_0
       1: invokevirtual #116                // Method m:()V
       4: aload_0
       5: getfield      #118                // Field f:Landroid/support/v7/app/a;
       8: areturn

  android.view.Window$Callback a(android.view.Window$Callback);
    Code:
       0: new           #11                 // class android/support/v7/app/h$b
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #121                // Method android/support/v7/app/h$b."<init>":(Landroid/support/v7/app/h;Landroid/view/Window$Callback;)V
       9: areturn

  abstract void a(int, android.view.Menu);

  public final void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #125                // Field p:Ljava/lang/CharSequence;
       5: aload_0
       6: aload_1
       7: invokevirtual #127                // Method b:(Ljava/lang/CharSequence;)V
      10: return

  abstract boolean a(int, android.view.KeyEvent);

  abstract boolean a(android.view.KeyEvent);

  abstract android.support.v7.view.b b(android.support.v7.view.b$a);

  public android.view.MenuInflater b();
    Code:
       0: aload_0
       1: getfield      #133                // Field g:Landroid/view/MenuInflater;
       4: ifnonnull     46
       7: aload_0
       8: invokevirtual #116                // Method m:()V
      11: aload_0
      12: getfield      #118                // Field f:Landroid/support/v7/app/a;
      15: ifnull        29
      18: aload_0
      19: getfield      #118                // Field f:Landroid/support/v7/app/a;
      22: invokevirtual #138                // Method android/support/v7/app/a.b:()Landroid/content/Context;
      25: astore_1
      26: goto          34
      29: aload_0
      30: getfield      #71                 // Field a:Landroid/content/Context;
      33: astore_1
      34: aload_0
      35: new           #140                // class android/support/v7/view/g
      38: dup
      39: aload_1
      40: invokespecial #143                // Method android/support/v7/view/g."<init>":(Landroid/content/Context;)V
      43: putfield      #133                // Field g:Landroid/view/MenuInflater;
      46: aload_0
      47: getfield      #133                // Field g:Landroid/view/MenuInflater;
      50: areturn

  abstract void b(java.lang.CharSequence);

  abstract boolean b(int, android.view.Menu);

  public void c();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #146                // Field q:Z
       5: return

  public void c(android.os.Bundle);
    Code:
       0: return

  public void d();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #146                // Field q:Z
       5: return

  public void g();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #149                // Field r:Z
       5: return

  public final android.support.v7.app.b$a h();
    Code:
       0: new           #8                  // class android/support/v7/app/h$a
       3: dup
       4: aload_0
       5: invokespecial #153                // Method android/support/v7/app/h$a."<init>":(Landroid/support/v7/app/h;)V
       8: areturn

  public boolean j();
    Code:
       0: iconst_0
       1: ireturn

  abstract void m();

  final android.support.v7.app.a n();
    Code:
       0: aload_0
       1: getfield      #118                // Field f:Landroid/support/v7/app/a;
       4: areturn

  final android.content.Context o();
    Code:
       0: aload_0
       1: invokevirtual #156                // Method a:()Landroid/support/v7/app/a;
       4: astore_1
       5: aload_1
       6: ifnull        17
       9: aload_1
      10: invokevirtual #138                // Method android/support/v7/app/a.b:()Landroid/content/Context;
      13: astore_1
      14: goto          19
      17: aconst_null
      18: astore_1
      19: aload_1
      20: astore_2
      21: aload_1
      22: ifnonnull     30
      25: aload_0
      26: getfield      #71                 // Field a:Landroid/content/Context;
      29: astore_2
      30: aload_2
      31: areturn

  public boolean p();
    Code:
       0: iconst_0
       1: ireturn

  final boolean q();
    Code:
       0: aload_0
       1: getfield      #149                // Field r:Z
       4: ireturn

  final android.view.Window$Callback r();
    Code:
       0: aload_0
       1: getfield      #73                 // Field b:Landroid/view/Window;
       4: invokevirtual #81                 // Method android/view/Window.getCallback:()Landroid/view/Window$Callback;
       7: areturn

  final java.lang.CharSequence s();
    Code:
       0: aload_0
       1: getfield      #83                 // Field c:Landroid/view/Window$Callback;
       4: instanceof    #160                // class android/app/Activity
       7: ifeq          21
      10: aload_0
      11: getfield      #83                 // Field c:Landroid/view/Window$Callback;
      14: checkcast     #160                // class android/app/Activity
      17: invokevirtual #163                // Method android/app/Activity.getTitle:()Ljava/lang/CharSequence;
      20: areturn
      21: aload_0
      22: getfield      #125                // Field p:Ljava/lang/CharSequence;
      25: areturn
}
