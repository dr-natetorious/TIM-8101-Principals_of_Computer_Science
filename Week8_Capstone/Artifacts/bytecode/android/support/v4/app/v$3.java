final class android.support.v4.app.v$3 implements java.lang.Runnable {
  final android.support.v4.app.i a;

  final android.support.v4.app.i b;

  final boolean c;

  final android.support.v4.g.a d;

  final android.view.View e;

  final android.support.v4.app.x f;

  final android.graphics.Rect g;

  android.support.v4.app.v$3(android.support.v4.app.i, android.support.v4.app.i, boolean, android.support.v4.g.a, android.view.View, android.support.v4.app.x, android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #27                 // Field a:Landroid/support/v4/app/i;
       5: aload_0
       6: aload_2
       7: putfield      #29                 // Field b:Landroid/support/v4/app/i;
      10: aload_0
      11: iload_3
      12: putfield      #31                 // Field c:Z
      15: aload_0
      16: aload         4
      18: putfield      #33                 // Field d:Landroid/support/v4/g/a;
      21: aload_0
      22: aload         5
      24: putfield      #35                 // Field e:Landroid/view/View;
      27: aload_0
      28: aload         6
      30: putfield      #37                 // Field f:Landroid/support/v4/app/x;
      33: aload_0
      34: aload         7
      36: putfield      #39                 // Field g:Landroid/graphics/Rect;
      39: aload_0
      40: invokespecial #42                 // Method java/lang/Object."<init>":()V
      43: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #27                 // Field a:Landroid/support/v4/app/i;
       4: aload_0
       5: getfield      #29                 // Field b:Landroid/support/v4/app/i;
       8: aload_0
       9: getfield      #31                 // Field c:Z
      12: aload_0
      13: getfield      #33                 // Field d:Landroid/support/v4/g/a;
      16: iconst_0
      17: invokestatic  #47                 // Method android/support/v4/app/v.a:(Landroid/support/v4/app/i;Landroid/support/v4/app/i;ZLandroid/support/v4/g/a;Z)V
      20: aload_0
      21: getfield      #35                 // Field e:Landroid/view/View;
      24: ifnull        42
      27: aload_0
      28: getfield      #37                 // Field f:Landroid/support/v4/app/x;
      31: aload_0
      32: getfield      #35                 // Field e:Landroid/view/View;
      35: aload_0
      36: getfield      #39                 // Field g:Landroid/graphics/Rect;
      39: invokevirtual #52                 // Method android/support/v4/app/x.a:(Landroid/view/View;Landroid/graphics/Rect;)V
      42: return
}
