public class android.support.constraint.Group extends android.support.constraint.b {
  public android.support.constraint.Group(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #8                  // Method android/support/constraint/b."<init>":(Landroid/content/Context;)V
       5: return

  public android.support.constraint.Group(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #12                 // Method android/support/constraint/b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.constraint.Group(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #15                 // Method android/support/constraint/b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public void a(android.support.constraint.ConstraintLayout);
    Code:
       0: aload_0
       1: invokevirtual #21                 // Method getVisibility:()I
       4: istore        4
       6: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
       9: bipush        21
      11: if_icmplt     22
      14: aload_0
      15: invokevirtual #31                 // Method getElevation:()F
      18: fstore_2
      19: goto          24
      22: fconst_0
      23: fstore_2
      24: iconst_0
      25: istore_3
      26: iload_3
      27: aload_0
      28: getfield      #34                 // Field b:I
      31: if_icmpge     85
      34: aload_1
      35: aload_0
      36: getfield      #37                 // Field a:[I
      39: iload_3
      40: iaload
      41: invokevirtual #42                 // Method android/support/constraint/ConstraintLayout.a:(I)Landroid/view/View;
      44: astore        5
      46: aload         5
      48: ifnull        78
      51: aload         5
      53: iload         4
      55: invokevirtual #48                 // Method android/view/View.setVisibility:(I)V
      58: fload_2
      59: fconst_0
      60: fcmpl
      61: ifle          78
      64: getstatic     #27                 // Field android/os/Build$VERSION.SDK_INT:I
      67: bipush        21
      69: if_icmplt     78
      72: aload         5
      74: fload_2
      75: invokevirtual #52                 // Method android/view/View.setElevation:(F)V
      78: iload_3
      79: iconst_1
      80: iadd
      81: istore_3
      82: goto          26
      85: return

  protected void a(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #55                 // Method android/support/constraint/b.a:(Landroid/util/AttributeSet;)V
       5: aload_0
       6: iconst_0
       7: putfield      #59                 // Field e:Z
      10: return

  public void b(android.support.constraint.ConstraintLayout);
    Code:
       0: aload_0
       1: invokevirtual #63                 // Method getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #65                 // class android/support/constraint/ConstraintLayout$a
       7: astore_1
       8: aload_1
       9: getfield      #69                 // Field android/support/constraint/ConstraintLayout$a.al:Landroid/support/constraint/a/a/d;
      12: iconst_0
      13: invokevirtual #74                 // Method android/support/constraint/a/a/d.h:(I)V
      16: aload_1
      17: getfield      #69                 // Field android/support/constraint/ConstraintLayout$a.al:Landroid/support/constraint/a/a/d;
      20: iconst_0
      21: invokevirtual #77                 // Method android/support/constraint/a/a/d.i:(I)V
      24: return
}
