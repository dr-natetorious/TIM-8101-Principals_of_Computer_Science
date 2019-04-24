public class android.support.v7.widget.ActionBarOverlayLayout extends android.view.ViewGroup implements android.support.v4.view.m,android.support.v7.widget.ak {
  static final int[] e;

  android.support.v7.widget.ActionBarContainer a;

  boolean b;

  android.view.ViewPropertyAnimator c;

  final android.animation.AnimatorListenerAdapter d;

  static {};
    Code:
       0: iconst_2
       1: newarray       int
       3: dup
       4: iconst_0
       5: getstatic     #68                 // Field android/support/v7/a/a$a.actionBarSize:I
       8: iastore
       9: dup
      10: iconst_1
      11: ldc           #69                 // int 16842841
      13: iastore
      14: putstatic     #71                 // Field e:[I
      17: return

  public android.support.v7.widget.ActionBarOverlayLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #77                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.ActionBarOverlayLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #78                 // Method android/view/ViewGroup."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #80                 // Field g:I
      11: aload_0
      12: new           #82                 // class android/graphics/Rect
      15: dup
      16: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      19: putfield      #86                 // Field q:Landroid/graphics/Rect;
      22: aload_0
      23: new           #82                 // class android/graphics/Rect
      26: dup
      27: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      30: putfield      #88                 // Field r:Landroid/graphics/Rect;
      33: aload_0
      34: new           #82                 // class android/graphics/Rect
      37: dup
      38: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      41: putfield      #90                 // Field s:Landroid/graphics/Rect;
      44: aload_0
      45: new           #82                 // class android/graphics/Rect
      48: dup
      49: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      52: putfield      #92                 // Field t:Landroid/graphics/Rect;
      55: aload_0
      56: new           #82                 // class android/graphics/Rect
      59: dup
      60: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      63: putfield      #94                 // Field u:Landroid/graphics/Rect;
      66: aload_0
      67: new           #82                 // class android/graphics/Rect
      70: dup
      71: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      74: putfield      #96                 // Field v:Landroid/graphics/Rect;
      77: aload_0
      78: new           #82                 // class android/graphics/Rect
      81: dup
      82: invokespecial #84                 // Method android/graphics/Rect."<init>":()V
      85: putfield      #98                 // Field w:Landroid/graphics/Rect;
      88: aload_0
      89: sipush        600
      92: putfield      #100                // Field y:I
      95: aload_0
      96: new           #10                 // class android/support/v7/widget/ActionBarOverlayLayout$1
      99: dup
     100: aload_0
     101: invokespecial #103                // Method android/support/v7/widget/ActionBarOverlayLayout$1."<init>":(Landroid/support/v7/widget/ActionBarOverlayLayout;)V
     104: putfield      #105                // Field d:Landroid/animation/AnimatorListenerAdapter;
     107: aload_0
     108: new           #12                 // class android/support/v7/widget/ActionBarOverlayLayout$2
     111: dup
     112: aload_0
     113: invokespecial #106                // Method android/support/v7/widget/ActionBarOverlayLayout$2."<init>":(Landroid/support/v7/widget/ActionBarOverlayLayout;)V
     116: putfield      #108                // Field A:Ljava/lang/Runnable;
     119: aload_0
     120: new           #14                 // class android/support/v7/widget/ActionBarOverlayLayout$3
     123: dup
     124: aload_0
     125: invokespecial #109                // Method android/support/v7/widget/ActionBarOverlayLayout$3."<init>":(Landroid/support/v7/widget/ActionBarOverlayLayout;)V
     128: putfield      #111                // Field B:Ljava/lang/Runnable;
     131: aload_0
     132: aload_1
     133: invokespecial #113                // Method a:(Landroid/content/Context;)V
     136: aload_0
     137: new           #115                // class android/support/v4/view/o
     140: dup
     141: aload_0
     142: invokespecial #118                // Method android/support/v4/view/o."<init>":(Landroid/view/ViewGroup;)V
     145: putfield      #120                // Field C:Landroid/support/v4/view/o;
     148: return

  public android.support.v7.widget.ActionBarOverlayLayout$b a(android.util.AttributeSet);
    Code:
       0: new           #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
       3: dup
       4: aload_0
       5: invokevirtual #162                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #276                // Method android/support/v7/widget/ActionBarOverlayLayout$b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  public void a(int);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: iload_1
       5: iconst_2
       6: if_icmpeq     37
       9: iload_1
      10: iconst_5
      11: if_icmpeq     27
      14: iload_1
      15: bipush        109
      17: if_icmpeq     21
      20: return
      21: aload_0
      22: iconst_1
      23: invokevirtual #282                // Method setOverlayMode:(Z)V
      26: return
      27: aload_0
      28: getfield      #284                // Field i:Landroid/support/v7/widget/al;
      31: invokeinterface #286,  1          // InterfaceMethod android/support/v7/widget/al.g:()V
      36: return
      37: aload_0
      38: getfield      #284                // Field i:Landroid/support/v7/widget/al;
      41: invokeinterface #288,  1          // InterfaceMethod android/support/v7/widget/al.f:()V
      46: return

  public void a(android.view.Menu, android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: aload_1
       9: aload_2
      10: invokeinterface #291,  3          // InterfaceMethod android/support/v7/widget/al.a:(Landroid/view/Menu;Landroid/support/v7/view/menu/o$a;)V
      15: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #294                // Field l:Z
       4: ireturn

  protected android.support.v7.widget.ActionBarOverlayLayout$b b();
    Code:
       0: new           #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
       3: dup
       4: iconst_m1
       5: iconst_m1
       6: invokespecial #298                // Method android/support/v7/widget/ActionBarOverlayLayout$b."<init>":(II)V
       9: areturn

  void c();
    Code:
       0: aload_0
       1: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
       4: ifnonnull     50
       7: aload_0
       8: aload_0
       9: getstatic     #305                // Field android/support/v7/a/a$f.action_bar_activity_content:I
      12: invokevirtual #309                // Method findViewById:(I)Landroid/view/View;
      15: checkcast     #311                // class android/support/v7/widget/ContentFrameLayout
      18: putfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
      21: aload_0
      22: aload_0
      23: getstatic     #314                // Field android/support/v7/a/a$f.action_bar_container:I
      26: invokevirtual #309                // Method findViewById:(I)Landroid/view/View;
      29: checkcast     #227                // class android/support/v7/widget/ActionBarContainer
      32: putfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      35: aload_0
      36: aload_0
      37: aload_0
      38: getstatic     #317                // Field android/support/v7/a/a$f.action_bar:I
      41: invokevirtual #309                // Method findViewById:(I)Landroid/view/View;
      44: invokespecial #319                // Method a:(Landroid/view/View;)Landroid/support/v7/widget/al;
      47: putfield      #284                // Field i:Landroid/support/v7/widget/al;
      50: return

  protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
       4: ireturn

  void d();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #108                // Field A:Ljava/lang/Runnable;
       5: invokevirtual #325                // Method removeCallbacks:(Ljava/lang/Runnable;)Z
       8: pop
       9: aload_0
      10: aload_0
      11: getfield      #111                // Field B:Ljava/lang/Runnable;
      14: invokevirtual #325                // Method removeCallbacks:(Ljava/lang/Runnable;)Z
      17: pop
      18: aload_0
      19: getfield      #327                // Field c:Landroid/view/ViewPropertyAnimator;
      22: ifnull        32
      25: aload_0
      26: getfield      #327                // Field c:Landroid/view/ViewPropertyAnimator;
      29: invokevirtual #332                // Method android/view/ViewPropertyAnimator.cancel:()V
      32: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #336                // Method android/view/ViewGroup.draw:(Landroid/graphics/Canvas;)V
       5: aload_0
       6: getfield      #188                // Field j:Landroid/graphics/drawable/Drawable;
       9: ifnull        86
      12: aload_0
      13: getfield      #206                // Field k:Z
      16: ifne          86
      19: aload_0
      20: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      23: invokevirtual #339                // Method android/support/v7/widget/ActionBarContainer.getVisibility:()I
      26: ifne          54
      29: aload_0
      30: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      33: invokevirtual #342                // Method android/support/v7/widget/ActionBarContainer.getBottom:()I
      36: i2f
      37: aload_0
      38: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      41: invokevirtual #346                // Method android/support/v7/widget/ActionBarContainer.getTranslationY:()F
      44: fadd
      45: ldc_w         #347                // float 0.5f
      48: fadd
      49: f2i
      50: istore_2
      51: goto          56
      54: iconst_0
      55: istore_2
      56: aload_0
      57: getfield      #188                // Field j:Landroid/graphics/drawable/Drawable;
      60: iconst_0
      61: iload_2
      62: aload_0
      63: invokevirtual #350                // Method getWidth:()I
      66: aload_0
      67: getfield      #188                // Field j:Landroid/graphics/drawable/Drawable;
      70: invokevirtual #355                // Method android/graphics/drawable/Drawable.getIntrinsicHeight:()I
      73: iload_2
      74: iadd
      75: invokevirtual #359                // Method android/graphics/drawable/Drawable.setBounds:(IIII)V
      78: aload_0
      79: getfield      #188                // Field j:Landroid/graphics/drawable/Drawable;
      82: aload_1
      83: invokevirtual #360                // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      86: return

  public boolean e();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #362,  1          // InterfaceMethod android/support/v7/widget/al.h:()Z
      13: ireturn

  public boolean f();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #364,  1          // InterfaceMethod android/support/v7/widget/al.i:()Z
      13: ireturn

  protected boolean fitSystemWindows(android.graphics.Rect);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: invokestatic  #371                // Method android/support/v4/view/s.n:(Landroid/view/View;)I
       8: pop
       9: aload_0
      10: aload_0
      11: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      14: aload_1
      15: iconst_1
      16: iconst_1
      17: iconst_0
      18: iconst_1
      19: invokespecial #373                // Method a:(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
      22: istore_2
      23: aload_0
      24: getfield      #92                 // Field t:Landroid/graphics/Rect;
      27: aload_1
      28: invokevirtual #377                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      31: aload_0
      32: aload_0
      33: getfield      #92                 // Field t:Landroid/graphics/Rect;
      36: aload_0
      37: getfield      #86                 // Field q:Landroid/graphics/Rect;
      40: invokestatic  #382                // Method android/support/v7/widget/bx.a:(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
      43: aload_0
      44: getfield      #94                 // Field u:Landroid/graphics/Rect;
      47: aload_0
      48: getfield      #92                 // Field t:Landroid/graphics/Rect;
      51: invokevirtual #386                // Method android/graphics/Rect.equals:(Ljava/lang/Object;)Z
      54: ifne          70
      57: aload_0
      58: getfield      #94                 // Field u:Landroid/graphics/Rect;
      61: aload_0
      62: getfield      #92                 // Field t:Landroid/graphics/Rect;
      65: invokevirtual #377                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      68: iconst_1
      69: istore_2
      70: aload_0
      71: getfield      #88                 // Field r:Landroid/graphics/Rect;
      74: aload_0
      75: getfield      #86                 // Field q:Landroid/graphics/Rect;
      78: invokevirtual #386                // Method android/graphics/Rect.equals:(Ljava/lang/Object;)Z
      81: ifne          97
      84: aload_0
      85: getfield      #88                 // Field r:Landroid/graphics/Rect;
      88: aload_0
      89: getfield      #86                 // Field q:Landroid/graphics/Rect;
      92: invokevirtual #377                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
      95: iconst_1
      96: istore_2
      97: iload_2
      98: ifeq          105
     101: aload_0
     102: invokevirtual #389                // Method requestLayout:()V
     105: iconst_1
     106: ireturn

  public boolean g();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #391,  1          // InterfaceMethod android/support/v7/widget/al.j:()Z
      13: ireturn

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: aload_0
       1: invokevirtual #394                // Method b:()Landroid/support/v7/widget/ActionBarOverlayLayout$b;
       4: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #398                // Method a:(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionBarOverlayLayout$b;
       5: areturn

  protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: new           #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
       3: dup
       4: aload_1
       5: invokespecial #402                // Method android/support/v7/widget/ActionBarOverlayLayout$b."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       8: areturn

  public int getActionBarHideOffset();
    Code:
       0: aload_0
       1: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
       4: ifnull        17
       7: aload_0
       8: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      11: invokevirtual #346                // Method android/support/v7/widget/ActionBarContainer.getTranslationY:()F
      14: f2i
      15: ineg
      16: ireturn
      17: iconst_0
      18: ireturn

  public int getNestedScrollAxes();
    Code:
       0: aload_0
       1: getfield      #120                // Field C:Landroid/support/v4/view/o;
       4: invokevirtual #406                // Method android/support/v4/view/o.a:()I
       7: ireturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #410,  1          // InterfaceMethod android/support/v7/widget/al.e:()Ljava/lang/CharSequence;
      13: areturn

  public boolean h();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #412,  1          // InterfaceMethod android/support/v7/widget/al.k:()Z
      13: ireturn

  public boolean i();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #414,  1          // InterfaceMethod android/support/v7/widget/al.l:()Z
      13: ireturn

  public void j();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #416,  1          // InterfaceMethod android/support/v7/widget/al.m:()V
      13: return

  public void k();
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: invokeinterface #418,  1          // InterfaceMethod android/support/v7/widget/al.n:()V
      13: return

  protected void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #422                // Method android/view/ViewGroup.onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: aload_0
       7: invokevirtual #162                // Method getContext:()Landroid/content/Context;
      10: invokespecial #113                // Method a:(Landroid/content/Context;)V
      13: aload_0
      14: invokestatic  #425                // Method android/support/v4/view/s.o:(Landroid/view/View;)V
      17: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #428                // Method android/view/ViewGroup.onDetachedFromWindow:()V
       4: aload_0
       5: invokevirtual #263                // Method d:()V
       8: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #433                // Method getChildCount:()I
       4: istore_3
       5: aload_0
       6: invokevirtual #436                // Method getPaddingLeft:()I
       9: istore        4
      11: aload_0
      12: invokevirtual #439                // Method getPaddingRight:()I
      15: pop
      16: aload_0
      17: invokevirtual #442                // Method getPaddingTop:()I
      20: istore        5
      22: aload_0
      23: invokevirtual #445                // Method getPaddingBottom:()I
      26: pop
      27: iconst_0
      28: istore_2
      29: iload_2
      30: iload_3
      31: if_icmpge     121
      34: aload_0
      35: iload_2
      36: invokevirtual #448                // Method getChildAt:(I)Landroid/view/View;
      39: astore        10
      41: aload         10
      43: invokevirtual #449                // Method android/view/View.getVisibility:()I
      46: bipush        8
      48: if_icmpeq     114
      51: aload         10
      53: invokevirtual #237                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      56: checkcast     #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
      59: astore        11
      61: aload         10
      63: invokevirtual #452                // Method android/view/View.getMeasuredWidth:()I
      66: istore        6
      68: aload         10
      70: invokevirtual #455                // Method android/view/View.getMeasuredHeight:()I
      73: istore        7
      75: aload         11
      77: getfield      #240                // Field android/support/v7/widget/ActionBarOverlayLayout$b.leftMargin:I
      80: iload         4
      82: iadd
      83: istore        8
      85: aload         11
      87: getfield      #246                // Field android/support/v7/widget/ActionBarOverlayLayout$b.topMargin:I
      90: iload         5
      92: iadd
      93: istore        9
      95: aload         10
      97: iload         8
      99: iload         9
     101: iload         6
     103: iload         8
     105: iadd
     106: iload         7
     108: iload         9
     110: iadd
     111: invokevirtual #458                // Method android/view/View.layout:(IIII)V
     114: iload_2
     115: iconst_1
     116: iadd
     117: istore_2
     118: goto          29
     121: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: aload_0
       6: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
       9: iload_1
      10: iconst_0
      11: iload_2
      12: iconst_0
      13: invokevirtual #463                // Method measureChildWithMargins:(Landroid/view/View;IIII)V
      16: aload_0
      17: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      20: invokevirtual #464                // Method android/support/v7/widget/ActionBarContainer.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      23: checkcast     #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
      26: astore        9
      28: iconst_0
      29: aload_0
      30: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      33: invokevirtual #465                // Method android/support/v7/widget/ActionBarContainer.getMeasuredWidth:()I
      36: aload         9
      38: getfield      #240                // Field android/support/v7/widget/ActionBarOverlayLayout$b.leftMargin:I
      41: iadd
      42: aload         9
      44: getfield      #252                // Field android/support/v7/widget/ActionBarOverlayLayout$b.rightMargin:I
      47: iadd
      48: invokestatic  #470                // Method java/lang/Math.max:(II)I
      51: istore        8
      53: iconst_0
      54: aload_0
      55: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      58: invokevirtual #471                // Method android/support/v7/widget/ActionBarContainer.getMeasuredHeight:()I
      61: aload         9
      63: getfield      #246                // Field android/support/v7/widget/ActionBarOverlayLayout$b.topMargin:I
      66: iadd
      67: aload         9
      69: getfield      #258                // Field android/support/v7/widget/ActionBarOverlayLayout$b.bottomMargin:I
      72: iadd
      73: invokestatic  #470                // Method java/lang/Math.max:(II)I
      76: istore        7
      78: iconst_0
      79: aload_0
      80: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      83: invokevirtual #474                // Method android/support/v7/widget/ActionBarContainer.getMeasuredState:()I
      86: invokestatic  #477                // Method android/view/View.combineMeasuredStates:(II)I
      89: istore        6
      91: aload_0
      92: invokestatic  #371                // Method android/support/v4/view/s.n:(Landroid/view/View;)I
      95: sipush        256
      98: iand
      99: ifeq          108
     102: iconst_1
     103: istore        4
     105: goto          111
     108: iconst_0
     109: istore        4
     111: iload         4
     113: ifeq          156
     116: aload_0
     117: getfield      #182                // Field f:I
     120: istore        5
     122: iload         5
     124: istore_3
     125: aload_0
     126: getfield      #479                // Field m:Z
     129: ifeq          181
     132: iload         5
     134: istore_3
     135: aload_0
     136: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
     139: invokevirtual #483                // Method android/support/v7/widget/ActionBarContainer.getTabContainer:()Landroid/view/View;
     142: ifnull        181
     145: iload         5
     147: aload_0
     148: getfield      #182                // Field f:I
     151: iadd
     152: istore_3
     153: goto          181
     156: aload_0
     157: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
     160: invokevirtual #339                // Method android/support/v7/widget/ActionBarContainer.getVisibility:()I
     163: bipush        8
     165: if_icmpeq     179
     168: aload_0
     169: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
     172: invokevirtual #471                // Method android/support/v7/widget/ActionBarContainer.getMeasuredHeight:()I
     175: istore_3
     176: goto          181
     179: iconst_0
     180: istore_3
     181: aload_0
     182: getfield      #90                 // Field s:Landroid/graphics/Rect;
     185: aload_0
     186: getfield      #86                 // Field q:Landroid/graphics/Rect;
     189: invokevirtual #377                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
     192: aload_0
     193: getfield      #96                 // Field v:Landroid/graphics/Rect;
     196: aload_0
     197: getfield      #92                 // Field t:Landroid/graphics/Rect;
     200: invokevirtual #377                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
     203: aload_0
     204: getfield      #294                // Field l:Z
     207: ifne          242
     210: iload         4
     212: ifne          242
     215: aload_0
     216: getfield      #90                 // Field s:Landroid/graphics/Rect;
     219: astore        9
     221: aload         9
     223: aload         9
     225: getfield      #249                // Field android/graphics/Rect.top:I
     228: iload_3
     229: iadd
     230: putfield      #249                // Field android/graphics/Rect.top:I
     233: aload_0
     234: getfield      #90                 // Field s:Landroid/graphics/Rect;
     237: astore        9
     239: goto          266
     242: aload_0
     243: getfield      #96                 // Field v:Landroid/graphics/Rect;
     246: astore        9
     248: aload         9
     250: aload         9
     252: getfield      #249                // Field android/graphics/Rect.top:I
     255: iload_3
     256: iadd
     257: putfield      #249                // Field android/graphics/Rect.top:I
     260: aload_0
     261: getfield      #96                 // Field v:Landroid/graphics/Rect;
     264: astore        9
     266: aload         9
     268: aload         9
     270: getfield      #261                // Field android/graphics/Rect.bottom:I
     273: iconst_0
     274: iadd
     275: putfield      #261                // Field android/graphics/Rect.bottom:I
     278: aload_0
     279: aload_0
     280: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     283: aload_0
     284: getfield      #90                 // Field s:Landroid/graphics/Rect;
     287: iconst_1
     288: iconst_1
     289: iconst_1
     290: iconst_1
     291: invokespecial #373                // Method a:(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
     294: pop
     295: aload_0
     296: getfield      #98                 // Field w:Landroid/graphics/Rect;
     299: aload_0
     300: getfield      #96                 // Field v:Landroid/graphics/Rect;
     303: invokevirtual #386                // Method android/graphics/Rect.equals:(Ljava/lang/Object;)Z
     306: ifne          331
     309: aload_0
     310: getfield      #98                 // Field w:Landroid/graphics/Rect;
     313: aload_0
     314: getfield      #96                 // Field v:Landroid/graphics/Rect;
     317: invokevirtual #377                // Method android/graphics/Rect.set:(Landroid/graphics/Rect;)V
     320: aload_0
     321: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     324: aload_0
     325: getfield      #96                 // Field v:Landroid/graphics/Rect;
     328: invokevirtual #485                // Method android/support/v7/widget/ContentFrameLayout.a:(Landroid/graphics/Rect;)V
     331: aload_0
     332: aload_0
     333: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     336: iload_1
     337: iconst_0
     338: iload_2
     339: iconst_0
     340: invokevirtual #463                // Method measureChildWithMargins:(Landroid/view/View;IIII)V
     343: aload_0
     344: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     347: invokevirtual #486                // Method android/support/v7/widget/ContentFrameLayout.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     350: checkcast     #19                 // class android/support/v7/widget/ActionBarOverlayLayout$b
     353: astore        9
     355: iload         8
     357: aload_0
     358: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     361: invokevirtual #487                // Method android/support/v7/widget/ContentFrameLayout.getMeasuredWidth:()I
     364: aload         9
     366: getfield      #240                // Field android/support/v7/widget/ActionBarOverlayLayout$b.leftMargin:I
     369: iadd
     370: aload         9
     372: getfield      #252                // Field android/support/v7/widget/ActionBarOverlayLayout$b.rightMargin:I
     375: iadd
     376: invokestatic  #470                // Method java/lang/Math.max:(II)I
     379: istore_3
     380: iload         7
     382: aload_0
     383: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     386: invokevirtual #488                // Method android/support/v7/widget/ContentFrameLayout.getMeasuredHeight:()I
     389: aload         9
     391: getfield      #246                // Field android/support/v7/widget/ActionBarOverlayLayout$b.topMargin:I
     394: iadd
     395: aload         9
     397: getfield      #258                // Field android/support/v7/widget/ActionBarOverlayLayout$b.bottomMargin:I
     400: iadd
     401: invokestatic  #470                // Method java/lang/Math.max:(II)I
     404: istore        4
     406: iload         6
     408: aload_0
     409: getfield      #300                // Field h:Landroid/support/v7/widget/ContentFrameLayout;
     412: invokevirtual #489                // Method android/support/v7/widget/ContentFrameLayout.getMeasuredState:()I
     415: invokestatic  #477                // Method android/view/View.combineMeasuredStates:(II)I
     418: istore        5
     420: aload_0
     421: invokevirtual #436                // Method getPaddingLeft:()I
     424: istore        6
     426: aload_0
     427: invokevirtual #439                // Method getPaddingRight:()I
     430: istore        7
     432: iload         4
     434: aload_0
     435: invokevirtual #442                // Method getPaddingTop:()I
     438: aload_0
     439: invokevirtual #445                // Method getPaddingBottom:()I
     442: iadd
     443: iadd
     444: aload_0
     445: invokevirtual #492                // Method getSuggestedMinimumHeight:()I
     448: invokestatic  #470                // Method java/lang/Math.max:(II)I
     451: istore        4
     453: aload_0
     454: iload_3
     455: iload         6
     457: iload         7
     459: iadd
     460: iadd
     461: aload_0
     462: invokevirtual #495                // Method getSuggestedMinimumWidth:()I
     465: invokestatic  #470                // Method java/lang/Math.max:(II)I
     468: iload_1
     469: iload         5
     471: invokestatic  #499                // Method android/view/View.resolveSizeAndState:(III)I
     474: iload         4
     476: iload_2
     477: iload         5
     479: bipush        16
     481: ishl
     482: invokestatic  #499                // Method android/view/View.resolveSizeAndState:(III)I
     485: invokevirtual #502                // Method setMeasuredDimension:(II)V
     488: return

  public boolean onNestedFling(android.view.View, float, float, boolean);
    Code:
       0: aload_0
       1: getfield      #506                // Field n:Z
       4: ifeq          42
       7: iload         4
       9: ifne          15
      12: goto          42
      15: aload_0
      16: fload_2
      17: fload_3
      18: invokespecial #508                // Method a:(FF)Z
      21: ifeq          31
      24: aload_0
      25: invokespecial #510                // Method o:()V
      28: goto          35
      31: aload_0
      32: invokespecial #511                // Method n:()V
      35: aload_0
      36: iconst_1
      37: putfield      #513                // Field b:Z
      40: iconst_1
      41: ireturn
      42: iconst_0
      43: ireturn

  public boolean onNestedPreFling(android.view.View, float, float);
    Code:
       0: iconst_0
       1: ireturn

  public void onNestedPreScroll(android.view.View, int, int, int[]);
    Code:
       0: return

  public void onNestedScroll(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #520                // Field o:I
       5: iload_3
       6: iadd
       7: putfield      #520                // Field o:I
      10: aload_0
      11: aload_0
      12: getfield      #520                // Field o:I
      15: invokevirtual #523                // Method setActionBarHideOffset:(I)V
      18: return

  public void onNestedScrollAccepted(android.view.View, android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #120                // Field C:Landroid/support/v4/view/o;
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokevirtual #527                // Method android/support/v4/view/o.a:(Landroid/view/View;Landroid/view/View;I)V
      10: aload_0
      11: aload_0
      12: invokevirtual #529                // Method getActionBarHideOffset:()I
      15: putfield      #520                // Field o:I
      18: aload_0
      19: invokevirtual #263                // Method d:()V
      22: aload_0
      23: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      26: ifnull        38
      29: aload_0
      30: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      33: invokeinterface #533,  1          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.l:()V
      38: return

  public boolean onStartNestedScroll(android.view.View, android.view.View, int);
    Code:
       0: iload_3
       1: iconst_2
       2: iand
       3: ifeq          24
       6: aload_0
       7: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      10: invokevirtual #339                // Method android/support/v7/widget/ActionBarContainer.getVisibility:()I
      13: ifeq          19
      16: goto          24
      19: aload_0
      20: getfield      #506                // Field n:Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public void onStopNestedScroll(android.view.View);
    Code:
       0: aload_0
       1: getfield      #506                // Field n:Z
       4: ifeq          39
       7: aload_0
       8: getfield      #513                // Field b:Z
      11: ifne          39
      14: aload_0
      15: getfield      #520                // Field o:I
      18: aload_0
      19: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      22: invokevirtual #230                // Method android/support/v7/widget/ActionBarContainer.getHeight:()I
      25: if_icmpgt     35
      28: aload_0
      29: invokespecial #537                // Method l:()V
      32: goto          39
      35: aload_0
      36: invokespecial #538                // Method m:()V
      39: aload_0
      40: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      43: ifnull        55
      46: aload_0
      47: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      50: invokeinterface #539,  1          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.m:()V
      55: return

  public void onWindowSystemUiVisibilityChanged(int);
    Code:
       0: getstatic     #545                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     13
       8: aload_0
       9: iload_1
      10: invokespecial #547                // Method android/view/ViewGroup.onWindowSystemUiVisibilityChanged:(I)V
      13: aload_0
      14: invokevirtual #279                // Method c:()V
      17: aload_0
      18: getfield      #549                // Field p:I
      21: istore        4
      23: aload_0
      24: iload_1
      25: putfield      #549                // Field p:I
      28: iconst_0
      29: istore_3
      30: iload_1
      31: iconst_4
      32: iand
      33: ifne          41
      36: iconst_1
      37: istore_2
      38: goto          43
      41: iconst_0
      42: istore_2
      43: iload_1
      44: sipush        256
      47: iand
      48: ifeq          53
      51: iconst_1
      52: istore_3
      53: aload_0
      54: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      57: ifnull        104
      60: aload_0
      61: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      64: iload_3
      65: iconst_1
      66: ixor
      67: invokeinterface #551,  2          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.h:(Z)V
      72: iload_2
      73: ifne          95
      76: iload_3
      77: ifne          83
      80: goto          95
      83: aload_0
      84: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      87: invokeinterface #553,  1          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.k:()V
      92: goto          104
      95: aload_0
      96: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      99: invokeinterface #555,  1          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.j:()V
     104: iload         4
     106: iload_1
     107: ixor
     108: sipush        256
     111: iand
     112: ifeq          126
     115: aload_0
     116: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
     119: ifnull        126
     122: aload_0
     123: invokestatic  #425                // Method android/support/v4/view/s.o:(Landroid/view/View;)V
     126: return

  protected void onWindowVisibilityChanged(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #558                // Method android/view/ViewGroup.onWindowVisibilityChanged:(I)V
       5: aload_0
       6: iload_1
       7: putfield      #80                 // Field g:I
      10: aload_0
      11: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      14: ifnull        27
      17: aload_0
      18: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      21: iload_1
      22: invokeinterface #560,  2          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.c:(I)V
      27: return

  public void setActionBarHideOffset(int);
    Code:
       0: aload_0
       1: invokevirtual #263                // Method d:()V
       4: iconst_0
       5: iload_1
       6: aload_0
       7: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      10: invokevirtual #230                // Method android/support/v7/widget/ActionBarContainer.getHeight:()I
      13: invokestatic  #563                // Method java/lang/Math.min:(II)I
      16: invokestatic  #470                // Method java/lang/Math.max:(II)I
      19: istore_1
      20: aload_0
      21: getfield      #225                // Field a:Landroid/support/v7/widget/ActionBarContainer;
      24: iload_1
      25: ineg
      26: i2f
      27: invokevirtual #567                // Method android/support/v7/widget/ActionBarContainer.setTranslationY:(F)V
      30: return

  public void setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
       5: aload_0
       6: invokevirtual #573                // Method getWindowToken:()Landroid/os/IBinder;
       9: ifnull        44
      12: aload_0
      13: getfield      #531                // Field x:Landroid/support/v7/widget/ActionBarOverlayLayout$a;
      16: aload_0
      17: getfield      #80                 // Field g:I
      20: invokeinterface #560,  2          // InterfaceMethod android/support/v7/widget/ActionBarOverlayLayout$a.c:(I)V
      25: aload_0
      26: getfield      #549                // Field p:I
      29: ifeq          44
      32: aload_0
      33: aload_0
      34: getfield      #549                // Field p:I
      37: invokevirtual #574                // Method onWindowSystemUiVisibilityChanged:(I)V
      40: aload_0
      41: invokestatic  #425                // Method android/support/v4/view/s.o:(Landroid/view/View;)V
      44: return

  public void setHasNonEmbeddedTabs(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #479                // Field m:Z
       5: return

  public void setHideOnContentScrollEnabled(boolean);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #506                // Field n:Z
       5: if_icmpeq     26
       8: aload_0
       9: iload_1
      10: putfield      #506                // Field n:Z
      13: iload_1
      14: ifne          26
      17: aload_0
      18: invokevirtual #263                // Method d:()V
      21: aload_0
      22: iconst_0
      23: invokevirtual #523                // Method setActionBarHideOffset:(I)V
      26: return

  public void setIcon(int);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: iload_1
       9: invokeinterface #579,  2          // InterfaceMethod android/support/v7/widget/al.a:(I)V
      14: return

  public void setIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: aload_1
       9: invokeinterface #582,  2          // InterfaceMethod android/support/v7/widget/al.a:(Landroid/graphics/drawable/Drawable;)V
      14: return

  public void setLogo(int);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: iload_1
       9: invokeinterface #585,  2          // InterfaceMethod android/support/v7/widget/al.b:(I)V
      14: return

  public void setOverlayMode(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #294                // Field l:Z
       5: iload_1
       6: ifeq          29
       9: aload_0
      10: invokevirtual #162                // Method getContext:()Landroid/content/Context;
      13: invokevirtual #199                // Method android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
      16: getfield      #204                // Field android/content/pm/ApplicationInfo.targetSdkVersion:I
      19: bipush        19
      21: if_icmpge     29
      24: iconst_1
      25: istore_1
      26: goto          31
      29: iconst_0
      30: istore_1
      31: aload_0
      32: iload_1
      33: putfield      #206                // Field k:Z
      36: return

  public void setShowingForActionMode(boolean);
    Code:
       0: return

  public void setUiOptions(int);
    Code:
       0: return

  public void setWindowCallback(android.view.Window$Callback);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: aload_1
       9: invokeinterface #591,  2          // InterfaceMethod android/support/v7/widget/al.a:(Landroid/view/Window$Callback;)V
      14: return

  public void setWindowTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokevirtual #279                // Method c:()V
       4: aload_0
       5: getfield      #284                // Field i:Landroid/support/v7/widget/al;
       8: aload_1
       9: invokeinterface #595,  2          // InterfaceMethod android/support/v7/widget/al.a:(Ljava/lang/CharSequence;)V
      14: return

  public boolean shouldDelayChildPressedState();
    Code:
       0: iconst_0
       1: ireturn
}
