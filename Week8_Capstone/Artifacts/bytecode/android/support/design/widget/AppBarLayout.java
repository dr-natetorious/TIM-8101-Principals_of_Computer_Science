public class android.support.design.widget.AppBarLayout extends android.widget.LinearLayout {
  public android.support.design.widget.AppBarLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #47                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.widget.AppBarLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #49                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #51                 // Field a:I
      11: aload_0
      12: iconst_m1
      13: putfield      #53                 // Field b:I
      16: aload_0
      17: iconst_m1
      18: putfield      #55                 // Field c:I
      21: aload_0
      22: iconst_0
      23: putfield      #57                 // Field e:I
      26: aload_0
      27: iconst_1
      28: invokevirtual #61                 // Method setOrientation:(I)V
      31: aload_1
      32: invokestatic  #65                 // Method android/support/design/widget/m.a:(Landroid/content/Context;)V
      35: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
      38: bipush        21
      40: if_icmplt     56
      43: aload_0
      44: invokestatic  #75                 // Method android/support/design/widget/q.a:(Landroid/view/View;)V
      47: aload_0
      48: aload_2
      49: iconst_0
      50: getstatic     #80                 // Field android/support/design/a$i.Widget_Design_AppBarLayout:I
      53: invokestatic  #83                 // Method android/support/design/widget/q.a:(Landroid/view/View;Landroid/util/AttributeSet;II)V
      56: aload_1
      57: aload_2
      58: getstatic     #88                 // Field android/support/design/a$j.AppBarLayout:[I
      61: iconst_0
      62: getstatic     #80                 // Field android/support/design/a$i.Widget_Design_AppBarLayout:I
      65: invokevirtual #94                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      68: astore_1
      69: aload_0
      70: aload_1
      71: getstatic     #97                 // Field android/support/design/a$j.AppBarLayout_android_background:I
      74: invokevirtual #103                // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      77: invokestatic  #108                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      80: aload_1
      81: getstatic     #111                // Field android/support/design/a$j.AppBarLayout_expanded:I
      84: invokevirtual #115                // Method android/content/res/TypedArray.hasValue:(I)Z
      87: ifeq          104
      90: aload_0
      91: aload_1
      92: getstatic     #111                // Field android/support/design/a$j.AppBarLayout_expanded:I
      95: iconst_0
      96: invokevirtual #119                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      99: iconst_0
     100: iconst_0
     101: invokespecial #122                // Method a:(ZZZ)V
     104: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
     107: bipush        21
     109: if_icmplt     135
     112: aload_1
     113: getstatic     #125                // Field android/support/design/a$j.AppBarLayout_elevation:I
     116: invokevirtual #115                // Method android/content/res/TypedArray.hasValue:(I)Z
     119: ifeq          135
     122: aload_0
     123: aload_1
     124: getstatic     #125                // Field android/support/design/a$j.AppBarLayout_elevation:I
     127: iconst_0
     128: invokevirtual #129                // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
     131: i2f
     132: invokestatic  #132                // Method android/support/design/widget/q.a:(Landroid/view/View;F)V
     135: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
     138: bipush        26
     140: if_icmplt     187
     143: aload_1
     144: getstatic     #135                // Field android/support/design/a$j.AppBarLayout_android_keyboardNavigationCluster:I
     147: invokevirtual #115                // Method android/content/res/TypedArray.hasValue:(I)Z
     150: ifeq          165
     153: aload_0
     154: aload_1
     155: getstatic     #135                // Field android/support/design/a$j.AppBarLayout_android_keyboardNavigationCluster:I
     158: iconst_0
     159: invokevirtual #119                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     162: invokevirtual #139                // Method setKeyboardNavigationCluster:(Z)V
     165: aload_1
     166: getstatic     #142                // Field android/support/design/a$j.AppBarLayout_android_touchscreenBlocksFocus:I
     169: invokevirtual #115                // Method android/content/res/TypedArray.hasValue:(I)Z
     172: ifeq          187
     175: aload_0
     176: aload_1
     177: getstatic     #142                // Field android/support/design/a$j.AppBarLayout_android_touchscreenBlocksFocus:I
     180: iconst_0
     181: invokevirtual #119                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
     184: invokevirtual #145                // Method setTouchscreenBlocksFocus:(Z)V
     187: aload_1
     188: invokevirtual #149                // Method android/content/res/TypedArray.recycle:()V
     191: aload_0
     192: new           #6                  // class android/support/design/widget/AppBarLayout$1
     195: dup
     196: aload_0
     197: invokespecial #152                // Method android/support/design/widget/AppBarLayout$1."<init>":(Landroid/support/design/widget/AppBarLayout;)V
     200: invokestatic  #155                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/p;)V
     203: return

  protected android.support.design.widget.AppBarLayout$a a();
    Code:
       0: new           #24                 // class android/support/design/widget/AppBarLayout$a
       3: dup
       4: iconst_m1
       5: bipush        -2
       7: invokespecial #187                // Method android/support/design/widget/AppBarLayout$a."<init>":(II)V
      10: areturn

  public android.support.design.widget.AppBarLayout$a a(android.util.AttributeSet);
    Code:
       0: new           #24                 // class android/support/design/widget/AppBarLayout$a
       3: dup
       4: aload_0
       5: invokevirtual #192                // Method getContext:()Landroid/content/Context;
       8: aload_1
       9: invokespecial #193                // Method android/support/design/widget/AppBarLayout$a."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
      12: areturn

  protected android.support.design.widget.AppBarLayout$a a(android.view.ViewGroup$LayoutParams);
    Code:
       0: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     27
       8: aload_1
       9: instanceof    #196                // class android/widget/LinearLayout$LayoutParams
      12: ifeq          27
      15: new           #24                 // class android/support/design/widget/AppBarLayout$a
      18: dup
      19: aload_1
      20: checkcast     #196                // class android/widget/LinearLayout$LayoutParams
      23: invokespecial #199                // Method android/support/design/widget/AppBarLayout$a."<init>":(Landroid/widget/LinearLayout$LayoutParams;)V
      26: areturn
      27: aload_1
      28: instanceof    #201                // class android/view/ViewGroup$MarginLayoutParams
      31: ifeq          46
      34: new           #24                 // class android/support/design/widget/AppBarLayout$a
      37: dup
      38: aload_1
      39: checkcast     #201                // class android/view/ViewGroup$MarginLayoutParams
      42: invokespecial #204                // Method android/support/design/widget/AppBarLayout$a."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
      45: areturn
      46: new           #24                 // class android/support/design/widget/AppBarLayout$a
      49: dup
      50: aload_1
      51: invokespecial #207                // Method android/support/design/widget/AppBarLayout$a."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
      54: areturn

  android.support.v4.view.ab a(android.support.v4.view.ab);
    Code:
       0: aload_0
       1: invokestatic  #212                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
       4: ifeq          12
       7: aload_1
       8: astore_2
       9: goto          14
      12: aconst_null
      13: astore_2
      14: aload_0
      15: getfield      #214                // Field f:Landroid/support/v4/view/ab;
      18: aload_2
      19: invokestatic  #219                // Method android/support/v4/g/i.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      22: ifne          34
      25: aload_0
      26: aload_2
      27: putfield      #214                // Field f:Landroid/support/v4/view/ab;
      30: aload_0
      31: invokespecial #221                // Method f:()V
      34: aload_1
      35: areturn

  void a(int);
    Code:
       0: aload_0
       1: getfield      #223                // Field g:Ljava/util/List;
       4: ifnull        60
       7: iconst_0
       8: istore_2
       9: aload_0
      10: getfield      #223                // Field g:Ljava/util/List;
      13: invokeinterface #228,  1          // InterfaceMethod java/util/List.size:()I
      18: istore_3
      19: iload_2
      20: iload_3
      21: if_icmpge     60
      24: aload_0
      25: getfield      #223                // Field g:Ljava/util/List;
      28: iload_2
      29: invokeinterface #232,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      34: checkcast     #26                 // class android/support/design/widget/AppBarLayout$b
      37: astore        4
      39: aload         4
      41: ifnull        53
      44: aload         4
      46: aload_0
      47: iload_1
      48: invokeinterface #235,  3          // InterfaceMethod android/support/design/widget/AppBarLayout$b.a:(Landroid/support/design/widget/AppBarLayout;I)V
      53: iload_2
      54: iconst_1
      55: iadd
      56: istore_2
      57: goto          19
      60: return

  public void a(boolean, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iconst_1
       4: invokespecial #122                // Method a:(ZZZ)V
       7: return

  boolean a(boolean);
    Code:
       0: aload_0
       1: getfield      #238                // Field i:Z
       4: iload_1
       5: if_icmpeq     19
       8: aload_0
       9: iload_1
      10: putfield      #238                // Field i:Z
      13: aload_0
      14: invokevirtual #164                // Method refreshDrawableState:()V
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  boolean b();
    Code:
       0: aload_0
       1: getfield      #240                // Field d:Z
       4: ireturn

  boolean c();
    Code:
       0: aload_0
       1: invokevirtual #243                // Method getTotalScrollRange:()I
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #24                 // class android/support/design/widget/AppBarLayout$a
       4: ireturn

  void d();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #57                 // Field e:I
       5: return

  protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams();
    Code:
       0: aload_0
       1: invokevirtual #248                // Method a:()Landroid/support/design/widget/AppBarLayout$a;
       4: areturn

  protected android.widget.LinearLayout$LayoutParams generateDefaultLayoutParams();
    Code:
       0: aload_0
       1: invokevirtual #248                // Method a:()Landroid/support/design/widget/AppBarLayout$a;
       4: areturn

  public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #253                // Method a:(Landroid/util/AttributeSet;)Landroid/support/design/widget/AppBarLayout$a;
       5: areturn

  protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #256                // Method a:(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/design/widget/AppBarLayout$a;
       5: areturn

  public android.widget.LinearLayout$LayoutParams generateLayoutParams(android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #253                // Method a:(Landroid/util/AttributeSet;)Landroid/support/design/widget/AppBarLayout$a;
       5: areturn

  protected android.widget.LinearLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #256                // Method a:(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/design/widget/AppBarLayout$a;
       5: areturn

  int getDownNestedPreScrollRange();
    Code:
       0: aload_0
       1: getfield      #53                 // Field b:I
       4: iconst_m1
       5: if_icmpeq     13
       8: aload_0
       9: getfield      #53                 // Field b:I
      12: ireturn
      13: aload_0
      14: invokevirtual #168                // Method getChildCount:()I
      17: iconst_1
      18: isub
      19: istore_2
      20: iconst_0
      21: istore_3
      22: iload_2
      23: iflt          143
      26: aload_0
      27: iload_2
      28: invokevirtual #172                // Method getChildAt:(I)Landroid/view/View;
      31: astore        5
      33: aload         5
      35: invokevirtual #178                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      38: checkcast     #24                 // class android/support/design/widget/AppBarLayout$a
      41: astore        6
      43: aload         5
      45: invokevirtual #262                // Method android/view/View.getMeasuredHeight:()I
      48: istore        4
      50: aload         6
      52: getfield      #263                // Field android/support/design/widget/AppBarLayout$a.a:I
      55: istore_1
      56: iload_1
      57: iconst_5
      58: iand
      59: iconst_5
      60: if_icmpne     125
      63: iload_3
      64: aload         6
      66: getfield      #266                // Field android/support/design/widget/AppBarLayout$a.topMargin:I
      69: aload         6
      71: getfield      #269                // Field android/support/design/widget/AppBarLayout$a.bottomMargin:I
      74: iadd
      75: iadd
      76: istore_3
      77: iload_1
      78: bipush        8
      80: iand
      81: ifeq          95
      84: iload_3
      85: aload         5
      87: invokestatic  #272                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
      90: iadd
      91: istore_1
      92: goto          134
      95: iload_1
      96: iconst_2
      97: iand
      98: ifeq          117
     101: aload         5
     103: invokestatic  #272                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
     106: istore_1
     107: iload_3
     108: iload         4
     110: iload_1
     111: isub
     112: iadd
     113: istore_1
     114: goto          134
     117: aload_0
     118: invokevirtual #275                // Method getTopInset:()I
     121: istore_1
     122: goto          107
     125: iload_3
     126: istore_1
     127: iload_3
     128: ifle          134
     131: goto          143
     134: iload_2
     135: iconst_1
     136: isub
     137: istore_2
     138: iload_1
     139: istore_3
     140: goto          22
     143: iconst_0
     144: iload_3
     145: invokestatic  #280                // Method java/lang/Math.max:(II)I
     148: istore_1
     149: aload_0
     150: iload_1
     151: putfield      #53                 // Field b:I
     154: iload_1
     155: ireturn

  int getDownNestedScrollRange();
    Code:
       0: aload_0
       1: getfield      #55                 // Field c:I
       4: iconst_m1
       5: if_icmpeq     13
       8: aload_0
       9: getfield      #55                 // Field c:I
      12: ireturn
      13: aload_0
      14: invokevirtual #168                // Method getChildCount:()I
      17: istore        4
      19: iconst_0
      20: istore_2
      21: iconst_0
      22: istore_1
      23: iload_1
      24: istore_3
      25: iload_2
      26: iload         4
      28: if_icmpge     126
      31: aload_0
      32: iload_2
      33: invokevirtual #172                // Method getChildAt:(I)Landroid/view/View;
      36: astore        9
      38: aload         9
      40: invokevirtual #178                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      43: checkcast     #24                 // class android/support/design/widget/AppBarLayout$a
      46: astore        10
      48: aload         9
      50: invokevirtual #262                // Method android/view/View.getMeasuredHeight:()I
      53: istore        6
      55: aload         10
      57: getfield      #266                // Field android/support/design/widget/AppBarLayout$a.topMargin:I
      60: istore        7
      62: aload         10
      64: getfield      #269                // Field android/support/design/widget/AppBarLayout$a.bottomMargin:I
      67: istore        8
      69: aload         10
      71: getfield      #263                // Field android/support/design/widget/AppBarLayout$a.a:I
      74: istore        5
      76: iload_1
      77: istore_3
      78: iload         5
      80: iconst_1
      81: iand
      82: ifeq          126
      85: iload_1
      86: iload         6
      88: iload         7
      90: iload         8
      92: iadd
      93: iadd
      94: iadd
      95: istore_1
      96: iload         5
      98: iconst_2
      99: iand
     100: ifeq          119
     103: iload_1
     104: aload         9
     106: invokestatic  #272                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
     109: aload_0
     110: invokevirtual #275                // Method getTopInset:()I
     113: iadd
     114: isub
     115: istore_3
     116: goto          126
     119: iload_2
     120: iconst_1
     121: iadd
     122: istore_2
     123: goto          23
     126: iconst_0
     127: iload_3
     128: invokestatic  #280                // Method java/lang/Math.max:(II)I
     131: istore_1
     132: aload_0
     133: iload_1
     134: putfield      #55                 // Field c:I
     137: iload_1
     138: ireturn

  final int getMinimumHeightForVisibleOverlappingContent();
    Code:
       0: aload_0
       1: invokevirtual #275                // Method getTopInset:()I
       4: istore_2
       5: aload_0
       6: invokestatic  #272                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
       9: istore_1
      10: iload_1
      11: ifeq          20
      14: iload_1
      15: iconst_2
      16: imul
      17: iload_2
      18: iadd
      19: ireturn
      20: aload_0
      21: invokevirtual #168                // Method getChildCount:()I
      24: istore_1
      25: iload_1
      26: iconst_1
      27: if_icmplt     44
      30: aload_0
      31: iload_1
      32: iconst_1
      33: isub
      34: invokevirtual #172                // Method getChildAt:(I)Landroid/view/View;
      37: invokestatic  #272                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
      40: istore_1
      41: goto          46
      44: iconst_0
      45: istore_1
      46: iload_1
      47: ifeq          53
      50: goto          14
      53: aload_0
      54: invokevirtual #285                // Method getHeight:()I
      57: iconst_3
      58: idiv
      59: ireturn

  int getPendingAction();
    Code:
       0: aload_0
       1: getfield      #57                 // Field e:I
       4: ireturn

  public float getTargetElevation();
    Code:
       0: fconst_0
       1: freturn

  final int getTopInset();
    Code:
       0: aload_0
       1: getfield      #214                // Field f:Landroid/support/v4/view/ab;
       4: ifnull        15
       7: aload_0
       8: getfield      #214                // Field f:Landroid/support/v4/view/ab;
      11: invokevirtual #294                // Method android/support/v4/view/ab.b:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public final int getTotalScrollRange();
    Code:
       0: aload_0
       1: getfield      #51                 // Field a:I
       4: iconst_m1
       5: if_icmpeq     13
       8: aload_0
       9: getfield      #51                 // Field a:I
      12: ireturn
      13: aload_0
      14: invokevirtual #168                // Method getChildCount:()I
      17: istore        4
      19: iconst_0
      20: istore_2
      21: iconst_0
      22: istore_1
      23: iload_1
      24: istore_3
      25: iload_2
      26: iload         4
      28: if_icmpge     113
      31: aload_0
      32: iload_2
      33: invokevirtual #172                // Method getChildAt:(I)Landroid/view/View;
      36: astore        7
      38: aload         7
      40: invokevirtual #178                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      43: checkcast     #24                 // class android/support/design/widget/AppBarLayout$a
      46: astore        8
      48: aload         7
      50: invokevirtual #262                // Method android/view/View.getMeasuredHeight:()I
      53: istore        6
      55: aload         8
      57: getfield      #263                // Field android/support/design/widget/AppBarLayout$a.a:I
      60: istore        5
      62: iload_1
      63: istore_3
      64: iload         5
      66: iconst_1
      67: iand
      68: ifeq          113
      71: iload_1
      72: iload         6
      74: aload         8
      76: getfield      #266                // Field android/support/design/widget/AppBarLayout$a.topMargin:I
      79: iadd
      80: aload         8
      82: getfield      #269                // Field android/support/design/widget/AppBarLayout$a.bottomMargin:I
      85: iadd
      86: iadd
      87: istore_1
      88: iload         5
      90: iconst_2
      91: iand
      92: ifeq          106
      95: iload_1
      96: aload         7
      98: invokestatic  #272                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
     101: isub
     102: istore_3
     103: goto          113
     106: iload_2
     107: iconst_1
     108: iadd
     109: istore_2
     110: goto          23
     113: iconst_0
     114: iload_3
     115: aload_0
     116: invokevirtual #275                // Method getTopInset:()I
     119: isub
     120: invokestatic  #280                // Method java/lang/Math.max:(II)I
     123: istore_1
     124: aload_0
     125: iload_1
     126: putfield      #51                 // Field a:I
     129: iload_1
     130: ireturn

  int getUpNestedPreScrollRange();
    Code:
       0: aload_0
       1: invokevirtual #243                // Method getTotalScrollRange:()I
       4: ireturn

  protected int[] onCreateDrawableState(int);
    Code:
       0: aload_0
       1: getfield      #299                // Field j:[I
       4: ifnonnull     14
       7: aload_0
       8: iconst_2
       9: newarray       int
      11: putfield      #299                // Field j:[I
      14: aload_0
      15: getfield      #299                // Field j:[I
      18: astore_2
      19: aload_0
      20: iload_1
      21: aload_2
      22: arraylength
      23: iadd
      24: invokespecial #301                // Method android/widget/LinearLayout.onCreateDrawableState:(I)[I
      27: astore_3
      28: aload_0
      29: getfield      #161                // Field h:Z
      32: ifeq          42
      35: getstatic     #306                // Field android/support/design/a$b.state_collapsible:I
      38: istore_1
      39: goto          47
      42: getstatic     #306                // Field android/support/design/a$b.state_collapsible:I
      45: ineg
      46: istore_1
      47: aload_2
      48: iconst_0
      49: iload_1
      50: iastore
      51: aload_0
      52: getfield      #161                // Field h:Z
      55: ifeq          72
      58: aload_0
      59: getfield      #238                // Field i:Z
      62: ifeq          72
      65: getstatic     #309                // Field android/support/design/a$b.state_collapsed:I
      68: istore_1
      69: goto          77
      72: getstatic     #309                // Field android/support/design/a$b.state_collapsed:I
      75: ineg
      76: istore_1
      77: aload_2
      78: iconst_1
      79: iload_1
      80: iastore
      81: aload_3
      82: aload_2
      83: invokestatic  #313                // Method mergeDrawableStates:([I[I)[I
      86: areturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #317                // Method android/widget/LinearLayout.onLayout:(ZIIII)V
      11: aload_0
      12: invokespecial #221                // Method f:()V
      15: iconst_0
      16: istore_2
      17: aload_0
      18: iconst_0
      19: putfield      #240                // Field d:Z
      22: aload_0
      23: invokevirtual #168                // Method getChildCount:()I
      26: istore_3
      27: iload_2
      28: iload_3
      29: if_icmpge     64
      32: aload_0
      33: iload_2
      34: invokevirtual #172                // Method getChildAt:(I)Landroid/view/View;
      37: invokevirtual #178                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      40: checkcast     #24                 // class android/support/design/widget/AppBarLayout$a
      43: invokevirtual #320                // Method android/support/design/widget/AppBarLayout$a.b:()Landroid/view/animation/Interpolator;
      46: ifnull        57
      49: aload_0
      50: iconst_1
      51: putfield      #240                // Field d:Z
      54: goto          64
      57: iload_2
      58: iconst_1
      59: iadd
      60: istore_2
      61: goto          27
      64: aload_0
      65: invokespecial #322                // Method e:()V
      68: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #325                // Method android/widget/LinearLayout.onMeasure:(II)V
       6: aload_0
       7: invokespecial #221                // Method f:()V
      10: return

  public void setExpanded(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: aload_0
       3: invokestatic  #329                // Method android/support/v4/view/s.w:(Landroid/view/View;)Z
       6: invokevirtual #331                // Method a:(ZZ)V
       9: return

  public void setOrientation(int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpeq     16
       5: new           #333                // class java/lang/IllegalArgumentException
       8: dup
       9: ldc_w         #335                // String AppBarLayout is always vertical and does not support horizontal orientation
      12: invokespecial #338                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: aload_0
      17: iload_1
      18: invokespecial #339                // Method android/widget/LinearLayout.setOrientation:(I)V
      21: return

  public void setTargetElevation(float);
    Code:
       0: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     13
       8: aload_0
       9: fload_1
      10: invokestatic  #132                // Method android/support/design/widget/q.a:(Landroid/view/View;F)V
      13: return
}
