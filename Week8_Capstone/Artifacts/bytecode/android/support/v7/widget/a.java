abstract class android.support.v7.widget.a extends android.view.ViewGroup {
  protected final android.support.v7.widget.a$a a;

  protected final android.content.Context b;

  protected android.support.v7.widget.ActionMenuView c;

  protected android.support.v7.widget.d d;

  protected int e;

  protected android.support.v4.view.x f;

  android.support.v7.widget.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #26                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  android.support.v7.widget.a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #30                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  android.support.v7.widget.a(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #31                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #6                  // class android/support/v7/widget/a$a
      11: dup
      12: aload_0
      13: invokespecial #34                 // Method android/support/v7/widget/a$a."<init>":(Landroid/support/v7/widget/a;)V
      16: putfield      #36                 // Field a:Landroid/support/v7/widget/a$a;
      19: new           #38                 // class android/util/TypedValue
      22: dup
      23: invokespecial #41                 // Method android/util/TypedValue."<init>":()V
      26: astore_2
      27: aload_1
      28: invokevirtual #47                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
      31: getstatic     #52                 // Field android/support/v7/a/a$a.actionBarPopupTheme:I
      34: aload_2
      35: iconst_1
      36: invokevirtual #58                 // Method android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
      39: ifeq          66
      42: aload_2
      43: getfield      #61                 // Field android/util/TypedValue.resourceId:I
      46: ifeq          66
      49: aload_0
      50: new           #63                 // class android/view/ContextThemeWrapper
      53: dup
      54: aload_1
      55: aload_2
      56: getfield      #61                 // Field android/util/TypedValue.resourceId:I
      59: invokespecial #66                 // Method android/view/ContextThemeWrapper."<init>":(Landroid/content/Context;I)V
      62: putfield      #68                 // Field b:Landroid/content/Context;
      65: return
      66: aload_0
      67: aload_1
      68: putfield      #68                 // Field b:Landroid/content/Context;
      71: return

  protected static int a(int, int, boolean);
    Code:
       0: iload_2
       1: ifeq          8
       4: iload_0
       5: iload_1
       6: isub
       7: ireturn
       8: iload_0
       9: iload_1
      10: iadd
      11: ireturn

  static void a(android.support.v7.widget.a, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #74                 // Method android/view/ViewGroup.setVisibility:(I)V
       5: return

  static void b(android.support.v7.widget.a, int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #74                 // Method android/view/ViewGroup.setVisibility:(I)V
       5: return

  protected int a(android.view.View, int, int, int);
    Code:
       0: aload_1
       1: iload_2
       2: ldc           #76                 // int -2147483648
       4: invokestatic  #82                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
       7: iload_3
       8: invokevirtual #88                 // Method android/view/View.measure:(II)V
      11: iconst_0
      12: iload_2
      13: aload_1
      14: invokevirtual #92                 // Method android/view/View.getMeasuredWidth:()I
      17: isub
      18: iload         4
      20: isub
      21: invokestatic  #97                 // Method java/lang/Math.max:(II)I
      24: ireturn

  protected int a(android.view.View, int, int, int, boolean);
    Code:
       0: aload_1
       1: invokevirtual #92                 // Method android/view/View.getMeasuredWidth:()I
       4: istore        6
       6: aload_1
       7: invokevirtual #101                // Method android/view/View.getMeasuredHeight:()I
      10: istore        7
      12: iload_3
      13: iload         4
      15: iload         7
      17: isub
      18: iconst_2
      19: idiv
      20: iadd
      21: istore_3
      22: iload         5
      24: ifeq          44
      27: aload_1
      28: iload_2
      29: iload         6
      31: isub
      32: iload_3
      33: iload_2
      34: iload         7
      36: iload_3
      37: iadd
      38: invokevirtual #105                // Method android/view/View.layout:(IIII)V
      41: goto          58
      44: aload_1
      45: iload_2
      46: iload_3
      47: iload_2
      48: iload         6
      50: iadd
      51: iload         7
      53: iload_3
      54: iadd
      55: invokevirtual #105                // Method android/view/View.layout:(IIII)V
      58: iload         6
      60: istore_2
      61: iload         5
      63: ifeq          70
      66: iload         6
      68: ineg
      69: istore_2
      70: iload_2
      71: ireturn

  public android.support.v4.view.x a(int, long);
    Code:
       0: aload_0
       1: getfield      #108                // Field f:Landroid/support/v4/view/x;
       4: ifnull        14
       7: aload_0
       8: getfield      #108                // Field f:Landroid/support/v4/view/x;
      11: invokevirtual #112                // Method android/support/v4/view/x.b:()V
      14: iload_1
      15: ifne          66
      18: aload_0
      19: invokevirtual #115                // Method getVisibility:()I
      22: ifeq          30
      25: aload_0
      26: fconst_0
      27: invokevirtual #119                // Method setAlpha:(F)V
      30: aload_0
      31: invokestatic  #125                // Method android/support/v4/view/s.k:(Landroid/view/View;)Landroid/support/v4/view/x;
      34: fconst_1
      35: invokevirtual #128                // Method android/support/v4/view/x.a:(F)Landroid/support/v4/view/x;
      38: astore        4
      40: aload         4
      42: lload_2
      43: invokevirtual #131                // Method android/support/v4/view/x.a:(J)Landroid/support/v4/view/x;
      46: pop
      47: aload         4
      49: aload_0
      50: getfield      #36                 // Field a:Landroid/support/v7/widget/a$a;
      53: aload         4
      55: iload_1
      56: invokevirtual #134                // Method android/support/v7/widget/a$a.a:(Landroid/support/v4/view/x;I)Landroid/support/v7/widget/a$a;
      59: invokevirtual #137                // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      62: pop
      63: aload         4
      65: areturn
      66: aload_0
      67: invokestatic  #125                // Method android/support/v4/view/s.k:(Landroid/view/View;)Landroid/support/v4/view/x;
      70: fconst_0
      71: invokevirtual #128                // Method android/support/v4/view/x.a:(F)Landroid/support/v4/view/x;
      74: astore        4
      76: goto          40

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #140                // Field d:Landroid/support/v7/widget/d;
       4: ifnull        15
       7: aload_0
       8: getfield      #140                // Field d:Landroid/support/v7/widget/d;
      11: invokevirtual #144                // Method android/support/v7/widget/d.f:()Z
      14: ireturn
      15: iconst_0
      16: ireturn

  public int getAnimatedVisibility();
    Code:
       0: aload_0
       1: getfield      #108                // Field f:Landroid/support/v4/view/x;
       4: ifnull        15
       7: aload_0
       8: getfield      #36                 // Field a:Landroid/support/v7/widget/a$a;
      11: getfield      #147                // Field android/support/v7/widget/a$a.a:I
      14: ireturn
      15: aload_0
      16: invokevirtual #115                // Method getVisibility:()I
      19: ireturn

  public int getContentHeight();
    Code:
       0: aload_0
       1: getfield      #150                // Field e:I
       4: ireturn

  protected void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #154                // Method android/view/ViewGroup.onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: invokevirtual #158                // Method getContext:()Landroid/content/Context;
       9: aconst_null
      10: getstatic     #164                // Field android/support/v7/a/a$j.ActionBar:[I
      13: getstatic     #167                // Field android/support/v7/a/a$a.actionBarStyle:I
      16: iconst_0
      17: invokevirtual #171                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      20: astore_2
      21: aload_0
      22: aload_2
      23: getstatic     #174                // Field android/support/v7/a/a$j.ActionBar_height:I
      26: iconst_0
      27: invokevirtual #179                // Method android/content/res/TypedArray.getLayoutDimension:(II)I
      30: invokevirtual #182                // Method setContentHeight:(I)V
      33: aload_2
      34: invokevirtual #185                // Method android/content/res/TypedArray.recycle:()V
      37: aload_0
      38: getfield      #140                // Field d:Landroid/support/v7/widget/d;
      41: ifnull        52
      44: aload_0
      45: getfield      #140                // Field d:Landroid/support/v7/widget/d;
      48: aload_1
      49: invokevirtual #187                // Method android/support/v7/widget/d.a:(Landroid/content/res/Configuration;)V
      52: return

  public boolean onHoverEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #194                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore_2
       5: iload_2
       6: bipush        9
       8: if_icmpne     16
      11: aload_0
      12: iconst_0
      13: putfield      #196                // Field h:Z
      16: aload_0
      17: getfield      #196                // Field h:Z
      20: ifne          44
      23: aload_0
      24: aload_1
      25: invokespecial #198                // Method android/view/ViewGroup.onHoverEvent:(Landroid/view/MotionEvent;)Z
      28: istore_3
      29: iload_2
      30: bipush        9
      32: if_icmpne     44
      35: iload_3
      36: ifne          44
      39: aload_0
      40: iconst_1
      41: putfield      #196                // Field h:Z
      44: iload_2
      45: bipush        10
      47: if_icmpeq     55
      50: iload_2
      51: iconst_3
      52: if_icmpne     60
      55: aload_0
      56: iconst_0
      57: putfield      #196                // Field h:Z
      60: iconst_1
      61: ireturn

  public boolean onTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_1
       1: invokevirtual #194                // Method android/view/MotionEvent.getActionMasked:()I
       4: istore_2
       5: iload_2
       6: ifne          14
       9: aload_0
      10: iconst_0
      11: putfield      #201                // Field g:Z
      14: aload_0
      15: getfield      #201                // Field g:Z
      18: ifne          40
      21: aload_0
      22: aload_1
      23: invokespecial #203                // Method android/view/ViewGroup.onTouchEvent:(Landroid/view/MotionEvent;)Z
      26: istore_3
      27: iload_2
      28: ifne          40
      31: iload_3
      32: ifne          40
      35: aload_0
      36: iconst_1
      37: putfield      #201                // Field g:Z
      40: iload_2
      41: iconst_1
      42: if_icmpeq     50
      45: iload_2
      46: iconst_3
      47: if_icmpne     55
      50: aload_0
      51: iconst_0
      52: putfield      #201                // Field g:Z
      55: iconst_1
      56: ireturn

  public void setContentHeight(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #150                // Field e:I
       5: aload_0
       6: invokevirtual #206                // Method requestLayout:()V
       9: return

  public void setVisibility(int);
    Code:
       0: iload_1
       1: aload_0
       2: invokevirtual #115                // Method getVisibility:()I
       5: if_icmpeq     27
       8: aload_0
       9: getfield      #108                // Field f:Landroid/support/v4/view/x;
      12: ifnull        22
      15: aload_0
      16: getfield      #108                // Field f:Landroid/support/v4/view/x;
      19: invokevirtual #112                // Method android/support/v4/view/x.b:()V
      22: aload_0
      23: iload_1
      24: invokespecial #74                 // Method android/view/ViewGroup.setVisibility:(I)V
      27: return
}
