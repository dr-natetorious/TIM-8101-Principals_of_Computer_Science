public class android.support.design.widget.AppBarLayout$Behavior extends android.support.design.widget.g<android.support.design.widget.AppBarLayout> {
  public android.support.design.widget.AppBarLayout$Behavior();
    Code:
       0: aload_0
       1: invokespecial #35                 // Method android/support/design/widget/g."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #37                 // Field d:I
       9: return

  public android.support.design.widget.AppBarLayout$Behavior(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #41                 // Method android/support/design/widget/g."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #37                 // Field d:I
      11: return

  static int a(android.support.design.widget.AppBarLayout$Behavior);
    Code:
       0: aload_0
       1: getfield      #44                 // Field b:I
       4: ireturn

  int a();
    Code:
       0: aload_0
       1: invokevirtual #227                // Method b:()I
       4: aload_0
       5: getfield      #44                 // Field b:I
       8: iadd
       9: ireturn

  int a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #64                 // Method a:()I
       4: istore        6
       6: iload         4
       8: ifeq          133
      11: iload         6
      13: iload         4
      15: if_icmplt     133
      18: iload         6
      20: iload         5
      22: if_icmpgt     133
      25: iload_3
      26: iload         4
      28: iload         5
      30: invokestatic  #200                // Method android/support/v4/d/a.a:(III)I
      33: istore        4
      35: iload         6
      37: iload         4
      39: if_icmpeq     138
      42: aload_2
      43: invokevirtual #230                // Method android/support/design/widget/AppBarLayout.b:()Z
      46: ifeq          60
      49: aload_0
      50: aload_2
      51: iload         4
      53: invokespecial #232                // Method b:(Landroid/support/design/widget/AppBarLayout;I)I
      56: istore_3
      57: goto          63
      60: iload         4
      62: istore_3
      63: aload_0
      64: iload_3
      65: invokevirtual #235                // Method a:(I)Z
      68: istore        7
      70: aload_0
      71: iload         4
      73: iload_3
      74: isub
      75: putfield      #44                 // Field b:I
      78: iload         7
      80: ifne          95
      83: aload_2
      84: invokevirtual #230                // Method android/support/design/widget/AppBarLayout.b:()Z
      87: ifeq          95
      90: aload_1
      91: aload_2
      92: invokevirtual #238                // Method android/support/design/widget/CoordinatorLayout.b:(Landroid/view/View;)V
      95: aload_2
      96: aload_0
      97: invokevirtual #227                // Method b:()I
     100: invokevirtual #241                // Method android/support/design/widget/AppBarLayout.a:(I)V
     103: iload         4
     105: iload         6
     107: if_icmpge     115
     110: iconst_m1
     111: istore_3
     112: goto          117
     115: iconst_1
     116: istore_3
     117: aload_0
     118: aload_1
     119: aload_2
     120: iload         4
     122: iload_3
     123: iconst_0
     124: invokespecial #243                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;IIZ)V
     127: iload         6
     129: iload         4
     131: isub
     132: ireturn
     133: aload_0
     134: iconst_0
     135: putfield      #44                 // Field b:I
     138: iconst_0
     139: ireturn

  int a(android.support.design.widget.CoordinatorLayout, android.view.View, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: iload_3
       7: iload         4
       9: iload         5
      11: invokevirtual #246                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;III)I
      14: ireturn

  int a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       5: invokevirtual #249                // Method c:(Landroid/support/design/widget/AppBarLayout;)I
       8: ireturn

  void a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #251                // Method c:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;)V
       6: return

  public void a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.os.Parcelable);
    Code:
       0: aload_3
       1: instanceof    #15                 // class android/support/design/widget/AppBarLayout$Behavior$b
       4: ifeq          47
       7: aload_3
       8: checkcast     #15                 // class android/support/design/widget/AppBarLayout$Behavior$b
      11: astore_3
      12: aload_0
      13: aload_1
      14: aload_2
      15: aload_3
      16: invokevirtual #255                // Method android/support/design/widget/AppBarLayout$Behavior$b.a:()Landroid/os/Parcelable;
      19: invokespecial #258                // Method android/support/design/widget/g.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
      22: aload_0
      23: aload_3
      24: getfield      #260                // Field android/support/design/widget/AppBarLayout$Behavior$b.a:I
      27: putfield      #37                 // Field d:I
      30: aload_0
      31: aload_3
      32: getfield      #262                // Field android/support/design/widget/AppBarLayout$Behavior$b.b:F
      35: putfield      #264                // Field f:F
      38: aload_0
      39: aload_3
      40: getfield      #266                // Field android/support/design/widget/AppBarLayout$Behavior$b.c:Z
      43: putfield      #268                // Field e:Z
      46: return
      47: aload_0
      48: aload_1
      49: aload_2
      50: aload_3
      51: invokespecial #258                // Method android/support/design/widget/g.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
      54: aload_0
      55: iconst_m1
      56: putfield      #37                 // Field d:I
      59: return

  public void a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, int);
    Code:
       0: iload         4
       2: ifne          11
       5: aload_0
       6: aload_1
       7: aload_2
       8: invokespecial #251                // Method c:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;)V
      11: aload_0
      12: new           #271                // class java/lang/ref/WeakReference
      15: dup
      16: aload_3
      17: invokespecial #274                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      20: putfield      #276                // Field g:Ljava/lang/ref/WeakReference;
      23: return

  public void a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, int, int, int, int, int);
    Code:
       0: iload         7
       2: ifge          20
       5: aload_0
       6: aload_1
       7: aload_2
       8: iload         7
      10: aload_2
      11: invokevirtual #280                // Method android/support/design/widget/AppBarLayout.getDownNestedScrollRange:()I
      14: ineg
      15: iconst_0
      16: invokevirtual #282                // Method b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)I
      19: pop
      20: return

  public void a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, int, int, int[], int);
    Code:
       0: iload         5
       2: ifeq          70
       5: iload         5
       7: ifge          37
      10: aload_2
      11: invokevirtual #195                // Method android/support/design/widget/AppBarLayout.getTotalScrollRange:()I
      14: ineg
      15: istore        7
      17: aload_2
      18: invokevirtual #286                // Method android/support/design/widget/AppBarLayout.getDownNestedPreScrollRange:()I
      21: istore        8
      23: iload         7
      25: istore        4
      27: iload         8
      29: iload         7
      31: iadd
      32: istore        7
      34: goto          47
      37: aload_2
      38: invokevirtual #289                // Method android/support/design/widget/AppBarLayout.getUpNestedPreScrollRange:()I
      41: ineg
      42: istore        4
      44: iconst_0
      45: istore        7
      47: iload         4
      49: iload         7
      51: if_icmpeq     70
      54: aload         6
      56: iconst_1
      57: aload_0
      58: aload_1
      59: aload_2
      60: iload         5
      62: iload         4
      64: iload         7
      66: invokevirtual #282                // Method b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)I
      69: iastore
      70: return

  void a(android.support.design.widget.CoordinatorLayout, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: invokevirtual #292                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;)V
       9: return

  public void a(android.support.design.widget.CoordinatorLayout, android.view.View, android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: aload_3
       7: invokevirtual #294                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/os/Parcelable;)V
      10: return

  public void a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: aload_3
       7: iload         4
       9: invokevirtual #297                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/view/View;I)V
      12: return

  public void a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: aload_3
       7: iload         4
       9: iload         5
      11: iload         6
      13: iload         7
      15: iload         8
      17: invokevirtual #300                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/view/View;IIIII)V
      20: return

  public void a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: aload_3
       7: iload         4
       9: iload         5
      11: aload         6
      13: iload         7
      15: invokevirtual #303                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/view/View;II[II)V
      18: return

  public boolean a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #304                // Method android/support/design/widget/g.a:(I)Z
       5: ireturn

  boolean a(android.support.design.widget.AppBarLayout);
    Code:
       0: aload_0
       1: getfield      #307                // Field h:Landroid/support/design/widget/AppBarLayout$Behavior$a;
       4: ifnull        16
       7: aload_0
       8: getfield      #307                // Field h:Landroid/support/design/widget/AppBarLayout$Behavior$a;
      11: aload_1
      12: invokevirtual #309                // Method android/support/design/widget/AppBarLayout$Behavior$a.a:(Landroid/support/design/widget/AppBarLayout;)Z
      15: ireturn
      16: aload_0
      17: getfield      #276                // Field g:Ljava/lang/ref/WeakReference;
      20: astore_1
      21: iconst_1
      22: istore_2
      23: aload_1
      24: ifnull        61
      27: aload_0
      28: getfield      #276                // Field g:Ljava/lang/ref/WeakReference;
      31: invokevirtual #312                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      34: checkcast     #55                 // class android/view/View
      37: astore_1
      38: aload_1
      39: ifnull        59
      42: aload_1
      43: invokevirtual #315                // Method android/view/View.isShown:()Z
      46: ifeq          59
      49: aload_1
      50: iconst_m1
      51: invokevirtual #318                // Method android/view/View.canScrollVertically:(I)Z
      54: ifne          59
      57: iconst_1
      58: ireturn
      59: iconst_0
      60: istore_2
      61: iload_2
      62: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #322                // Method android/support/design/widget/g.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)Z
       7: istore        5
       9: aload_2
      10: invokevirtual #325                // Method android/support/design/widget/AppBarLayout.getPendingAction:()I
      13: istore        4
      15: aload_0
      16: getfield      #37                 // Field d:I
      19: iflt          101
      22: iload         4
      24: bipush        8
      26: iand
      27: ifne          101
      30: aload_2
      31: aload_0
      32: getfield      #37                 // Field d:I
      35: invokevirtual #53                 // Method android/support/design/widget/AppBarLayout.getChildAt:(I)Landroid/view/View;
      38: astore        6
      40: aload         6
      42: invokevirtual #61                 // Method android/view/View.getBottom:()I
      45: ineg
      46: istore        4
      48: aload_0
      49: getfield      #268                // Field e:Z
      52: ifeq          69
      55: aload         6
      57: invokestatic  #145                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
      60: aload_2
      61: invokevirtual #148                // Method android/support/design/widget/AppBarLayout.getTopInset:()I
      64: iadd
      65: istore_3
      66: goto          87
      69: aload         6
      71: invokevirtual #167                // Method android/view/View.getHeight:()I
      74: i2f
      75: aload_0
      76: getfield      #264                // Field f:F
      79: fmul
      80: invokestatic  #78                 // Method java/lang/Math.round:(F)I
      83: istore_3
      84: goto          66
      87: aload_0
      88: aload_1
      89: aload_2
      90: iload         4
      92: iload_3
      93: iadd
      94: invokevirtual #329                // Method a_:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)I
      97: pop
      98: goto          192
     101: iload         4
     103: ifeq          192
     106: iload         4
     108: iconst_4
     109: iand
     110: ifeq          118
     113: iconst_1
     114: istore_3
     115: goto          120
     118: iconst_0
     119: istore_3
     120: iload         4
     122: iconst_2
     123: iand
     124: ifeq          162
     127: aload_2
     128: invokevirtual #289                // Method android/support/design/widget/AppBarLayout.getUpNestedPreScrollRange:()I
     131: ineg
     132: istore        4
     134: iload_3
     135: ifeq          150
     138: aload_0
     139: aload_1
     140: aload_2
     141: iload         4
     143: fconst_0
     144: invokespecial #202                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;IF)V
     147: goto          192
     150: aload_0
     151: aload_1
     152: aload_2
     153: iload         4
     155: invokevirtual #329                // Method a_:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)I
     158: pop
     159: goto          192
     162: iload         4
     164: iconst_1
     165: iand
     166: ifeq          192
     169: iload_3
     170: ifeq          184
     173: aload_0
     174: aload_1
     175: aload_2
     176: iconst_0
     177: fconst_0
     178: invokespecial #202                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;IF)V
     181: goto          192
     184: aload_0
     185: aload_1
     186: aload_2
     187: iconst_0
     188: invokevirtual #329                // Method a_:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)I
     191: pop
     192: aload_2
     193: invokevirtual #331                // Method android/support/design/widget/AppBarLayout.d:()V
     196: aload_0
     197: iconst_m1
     198: putfield      #37                 // Field d:I
     201: aload_0
     202: aload_0
     203: invokevirtual #227                // Method b:()I
     206: aload_2
     207: invokevirtual #195                // Method android/support/design/widget/AppBarLayout.getTotalScrollRange:()I
     210: ineg
     211: iconst_0
     212: invokestatic  #200                // Method android/support/v4/d/a.a:(III)I
     215: invokevirtual #235                // Method a:(I)Z
     218: pop
     219: aload_0
     220: aload_1
     221: aload_2
     222: aload_0
     223: invokevirtual #227                // Method b:()I
     226: iconst_0
     227: iconst_1
     228: invokespecial #243                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;IIZ)V
     231: aload_2
     232: aload_0
     233: invokevirtual #227                // Method b:()I
     236: invokevirtual #241                // Method android/support/design/widget/AppBarLayout.a:(I)V
     239: iload         5
     241: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, int, int);
    Code:
       0: aload_2
       1: invokevirtual #333                // Method android/support/design/widget/AppBarLayout.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #218                // class android/support/design/widget/CoordinatorLayout$e
       7: getfield      #336                // Field android/support/design/widget/CoordinatorLayout$e.height:I
      10: bipush        -2
      12: if_icmpne     32
      15: aload_1
      16: aload_2
      17: iload_3
      18: iload         4
      20: iconst_0
      21: iconst_0
      22: invokestatic  #341                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      25: iload         6
      27: invokevirtual #344                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;IIII)V
      30: iconst_1
      31: ireturn
      32: aload_0
      33: aload_1
      34: aload_2
      35: iload_3
      36: iload         4
      38: iload         5
      40: iload         6
      42: invokespecial #347                // Method android/support/design/widget/g.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
      45: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, android.view.View, int, int);
    Code:
       0: iload         5
       2: iconst_2
       3: iand
       4: ifeq          36
       7: aload_2
       8: invokevirtual #350                // Method android/support/design/widget/AppBarLayout.c:()Z
      11: ifeq          36
      14: aload_1
      15: invokevirtual #351                // Method android/support/design/widget/CoordinatorLayout.getHeight:()I
      18: aload_3
      19: invokevirtual #167                // Method android/view/View.getHeight:()I
      22: isub
      23: aload_2
      24: invokevirtual #81                 // Method android/support/design/widget/AppBarLayout.getHeight:()I
      27: if_icmpgt     36
      30: iconst_1
      31: istore        7
      33: goto          39
      36: iconst_0
      37: istore        7
      39: iload         7
      41: ifeq          58
      44: aload_0
      45: getfield      #87                 // Field c:Landroid/animation/ValueAnimator;
      48: ifnull        58
      51: aload_0
      52: getfield      #87                 // Field c:Landroid/animation/ValueAnimator;
      55: invokevirtual #96                 // Method android/animation/ValueAnimator.cancel:()V
      58: aload_0
      59: aconst_null
      60: putfield      #276                // Field g:Ljava/lang/ref/WeakReference;
      63: iload         7
      65: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: iload_3
       7: invokevirtual #353                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;I)Z
      10: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: iload_3
       7: iload         4
       9: iload         5
      11: iload         6
      13: invokevirtual #355                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;IIII)Z
      16: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: aload_3
       7: aload         4
       9: iload         5
      11: iload         6
      13: invokevirtual #358                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;Landroid/view/View;Landroid/view/View;II)Z
      16: ireturn

  public int b();
    Code:
       0: aload_0
       1: invokespecial #359                // Method android/support/design/widget/g.b:()I
       4: ireturn

  int b(android.support.design.widget.AppBarLayout);
    Code:
       0: aload_1
       1: invokevirtual #280                // Method android/support/design/widget/AppBarLayout.getDownNestedScrollRange:()I
       4: ineg
       5: ireturn

  int b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       5: invokevirtual #361                // Method b:(Landroid/support/design/widget/AppBarLayout;)I
       8: ireturn

  public android.os.Parcelable b(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #365                // Method android/support/design/widget/g.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
       6: astore        8
       8: aload_0
       9: invokevirtual #227                // Method b:()I
      12: istore        4
      14: aload_2
      15: invokevirtual #49                 // Method android/support/design/widget/AppBarLayout.getChildCount:()I
      18: istore        5
      20: iconst_0
      21: istore        7
      23: iconst_0
      24: istore_3
      25: iload_3
      26: iload         5
      28: if_icmpge     126
      31: aload_2
      32: iload_3
      33: invokevirtual #53                 // Method android/support/design/widget/AppBarLayout.getChildAt:(I)Landroid/view/View;
      36: astore_1
      37: aload_1
      38: invokevirtual #61                 // Method android/view/View.getBottom:()I
      41: iload         4
      43: iadd
      44: istore        6
      46: aload_1
      47: invokevirtual #58                 // Method android/view/View.getTop:()I
      50: iload         4
      52: iadd
      53: ifgt          119
      56: iload         6
      58: iflt          119
      61: new           #15                 // class android/support/design/widget/AppBarLayout$Behavior$b
      64: dup
      65: aload         8
      67: invokespecial #368                // Method android/support/design/widget/AppBarLayout$Behavior$b."<init>":(Landroid/os/Parcelable;)V
      70: astore        8
      72: aload         8
      74: iload_3
      75: putfield      #260                // Field android/support/design/widget/AppBarLayout$Behavior$b.a:I
      78: iload         6
      80: aload_1
      81: invokestatic  #145                // Method android/support/v4/view/s.j:(Landroid/view/View;)I
      84: aload_2
      85: invokevirtual #148                // Method android/support/design/widget/AppBarLayout.getTopInset:()I
      88: iadd
      89: if_icmpne     95
      92: iconst_1
      93: istore        7
      95: aload         8
      97: iload         7
      99: putfield      #266                // Field android/support/design/widget/AppBarLayout$Behavior$b.c:Z
     102: aload         8
     104: iload         6
     106: i2f
     107: aload_1
     108: invokevirtual #167                // Method android/view/View.getHeight:()I
     111: i2f
     112: fdiv
     113: putfield      #262                // Field android/support/design/widget/AppBarLayout$Behavior$b.b:F
     116: aload         8
     118: areturn
     119: iload_3
     120: iconst_1
     121: iadd
     122: istore_3
     123: goto          25
     126: aload         8
     128: areturn

  public android.os.Parcelable b(android.support.design.widget.CoordinatorLayout, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       6: invokevirtual #370                // Method b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/support/design/widget/AppBarLayout;)Landroid/os/Parcelable;
       9: areturn

  int c(android.support.design.widget.AppBarLayout);
    Code:
       0: aload_1
       1: invokevirtual #195                // Method android/support/design/widget/AppBarLayout.getTotalScrollRange:()I
       4: ireturn

  boolean c(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #7                  // class android/support/design/widget/AppBarLayout
       5: invokevirtual #371                // Method a:(Landroid/support/design/widget/AppBarLayout;)Z
       8: ireturn
}
