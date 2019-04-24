abstract class android.support.design.widget.g<V extends android.view.View> extends android.support.design.widget.n<V> {
  android.widget.OverScroller a;

  public android.support.design.widget.g();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method android/support/design/widget/n."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #25                 // Field d:I
       9: aload_0
      10: iconst_m1
      11: putfield      #27                 // Field f:I
      14: return

  public android.support.design.widget.g(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #31                 // Method android/support/design/widget/n."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_m1
       8: putfield      #25                 // Field d:I
      11: aload_0
      12: iconst_m1
      13: putfield      #27                 // Field f:I
      16: return

  int a();
    Code:
       0: aload_0
       1: invokevirtual #42                 // Method b:()I
       4: ireturn

  int a(android.support.design.widget.CoordinatorLayout, V, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #42                 // Method b:()I
       4: istore        6
       6: iload         4
       8: ifeq          51
      11: iload         6
      13: iload         4
      15: if_icmplt     51
      18: iload         6
      20: iload         5
      22: if_icmpgt     51
      25: iload_3
      26: iload         4
      28: iload         5
      30: invokestatic  #48                 // Method android/support/v4/d/a.a:(III)I
      33: istore_3
      34: iload         6
      36: iload_3
      37: if_icmpeq     51
      40: aload_0
      41: iload_3
      42: invokevirtual #51                 // Method a:(I)Z
      45: pop
      46: iload         6
      48: iload_3
      49: isub
      50: ireturn
      51: iconst_0
      52: ireturn

  int a(V);
    Code:
       0: aload_1
       1: invokevirtual #59                 // Method android/view/View.getHeight:()I
       4: ireturn

  void a(android.support.design.widget.CoordinatorLayout, V);
    Code:
       0: return

  final boolean a(android.support.design.widget.CoordinatorLayout, V, int, int, float);
    Code:
       0: aload_0
       1: getfield      #65                 // Field b:Ljava/lang/Runnable;
       4: ifnull        21
       7: aload_2
       8: aload_0
       9: getfield      #65                 // Field b:Ljava/lang/Runnable;
      12: invokevirtual #69                 // Method android/view/View.removeCallbacks:(Ljava/lang/Runnable;)Z
      15: pop
      16: aload_0
      17: aconst_null
      18: putfield      #65                 // Field b:Ljava/lang/Runnable;
      21: aload_0
      22: getfield      #71                 // Field a:Landroid/widget/OverScroller;
      25: ifnonnull     43
      28: aload_0
      29: new           #73                 // class android/widget/OverScroller
      32: dup
      33: aload_2
      34: invokevirtual #77                 // Method android/view/View.getContext:()Landroid/content/Context;
      37: invokespecial #80                 // Method android/widget/OverScroller."<init>":(Landroid/content/Context;)V
      40: putfield      #71                 // Field a:Landroid/widget/OverScroller;
      43: aload_0
      44: getfield      #71                 // Field a:Landroid/widget/OverScroller;
      47: iconst_0
      48: aload_0
      49: invokevirtual #42                 // Method b:()I
      52: iconst_0
      53: fload         5
      55: invokestatic  #86                 // Method java/lang/Math.round:(F)I
      58: iconst_0
      59: iconst_0
      60: iload_3
      61: iload         4
      63: invokevirtual #90                 // Method android/widget/OverScroller.fling:(IIIIIIII)V
      66: aload_0
      67: getfield      #71                 // Field a:Landroid/widget/OverScroller;
      70: invokevirtual #94                 // Method android/widget/OverScroller.computeScrollOffset:()Z
      73: ifeq          100
      76: aload_0
      77: new           #7                  // class android/support/design/widget/g$a
      80: dup
      81: aload_0
      82: aload_1
      83: aload_2
      84: invokespecial #97                 // Method android/support/design/widget/g$a."<init>":(Landroid/support/design/widget/g;Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)V
      87: putfield      #65                 // Field b:Ljava/lang/Runnable;
      90: aload_2
      91: aload_0
      92: getfield      #65                 // Field b:Ljava/lang/Runnable;
      95: invokestatic  #102                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
      98: iconst_1
      99: ireturn
     100: aload_0
     101: aload_1
     102: aload_2
     103: invokevirtual #104                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)V
     106: iconst_0
     107: ireturn

  public boolean a(android.support.design.widget.CoordinatorLayout, V, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #27                 // Field f:I
       4: ifge          21
       7: aload_0
       8: aload_1
       9: invokevirtual #109                // Method android/support/design/widget/CoordinatorLayout.getContext:()Landroid/content/Context;
      12: invokestatic  #115                // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      15: invokevirtual #118                // Method android/view/ViewConfiguration.getScaledTouchSlop:()I
      18: putfield      #27                 // Field f:I
      21: aload_3
      22: invokevirtual #123                // Method android/view/MotionEvent.getAction:()I
      25: iconst_2
      26: if_icmpne     38
      29: aload_0
      30: getfield      #125                // Field c:Z
      33: ifeq          38
      36: iconst_1
      37: ireturn
      38: aload_3
      39: invokevirtual #128                // Method android/view/MotionEvent.getActionMasked:()I
      42: tableswitch   { // 0 to 3
                     0: 179
                     1: 147
                     2: 75
                     3: 147
               default: 72
          }
      72: goto          237
      75: aload_0
      76: getfield      #25                 // Field d:I
      79: istore        4
      81: iload         4
      83: iconst_m1
      84: if_icmpne     90
      87: goto          237
      90: aload_3
      91: iload         4
      93: invokevirtual #132                // Method android/view/MotionEvent.findPointerIndex:(I)I
      96: istore        4
      98: iload         4
     100: iconst_m1
     101: if_icmpne     107
     104: goto          237
     107: aload_3
     108: iload         4
     110: invokevirtual #136                // Method android/view/MotionEvent.getY:(I)F
     113: f2i
     114: istore        4
     116: iload         4
     118: aload_0
     119: getfield      #138                // Field e:I
     122: isub
     123: invokestatic  #141                // Method java/lang/Math.abs:(I)I
     126: aload_0
     127: getfield      #27                 // Field f:I
     130: if_icmple     237
     133: aload_0
     134: iconst_1
     135: putfield      #125                // Field c:Z
     138: aload_0
     139: iload         4
     141: putfield      #138                // Field e:I
     144: goto          237
     147: aload_0
     148: iconst_0
     149: putfield      #125                // Field c:Z
     152: aload_0
     153: iconst_m1
     154: putfield      #25                 // Field d:I
     157: aload_0
     158: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     161: ifnull        237
     164: aload_0
     165: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     168: invokevirtual #144                // Method android/view/VelocityTracker.recycle:()V
     171: aload_0
     172: aconst_null
     173: putfield      #33                 // Field g:Landroid/view/VelocityTracker;
     176: goto          237
     179: aload_0
     180: iconst_0
     181: putfield      #125                // Field c:Z
     184: aload_3
     185: invokevirtual #148                // Method android/view/MotionEvent.getX:()F
     188: f2i
     189: istore        4
     191: aload_3
     192: invokevirtual #150                // Method android/view/MotionEvent.getY:()F
     195: f2i
     196: istore        5
     198: aload_0
     199: aload_2
     200: invokevirtual #153                // Method c:(Landroid/view/View;)Z
     203: ifeq          237
     206: aload_1
     207: aload_2
     208: iload         4
     210: iload         5
     212: invokevirtual #156                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
     215: ifeq          237
     218: aload_0
     219: iload         5
     221: putfield      #138                // Field e:I
     224: aload_0
     225: aload_3
     226: iconst_0
     227: invokevirtual #159                // Method android/view/MotionEvent.getPointerId:(I)I
     230: putfield      #25                 // Field d:I
     233: aload_0
     234: invokespecial #161                // Method d:()V
     237: aload_0
     238: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     241: ifnull        252
     244: aload_0
     245: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     248: aload_3
     249: invokevirtual #165                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     252: aload_0
     253: getfield      #125                // Field c:Z
     256: ireturn

  int a_(android.support.design.widget.CoordinatorLayout, V, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: ldc           #169                // int -2147483648
       6: ldc           #170                // int 2147483647
       8: invokevirtual #172                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)I
      11: ireturn

  final int b(android.support.design.widget.CoordinatorLayout, V, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_0
       4: invokevirtual #175                // Method a:()I
       7: iload_3
       8: isub
       9: iload         4
      11: iload         5
      13: invokevirtual #172                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)I
      16: ireturn

  int b(V);
    Code:
       0: aload_1
       1: invokevirtual #59                 // Method android/view/View.getHeight:()I
       4: ineg
       5: ireturn

  public boolean b(android.support.design.widget.CoordinatorLayout, V, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #27                 // Field f:I
       4: ifge          21
       7: aload_0
       8: aload_1
       9: invokevirtual #109                // Method android/support/design/widget/CoordinatorLayout.getContext:()Landroid/content/Context;
      12: invokestatic  #115                // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      15: invokevirtual #118                // Method android/view/ViewConfiguration.getScaledTouchSlop:()I
      18: putfield      #27                 // Field f:I
      21: aload_3
      22: invokevirtual #128                // Method android/view/MotionEvent.getActionMasked:()I
      25: tableswitch   { // 0 to 3
                     0: 270
                     1: 184
                     2: 59
                     3: 238
               default: 56
          }
      56: goto          328
      59: aload_3
      60: aload_0
      61: getfield      #25                 // Field d:I
      64: invokevirtual #132                // Method android/view/MotionEvent.findPointerIndex:(I)I
      67: istore        5
      69: iload         5
      71: iconst_m1
      72: if_icmpne     77
      75: iconst_0
      76: ireturn
      77: aload_3
      78: iload         5
      80: invokevirtual #136                // Method android/view/MotionEvent.getY:(I)F
      83: f2i
      84: istore        7
      86: aload_0
      87: getfield      #138                // Field e:I
      90: iload         7
      92: isub
      93: istore        6
      95: iload         6
      97: istore        5
      99: aload_0
     100: getfield      #125                // Field c:Z
     103: ifne          153
     106: iload         6
     108: istore        5
     110: iload         6
     112: invokestatic  #141                // Method java/lang/Math.abs:(I)I
     115: aload_0
     116: getfield      #27                 // Field f:I
     119: if_icmple     153
     122: aload_0
     123: iconst_1
     124: putfield      #125                // Field c:Z
     127: iload         6
     129: ifle          144
     132: iload         6
     134: aload_0
     135: getfield      #27                 // Field f:I
     138: isub
     139: istore        5
     141: goto          153
     144: iload         6
     146: aload_0
     147: getfield      #27                 // Field f:I
     150: iadd
     151: istore        5
     153: aload_0
     154: getfield      #125                // Field c:Z
     157: ifeq          328
     160: aload_0
     161: iload         7
     163: putfield      #138                // Field e:I
     166: aload_0
     167: aload_1
     168: aload_2
     169: iload         5
     171: aload_0
     172: aload_2
     173: invokevirtual #177                // Method b:(Landroid/view/View;)I
     176: iconst_0
     177: invokevirtual #179                // Method b:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)I
     180: pop
     181: goto          328
     184: aload_0
     185: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     188: ifnull        238
     191: aload_0
     192: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     195: aload_3
     196: invokevirtual #165                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     199: aload_0
     200: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     203: sipush        1000
     206: invokevirtual #183                // Method android/view/VelocityTracker.computeCurrentVelocity:(I)V
     209: aload_0
     210: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     213: aload_0
     214: getfield      #25                 // Field d:I
     217: invokevirtual #186                // Method android/view/VelocityTracker.getYVelocity:(I)F
     220: fstore        4
     222: aload_0
     223: aload_1
     224: aload_2
     225: aload_0
     226: aload_2
     227: invokevirtual #188                // Method a:(Landroid/view/View;)I
     230: ineg
     231: iconst_0
     232: fload         4
     234: invokevirtual #190                // Method a:(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;IIF)Z
     237: pop
     238: aload_0
     239: iconst_0
     240: putfield      #125                // Field c:Z
     243: aload_0
     244: iconst_m1
     245: putfield      #25                 // Field d:I
     248: aload_0
     249: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     252: ifnull        328
     255: aload_0
     256: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     259: invokevirtual #144                // Method android/view/VelocityTracker.recycle:()V
     262: aload_0
     263: aconst_null
     264: putfield      #33                 // Field g:Landroid/view/VelocityTracker;
     267: goto          328
     270: aload_3
     271: invokevirtual #148                // Method android/view/MotionEvent.getX:()F
     274: f2i
     275: istore        5
     277: aload_3
     278: invokevirtual #150                // Method android/view/MotionEvent.getY:()F
     281: f2i
     282: istore        6
     284: aload_1
     285: aload_2
     286: iload         5
     288: iload         6
     290: invokevirtual #156                // Method android/support/design/widget/CoordinatorLayout.a:(Landroid/view/View;II)Z
     293: ifeq          326
     296: aload_0
     297: aload_2
     298: invokevirtual #153                // Method c:(Landroid/view/View;)Z
     301: ifeq          326
     304: aload_0
     305: iload         6
     307: putfield      #138                // Field e:I
     310: aload_0
     311: aload_3
     312: iconst_0
     313: invokevirtual #159                // Method android/view/MotionEvent.getPointerId:(I)I
     316: putfield      #25                 // Field d:I
     319: aload_0
     320: invokespecial #161                // Method d:()V
     323: goto          328
     326: iconst_0
     327: ireturn
     328: aload_0
     329: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     332: ifnull        343
     335: aload_0
     336: getfield      #33                 // Field g:Landroid/view/VelocityTracker;
     339: aload_3
     340: invokevirtual #165                // Method android/view/VelocityTracker.addMovement:(Landroid/view/MotionEvent;)V
     343: iconst_1
     344: ireturn

  boolean c(V);
    Code:
       0: iconst_0
       1: ireturn
}
