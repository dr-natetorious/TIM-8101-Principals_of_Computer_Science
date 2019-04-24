public class android.support.design.widget.BottomSheetBehavior<V extends android.view.View> extends android.support.design.widget.CoordinatorLayout$b<V> {
  int a;

  int b;

  boolean c;

  int d;

  android.support.v4.widget.p e;

  int f;

  java.lang.ref.WeakReference<V> g;

  java.lang.ref.WeakReference<android.view.View> h;

  int i;

  boolean j;

  public android.support.design.widget.BottomSheetBehavior();
    Code:
       0: aload_0
       1: invokespecial #51                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":()V
       4: aload_0
       5: iconst_4
       6: putfield      #53                 // Field d:I
       9: aload_0
      10: new           #7                  // class android/support/design/widget/BottomSheetBehavior$1
      13: dup
      14: aload_0
      15: invokespecial #56                 // Method android/support/design/widget/BottomSheetBehavior$1."<init>":(Landroid/support/design/widget/BottomSheetBehavior;)V
      18: putfield      #58                 // Field v:Landroid/support/v4/widget/p$a;
      21: return

  public android.support.design.widget.BottomSheetBehavior(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #62                 // Method android/support/design/widget/CoordinatorLayout$b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_4
       8: putfield      #53                 // Field d:I
      11: aload_0
      12: new           #7                  // class android/support/design/widget/BottomSheetBehavior$1
      15: dup
      16: aload_0
      17: invokespecial #56                 // Method android/support/design/widget/BottomSheetBehavior$1."<init>":(Landroid/support/design/widget/BottomSheetBehavior;)V
      20: putfield      #58                 // Field v:Landroid/support/v4/widget/p$a;
      23: aload_1
      24: aload_2
      25: getstatic     #68                 // Field android/support/design/a$j.BottomSheetBehavior_Layout:[I
      28: invokevirtual #74                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      31: astore_2
      32: aload_2
      33: getstatic     #77                 // Field android/support/design/a$j.BottomSheetBehavior_Layout_behavior_peekHeight:I
      36: invokevirtual #83                 // Method android/content/res/TypedArray.peekValue:(I)Landroid/util/TypedValue;
      39: astore        4
      41: aload         4
      43: ifnull        64
      46: aload         4
      48: getfield      #88                 // Field android/util/TypedValue.data:I
      51: iconst_m1
      52: if_icmpne     64
      55: aload         4
      57: getfield      #88                 // Field android/util/TypedValue.data:I
      60: istore_3
      61: goto          73
      64: aload_2
      65: getstatic     #77                 // Field android/support/design/a$j.BottomSheetBehavior_Layout_behavior_peekHeight:I
      68: iconst_m1
      69: invokevirtual #92                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      72: istore_3
      73: aload_0
      74: iload_3
      75: invokevirtual #95                 // Method a:(I)V
      78: aload_0
      79: aload_2
      80: getstatic     #98                 // Field android/support/design/a$j.BottomSheetBehavior_Layout_behavior_hideable:I
      83: iconst_0
      84: invokevirtual #102                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      87: invokevirtual #105                // Method a:(Z)V
      90: aload_0
      91: aload_2
      92: getstatic     #108                // Field android/support/design/a$j.BottomSheetBehavior_Layout_behavior_skipCollapsed:I
      95: iconst_0
      96: invokevirtual #102                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      99: invokevirtual #110                // Method b:(Z)V
     102: aload_2
     103: invokevirtual #113                // Method android/content/res/TypedArray.recycle:()V
     106: aload_0
     107: aload_1
     108: invokestatic  #119                // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
     111: invokevirtual #123                // Method android/view/ViewConfiguration.getScaledMaximumFlingVelocity:()I
     114: i2f
     115: putfield      #125                // Field k:F
     118: return

  android.view.View a(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #147                // Method android/support/v4/view/s.u:(Landroid/view/View;)Z
       4: ifeq          9
       7: aload_1
       8: areturn
       9: aload_1
      10: instanceof    #149                // class android/view/ViewGroup
      13: ifeq          59
      16: aload_1
      17: checkcast     #149                // class android/view/ViewGroup
      20: astore_1
      21: iconst_0
      22: istore_2
      23: aload_1
      24: invokevirtual #152                // Method android/view/ViewGroup.getChildCount:()I
      27: istore_3
      28: iload_2
      29: iload_3
      30: if_icmpge     59
      33: aload_0
      34: aload_1
      35: iload_2
      36: invokevirtual #156                // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      39: invokevirtual #158                // Method a:(Landroid/view/View;)Landroid/view/View;
      42: astore        4
      44: aload         4
      46: ifnull        52
      49: aload         4
      51: areturn
      52: iload_2
      53: iconst_1
      54: iadd
      55: istore_2
      56: goto          28
      59: aconst_null
      60: areturn

  public final void a(int);
    Code:
       0: iconst_1
       1: istore_2
       2: iload_1
       3: iconst_m1
       4: if_icmpne     24
       7: aload_0
       8: getfield      #160                // Field m:Z
      11: ifne          42
      14: aload_0
      15: iconst_1
      16: putfield      #160                // Field m:Z
      19: iload_2
      20: istore_1
      21: goto          73
      24: aload_0
      25: getfield      #160                // Field m:Z
      28: ifne          47
      31: aload_0
      32: getfield      #162                // Field l:I
      35: iload_1
      36: if_icmpeq     42
      39: goto          47
      42: iconst_0
      43: istore_1
      44: goto          73
      47: aload_0
      48: iconst_0
      49: putfield      #160                // Field m:Z
      52: aload_0
      53: iconst_0
      54: iload_1
      55: invokestatic  #167                // Method java/lang/Math.max:(II)I
      58: putfield      #162                // Field l:I
      61: aload_0
      62: aload_0
      63: getfield      #169                // Field f:I
      66: iload_1
      67: isub
      68: putfield      #171                // Field b:I
      71: iload_2
      72: istore_1
      73: iload_1
      74: ifeq          111
      77: aload_0
      78: getfield      #53                 // Field d:I
      81: iconst_4
      82: if_icmpne     111
      85: aload_0
      86: getfield      #173                // Field g:Ljava/lang/ref/WeakReference;
      89: ifnull        111
      92: aload_0
      93: getfield      #173                // Field g:Ljava/lang/ref/WeakReference;
      96: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      99: checkcast     #180                // class android/view/View
     102: astore_3
     103: aload_3
     104: ifnull        111
     107: aload_3
     108: invokevirtual #183                // Method android/view/View.requestLayout:()V
     111: return

  public void a(android.support.design.widget.CoordinatorLayout, V, android.os.Parcelable);
    Code:
       0: aload_3
       1: checkcast     #12                 // class android/support/design/widget/BottomSheetBehavior$b
       4: astore_3
       5: aload_0
       6: aload_1
       7: aload_2
       8: aload_3
       9: invokevirtual #187                // Method android/support/design/widget/BottomSheetBehavior$b.a:()Landroid/os/Parcelable;
      12: invokespecial #189                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
      15: aload_3
      16: getfield      #191                // Field android/support/design/widget/BottomSheetBehavior$b.a:I
      19: iconst_1
      20: if_icmpeq     43
      23: aload_3
      24: getfield      #191                // Field android/support/design/widget/BottomSheetBehavior$b.a:I
      27: iconst_2
      28: if_icmpne     34
      31: goto          43
      34: aload_3
      35: getfield      #191                // Field android/support/design/widget/BottomSheetBehavior$b.a:I
      38: istore        4
      40: goto          46
      43: iconst_4
      44: istore        4
      46: aload_0
      47: iload         4
      49: putfield      #53                 // Field d:I
      52: return

  public void a(android.support.design.widget.CoordinatorLayout, V, android.view.View, int, int, int[]);
    Code:
       0: aload_3
       1: aload_0
       2: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
       5: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       8: checkcast     #180                // class android/view/View
      11: if_acmpeq     15
      14: return
      15: aload_2
      16: invokevirtual #199                // Method android/view/View.getTop:()I
      19: istore        4
      21: iload         4
      23: iload         5
      25: isub
      26: istore        7
      28: iload         5
      30: ifle          95
      33: iload         7
      35: aload_0
      36: getfield      #200                // Field a:I
      39: if_icmpge     74
      42: aload         6
      44: iconst_1
      45: iload         4
      47: aload_0
      48: getfield      #200                // Field a:I
      51: isub
      52: iastore
      53: aload_2
      54: aload         6
      56: iconst_1
      57: iaload
      58: ineg
      59: invokestatic  #203                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      62: iconst_3
      63: istore        4
      65: aload_0
      66: iload         4
      68: invokevirtual #205                // Method b:(I)V
      71: goto          162
      74: aload         6
      76: iconst_1
      77: iload         5
      79: iastore
      80: aload_2
      81: iload         5
      83: ineg
      84: invokestatic  #203                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
      87: aload_0
      88: iconst_1
      89: invokevirtual #205                // Method b:(I)V
      92: goto          162
      95: iload         5
      97: ifge          162
     100: aload_3
     101: iconst_m1
     102: invokevirtual #209                // Method android/view/View.canScrollVertically:(I)Z
     105: ifne          162
     108: iload         7
     110: aload_0
     111: getfield      #171                // Field b:I
     114: if_icmple     153
     117: aload_0
     118: getfield      #211                // Field c:Z
     121: ifeq          127
     124: goto          153
     127: aload         6
     129: iconst_1
     130: iload         4
     132: aload_0
     133: getfield      #171                // Field b:I
     136: isub
     137: iastore
     138: aload_2
     139: aload         6
     141: iconst_1
     142: iaload
     143: ineg
     144: invokestatic  #203                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
     147: iconst_4
     148: istore        4
     150: goto          65
     153: aload         6
     155: iconst_1
     156: iload         5
     158: iastore
     159: goto          80
     162: aload_0
     163: aload_2
     164: invokevirtual #199                // Method android/view/View.getTop:()I
     167: invokevirtual #213                // Method c:(I)V
     170: aload_0
     171: iload         5
     173: putfield      #215                // Field q:I
     176: aload_0
     177: iconst_1
     178: putfield      #217                // Field r:Z
     181: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #211                // Field c:Z
       5: return

  public boolean a(android.support.design.widget.CoordinatorLayout, V, int);
    Code:
       0: aload_1
       1: invokestatic  #221                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
       4: ifeq          19
       7: aload_2
       8: invokestatic  #221                // Method android/support/v4/view/s.p:(Landroid/view/View;)Z
      11: ifne          19
      14: aload_2
      15: iconst_1
      16: invokestatic  #224                // Method android/support/v4/view/s.b:(Landroid/view/View;Z)V
      19: aload_2
      20: invokevirtual #199                // Method android/view/View.getTop:()I
      23: istore        4
      25: aload_1
      26: aload_2
      27: iload_3
      28: invokevirtual #228                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;I)V
      31: aload_0
      32: aload_1
      33: invokevirtual #231                // Method android/support/design/widget/CoordinatorLayout.getHeight:()I
      36: putfield      #169                // Field f:I
      39: aload_0
      40: getfield      #160                // Field m:Z
      43: ifeq          93
      46: aload_0
      47: getfield      #233                // Field n:I
      50: ifne          67
      53: aload_0
      54: aload_1
      55: invokevirtual #237                // Method android/support/design/widget/CoordinatorLayout.getResources:()Landroid/content/res/Resources;
      58: getstatic     #242                // Field android/support/design/a$d.design_bottom_sheet_peek_height_min:I
      61: invokevirtual #247                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      64: putfield      #233                // Field n:I
      67: aload_0
      68: getfield      #233                // Field n:I
      71: aload_0
      72: getfield      #169                // Field f:I
      75: aload_1
      76: invokevirtual #250                // Method android/support/design/widget/CoordinatorLayout.getWidth:()I
      79: bipush        9
      81: imul
      82: bipush        16
      84: idiv
      85: isub
      86: invokestatic  #167                // Method java/lang/Math.max:(II)I
      89: istore_3
      90: goto          98
      93: aload_0
      94: getfield      #162                // Field l:I
      97: istore_3
      98: aload_0
      99: iconst_0
     100: aload_0
     101: getfield      #169                // Field f:I
     104: aload_2
     105: invokevirtual #251                // Method android/view/View.getHeight:()I
     108: isub
     109: invokestatic  #167                // Method java/lang/Math.max:(II)I
     112: putfield      #200                // Field a:I
     115: aload_0
     116: aload_0
     117: getfield      #169                // Field f:I
     120: iload_3
     121: isub
     122: aload_0
     123: getfield      #200                // Field a:I
     126: invokestatic  #167                // Method java/lang/Math.max:(II)I
     129: putfield      #171                // Field b:I
     132: aload_0
     133: getfield      #53                 // Field d:I
     136: iconst_3
     137: if_icmpne     153
     140: aload_0
     141: getfield      #200                // Field a:I
     144: istore_3
     145: aload_2
     146: iload_3
     147: invokestatic  #203                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
     150: goto          219
     153: aload_0
     154: getfield      #211                // Field c:Z
     157: ifeq          176
     160: aload_0
     161: getfield      #53                 // Field d:I
     164: iconst_5
     165: if_icmpne     176
     168: aload_0
     169: getfield      #169                // Field f:I
     172: istore_3
     173: goto          145
     176: aload_0
     177: getfield      #53                 // Field d:I
     180: iconst_4
     181: if_icmpne     192
     184: aload_0
     185: getfield      #171                // Field b:I
     188: istore_3
     189: goto          145
     192: aload_0
     193: getfield      #53                 // Field d:I
     196: iconst_1
     197: if_icmpeq     208
     200: aload_0
     201: getfield      #53                 // Field d:I
     204: iconst_2
     205: if_icmpne     219
     208: aload_2
     209: iload         4
     211: aload_2
     212: invokevirtual #199                // Method android/view/View.getTop:()I
     215: isub
     216: invokestatic  #203                // Method android/support/v4/view/s.b:(Landroid/view/View;I)V
     219: aload_0
     220: getfield      #253                // Field e:Landroid/support/v4/widget/p;
     223: ifnonnull     238
     226: aload_0
     227: aload_1
     228: aload_0
     229: getfield      #58                 // Field v:Landroid/support/v4/widget/p$a;
     232: invokestatic  #258                // Method android/support/v4/widget/p.a:(Landroid/view/ViewGroup;Landroid/support/v4/widget/p$a;)Landroid/support/v4/widget/p;
     235: putfield      #253                // Field e:Landroid/support/v4/widget/p;
     238: aload_0
     239: new           #175                // class java/lang/ref/WeakReference
     242: dup
     243: aload_2
     244: invokespecial #261                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
     247: putfield      #173                // Field g:Ljava/lang/ref/WeakReference;
     250: aload_0
     251: new           #175                // class java/lang/ref/WeakReference
     254: dup
     255: aload_0
     256: aload_2
     257: invokevirtual #158                // Method a:(Landroid/view/View;)Landroid/view/View;
     260: invokespecial #261                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
     263: putfield      #196                // Field h:Ljava/lang/ref/WeakReference;
     266: iconst_1
     267: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, V, android.view.MotionEvent);
    Code:
       0: aload_2
       1: invokevirtual #267                // Method android/view/View.isShown:()Z
       4: istore        6
       6: iconst_0
       7: istore        7
       9: iload         6
      11: ifne          21
      14: aload_0
      15: iconst_1
      16: putfield      #269                // Field p:Z
      19: iconst_0
      20: ireturn
      21: aload_3
      22: invokevirtual #274                // Method android/view/MotionEvent.getActionMasked:()I
      25: istore        4
      27: iload         4
      29: ifne          36
      32: aload_0
      33: invokespecial #276                // Method a:()V
      36: aload_0
      37: getfield      #129                // Field t:Landroid/view/VelocityTracker;
      40: ifnonnull     50
      43: aload_0
      44: invokestatic  #280                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      47: putfield      #129                // Field t:Landroid/view/VelocityTracker;
      50: aload_0
      51: getfield      #129                // Field t:Landroid/view/VelocityTracker;
      54: aload_3
      55: invokevirtual #284                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      58: iload         4
      60: iconst_3
      61: if_icmpeq     209
      64: iload         4
      66: tableswitch   { // 0 to 1
                     0: 91
                     1: 209
               default: 88
          }
      88: goto          233
      91: aload_3
      92: invokevirtual #287                // Method android/view/MotionEvent.getX:()F
      95: f2i
      96: istore        5
      98: aload_0
      99: aload_3
     100: invokevirtual #290                // Method android/view/MotionEvent.getY:()F
     103: f2i
     104: putfield      #292                // Field u:I
     107: aload_0
     108: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
     111: ifnull        129
     114: aload_0
     115: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
     118: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     121: checkcast     #180                // class android/view/View
     124: astore        8
     126: goto          132
     129: aconst_null
     130: astore        8
     132: aload         8
     134: ifnull        169
     137: aload_1
     138: aload         8
     140: iload         5
     142: aload_0
     143: getfield      #292                // Field u:I
     146: invokevirtual #295                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
     149: ifeq          169
     152: aload_0
     153: aload_3
     154: aload_3
     155: invokevirtual #298                // Method android/view/MotionEvent.getActionIndex:()I
     158: invokevirtual #301                // Method android/view/MotionEvent.getPointerId:(I)I
     161: putfield      #127                // Field i:I
     164: aload_0
     165: iconst_1
     166: putfield      #303                // Field j:Z
     169: aload_0
     170: getfield      #127                // Field i:I
     173: iconst_m1
     174: if_icmpne     197
     177: aload_1
     178: aload_2
     179: iload         5
     181: aload_0
     182: getfield      #292                // Field u:I
     185: invokevirtual #295                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
     188: ifne          197
     191: iconst_1
     192: istore        6
     194: goto          200
     197: iconst_0
     198: istore        6
     200: aload_0
     201: iload         6
     203: putfield      #269                // Field p:Z
     206: goto          233
     209: aload_0
     210: iconst_0
     211: putfield      #303                // Field j:Z
     214: aload_0
     215: iconst_m1
     216: putfield      #127                // Field i:I
     219: aload_0
     220: getfield      #269                // Field p:Z
     223: ifeq          233
     226: aload_0
     227: iconst_0
     228: putfield      #269                // Field p:Z
     231: iconst_0
     232: ireturn
     233: aload_0
     234: getfield      #269                // Field p:Z
     237: ifne          253
     240: aload_0
     241: getfield      #253                // Field e:Landroid/support/v4/widget/p;
     244: aload_3
     245: invokevirtual #306                // Method android/support/v4/widget/p.a:(Landroid/view/MotionEvent;)Z
     248: ifeq          253
     251: iconst_1
     252: ireturn
     253: aload_0
     254: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
     257: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     260: checkcast     #180                // class android/view/View
     263: astore_2
     264: iload         7
     266: istore        6
     268: iload         4
     270: iconst_2
     271: if_icmpne     359
     274: iload         7
     276: istore        6
     278: aload_2
     279: ifnull        359
     282: iload         7
     284: istore        6
     286: aload_0
     287: getfield      #269                // Field p:Z
     290: ifne          359
     293: iload         7
     295: istore        6
     297: aload_0
     298: getfield      #53                 // Field d:I
     301: iconst_1
     302: if_icmpeq     359
     305: iload         7
     307: istore        6
     309: aload_1
     310: aload_2
     311: aload_3
     312: invokevirtual #287                // Method android/view/MotionEvent.getX:()F
     315: f2i
     316: aload_3
     317: invokevirtual #290                // Method android/view/MotionEvent.getY:()F
     320: f2i
     321: invokevirtual #295                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
     324: ifne          359
     327: iload         7
     329: istore        6
     331: aload_0
     332: getfield      #292                // Field u:I
     335: i2f
     336: aload_3
     337: invokevirtual #290                // Method android/view/MotionEvent.getY:()F
     340: fsub
     341: invokestatic  #310                // Method java/lang/Math.abs:(F)F
     344: aload_0
     345: getfield      #253                // Field e:Landroid/support/v4/widget/p;
     348: invokevirtual #312                // Method android/support/v4/widget/p.d:()I
     351: i2f
     352: fcmpl
     353: ifle          359
     356: iconst_1
     357: istore        6
     359: iload         6
     361: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, V, android.view.View, float, float);
    Code:
       0: aload_3
       1: aload_0
       2: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
       5: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       8: if_acmpne     35
      11: aload_0
      12: getfield      #53                 // Field d:I
      15: iconst_3
      16: if_icmpne     33
      19: aload_0
      20: aload_1
      21: aload_2
      22: aload_3
      23: fload         4
      25: fload         5
      27: invokespecial #316                // Method android/support/design/widget/CoordinatorLayout$b.a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z
      30: ifeq          35
      33: iconst_1
      34: ireturn
      35: iconst_0
      36: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, V, android.view.View, android.view.View, int);
    Code:
       0: iconst_0
       1: istore        6
       3: aload_0
       4: iconst_0
       5: putfield      #215                // Field q:I
       8: aload_0
       9: iconst_0
      10: putfield      #217                // Field r:Z
      13: iload         5
      15: iconst_2
      16: iand
      17: ifeq          23
      20: iconst_1
      21: istore        6
      23: iload         6
      25: ireturn

  boolean a(android.view.View, float);
    Code:
       0: aload_0
       1: getfield      #322                // Field o:Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_1
      10: invokevirtual #199                // Method android/view/View.getTop:()I
      13: aload_0
      14: getfield      #171                // Field b:I
      17: if_icmpge     22
      20: iconst_0
      21: ireturn
      22: aload_1
      23: invokevirtual #199                // Method android/view/View.getTop:()I
      26: i2f
      27: fload_2
      28: ldc_w         #323                // float 0.1f
      31: fmul
      32: fadd
      33: aload_0
      34: getfield      #171                // Field b:I
      37: i2f
      38: fsub
      39: invokestatic  #310                // Method java/lang/Math.abs:(F)F
      42: aload_0
      43: getfield      #162                // Field l:I
      46: i2f
      47: fdiv
      48: ldc_w         #324                // float 0.5f
      51: fcmpl
      52: ifle          57
      55: iconst_1
      56: ireturn
      57: iconst_0
      58: ireturn

  public android.os.Parcelable b(android.support.design.widget.CoordinatorLayout, V);
    Code:
       0: new           #12                 // class android/support/design/widget/BottomSheetBehavior$b
       3: dup
       4: aload_0
       5: aload_1
       6: aload_2
       7: invokespecial #327                // Method android/support/design/widget/CoordinatorLayout$b.b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
      10: aload_0
      11: getfield      #53                 // Field d:I
      14: invokespecial #330                // Method android/support/design/widget/BottomSheetBehavior$b."<init>":(Landroid/os/Parcelable;I)V
      17: areturn

  void b(int);
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:I
       4: iload_1
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #53                 // Field d:I
      14: aload_0
      15: getfield      #173                // Field g:Ljava/lang/ref/WeakReference;
      18: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      21: checkcast     #180                // class android/view/View
      24: astore_2
      25: aload_2
      26: ifnull        45
      29: aload_0
      30: getfield      #333                // Field s:Landroid/support/design/widget/BottomSheetBehavior$a;
      33: ifnull        45
      36: aload_0
      37: getfield      #333                // Field s:Landroid/support/design/widget/BottomSheetBehavior$a;
      40: aload_2
      41: iload_1
      42: invokevirtual #334                // Method android/support/design/widget/BottomSheetBehavior$a.a:(Landroid/view/View;I)V
      45: return

  public void b(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #322                // Field o:Z
       5: return

  public boolean b(android.support.design.widget.CoordinatorLayout, V, android.view.MotionEvent);
    Code:
       0: aload_2
       1: invokevirtual #267                // Method android/view/View.isShown:()Z
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_3
      10: invokevirtual #274                // Method android/view/MotionEvent.getActionMasked:()I
      13: istore        4
      15: aload_0
      16: getfield      #53                 // Field d:I
      19: iconst_1
      20: if_icmpne     30
      23: iload         4
      25: ifne          30
      28: iconst_1
      29: ireturn
      30: aload_0
      31: getfield      #253                // Field e:Landroid/support/v4/widget/p;
      34: ifnull        45
      37: aload_0
      38: getfield      #253                // Field e:Landroid/support/v4/widget/p;
      41: aload_3
      42: invokevirtual #336                // Method android/support/v4/widget/p.b:(Landroid/view/MotionEvent;)V
      45: iload         4
      47: ifne          54
      50: aload_0
      51: invokespecial #276                // Method a:()V
      54: aload_0
      55: getfield      #129                // Field t:Landroid/view/VelocityTracker;
      58: ifnonnull     68
      61: aload_0
      62: invokestatic  #280                // Method android/view/VelocityTracker.obtain:()Landroid/view/VelocityTracker;
      65: putfield      #129                // Field t:Landroid/view/VelocityTracker;
      68: aload_0
      69: getfield      #129                // Field t:Landroid/view/VelocityTracker;
      72: aload_3
      73: invokevirtual #284                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
      76: iload         4
      78: iconst_2
      79: if_icmpne     130
      82: aload_0
      83: getfield      #269                // Field p:Z
      86: ifne          130
      89: aload_0
      90: getfield      #292                // Field u:I
      93: i2f
      94: aload_3
      95: invokevirtual #290                // Method android/view/MotionEvent.getY:()F
      98: fsub
      99: invokestatic  #310                // Method java/lang/Math.abs:(F)F
     102: aload_0
     103: getfield      #253                // Field e:Landroid/support/v4/widget/p;
     106: invokevirtual #312                // Method android/support/v4/widget/p.d:()I
     109: i2f
     110: fcmpl
     111: ifle          130
     114: aload_0
     115: getfield      #253                // Field e:Landroid/support/v4/widget/p;
     118: aload_2
     119: aload_3
     120: aload_3
     121: invokevirtual #298                // Method android/view/MotionEvent.getActionIndex:()I
     124: invokevirtual #301                // Method android/view/MotionEvent.getPointerId:(I)I
     127: invokevirtual #337                // Method android/support/v4/widget/p.a:(Landroid/view/View;I)V
     130: aload_0
     131: getfield      #269                // Field p:Z
     134: iconst_1
     135: ixor
     136: ireturn

  void c(int);
    Code:
       0: aload_0
       1: getfield      #173                // Field g:Ljava/lang/ref/WeakReference;
       4: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
       7: checkcast     #180                // class android/view/View
      10: astore        5
      12: aload         5
      14: ifnull        97
      17: aload_0
      18: getfield      #333                // Field s:Landroid/support/design/widget/BottomSheetBehavior$a;
      21: ifnull        97
      24: iload_1
      25: aload_0
      26: getfield      #171                // Field b:I
      29: if_icmple     70
      32: aload_0
      33: getfield      #333                // Field s:Landroid/support/design/widget/BottomSheetBehavior$a;
      36: astore        4
      38: aload_0
      39: getfield      #171                // Field b:I
      42: iload_1
      43: isub
      44: i2f
      45: fstore_2
      46: aload_0
      47: getfield      #169                // Field f:I
      50: istore_1
      51: aload_0
      52: getfield      #171                // Field b:I
      55: istore_3
      56: aload         4
      58: aload         5
      60: fload_2
      61: iload_1
      62: iload_3
      63: isub
      64: i2f
      65: fdiv
      66: invokevirtual #340                // Method android/support/design/widget/BottomSheetBehavior$a.a:(Landroid/view/View;F)V
      69: return
      70: aload_0
      71: getfield      #333                // Field s:Landroid/support/design/widget/BottomSheetBehavior$a;
      74: astore        4
      76: aload_0
      77: getfield      #171                // Field b:I
      80: iload_1
      81: isub
      82: i2f
      83: fstore_2
      84: aload_0
      85: getfield      #171                // Field b:I
      88: istore_1
      89: aload_0
      90: getfield      #200                // Field a:I
      93: istore_3
      94: goto          56
      97: return

  public void c(android.support.design.widget.CoordinatorLayout, V, android.view.View);
    Code:
       0: aload_2
       1: invokevirtual #199                // Method android/view/View.getTop:()I
       4: istore        5
       6: aload_0
       7: getfield      #200                // Field a:I
      10: istore        6
      12: iconst_3
      13: istore        4
      15: iload         5
      17: iload         6
      19: if_icmpne     28
      22: aload_0
      23: iconst_3
      24: invokevirtual #205                // Method b:(I)V
      27: return
      28: aload_0
      29: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
      32: ifnull        200
      35: aload_3
      36: aload_0
      37: getfield      #196                // Field h:Ljava/lang/ref/WeakReference;
      40: invokevirtual #178                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      43: if_acmpne     200
      46: aload_0
      47: getfield      #217                // Field r:Z
      50: ifne          54
      53: return
      54: aload_0
      55: getfield      #215                // Field q:I
      58: ifle          70
      61: aload_0
      62: getfield      #200                // Field a:I
      65: istore        5
      67: goto          149
      70: aload_0
      71: getfield      #211                // Field c:Z
      74: ifeq          101
      77: aload_0
      78: aload_2
      79: aload_0
      80: invokespecial #343                // Method b:()F
      83: invokevirtual #345                // Method a:(Landroid/view/View;F)Z
      86: ifeq          101
      89: aload_0
      90: getfield      #169                // Field f:I
      93: istore        5
      95: iconst_5
      96: istore        4
      98: goto          149
     101: aload_0
     102: getfield      #215                // Field q:I
     105: ifne          140
     108: aload_2
     109: invokevirtual #199                // Method android/view/View.getTop:()I
     112: istore        5
     114: iload         5
     116: aload_0
     117: getfield      #200                // Field a:I
     120: isub
     121: invokestatic  #347                // Method java/lang/Math.abs:(I)I
     124: iload         5
     126: aload_0
     127: getfield      #171                // Field b:I
     130: isub
     131: invokestatic  #347                // Method java/lang/Math.abs:(I)I
     134: if_icmpge     140
     137: goto          61
     140: aload_0
     141: getfield      #171                // Field b:I
     144: istore        5
     146: iconst_4
     147: istore        4
     149: aload_0
     150: getfield      #253                // Field e:Landroid/support/v4/widget/p;
     153: aload_2
     154: aload_2
     155: invokevirtual #350                // Method android/view/View.getLeft:()I
     158: iload         5
     160: invokevirtual #351                // Method android/support/v4/widget/p.a:(Landroid/view/View;II)Z
     163: ifeq          189
     166: aload_0
     167: iconst_2
     168: invokevirtual #205                // Method b:(I)V
     171: aload_2
     172: new           #17                 // class android/support/design/widget/BottomSheetBehavior$c
     175: dup
     176: aload_0
     177: aload_2
     178: iload         4
     180: invokespecial #354                // Method android/support/design/widget/BottomSheetBehavior$c."<init>":(Landroid/support/design/widget/BottomSheetBehavior;Landroid/view/View;I)V
     183: invokestatic  #357                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
     186: goto          195
     189: aload_0
     190: iload         4
     192: invokevirtual #205                // Method b:(I)V
     195: aload_0
     196: iconst_0
     197: putfield      #217                // Field r:Z
     200: return
}
