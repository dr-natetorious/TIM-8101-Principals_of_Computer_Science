public class android.support.v7.widget.ActionMenuView extends android.support.v7.widget.av implements android.support.v7.view.menu.h$b,android.support.v7.view.menu.p {
  android.support.v7.view.menu.h$a a;

  android.support.v7.widget.ActionMenuView$e b;

  public android.support.v7.widget.ActionMenuView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #43                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.ActionMenuView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #45                 // Method android/support/v7/widget/av."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: invokevirtual #49                 // Method setBaselineAligned:(Z)V
      11: aload_1
      12: invokevirtual #55                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      15: invokevirtual #61                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      18: getfield      #67                 // Field android/util/DisplayMetrics.density:F
      21: fstore_3
      22: aload_0
      23: ldc           #68                 // float 56.0f
      25: fload_3
      26: fmul
      27: f2i
      28: putfield      #70                 // Field k:I
      31: aload_0
      32: fload_3
      33: ldc           #71                 // float 4.0f
      35: fmul
      36: f2i
      37: putfield      #73                 // Field l:I
      40: aload_0
      41: aload_1
      42: putfield      #75                 // Field d:Landroid/content/Context;
      45: aload_0
      46: iconst_0
      47: putfield      #77                 // Field e:I
      50: return

  static int a(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #84                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #16                 // class android/support/v7/widget/ActionMenuView$c
       7: astore        11
       9: iload_3
      10: invokestatic  #90                 // Method android/view/View$MeasureSpec.getSize:(I)I
      13: iload         4
      15: isub
      16: iload_3
      17: invokestatic  #93                 // Method android/view/View$MeasureSpec.getMode:(I)I
      20: invokestatic  #97                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      23: istore        6
      25: aload_0
      26: instanceof    #99                 // class android/support/v7/view/menu/ActionMenuItemView
      29: ifeq          41
      32: aload_0
      33: checkcast     #99                 // class android/support/v7/view/menu/ActionMenuItemView
      36: astore        10
      38: goto          44
      41: aconst_null
      42: astore        10
      44: iconst_0
      45: istore        9
      47: aload         10
      49: ifnull        65
      52: aload         10
      54: invokevirtual #102                // Method android/support/v7/view/menu/ActionMenuItemView.a:()Z
      57: ifeq          65
      60: iconst_1
      61: istore_3
      62: goto          67
      65: iconst_0
      66: istore_3
      67: iconst_2
      68: istore        4
      70: iload_2
      71: ifle          142
      74: iload_3
      75: ifeq          83
      78: iload_2
      79: iconst_2
      80: if_icmplt     142
      83: aload_0
      84: iload_2
      85: iload_1
      86: imul
      87: ldc           #103                // int -2147483648
      89: invokestatic  #97                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      92: iload         6
      94: invokevirtual #107                // Method android/view/View.measure:(II)V
      97: aload_0
      98: invokevirtual #111                // Method android/view/View.getMeasuredWidth:()I
     101: istore        7
     103: iload         7
     105: iload_1
     106: idiv
     107: istore        5
     109: iload         5
     111: istore_2
     112: iload         7
     114: iload_1
     115: irem
     116: ifeq          124
     119: iload         5
     121: iconst_1
     122: iadd
     123: istore_2
     124: iload_3
     125: ifeq          139
     128: iload_2
     129: iconst_2
     130: if_icmpge     139
     133: iload         4
     135: istore_2
     136: goto          144
     139: goto          144
     142: iconst_0
     143: istore_2
     144: iload         9
     146: istore        8
     148: aload         11
     150: getfield      #113                // Field android/support/v7/widget/ActionMenuView$c.a:Z
     153: ifne          167
     156: iload         9
     158: istore        8
     160: iload_3
     161: ifeq          167
     164: iconst_1
     165: istore        8
     167: aload         11
     169: iload         8
     171: putfield      #115                // Field android/support/v7/widget/ActionMenuView$c.d:Z
     174: aload         11
     176: iload_2
     177: putfield      #117                // Field android/support/v7/widget/ActionMenuView$c.b:I
     180: aload_0
     181: iload_1
     182: iload_2
     183: imul
     184: ldc           #118                // int 1073741824
     186: invokestatic  #97                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     189: iload         6
     191: invokevirtual #107                // Method android/view/View.measure:(II)V
     194: iload_2
     195: ireturn

  public android.support.v7.widget.ActionMenuView$c a(android.util.AttributeSet);
    Code:
       0: new           #16                 // class android/support/v7/widget/ActionMenuView$c
       3: dup
       4: aload_0
       5: invokevirtual #186                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #187                // Method android/support/v7/widget/ActionMenuView$c."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  protected android.support.v7.widget.ActionMenuView$c a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: ifnull        50
       4: aload_1
       5: instanceof    #16                 // class android/support/v7/widget/ActionMenuView$c
       8: ifeq          26
      11: new           #16                 // class android/support/v7/widget/ActionMenuView$c
      14: dup
      15: aload_1
      16: checkcast     #16                 // class android/support/v7/widget/ActionMenuView$c
      19: invokespecial #191                // Method android/support/v7/widget/ActionMenuView$c."<init>":(Landroid/support/v7/widget/ActionMenuView$c;)V
      22: astore_1
      23: goto          35
      26: new           #16                 // class android/support/v7/widget/ActionMenuView$c
      29: dup
      30: aload_1
      31: invokespecial #194                // Method android/support/v7/widget/ActionMenuView$c."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
      34: astore_1
      35: aload_1
      36: getfield      #196                // Field android/support/v7/widget/ActionMenuView$c.h:I
      39: ifgt          48
      42: aload_1
      43: bipush        16
      45: putfield      #196                // Field android/support/v7/widget/ActionMenuView$c.h:I
      48: aload_1
      49: areturn
      50: aload_0
      51: invokevirtual #199                // Method b:()Landroid/support/v7/widget/ActionMenuView$c;
      54: areturn

  public void a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #202                // Field c:Landroid/support/v7/view/menu/h;
       5: return

  public void a(android.support.v7.view.menu.o$a, android.support.v7.view.menu.h$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #205                // Field h:Landroid/support/v7/view/menu/o$a;
       5: aload_0
       6: aload_2
       7: putfield      #207                // Field a:Landroid/support/v7/view/menu/h$a;
      10: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #208                // Field f:Z
       4: ireturn

  protected boolean a(int);
    Code:
       0: iconst_0
       1: istore_3
       2: iload_1
       3: ifne          8
       6: iconst_0
       7: ireturn
       8: aload_0
       9: iload_1
      10: iconst_1
      11: isub
      12: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
      15: astore        4
      17: aload_0
      18: iload_1
      19: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
      22: astore        5
      24: iload_3
      25: istore_2
      26: iload_1
      27: aload_0
      28: invokevirtual #140                // Method getChildCount:()I
      31: if_icmpge     57
      34: iload_3
      35: istore_2
      36: aload         4
      38: instanceof    #10                 // class android/support/v7/widget/ActionMenuView$a
      41: ifeq          57
      44: iconst_0
      45: aload         4
      47: checkcast     #10                 // class android/support/v7/widget/ActionMenuView$a
      50: invokeinterface #211,  1          // InterfaceMethod android/support/v7/widget/ActionMenuView$a.d:()Z
      55: ior
      56: istore_2
      57: iload_2
      58: istore_3
      59: iload_1
      60: ifle          86
      63: iload_2
      64: istore_3
      65: aload         5
      67: instanceof    #10                 // class android/support/v7/widget/ActionMenuView$a
      70: ifeq          86
      73: iload_2
      74: aload         5
      76: checkcast     #10                 // class android/support/v7/widget/ActionMenuView$a
      79: invokeinterface #213,  1          // InterfaceMethod android/support/v7/widget/ActionMenuView$a.c:()Z
      84: ior
      85: istore_3
      86: iload_3
      87: ireturn

  public boolean a(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
       4: aload_1
       5: iconst_0
       6: invokevirtual #219                // Method android/support/v7/view/menu/h.a:(Landroid/view/MenuItem;I)Z
       9: ireturn

  protected android.support.v7.widget.ActionMenuView$c b();
    Code:
       0: new           #16                 // class android/support/v7/widget/ActionMenuView$c
       3: dup
       4: bipush        -2
       6: bipush        -2
       8: invokespecial #221                // Method android/support/v7/widget/ActionMenuView$c."<init>":(II)V
      11: astore_1
      12: aload_1
      13: bipush        16
      15: putfield      #196                // Field android/support/v7/widget/ActionMenuView$c.h:I
      18: aload_1
      19: areturn

  public android.support.v7.widget.av$a b(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #224                // Method a:(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$c;
       5: areturn

  protected android.support.v7.widget.av$a b(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #227                // Method a:(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/ActionMenuView$c;
       5: areturn

  public android.support.v7.widget.ActionMenuView$c c();
    Code:
       0: aload_0
       1: invokevirtual #199                // Method b:()Landroid/support/v7/widget/ActionMenuView$c;
       4: astore_1
       5: aload_1
       6: iconst_1
       7: putfield      #113                // Field android/support/v7/widget/ActionMenuView$c.a:Z
      10: aload_1
      11: areturn

  protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: ifnull        13
       4: aload_1
       5: instanceof    #16                 // class android/support/v7/widget/ActionMenuView$c
       8: ifeq          13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public android.support.v7.view.menu.h d();
    Code:
       0: aload_0
       1: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
       4: areturn

  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: iconst_0
       1: ireturn

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       4: ifnull        19
       7: aload_0
       8: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      11: invokevirtual #238                // Method android/support/v7/widget/d.f:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       4: ifnull        19
       7: aload_0
       8: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      11: invokevirtual #240                // Method android/support/v7/widget/d.g:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean g();
    Code:
       0: aload_0
       1: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       4: ifnull        19
       7: aload_0
       8: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      11: invokevirtual #242                // Method android/support/v7/widget/d.j:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: aload_0
       1: invokevirtual #199                // Method b:()Landroid/support/v7/widget/ActionMenuView$c;
       4: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #224                // Method a:(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$c;
       5: areturn

  protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #227                // Method a:(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/ActionMenuView$c;
       5: areturn

  public android.view.Menu getMenu();
    Code:
       0: aload_0
       1: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
       4: ifnonnull     115
       7: aload_0
       8: invokevirtual #186                // Method getContext:()Landroid/content/Context;
      11: astore_1
      12: aload_0
      13: new           #216                // class android/support/v7/view/menu/h
      16: dup
      17: aload_1
      18: invokespecial #250                // Method android/support/v7/view/menu/h."<init>":(Landroid/content/Context;)V
      21: putfield      #202                // Field c:Landroid/support/v7/view/menu/h;
      24: aload_0
      25: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
      28: new           #19                 // class android/support/v7/widget/ActionMenuView$d
      31: dup
      32: aload_0
      33: invokespecial #253                // Method android/support/v7/widget/ActionMenuView$d."<init>":(Landroid/support/v7/widget/ActionMenuView;)V
      36: invokevirtual #256                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h$a;)V
      39: aload_0
      40: new           #236                // class android/support/v7/widget/d
      43: dup
      44: aload_1
      45: invokespecial #257                // Method android/support/v7/widget/d."<init>":(Landroid/content/Context;)V
      48: putfield      #234                // Field g:Landroid/support/v7/widget/d;
      51: aload_0
      52: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      55: iconst_1
      56: invokevirtual #259                // Method android/support/v7/widget/d.c:(Z)V
      59: aload_0
      60: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      63: astore_2
      64: aload_0
      65: getfield      #205                // Field h:Landroid/support/v7/view/menu/o$a;
      68: ifnull        79
      71: aload_0
      72: getfield      #205                // Field h:Landroid/support/v7/view/menu/o$a;
      75: astore_1
      76: goto          87
      79: new           #13                 // class android/support/v7/widget/ActionMenuView$b
      82: dup
      83: invokespecial #262                // Method android/support/v7/widget/ActionMenuView$b."<init>":()V
      86: astore_1
      87: aload_2
      88: aload_1
      89: invokevirtual #265                // Method android/support/v7/widget/d.a:(Landroid/support/v7/view/menu/o$a;)V
      92: aload_0
      93: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
      96: aload_0
      97: getfield      #234                // Field g:Landroid/support/v7/widget/d;
     100: aload_0
     101: getfield      #75                 // Field d:Landroid/content/Context;
     104: invokevirtual #268                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/o;Landroid/content/Context;)V
     107: aload_0
     108: getfield      #234                // Field g:Landroid/support/v7/widget/d;
     111: aload_0
     112: invokevirtual #270                // Method android/support/v7/widget/d.a:(Landroid/support/v7/widget/ActionMenuView;)V
     115: aload_0
     116: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
     119: areturn

  public android.graphics.drawable.Drawable getOverflowIcon();
    Code:
       0: aload_0
       1: invokevirtual #274                // Method getMenu:()Landroid/view/Menu;
       4: pop
       5: aload_0
       6: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       9: invokevirtual #276                // Method android/support/v7/widget/d.e:()Landroid/graphics/drawable/Drawable;
      12: areturn

  public int getPopupTheme();
    Code:
       0: aload_0
       1: getfield      #77                 // Field e:I
       4: ireturn

  public int getWindowAnimations();
    Code:
       0: iconst_0
       1: ireturn

  public boolean h();
    Code:
       0: aload_0
       1: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       4: ifnull        19
       7: aload_0
       8: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      11: invokevirtual #280                // Method android/support/v7/widget/d.k:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public void i();
    Code:
       0: aload_0
       1: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       4: ifnull        15
       7: aload_0
       8: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      11: invokevirtual #282                // Method android/support/v7/widget/d.h:()Z
      14: pop
      15: return

  protected android.support.v7.widget.av$a j();
    Code:
       0: aload_0
       1: invokevirtual #199                // Method b:()Landroid/support/v7/widget/ActionMenuView$c;
       4: areturn

  public void onConfigurationChanged(android.content.res.Configuration);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #287                // Method android/support/v7/widget/av.onConfigurationChanged:(Landroid/content/res/Configuration;)V
       5: aload_0
       6: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       9: ifnull        46
      12: aload_0
      13: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      16: iconst_0
      17: invokevirtual #289                // Method android/support/v7/widget/d.a:(Z)V
      20: aload_0
      21: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      24: invokevirtual #242                // Method android/support/v7/widget/d.j:()Z
      27: ifeq          46
      30: aload_0
      31: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      34: invokevirtual #240                // Method android/support/v7/widget/d.g:()Z
      37: pop
      38: aload_0
      39: getfield      #234                // Field g:Landroid/support/v7/widget/d;
      42: invokevirtual #238                // Method android/support/v7/widget/d.f:()Z
      45: pop
      46: return

  public void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #292                // Method android/support/v7/widget/av.onDetachedFromWindow:()V
       4: aload_0
       5: invokevirtual #294                // Method i:()V
       8: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #298                // Field i:Z
       4: ifne          19
       7: aload_0
       8: iload_1
       9: iload_2
      10: iload_3
      11: iload         4
      13: iload         5
      15: invokespecial #300                // Method android/support/v7/widget/av.onLayout:(ZIIII)V
      18: return
      19: aload_0
      20: invokevirtual #140                // Method getChildCount:()I
      23: istore        9
      25: iload         5
      27: iload_3
      28: isub
      29: iconst_2
      30: idiv
      31: istore        8
      33: aload_0
      34: invokevirtual #303                // Method getDividerWidth:()I
      37: istore        10
      39: iload         4
      41: iload_2
      42: isub
      43: istore        11
      45: aload_0
      46: invokevirtual #124                // Method getPaddingRight:()I
      49: istore_2
      50: aload_0
      51: invokevirtual #121                // Method getPaddingLeft:()I
      54: istore_3
      55: aload_0
      56: invokestatic  #308                // Method android/support/v7/widget/bx.a:(Landroid/view/View;)Z
      59: istore_1
      60: iload         11
      62: iload_2
      63: isub
      64: iload_3
      65: isub
      66: istore_2
      67: iconst_0
      68: istore_3
      69: iconst_0
      70: istore        5
      72: iconst_0
      73: istore        4
      75: iload_3
      76: iload         9
      78: if_icmpge     277
      81: aload_0
      82: iload_3
      83: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
      86: astore        14
      88: aload         14
      90: invokevirtual #147                // Method android/view/View.getVisibility:()I
      93: bipush        8
      95: if_icmpne     101
      98: goto          270
     101: aload         14
     103: invokevirtual #84                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     106: checkcast     #16                 // class android/support/v7/widget/ActionMenuView$c
     109: astore        15
     111: aload         15
     113: getfield      #113                // Field android/support/v7/widget/ActionMenuView$c.a:Z
     116: ifeq          238
     119: aload         14
     121: invokevirtual #111                // Method android/view/View.getMeasuredWidth:()I
     124: istore        6
     126: iload         6
     128: istore        5
     130: aload_0
     131: iload_3
     132: invokevirtual #310                // Method a:(I)Z
     135: ifeq          145
     138: iload         6
     140: iload         10
     142: iadd
     143: istore        5
     145: aload         14
     147: invokevirtual #173                // Method android/view/View.getMeasuredHeight:()I
     150: istore        12
     152: iload_1
     153: ifeq          178
     156: aload_0
     157: invokevirtual #121                // Method getPaddingLeft:()I
     160: aload         15
     162: getfield      #158                // Field android/support/v7/widget/ActionMenuView$c.leftMargin:I
     165: iadd
     166: istore        7
     168: iload         7
     170: iload         5
     172: iadd
     173: istore        6
     175: goto          202
     178: aload_0
     179: invokevirtual #313                // Method getWidth:()I
     182: aload_0
     183: invokevirtual #124                // Method getPaddingRight:()I
     186: isub
     187: aload         15
     189: getfield      #161                // Field android/support/v7/widget/ActionMenuView$c.rightMargin:I
     192: isub
     193: istore        6
     195: iload         6
     197: iload         5
     199: isub
     200: istore        7
     202: iload         8
     204: iload         12
     206: iconst_2
     207: idiv
     208: isub
     209: istore        13
     211: aload         14
     213: iload         7
     215: iload         13
     217: iload         6
     219: iload         12
     221: iload         13
     223: iadd
     224: invokevirtual #316                // Method android/view/View.layout:(IIII)V
     227: iload_2
     228: iload         5
     230: isub
     231: istore_2
     232: iconst_1
     233: istore        5
     235: goto          270
     238: iload_2
     239: aload         14
     241: invokevirtual #111                // Method android/view/View.getMeasuredWidth:()I
     244: aload         15
     246: getfield      #158                // Field android/support/v7/widget/ActionMenuView$c.leftMargin:I
     249: iadd
     250: aload         15
     252: getfield      #161                // Field android/support/v7/widget/ActionMenuView$c.rightMargin:I
     255: iadd
     256: isub
     257: istore_2
     258: aload_0
     259: iload_3
     260: invokevirtual #310                // Method a:(I)Z
     263: pop
     264: iload         4
     266: iconst_1
     267: iadd
     268: istore        4
     270: iload_3
     271: iconst_1
     272: iadd
     273: istore_3
     274: goto          75
     277: iload         9
     279: iconst_1
     280: if_icmpne     343
     283: iload         5
     285: ifne          343
     288: aload_0
     289: iconst_0
     290: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
     293: astore        14
     295: aload         14
     297: invokevirtual #111                // Method android/view/View.getMeasuredWidth:()I
     300: istore_2
     301: aload         14
     303: invokevirtual #173                // Method android/view/View.getMeasuredHeight:()I
     306: istore_3
     307: iload         11
     309: iconst_2
     310: idiv
     311: iload_2
     312: iconst_2
     313: idiv
     314: isub
     315: istore        4
     317: iload         8
     319: iload_3
     320: iconst_2
     321: idiv
     322: isub
     323: istore        5
     325: aload         14
     327: iload         4
     329: iload         5
     331: iload_2
     332: iload         4
     334: iadd
     335: iload_3
     336: iload         5
     338: iadd
     339: invokevirtual #316                // Method android/view/View.layout:(IIII)V
     342: return
     343: iload         4
     345: iload         5
     347: iconst_1
     348: ixor
     349: isub
     350: istore_3
     351: iload_3
     352: ifle          362
     355: iload_2
     356: iload_3
     357: idiv
     358: istore_2
     359: goto          364
     362: iconst_0
     363: istore_2
     364: iconst_0
     365: istore        5
     367: iconst_0
     368: istore        4
     370: iconst_0
     371: iload_2
     372: invokestatic  #170                // Method java/lang/Math.max:(II)I
     375: istore        6
     377: iload_1
     378: ifeq          517
     381: aload_0
     382: invokevirtual #313                // Method getWidth:()I
     385: aload_0
     386: invokevirtual #124                // Method getPaddingRight:()I
     389: isub
     390: istore_3
     391: iload         4
     393: istore_2
     394: iload_2
     395: iload         9
     397: if_icmpge     648
     400: aload_0
     401: iload_2
     402: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
     405: astore        14
     407: aload         14
     409: invokevirtual #84                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     412: checkcast     #16                 // class android/support/v7/widget/ActionMenuView$c
     415: astore        15
     417: iload_3
     418: istore        4
     420: aload         14
     422: invokevirtual #147                // Method android/view/View.getVisibility:()I
     425: bipush        8
     427: if_icmpeq     507
     430: aload         15
     432: getfield      #113                // Field android/support/v7/widget/ActionMenuView$c.a:Z
     435: ifeq          444
     438: iload_3
     439: istore        4
     441: goto          507
     444: iload_3
     445: aload         15
     447: getfield      #161                // Field android/support/v7/widget/ActionMenuView$c.rightMargin:I
     450: isub
     451: istore_3
     452: aload         14
     454: invokevirtual #111                // Method android/view/View.getMeasuredWidth:()I
     457: istore        4
     459: aload         14
     461: invokevirtual #173                // Method android/view/View.getMeasuredHeight:()I
     464: istore        5
     466: iload         8
     468: iload         5
     470: iconst_2
     471: idiv
     472: isub
     473: istore        7
     475: aload         14
     477: iload_3
     478: iload         4
     480: isub
     481: iload         7
     483: iload_3
     484: iload         5
     486: iload         7
     488: iadd
     489: invokevirtual #316                // Method android/view/View.layout:(IIII)V
     492: iload_3
     493: iload         4
     495: aload         15
     497: getfield      #158                // Field android/support/v7/widget/ActionMenuView$c.leftMargin:I
     500: iadd
     501: iload         6
     503: iadd
     504: isub
     505: istore        4
     507: iload_2
     508: iconst_1
     509: iadd
     510: istore_2
     511: iload         4
     513: istore_3
     514: goto          394
     517: aload_0
     518: invokevirtual #121                // Method getPaddingLeft:()I
     521: istore_3
     522: iload         5
     524: istore_2
     525: iload_2
     526: iload         9
     528: if_icmpge     648
     531: aload_0
     532: iload_2
     533: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
     536: astore        14
     538: aload         14
     540: invokevirtual #84                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     543: checkcast     #16                 // class android/support/v7/widget/ActionMenuView$c
     546: astore        15
     548: iload_3
     549: istore        4
     551: aload         14
     553: invokevirtual #147                // Method android/view/View.getVisibility:()I
     556: bipush        8
     558: if_icmpeq     638
     561: aload         15
     563: getfield      #113                // Field android/support/v7/widget/ActionMenuView$c.a:Z
     566: ifeq          575
     569: iload_3
     570: istore        4
     572: goto          638
     575: iload_3
     576: aload         15
     578: getfield      #158                // Field android/support/v7/widget/ActionMenuView$c.leftMargin:I
     581: iadd
     582: istore_3
     583: aload         14
     585: invokevirtual #111                // Method android/view/View.getMeasuredWidth:()I
     588: istore        4
     590: aload         14
     592: invokevirtual #173                // Method android/view/View.getMeasuredHeight:()I
     595: istore        5
     597: iload         8
     599: iload         5
     601: iconst_2
     602: idiv
     603: isub
     604: istore        7
     606: aload         14
     608: iload_3
     609: iload         7
     611: iload_3
     612: iload         4
     614: iadd
     615: iload         5
     617: iload         7
     619: iadd
     620: invokevirtual #316                // Method android/view/View.layout:(IIII)V
     623: iload_3
     624: iload         4
     626: aload         15
     628: getfield      #161                // Field android/support/v7/widget/ActionMenuView$c.rightMargin:I
     631: iadd
     632: iload         6
     634: iadd
     635: iadd
     636: istore        4
     638: iload_2
     639: iconst_1
     640: iadd
     641: istore_2
     642: iload         4
     644: istore_3
     645: goto          525
     648: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: getfield      #298                // Field i:Z
       4: istore        6
       6: iload_1
       7: invokestatic  #93                 // Method android/view/View$MeasureSpec.getMode:(I)I
      10: ldc           #118                // int 1073741824
      12: if_icmpne     21
      15: iconst_1
      16: istore        5
      18: goto          24
      21: iconst_0
      22: istore        5
      24: aload_0
      25: iload         5
      27: putfield      #298                // Field i:Z
      30: iload         6
      32: aload_0
      33: getfield      #298                // Field i:Z
      36: if_icmpeq     44
      39: aload_0
      40: iconst_0
      41: putfield      #319                // Field j:I
      44: iload_1
      45: invokestatic  #90                 // Method android/view/View$MeasureSpec.getSize:(I)I
      48: istore_3
      49: aload_0
      50: getfield      #298                // Field i:Z
      53: ifeq          84
      56: aload_0
      57: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
      60: ifnull        84
      63: iload_3
      64: aload_0
      65: getfield      #319                // Field j:I
      68: if_icmpeq     84
      71: aload_0
      72: iload_3
      73: putfield      #319                // Field j:I
      76: aload_0
      77: getfield      #202                // Field c:Landroid/support/v7/view/menu/h;
      80: iconst_1
      81: invokevirtual #320                // Method android/support/v7/view/menu/h.a:(Z)V
      84: aload_0
      85: invokevirtual #140                // Method getChildCount:()I
      88: istore        4
      90: aload_0
      91: getfield      #298                // Field i:Z
      94: ifeq          109
      97: iload         4
      99: ifle          109
     102: aload_0
     103: iload_1
     104: iload_2
     105: invokespecial #322                // Method c:(II)V
     108: return
     109: iconst_0
     110: istore_3
     111: iload_3
     112: iload         4
     114: if_icmpge     149
     117: aload_0
     118: iload_3
     119: invokevirtual #144                // Method getChildAt:(I)Landroid/view/View;
     122: invokevirtual #84                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     125: checkcast     #16                 // class android/support/v7/widget/ActionMenuView$c
     128: astore        7
     130: aload         7
     132: iconst_0
     133: putfield      #161                // Field android/support/v7/widget/ActionMenuView$c.rightMargin:I
     136: aload         7
     138: iconst_0
     139: putfield      #158                // Field android/support/v7/widget/ActionMenuView$c.leftMargin:I
     142: iload_3
     143: iconst_1
     144: iadd
     145: istore_3
     146: goto          111
     149: aload_0
     150: iload_1
     151: iload_2
     152: invokespecial #324                // Method android/support/v7/widget/av.onMeasure:(II)V
     155: return

  public void setExpandedActionViewsExclusive(boolean);
    Code:
       0: aload_0
       1: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       4: iload_1
       5: invokevirtual #327                // Method android/support/v7/widget/d.d:(Z)V
       8: return

  public void setOnMenuItemClickListener(android.support.v7.widget.ActionMenuView$e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #331                // Field b:Landroid/support/v7/widget/ActionMenuView$e;
       5: return

  public void setOverflowIcon(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: invokevirtual #274                // Method getMenu:()Landroid/view/Menu;
       4: pop
       5: aload_0
       6: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       9: aload_1
      10: invokevirtual #335                // Method android/support/v7/widget/d.a:(Landroid/graphics/drawable/Drawable;)V
      13: return

  public void setOverflowReserved(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #208                // Field f:Z
       5: return

  public void setPopupTheme(int);
    Code:
       0: aload_0
       1: getfield      #77                 // Field e:I
       4: iload_1
       5: if_icmpeq     42
       8: aload_0
       9: iload_1
      10: putfield      #77                 // Field e:I
      13: iload_1
      14: ifne          26
      17: aload_0
      18: aload_0
      19: invokevirtual #186                // Method getContext:()Landroid/content/Context;
      22: putfield      #75                 // Field d:Landroid/content/Context;
      25: return
      26: aload_0
      27: new           #340                // class android/view/ContextThemeWrapper
      30: dup
      31: aload_0
      32: invokevirtual #186                // Method getContext:()Landroid/content/Context;
      35: iload_1
      36: invokespecial #343                // Method android/view/ContextThemeWrapper."<init>":(Landroid/content/Context;I)V
      39: putfield      #75                 // Field d:Landroid/content/Context;
      42: return

  public void setPresenter(android.support.v7.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #234                // Field g:Landroid/support/v7/widget/d;
       5: aload_0
       6: getfield      #234                // Field g:Landroid/support/v7/widget/d;
       9: aload_0
      10: invokevirtual #270                // Method android/support/v7/widget/d.a:(Landroid/support/v7/widget/ActionMenuView;)V
      13: return
}
