public class android.support.design.widget.SwipeDismissBehavior<V extends android.view.View> extends android.support.design.widget.CoordinatorLayout$b<V> {
  android.support.v4.widget.p b;

  android.support.design.widget.SwipeDismissBehavior$a c;

  int d;

  float e;

  float f;

  float g;

  public android.support.design.widget.SwipeDismissBehavior();
    Code:
       0: aload_0
       1: invokespecial #31                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":()V
       4: aload_0
       5: fconst_0
       6: putfield      #33                 // Field h:F
       9: aload_0
      10: iconst_2
      11: putfield      #35                 // Field d:I
      14: aload_0
      15: ldc           #36                 // float 0.5f
      17: putfield      #38                 // Field e:F
      20: aload_0
      21: fconst_0
      22: putfield      #40                 // Field f:F
      25: aload_0
      26: ldc           #36                 // float 0.5f
      28: putfield      #42                 // Field g:F
      31: aload_0
      32: new           #7                  // class android/support/design/widget/SwipeDismissBehavior$1
      35: dup
      36: aload_0
      37: invokespecial #45                 // Method android/support/design/widget/SwipeDismissBehavior$1."<init>":(Landroid/support/design/widget/SwipeDismissBehavior;)V
      40: putfield      #47                 // Field j:Landroid/support/v4/widget/p$a;
      43: return

  static float a(float, float, float);
    Code:
       0: fload_0
       1: fload_1
       2: invokestatic  #55                 // Method java/lang/Math.max:(FF)F
       5: fload_2
       6: invokestatic  #58                 // Method java/lang/Math.min:(FF)F
       9: freturn

  static int a(int, int, int);
    Code:
       0: iload_0
       1: iload_1
       2: invokestatic  #62                 // Method java/lang/Math.max:(II)I
       5: iload_2
       6: invokestatic  #64                 // Method java/lang/Math.min:(II)I
       9: ireturn

  static float b(float, float, float);
    Code:
       0: fload_2
       1: fload_0
       2: fsub
       3: fload_1
       4: fload_0
       5: fsub
       6: fdiv
       7: freturn

  public void a(float);
    Code:
       0: aload_0
       1: fconst_0
       2: fload_1
       3: fconst_1
       4: invokestatic  #80                 // Method a:(FFF)F
       7: putfield      #40                 // Field f:F
      10: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #35                 // Field d:I
       5: return

  public void a(android.support.design.widget.SwipeDismissBehavior$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #84                 // Field c:Landroid/support/design/widget/SwipeDismissBehavior$a;
       5: return

  public boolean a(android.support.design.widget.CoordinatorLayout, V, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Z
       4: istore        5
       6: aload_3
       7: invokevirtual #93                 // Method android/view/MotionEvent.getActionMasked:()I
      10: istore        4
      12: iload         4
      14: iconst_3
      15: if_icmpeq     75
      18: iload         4
      20: tableswitch   { // 0 to 1
                     0: 47
                     1: 75
               default: 44
          }
      44: goto          80
      47: aload_0
      48: aload_1
      49: aload_2
      50: aload_3
      51: invokevirtual #97                 // Method android/view/MotionEvent.getX:()F
      54: f2i
      55: aload_3
      56: invokevirtual #100                // Method android/view/MotionEvent.getY:()F
      59: f2i
      60: invokevirtual #105                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
      63: putfield      #87                 // Field a:Z
      66: aload_0
      67: getfield      #87                 // Field a:Z
      70: istore        5
      72: goto          80
      75: aload_0
      76: iconst_0
      77: putfield      #87                 // Field a:Z
      80: iload         5
      82: ifeq          99
      85: aload_0
      86: aload_1
      87: invokespecial #107                // Method a:(Landroid/view/ViewGroup;)V
      90: aload_0
      91: getfield      #67                 // Field b:Landroid/support/v4/widget/p;
      94: aload_3
      95: invokevirtual #110                // Method android/support/v4/widget/p.a:(Landroid/view/MotionEvent;)Z
      98: ireturn
      99: iconst_0
     100: ireturn

  public boolean a(android.view.View);
    Code:
       0: iconst_1
       1: ireturn

  public void b(float);
    Code:
       0: aload_0
       1: fconst_0
       2: fload_1
       3: fconst_1
       4: invokestatic  #80                 // Method a:(FFF)F
       7: putfield      #42                 // Field g:F
      10: return

  public boolean b(android.support.design.widget.CoordinatorLayout, V, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #67                 // Field b:Landroid/support/v4/widget/p;
       4: ifnull        17
       7: aload_0
       8: getfield      #67                 // Field b:Landroid/support/v4/widget/p;
      11: aload_3
      12: invokevirtual #116                // Method android/support/v4/widget/p.b:(Landroid/view/MotionEvent;)V
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn
}
