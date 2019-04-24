public class android.support.v7.widget.am extends android.support.v7.widget.bi {
  java.util.ArrayList<java.util.ArrayList<android.support.v7.widget.RecyclerView$x>> a;

  java.util.ArrayList<java.util.ArrayList<android.support.v7.widget.am$b>> b;

  java.util.ArrayList<java.util.ArrayList<android.support.v7.widget.am$a>> c;

  java.util.ArrayList<android.support.v7.widget.RecyclerView$x> d;

  java.util.ArrayList<android.support.v7.widget.RecyclerView$x> e;

  java.util.ArrayList<android.support.v7.widget.RecyclerView$x> f;

  java.util.ArrayList<android.support.v7.widget.RecyclerView$x> g;

  public android.support.v7.widget.am();
    Code:
       0: aload_0
       1: invokespecial #48                 // Method android/support/v7/widget/bi."<init>":()V
       4: aload_0
       5: new           #50                 // class java/util/ArrayList
       8: dup
       9: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #53                 // Field j:Ljava/util/ArrayList;
      15: aload_0
      16: new           #50                 // class java/util/ArrayList
      19: dup
      20: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #55                 // Field k:Ljava/util/ArrayList;
      26: aload_0
      27: new           #50                 // class java/util/ArrayList
      30: dup
      31: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      34: putfield      #57                 // Field l:Ljava/util/ArrayList;
      37: aload_0
      38: new           #50                 // class java/util/ArrayList
      41: dup
      42: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      45: putfield      #59                 // Field m:Ljava/util/ArrayList;
      48: aload_0
      49: new           #50                 // class java/util/ArrayList
      52: dup
      53: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      56: putfield      #61                 // Field a:Ljava/util/ArrayList;
      59: aload_0
      60: new           #50                 // class java/util/ArrayList
      63: dup
      64: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      67: putfield      #63                 // Field b:Ljava/util/ArrayList;
      70: aload_0
      71: new           #50                 // class java/util/ArrayList
      74: dup
      75: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      78: putfield      #65                 // Field c:Ljava/util/ArrayList;
      81: aload_0
      82: new           #50                 // class java/util/ArrayList
      85: dup
      86: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
      89: putfield      #67                 // Field d:Ljava/util/ArrayList;
      92: aload_0
      93: new           #50                 // class java/util/ArrayList
      96: dup
      97: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
     100: putfield      #69                 // Field e:Ljava/util/ArrayList;
     103: aload_0
     104: new           #50                 // class java/util/ArrayList
     107: dup
     108: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
     111: putfield      #71                 // Field f:Ljava/util/ArrayList;
     114: aload_0
     115: new           #50                 // class java/util/ArrayList
     118: dup
     119: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
     122: putfield      #73                 // Field g:Ljava/util/ArrayList;
     125: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #53                 // Field j:Ljava/util/ArrayList;
       4: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
       7: iconst_1
       8: ixor
       9: istore_1
      10: aload_0
      11: getfield      #57                 // Field l:Ljava/util/ArrayList;
      14: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      17: iconst_1
      18: ixor
      19: istore_2
      20: aload_0
      21: getfield      #59                 // Field m:Ljava/util/ArrayList;
      24: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      27: iconst_1
      28: ixor
      29: istore_3
      30: aload_0
      31: getfield      #55                 // Field k:Ljava/util/ArrayList;
      34: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      37: iconst_1
      38: ixor
      39: istore        4
      41: iload_1
      42: ifne          59
      45: iload_2
      46: ifne          59
      49: iload         4
      51: ifne          59
      54: iload_3
      55: ifne          59
      58: return
      59: aload_0
      60: getfield      #53                 // Field j:Ljava/util/ArrayList;
      63: invokevirtual #176                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      66: astore        11
      68: aload         11
      70: invokeinterface #181,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      75: ifeq          95
      78: aload_0
      79: aload         11
      81: invokeinterface #185,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      86: checkcast     #101                // class android/support/v7/widget/RecyclerView$x
      89: invokespecial #187                // Method u:(Landroid/support/v7/widget/RecyclerView$x;)V
      92: goto          68
      95: aload_0
      96: getfield      #53                 // Field j:Ljava/util/ArrayList;
      99: invokevirtual #190                // Method java/util/ArrayList.clear:()V
     102: iload_2
     103: ifeq          192
     106: new           #50                 // class java/util/ArrayList
     109: dup
     110: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
     113: astore        11
     115: aload         11
     117: aload_0
     118: getfield      #57                 // Field l:Ljava/util/ArrayList;
     121: invokevirtual #194                // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
     124: pop
     125: aload_0
     126: getfield      #63                 // Field b:Ljava/util/ArrayList;
     129: aload         11
     131: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     134: pop
     135: aload_0
     136: getfield      #57                 // Field l:Ljava/util/ArrayList;
     139: invokevirtual #190                // Method java/util/ArrayList.clear:()V
     142: new           #6                  // class android/support/v7/widget/am$1
     145: dup
     146: aload_0
     147: aload         11
     149: invokespecial #197                // Method android/support/v7/widget/am$1."<init>":(Landroid/support/v7/widget/am;Ljava/util/ArrayList;)V
     152: astore        12
     154: iload_1
     155: ifeq          185
     158: aload         11
     160: iconst_0
     161: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     164: checkcast     #25                 // class android/support/v7/widget/am$b
     167: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
     170: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     173: aload         12
     175: aload_0
     176: invokevirtual #132                // Method g:()J
     179: invokestatic  #204                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;J)V
     182: goto          192
     185: aload         12
     187: invokeinterface #209,  1          // InterfaceMethod java/lang/Runnable.run:()V
     192: iload_3
     193: ifeq          282
     196: new           #50                 // class java/util/ArrayList
     199: dup
     200: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
     203: astore        11
     205: aload         11
     207: aload_0
     208: getfield      #59                 // Field m:Ljava/util/ArrayList;
     211: invokevirtual #194                // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
     214: pop
     215: aload_0
     216: getfield      #65                 // Field c:Ljava/util/ArrayList;
     219: aload         11
     221: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     224: pop
     225: aload_0
     226: getfield      #59                 // Field m:Ljava/util/ArrayList;
     229: invokevirtual #190                // Method java/util/ArrayList.clear:()V
     232: new           #8                  // class android/support/v7/widget/am$2
     235: dup
     236: aload_0
     237: aload         11
     239: invokespecial #210                // Method android/support/v7/widget/am$2."<init>":(Landroid/support/v7/widget/am;Ljava/util/ArrayList;)V
     242: astore        12
     244: iload_1
     245: ifeq          275
     248: aload         11
     250: iconst_0
     251: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     254: checkcast     #22                 // class android/support/v7/widget/am$a
     257: getfield      #91                 // Field android/support/v7/widget/am$a.a:Landroid/support/v7/widget/RecyclerView$x;
     260: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     263: aload         12
     265: aload_0
     266: invokevirtual #132                // Method g:()J
     269: invokestatic  #204                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;J)V
     272: goto          282
     275: aload         12
     277: invokeinterface #209,  1          // InterfaceMethod java/lang/Runnable.run:()V
     282: iload         4
     284: ifeq          434
     287: new           #50                 // class java/util/ArrayList
     290: dup
     291: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
     294: astore        11
     296: aload         11
     298: aload_0
     299: getfield      #55                 // Field k:Ljava/util/ArrayList;
     302: invokevirtual #194                // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
     305: pop
     306: aload_0
     307: getfield      #61                 // Field a:Ljava/util/ArrayList;
     310: aload         11
     312: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     315: pop
     316: aload_0
     317: getfield      #55                 // Field k:Ljava/util/ArrayList;
     320: invokevirtual #190                // Method java/util/ArrayList.clear:()V
     323: new           #10                 // class android/support/v7/widget/am$3
     326: dup
     327: aload_0
     328: aload         11
     330: invokespecial #211                // Method android/support/v7/widget/am$3."<init>":(Landroid/support/v7/widget/am;Ljava/util/ArrayList;)V
     333: astore        12
     335: iload_1
     336: ifne          358
     339: iload_2
     340: ifne          358
     343: iload_3
     344: ifeq          350
     347: goto          358
     350: aload         12
     352: invokeinterface #209,  1          // InterfaceMethod java/lang/Runnable.run:()V
     357: return
     358: lconst_0
     359: lstore        9
     361: iload_1
     362: ifeq          374
     365: aload_0
     366: invokevirtual #132                // Method g:()J
     369: lstore        5
     371: goto          377
     374: lconst_0
     375: lstore        5
     377: iload_2
     378: ifeq          390
     381: aload_0
     382: invokevirtual #213                // Method e:()J
     385: lstore        7
     387: goto          393
     390: lconst_0
     391: lstore        7
     393: iload_3
     394: ifeq          403
     397: aload_0
     398: invokevirtual #216                // Method h:()J
     401: lstore        9
     403: lload         7
     405: lload         9
     407: invokestatic  #222                // Method java/lang/Math.max:(JJ)J
     410: lstore        7
     412: aload         11
     414: iconst_0
     415: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     418: checkcast     #101                // class android/support/v7/widget/RecyclerView$x
     421: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     424: aload         12
     426: lload         5
     428: lload         7
     430: ladd
     431: invokestatic  #204                // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;J)V
     434: return

  void a(android.support.v7.widget.am$a);
    Code:
       0: aload_1
       1: getfield      #91                 // Field android/support/v7/widget/am$a.a:Landroid/support/v7/widget/RecyclerView$x;
       4: astore_2
       5: aconst_null
       6: astore_3
       7: aload_2
       8: ifnonnull     16
      11: aconst_null
      12: astore_2
      13: goto          21
      16: aload_2
      17: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      20: astore_2
      21: aload_1
      22: getfield      #93                 // Field android/support/v7/widget/am$a.b:Landroid/support/v7/widget/RecyclerView$x;
      25: astore        4
      27: aload         4
      29: ifnull        38
      32: aload         4
      34: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      37: astore_3
      38: aload_2
      39: ifnull        123
      42: aload_2
      43: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      46: aload_0
      47: invokevirtual #216                // Method h:()J
      50: invokevirtual #138                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      53: astore        4
      55: aload_0
      56: getfield      #73                 // Field g:Ljava/util/ArrayList;
      59: aload_1
      60: getfield      #91                 // Field android/support/v7/widget/am$a.a:Landroid/support/v7/widget/RecyclerView$x;
      63: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      66: pop
      67: aload         4
      69: aload_1
      70: getfield      #225                // Field android/support/v7/widget/am$a.e:I
      73: aload_1
      74: getfield      #227                // Field android/support/v7/widget/am$a.c:I
      77: isub
      78: i2f
      79: invokevirtual #230                // Method android/view/ViewPropertyAnimator.translationX:(F)Landroid/view/ViewPropertyAnimator;
      82: pop
      83: aload         4
      85: aload_1
      86: getfield      #232                // Field android/support/v7/widget/am$a.f:I
      89: aload_1
      90: getfield      #234                // Field android/support/v7/widget/am$a.d:I
      93: isub
      94: i2f
      95: invokevirtual #237                // Method android/view/ViewPropertyAnimator.translationY:(F)Landroid/view/ViewPropertyAnimator;
      98: pop
      99: aload         4
     101: fconst_0
     102: invokevirtual #142                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
     105: new           #18                 // class android/support/v7/widget/am$7
     108: dup
     109: aload_0
     110: aload_1
     111: aload         4
     113: aload_2
     114: invokespecial #240                // Method android/support/v7/widget/am$7."<init>":(Landroid/support/v7/widget/am;Landroid/support/v7/widget/am$a;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
     117: invokevirtual #149                // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
     120: invokevirtual #152                // Method android/view/ViewPropertyAnimator.start:()V
     123: aload_3
     124: ifnull        181
     127: aload_3
     128: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
     131: astore_2
     132: aload_0
     133: getfield      #73                 // Field g:Ljava/util/ArrayList;
     136: aload_1
     137: getfield      #93                 // Field android/support/v7/widget/am$a.b:Landroid/support/v7/widget/RecyclerView$x;
     140: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     143: pop
     144: aload_2
     145: fconst_0
     146: invokevirtual #230                // Method android/view/ViewPropertyAnimator.translationX:(F)Landroid/view/ViewPropertyAnimator;
     149: fconst_0
     150: invokevirtual #237                // Method android/view/ViewPropertyAnimator.translationY:(F)Landroid/view/ViewPropertyAnimator;
     153: aload_0
     154: invokevirtual #216                // Method h:()J
     157: invokevirtual #138                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
     160: fconst_1
     161: invokevirtual #142                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
     164: new           #20                 // class android/support/v7/widget/am$8
     167: dup
     168: aload_0
     169: aload_1
     170: aload_2
     171: aload_3
     172: invokespecial #241                // Method android/support/v7/widget/am$8."<init>":(Landroid/support/v7/widget/am;Landroid/support/v7/widget/am$a;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
     175: invokevirtual #149                // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
     178: invokevirtual #152                // Method android/view/ViewPropertyAnimator.start:()V
     181: return

  void a(java.util.List<android.support.v7.widget.RecyclerView$x>);
    Code:
       0: aload_1
       1: invokeinterface #81,  1           // InterfaceMethod java/util/List.size:()I
       6: iconst_1
       7: isub
       8: istore_2
       9: iload_2
      10: iflt          39
      13: aload_1
      14: iload_2
      15: invokeinterface #85,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      20: checkcast     #101                // class android/support/v7/widget/RecyclerView$x
      23: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      26: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      29: invokevirtual #245                // Method android/view/ViewPropertyAnimator.cancel:()V
      32: iload_2
      33: iconst_1
      34: isub
      35: istore_2
      36: goto          9
      39: return

  public boolean a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #249                // Method v:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: aload_0
       6: getfield      #53                 // Field j:Ljava/util/ArrayList;
       9: aload_1
      10: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      13: pop
      14: iconst_1
      15: ireturn

  public boolean a(android.support.v7.widget.RecyclerView$x, int, int, int, int);
    Code:
       0: aload_1
       1: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       4: astore        8
       6: iload_2
       7: aload_1
       8: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      11: invokevirtual #254                // Method android/view/View.getTranslationX:()F
      14: f2i
      15: iadd
      16: istore_2
      17: iload_3
      18: aload_1
      19: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      22: invokevirtual #257                // Method android/view/View.getTranslationY:()F
      25: f2i
      26: iadd
      27: istore_3
      28: aload_0
      29: aload_1
      30: invokespecial #249                // Method v:(Landroid/support/v7/widget/RecyclerView$x;)V
      33: iload         4
      35: iload_2
      36: isub
      37: istore        6
      39: iload         5
      41: iload_3
      42: isub
      43: istore        7
      45: iload         6
      47: ifne          62
      50: iload         7
      52: ifne          62
      55: aload_0
      56: aload_1
      57: invokevirtual #259                // Method j:(Landroid/support/v7/widget/RecyclerView$x;)V
      60: iconst_0
      61: ireturn
      62: iload         6
      64: ifeq          76
      67: aload         8
      69: iload         6
      71: ineg
      72: i2f
      73: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
      76: iload         7
      78: ifeq          90
      81: aload         8
      83: iload         7
      85: ineg
      86: i2f
      87: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
      90: aload_0
      91: getfield      #57                 // Field l:Ljava/util/ArrayList;
      94: new           #25                 // class android/support/v7/widget/am$b
      97: dup
      98: aload_1
      99: iload_2
     100: iload_3
     101: iload         4
     103: iload         5
     105: invokespecial #262                // Method android/support/v7/widget/am$b."<init>":(Landroid/support/v7/widget/RecyclerView$x;IIII)V
     108: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     111: pop
     112: iconst_1
     113: ireturn

  public boolean a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$x, int, int, int, int);
    Code:
       0: aload_1
       1: aload_2
       2: if_acmpne     18
       5: aload_0
       6: aload_1
       7: iload_3
       8: iload         4
      10: iload         5
      12: iload         6
      14: invokevirtual #265                // Method a:(Landroid/support/v7/widget/RecyclerView$x;IIII)Z
      17: ireturn
      18: aload_1
      19: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      22: invokevirtual #254                // Method android/view/View.getTranslationX:()F
      25: fstore        7
      27: aload_1
      28: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      31: invokevirtual #257                // Method android/view/View.getTranslationY:()F
      34: fstore        8
      36: aload_1
      37: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      40: invokevirtual #268                // Method android/view/View.getAlpha:()F
      43: fstore        9
      45: aload_0
      46: aload_1
      47: invokespecial #249                // Method v:(Landroid/support/v7/widget/RecyclerView$x;)V
      50: iload         5
      52: iload_3
      53: isub
      54: i2f
      55: fload         7
      57: fsub
      58: f2i
      59: istore        10
      61: iload         6
      63: iload         4
      65: isub
      66: i2f
      67: fload         8
      69: fsub
      70: f2i
      71: istore        11
      73: aload_1
      74: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      77: fload         7
      79: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
      82: aload_1
      83: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      86: fload         8
      88: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
      91: aload_1
      92: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      95: fload         9
      97: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     100: aload_2
     101: ifnull        139
     104: aload_0
     105: aload_2
     106: invokespecial #249                // Method v:(Landroid/support/v7/widget/RecyclerView$x;)V
     109: aload_2
     110: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     113: iload         10
     115: ineg
     116: i2f
     117: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
     120: aload_2
     121: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     124: iload         11
     126: ineg
     127: i2f
     128: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
     131: aload_2
     132: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     135: fconst_0
     136: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     139: aload_0
     140: getfield      #59                 // Field m:Ljava/util/ArrayList;
     143: new           #22                 // class android/support/v7/widget/am$a
     146: dup
     147: aload_1
     148: aload_2
     149: iload_3
     150: iload         4
     152: iload         5
     154: iload         6
     156: invokespecial #271                // Method android/support/v7/widget/am$a."<init>":(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$x;IIII)V
     159: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     162: pop
     163: iconst_1
     164: ireturn

  public boolean a(android.support.v7.widget.RecyclerView$x, java.util.List<java.lang.Object>);
    Code:
       0: aload_2
       1: invokeinterface #273,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       6: ifeq          23
       9: aload_0
      10: aload_1
      11: aload_2
      12: invokespecial #275                // Method android/support/v7/widget/bi.a:(Landroid/support/v7/widget/RecyclerView$x;Ljava/util/List;)Z
      15: ifeq          21
      18: goto          23
      21: iconst_0
      22: ireturn
      23: iconst_1
      24: ireturn

  void b(android.support.v7.widget.RecyclerView$x, int, int, int, int);
    Code:
       0: aload_1
       1: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       4: astore        6
       6: iload         4
       8: iload_2
       9: isub
      10: istore_2
      11: iload         5
      13: iload_3
      14: isub
      15: istore_3
      16: iload_2
      17: ifeq          30
      20: aload         6
      22: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      25: fconst_0
      26: invokevirtual #230                // Method android/view/ViewPropertyAnimator.translationX:(F)Landroid/view/ViewPropertyAnimator;
      29: pop
      30: iload_3
      31: ifeq          44
      34: aload         6
      36: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      39: fconst_0
      40: invokevirtual #237                // Method android/view/ViewPropertyAnimator.translationY:(F)Landroid/view/ViewPropertyAnimator;
      43: pop
      44: aload         6
      46: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      49: astore        7
      51: aload_0
      52: getfield      #69                 // Field e:Ljava/util/ArrayList;
      55: aload_1
      56: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      59: pop
      60: aload         7
      62: aload_0
      63: invokevirtual #213                // Method e:()J
      66: invokevirtual #138                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      69: new           #16                 // class android/support/v7/widget/am$6
      72: dup
      73: aload_0
      74: aload_1
      75: iload_2
      76: aload         6
      78: iload_3
      79: aload         7
      81: invokespecial #279                // Method android/support/v7/widget/am$6."<init>":(Landroid/support/v7/widget/am;Landroid/support/v7/widget/RecyclerView$x;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V
      84: invokevirtual #149                // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
      87: invokevirtual #152                // Method android/view/ViewPropertyAnimator.start:()V
      90: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #55                 // Field k:Ljava/util/ArrayList;
       4: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
       7: ifeq          115
      10: aload_0
      11: getfield      #59                 // Field m:Ljava/util/ArrayList;
      14: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      17: ifeq          115
      20: aload_0
      21: getfield      #57                 // Field l:Ljava/util/ArrayList;
      24: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      27: ifeq          115
      30: aload_0
      31: getfield      #53                 // Field j:Ljava/util/ArrayList;
      34: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      37: ifeq          115
      40: aload_0
      41: getfield      #69                 // Field e:Ljava/util/ArrayList;
      44: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      47: ifeq          115
      50: aload_0
      51: getfield      #71                 // Field f:Ljava/util/ArrayList;
      54: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      57: ifeq          115
      60: aload_0
      61: getfield      #67                 // Field d:Ljava/util/ArrayList;
      64: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      67: ifeq          115
      70: aload_0
      71: getfield      #73                 // Field g:Ljava/util/ArrayList;
      74: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      77: ifeq          115
      80: aload_0
      81: getfield      #63                 // Field b:Ljava/util/ArrayList;
      84: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      87: ifeq          115
      90: aload_0
      91: getfield      #61                 // Field a:Ljava/util/ArrayList;
      94: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
      97: ifeq          115
     100: aload_0
     101: getfield      #65                 // Field c:Ljava/util/ArrayList;
     104: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     107: ifne          113
     110: goto          115
     113: iconst_0
     114: ireturn
     115: iconst_1
     116: ireturn

  public boolean b(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #249                // Method v:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: aload_1
       6: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       9: fconst_0
      10: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
      13: aload_0
      14: getfield      #55                 // Field k:Ljava/util/ArrayList;
      17: aload_1
      18: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      21: pop
      22: iconst_1
      23: ireturn

  void c();
    Code:
       0: aload_0
       1: invokevirtual #281                // Method b:()Z
       4: ifne          11
       7: aload_0
       8: invokevirtual #283                // Method i:()V
      11: return

  void c(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       4: astore_2
       5: aload_2
       6: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
       9: astore_3
      10: aload_0
      11: getfield      #67                 // Field d:Ljava/util/ArrayList;
      14: aload_1
      15: invokevirtual #129                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      18: pop
      19: aload_3
      20: fconst_1
      21: invokevirtual #142                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      24: aload_0
      25: invokevirtual #285                // Method f:()J
      28: invokevirtual #138                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      31: new           #14                 // class android/support/v7/widget/am$5
      34: dup
      35: aload_0
      36: aload_1
      37: aload_2
      38: aload_3
      39: invokespecial #288                // Method android/support/v7/widget/am$5."<init>":(Landroid/support/v7/widget/am;Landroid/support/v7/widget/RecyclerView$x;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V
      42: invokevirtual #149                // Method android/view/ViewPropertyAnimator.setListener:(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
      45: invokevirtual #152                // Method android/view/ViewPropertyAnimator.start:()V
      48: return

  public void d();
    Code:
       0: aload_0
       1: getfield      #57                 // Field l:Ljava/util/ArrayList;
       4: invokevirtual #289                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_1
      10: iload_1
      11: iflt          71
      14: aload_0
      15: getfield      #57                 // Field l:Ljava/util/ArrayList;
      18: iload_1
      19: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #25                 // class android/support/v7/widget/am$b
      25: astore_3
      26: aload_3
      27: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
      30: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      33: astore        4
      35: aload         4
      37: fconst_0
      38: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
      41: aload         4
      43: fconst_0
      44: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
      47: aload_0
      48: aload_3
      49: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
      52: invokevirtual #259                // Method j:(Landroid/support/v7/widget/RecyclerView$x;)V
      55: aload_0
      56: getfield      #57                 // Field l:Ljava/util/ArrayList;
      59: iload_1
      60: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      63: pop
      64: iload_1
      65: iconst_1
      66: isub
      67: istore_1
      68: goto          10
      71: aload_0
      72: getfield      #53                 // Field j:Ljava/util/ArrayList;
      75: invokevirtual #289                // Method java/util/ArrayList.size:()I
      78: iconst_1
      79: isub
      80: istore_1
      81: iload_1
      82: iflt          116
      85: aload_0
      86: aload_0
      87: getfield      #53                 // Field j:Ljava/util/ArrayList;
      90: iload_1
      91: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      94: checkcast     #101                // class android/support/v7/widget/RecyclerView$x
      97: invokevirtual #293                // Method i:(Landroid/support/v7/widget/RecyclerView$x;)V
     100: aload_0
     101: getfield      #53                 // Field j:Ljava/util/ArrayList;
     104: iload_1
     105: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     108: pop
     109: iload_1
     110: iconst_1
     111: isub
     112: istore_1
     113: goto          81
     116: aload_0
     117: getfield      #55                 // Field k:Ljava/util/ArrayList;
     120: invokevirtual #289                // Method java/util/ArrayList.size:()I
     123: iconst_1
     124: isub
     125: istore_1
     126: iload_1
     127: iflt          171
     130: aload_0
     131: getfield      #55                 // Field k:Ljava/util/ArrayList;
     134: iload_1
     135: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     138: checkcast     #101                // class android/support/v7/widget/RecyclerView$x
     141: astore_3
     142: aload_3
     143: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     146: fconst_1
     147: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     150: aload_0
     151: aload_3
     152: invokevirtual #295                // Method k:(Landroid/support/v7/widget/RecyclerView$x;)V
     155: aload_0
     156: getfield      #55                 // Field k:Ljava/util/ArrayList;
     159: iload_1
     160: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     163: pop
     164: iload_1
     165: iconst_1
     166: isub
     167: istore_1
     168: goto          126
     171: aload_0
     172: getfield      #59                 // Field m:Ljava/util/ArrayList;
     175: invokevirtual #289                // Method java/util/ArrayList.size:()I
     178: iconst_1
     179: isub
     180: istore_1
     181: iload_1
     182: iflt          207
     185: aload_0
     186: aload_0
     187: getfield      #59                 // Field m:Ljava/util/ArrayList;
     190: iload_1
     191: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     194: checkcast     #22                 // class android/support/v7/widget/am$a
     197: invokespecial #297                // Method b:(Landroid/support/v7/widget/am$a;)V
     200: iload_1
     201: iconst_1
     202: isub
     203: istore_1
     204: goto          181
     207: aload_0
     208: getfield      #59                 // Field m:Ljava/util/ArrayList;
     211: invokevirtual #190                // Method java/util/ArrayList.clear:()V
     214: aload_0
     215: invokevirtual #281                // Method b:()Z
     218: ifne          222
     221: return
     222: aload_0
     223: getfield      #63                 // Field b:Ljava/util/ArrayList;
     226: invokevirtual #289                // Method java/util/ArrayList.size:()I
     229: iconst_1
     230: isub
     231: istore_1
     232: iload_1
     233: iflt          336
     236: aload_0
     237: getfield      #63                 // Field b:Ljava/util/ArrayList;
     240: iload_1
     241: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     244: checkcast     #50                 // class java/util/ArrayList
     247: astore_3
     248: aload_3
     249: invokevirtual #289                // Method java/util/ArrayList.size:()I
     252: iconst_1
     253: isub
     254: istore_2
     255: iload_2
     256: iflt          329
     259: aload_3
     260: iload_2
     261: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     264: checkcast     #25                 // class android/support/v7/widget/am$b
     267: astore        4
     269: aload         4
     271: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
     274: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     277: astore        5
     279: aload         5
     281: fconst_0
     282: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
     285: aload         5
     287: fconst_0
     288: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
     291: aload_0
     292: aload         4
     294: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
     297: invokevirtual #259                // Method j:(Landroid/support/v7/widget/RecyclerView$x;)V
     300: aload_3
     301: iload_2
     302: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     305: pop
     306: aload_3
     307: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     310: ifeq          322
     313: aload_0
     314: getfield      #63                 // Field b:Ljava/util/ArrayList;
     317: aload_3
     318: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     321: pop
     322: iload_2
     323: iconst_1
     324: isub
     325: istore_2
     326: goto          255
     329: iload_1
     330: iconst_1
     331: isub
     332: istore_1
     333: goto          232
     336: aload_0
     337: getfield      #61                 // Field a:Ljava/util/ArrayList;
     340: invokevirtual #289                // Method java/util/ArrayList.size:()I
     343: iconst_1
     344: isub
     345: istore_1
     346: iload_1
     347: iflt          434
     350: aload_0
     351: getfield      #61                 // Field a:Ljava/util/ArrayList;
     354: iload_1
     355: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     358: checkcast     #50                 // class java/util/ArrayList
     361: astore_3
     362: aload_3
     363: invokevirtual #289                // Method java/util/ArrayList.size:()I
     366: iconst_1
     367: isub
     368: istore_2
     369: iload_2
     370: iflt          427
     373: aload_3
     374: iload_2
     375: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     378: checkcast     #101                // class android/support/v7/widget/RecyclerView$x
     381: astore        4
     383: aload         4
     385: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
     388: fconst_1
     389: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     392: aload_0
     393: aload         4
     395: invokevirtual #295                // Method k:(Landroid/support/v7/widget/RecyclerView$x;)V
     398: aload_3
     399: iload_2
     400: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     403: pop
     404: aload_3
     405: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     408: ifeq          420
     411: aload_0
     412: getfield      #61                 // Field a:Ljava/util/ArrayList;
     415: aload_3
     416: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     419: pop
     420: iload_2
     421: iconst_1
     422: isub
     423: istore_2
     424: goto          369
     427: iload_1
     428: iconst_1
     429: isub
     430: istore_1
     431: goto          346
     434: aload_0
     435: getfield      #65                 // Field c:Ljava/util/ArrayList;
     438: invokevirtual #289                // Method java/util/ArrayList.size:()I
     441: iconst_1
     442: isub
     443: istore_1
     444: iload_1
     445: iflt          513
     448: aload_0
     449: getfield      #65                 // Field c:Ljava/util/ArrayList;
     452: iload_1
     453: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     456: checkcast     #50                 // class java/util/ArrayList
     459: astore_3
     460: aload_3
     461: invokevirtual #289                // Method java/util/ArrayList.size:()I
     464: iconst_1
     465: isub
     466: istore_2
     467: iload_2
     468: iflt          506
     471: aload_0
     472: aload_3
     473: iload_2
     474: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     477: checkcast     #22                 // class android/support/v7/widget/am$a
     480: invokespecial #297                // Method b:(Landroid/support/v7/widget/am$a;)V
     483: aload_3
     484: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     487: ifeq          499
     490: aload_0
     491: getfield      #65                 // Field c:Ljava/util/ArrayList;
     494: aload_3
     495: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     498: pop
     499: iload_2
     500: iconst_1
     501: isub
     502: istore_2
     503: goto          467
     506: iload_1
     507: iconst_1
     508: isub
     509: istore_1
     510: goto          444
     513: aload_0
     514: aload_0
     515: getfield      #71                 // Field f:Ljava/util/ArrayList;
     518: invokevirtual #300                // Method a:(Ljava/util/List;)V
     521: aload_0
     522: aload_0
     523: getfield      #69                 // Field e:Ljava/util/ArrayList;
     526: invokevirtual #300                // Method a:(Ljava/util/List;)V
     529: aload_0
     530: aload_0
     531: getfield      #67                 // Field d:Ljava/util/ArrayList;
     534: invokevirtual #300                // Method a:(Ljava/util/List;)V
     537: aload_0
     538: aload_0
     539: getfield      #73                 // Field g:Ljava/util/ArrayList;
     542: invokevirtual #300                // Method a:(Ljava/util/List;)V
     545: aload_0
     546: invokevirtual #283                // Method i:()V
     549: return

  public void d(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_1
       1: getfield      #104                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       4: astore        4
       6: aload         4
       8: invokevirtual #126                // Method android/view/View.animate:()Landroid/view/ViewPropertyAnimator;
      11: invokevirtual #245                // Method android/view/ViewPropertyAnimator.cancel:()V
      14: aload_0
      15: getfield      #57                 // Field l:Ljava/util/ArrayList;
      18: invokevirtual #289                // Method java/util/ArrayList.size:()I
      21: iconst_1
      22: isub
      23: istore_2
      24: iload_2
      25: iflt          79
      28: aload_0
      29: getfield      #57                 // Field l:Ljava/util/ArrayList;
      32: iload_2
      33: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      36: checkcast     #25                 // class android/support/v7/widget/am$b
      39: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
      42: aload_1
      43: if_acmpne     72
      46: aload         4
      48: fconst_0
      49: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
      52: aload         4
      54: fconst_0
      55: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
      58: aload_0
      59: aload_1
      60: invokevirtual #259                // Method j:(Landroid/support/v7/widget/RecyclerView$x;)V
      63: aload_0
      64: getfield      #57                 // Field l:Ljava/util/ArrayList;
      67: iload_2
      68: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      71: pop
      72: iload_2
      73: iconst_1
      74: isub
      75: istore_2
      76: goto          24
      79: aload_0
      80: aload_0
      81: getfield      #59                 // Field m:Ljava/util/ArrayList;
      84: aload_1
      85: invokespecial #302                // Method a:(Ljava/util/List;Landroid/support/v7/widget/RecyclerView$x;)V
      88: aload_0
      89: getfield      #53                 // Field j:Ljava/util/ArrayList;
      92: aload_1
      93: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      96: ifeq          110
      99: aload         4
     101: fconst_1
     102: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     105: aload_0
     106: aload_1
     107: invokevirtual #293                // Method i:(Landroid/support/v7/widget/RecyclerView$x;)V
     110: aload_0
     111: getfield      #55                 // Field k:Ljava/util/ArrayList;
     114: aload_1
     115: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     118: ifeq          132
     121: aload         4
     123: fconst_1
     124: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     127: aload_0
     128: aload_1
     129: invokevirtual #295                // Method k:(Landroid/support/v7/widget/RecyclerView$x;)V
     132: aload_0
     133: getfield      #65                 // Field c:Ljava/util/ArrayList;
     136: invokevirtual #289                // Method java/util/ArrayList.size:()I
     139: iconst_1
     140: isub
     141: istore_2
     142: iload_2
     143: iflt          190
     146: aload_0
     147: getfield      #65                 // Field c:Ljava/util/ArrayList;
     150: iload_2
     151: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     154: checkcast     #50                 // class java/util/ArrayList
     157: astore        5
     159: aload_0
     160: aload         5
     162: aload_1
     163: invokespecial #302                // Method a:(Ljava/util/List;Landroid/support/v7/widget/RecyclerView$x;)V
     166: aload         5
     168: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     171: ifeq          183
     174: aload_0
     175: getfield      #65                 // Field c:Ljava/util/ArrayList;
     178: iload_2
     179: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     182: pop
     183: iload_2
     184: iconst_1
     185: isub
     186: istore_2
     187: goto          142
     190: aload_0
     191: getfield      #63                 // Field b:Ljava/util/ArrayList;
     194: invokevirtual #289                // Method java/util/ArrayList.size:()I
     197: iconst_1
     198: isub
     199: istore_2
     200: iload_2
     201: iflt          303
     204: aload_0
     205: getfield      #63                 // Field b:Ljava/util/ArrayList;
     208: iload_2
     209: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     212: checkcast     #50                 // class java/util/ArrayList
     215: astore        5
     217: aload         5
     219: invokevirtual #289                // Method java/util/ArrayList.size:()I
     222: iconst_1
     223: isub
     224: istore_3
     225: iload_3
     226: iflt          296
     229: aload         5
     231: iload_3
     232: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     235: checkcast     #25                 // class android/support/v7/widget/am$b
     238: getfield      #199                // Field android/support/v7/widget/am$b.a:Landroid/support/v7/widget/RecyclerView$x;
     241: aload_1
     242: if_acmpne     289
     245: aload         4
     247: fconst_0
     248: invokevirtual #116                // Method android/view/View.setTranslationY:(F)V
     251: aload         4
     253: fconst_0
     254: invokevirtual #113                // Method android/view/View.setTranslationX:(F)V
     257: aload_0
     258: aload_1
     259: invokevirtual #259                // Method j:(Landroid/support/v7/widget/RecyclerView$x;)V
     262: aload         5
     264: iload_3
     265: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     268: pop
     269: aload         5
     271: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     274: ifeq          296
     277: aload_0
     278: getfield      #63                 // Field b:Ljava/util/ArrayList;
     281: iload_2
     282: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     285: pop
     286: goto          296
     289: iload_3
     290: iconst_1
     291: isub
     292: istore_3
     293: goto          225
     296: iload_2
     297: iconst_1
     298: isub
     299: istore_2
     300: goto          200
     303: aload_0
     304: getfield      #61                 // Field a:Ljava/util/ArrayList;
     307: invokevirtual #289                // Method java/util/ArrayList.size:()I
     310: iconst_1
     311: isub
     312: istore_2
     313: iload_2
     314: iflt          374
     317: aload_0
     318: getfield      #61                 // Field a:Ljava/util/ArrayList;
     321: iload_2
     322: invokevirtual #198                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     325: checkcast     #50                 // class java/util/ArrayList
     328: astore        5
     330: aload         5
     332: aload_1
     333: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     336: ifeq          367
     339: aload         4
     341: fconst_1
     342: invokevirtual #110                // Method android/view/View.setAlpha:(F)V
     345: aload_0
     346: aload_1
     347: invokevirtual #295                // Method k:(Landroid/support/v7/widget/RecyclerView$x;)V
     350: aload         5
     352: invokevirtual #172                // Method java/util/ArrayList.isEmpty:()Z
     355: ifeq          367
     358: aload_0
     359: getfield      #61                 // Field a:Ljava/util/ArrayList;
     362: iload_2
     363: invokevirtual #291                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     366: pop
     367: iload_2
     368: iconst_1
     369: isub
     370: istore_2
     371: goto          313
     374: aload_0
     375: getfield      #71                 // Field f:Ljava/util/ArrayList;
     378: aload_1
     379: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     382: pop
     383: aload_0
     384: getfield      #67                 // Field d:Ljava/util/ArrayList;
     387: aload_1
     388: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     391: pop
     392: aload_0
     393: getfield      #73                 // Field g:Ljava/util/ArrayList;
     396: aload_1
     397: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     400: pop
     401: aload_0
     402: getfield      #69                 // Field e:Ljava/util/ArrayList;
     405: aload_1
     406: invokevirtual #298                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     409: pop
     410: aload_0
     411: invokevirtual #304                // Method c:()V
     414: return
}
