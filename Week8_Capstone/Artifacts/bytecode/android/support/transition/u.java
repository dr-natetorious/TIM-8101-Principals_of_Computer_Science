public abstract class android.support.transition.u implements java.lang.Cloneable {
  long a;

  java.util.ArrayList<java.lang.Integer> b;

  java.util.ArrayList<android.view.View> c;

  android.support.transition.y d;

  boolean e;

  android.support.transition.x f;

  static {};
    Code:
       0: iconst_4
       1: newarray       int
       3: dup
       4: iconst_0
       5: iconst_2
       6: iastore
       7: dup
       8: iconst_1
       9: iconst_1
      10: iastore
      11: dup
      12: iconst_2
      13: iconst_3
      14: iastore
      15: dup
      16: iconst_3
      17: iconst_4
      18: iastore
      19: putstatic     #80                 // Field g:[I
      22: new           #8                  // class android/support/transition/u$1
      25: dup
      26: invokespecial #83                 // Method android/support/transition/u$1."<init>":()V
      29: putstatic     #85                 // Field h:Landroid/support/transition/l;
      32: new           #87                 // class java/lang/ThreadLocal
      35: dup
      36: invokespecial #88                 // Method java/lang/ThreadLocal."<init>":()V
      39: putstatic     #90                 // Field z:Ljava/lang/ThreadLocal;
      42: return

  public android.support.transition.u();
    Code:
       0: aload_0
       1: invokespecial #92                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_0
       6: invokevirtual #96                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       9: invokevirtual #102                // Method java/lang/Class.getName:()Ljava/lang/String;
      12: putfield      #104                // Field i:Ljava/lang/String;
      15: aload_0
      16: ldc2_w        #105                // long -1l
      19: putfield      #108                // Field j:J
      22: aload_0
      23: ldc2_w        #105                // long -1l
      26: putfield      #110                // Field a:J
      29: aload_0
      30: aconst_null
      31: putfield      #112                // Field k:Landroid/animation/TimeInterpolator;
      34: aload_0
      35: new           #114                // class java/util/ArrayList
      38: dup
      39: invokespecial #115                // Method java/util/ArrayList."<init>":()V
      42: putfield      #117                // Field b:Ljava/util/ArrayList;
      45: aload_0
      46: new           #114                // class java/util/ArrayList
      49: dup
      50: invokespecial #115                // Method java/util/ArrayList."<init>":()V
      53: putfield      #119                // Field c:Ljava/util/ArrayList;
      56: aload_0
      57: aconst_null
      58: putfield      #121                // Field l:Ljava/util/ArrayList;
      61: aload_0
      62: aconst_null
      63: putfield      #123                // Field m:Ljava/util/ArrayList;
      66: aload_0
      67: aconst_null
      68: putfield      #125                // Field n:Ljava/util/ArrayList;
      71: aload_0
      72: aconst_null
      73: putfield      #127                // Field o:Ljava/util/ArrayList;
      76: aload_0
      77: aconst_null
      78: putfield      #129                // Field p:Ljava/util/ArrayList;
      81: aload_0
      82: aconst_null
      83: putfield      #131                // Field q:Ljava/util/ArrayList;
      86: aload_0
      87: aconst_null
      88: putfield      #133                // Field r:Ljava/util/ArrayList;
      91: aload_0
      92: aconst_null
      93: putfield      #135                // Field s:Ljava/util/ArrayList;
      96: aload_0
      97: aconst_null
      98: putfield      #137                // Field t:Ljava/util/ArrayList;
     101: aload_0
     102: new           #139                // class android/support/transition/ab
     105: dup
     106: invokespecial #140                // Method android/support/transition/ab."<init>":()V
     109: putfield      #142                // Field u:Landroid/support/transition/ab;
     112: aload_0
     113: new           #139                // class android/support/transition/ab
     116: dup
     117: invokespecial #140                // Method android/support/transition/ab."<init>":()V
     120: putfield      #144                // Field v:Landroid/support/transition/ab;
     123: aload_0
     124: aconst_null
     125: putfield      #146                // Field d:Landroid/support/transition/y;
     128: aload_0
     129: getstatic     #80                 // Field g:[I
     132: putfield      #148                // Field w:[I
     135: aload_0
     136: aconst_null
     137: putfield      #150                // Field A:Landroid/view/ViewGroup;
     140: aload_0
     141: iconst_0
     142: putfield      #152                // Field e:Z
     145: aload_0
     146: new           #114                // class java/util/ArrayList
     149: dup
     150: invokespecial #115                // Method java/util/ArrayList."<init>":()V
     153: putfield      #154                // Field B:Ljava/util/ArrayList;
     156: aload_0
     157: iconst_0
     158: putfield      #156                // Field C:I
     161: aload_0
     162: iconst_0
     163: putfield      #158                // Field D:Z
     166: aload_0
     167: iconst_0
     168: putfield      #160                // Field E:Z
     171: aload_0
     172: aconst_null
     173: putfield      #162                // Field F:Ljava/util/ArrayList;
     176: aload_0
     177: new           #114                // class java/util/ArrayList
     180: dup
     181: invokespecial #115                // Method java/util/ArrayList."<init>":()V
     184: putfield      #164                // Field G:Ljava/util/ArrayList;
     187: aload_0
     188: getstatic     #85                 // Field h:Landroid/support/transition/l;
     191: putfield      #166                // Field J:Landroid/support/transition/l;
     194: return

  static java.util.ArrayList a(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #154                // Field B:Ljava/util/ArrayList;
       4: areturn

  public android.animation.Animator a(android.view.ViewGroup, android.support.transition.aa, android.support.transition.aa);
    Code:
       0: aconst_null
       1: areturn

  public android.support.transition.aa a(android.view.View, boolean);
    Code:
       0: aload_0
       1: getfield      #146                // Field d:Landroid/support/transition/y;
       4: ifnull        17
       7: aload_0
       8: getfield      #146                // Field d:Landroid/support/transition/y;
      11: aload_1
      12: iload_2
      13: invokevirtual #391                // Method android/support/transition/y.a:(Landroid/view/View;Z)Landroid/support/transition/aa;
      16: areturn
      17: iload_2
      18: ifeq          29
      21: aload_0
      22: getfield      #142                // Field u:Landroid/support/transition/ab;
      25: astore_3
      26: goto          34
      29: aload_0
      30: getfield      #144                // Field v:Landroid/support/transition/ab;
      33: astore_3
      34: aload_3
      35: getfield      #187                // Field android/support/transition/ab.a:Landroid/support/v4/g/a;
      38: aload_1
      39: invokevirtual #312                // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
      42: checkcast     #294                // class android/support/transition/aa
      45: areturn

  public android.support.transition.u a(long);
    Code:
       0: aload_0
       1: lload_1
       2: putfield      #110                // Field a:J
       5: aload_0
       6: areturn

  public android.support.transition.u a(android.support.transition.u$c);
    Code:
       0: aload_0
       1: getfield      #162                // Field F:Ljava/util/ArrayList;
       4: ifnonnull     18
       7: aload_0
       8: new           #114                // class java/util/ArrayList
      11: dup
      12: invokespecial #115                // Method java/util/ArrayList."<init>":()V
      15: putfield      #162                // Field F:Ljava/util/ArrayList;
      18: aload_0
      19: getfield      #162                // Field F:Ljava/util/ArrayList;
      22: aload_1
      23: invokevirtual #304                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      26: pop
      27: aload_0
      28: areturn

  java.lang.String a(java.lang.String);
    Code:
       0: new           #396                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
       7: astore        4
       9: aload         4
      11: aload_1
      12: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      15: pop
      16: aload         4
      18: aload_0
      19: invokevirtual #96                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      22: invokevirtual #404                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      25: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      28: pop
      29: aload         4
      31: ldc_w         #406                // String @
      34: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: aload         4
      40: aload_0
      41: invokevirtual #409                // Method java/lang/Object.hashCode:()I
      44: invokestatic  #413                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      47: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: aload         4
      53: ldc_w         #415                // String :
      56: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      59: pop
      60: aload         4
      62: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      65: astore        4
      67: aload         4
      69: astore_1
      70: aload_0
      71: getfield      #110                // Field a:J
      74: ldc2_w        #105                // long -1l
      77: lcmp
      78: ifeq          126
      81: new           #396                // class java/lang/StringBuilder
      84: dup
      85: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
      88: astore_1
      89: aload_1
      90: aload         4
      92: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      95: pop
      96: aload_1
      97: ldc_w         #420                // String dur(
     100: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     103: pop
     104: aload_1
     105: aload_0
     106: getfield      #110                // Field a:J
     109: invokevirtual #423                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
     112: pop
     113: aload_1
     114: ldc_w         #425                // String )
     117: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     120: pop
     121: aload_1
     122: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     125: astore_1
     126: aload_1
     127: astore        4
     129: aload_0
     130: getfield      #108                // Field j:J
     133: ldc2_w        #105                // long -1l
     136: lcmp
     137: ifeq          191
     140: new           #396                // class java/lang/StringBuilder
     143: dup
     144: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     147: astore        4
     149: aload         4
     151: aload_1
     152: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     155: pop
     156: aload         4
     158: ldc_w         #427                // String dly(
     161: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     164: pop
     165: aload         4
     167: aload_0
     168: getfield      #108                // Field j:J
     171: invokevirtual #423                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
     174: pop
     175: aload         4
     177: ldc_w         #425                // String )
     180: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     183: pop
     184: aload         4
     186: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     189: astore        4
     191: aload         4
     193: astore_1
     194: aload_0
     195: getfield      #112                // Field k:Landroid/animation/TimeInterpolator;
     198: ifnull        246
     201: new           #396                // class java/lang/StringBuilder
     204: dup
     205: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     208: astore_1
     209: aload_1
     210: aload         4
     212: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     215: pop
     216: aload_1
     217: ldc_w         #429                // String interp(
     220: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     223: pop
     224: aload_1
     225: aload_0
     226: getfield      #112                // Field k:Landroid/animation/TimeInterpolator;
     229: invokevirtual #432                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     232: pop
     233: aload_1
     234: ldc_w         #425                // String )
     237: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     240: pop
     241: aload_1
     242: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     245: astore_1
     246: aload_0
     247: getfield      #117                // Field b:Ljava/util/ArrayList;
     250: invokevirtual #349                // Method java/util/ArrayList.size:()I
     253: ifgt          269
     256: aload_1
     257: astore        4
     259: aload_0
     260: getfield      #119                // Field c:Ljava/util/ArrayList;
     263: invokevirtual #349                // Method java/util/ArrayList.size:()I
     266: ifle          550
     269: new           #396                // class java/lang/StringBuilder
     272: dup
     273: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     276: astore        4
     278: aload         4
     280: aload_1
     281: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     284: pop
     285: aload         4
     287: ldc_w         #434                // String tgts(
     290: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     293: pop
     294: aload         4
     296: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     299: astore        4
     301: aload_0
     302: getfield      #117                // Field b:Ljava/util/ArrayList;
     305: invokevirtual #349                // Method java/util/ArrayList.size:()I
     308: istore_2
     309: iconst_0
     310: istore_3
     311: aload         4
     313: astore_1
     314: iload_2
     315: ifle          413
     318: aload         4
     320: astore_1
     321: iconst_0
     322: istore_2
     323: iload_2
     324: aload_0
     325: getfield      #117                // Field b:Ljava/util/ArrayList;
     328: invokevirtual #349                // Method java/util/ArrayList.size:()I
     331: if_icmpge     413
     334: aload_1
     335: astore        4
     337: iload_2
     338: ifle          373
     341: new           #396                // class java/lang/StringBuilder
     344: dup
     345: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     348: astore        4
     350: aload         4
     352: aload_1
     353: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     356: pop
     357: aload         4
     359: ldc_w         #436                // String ,
     362: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     365: pop
     366: aload         4
     368: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     371: astore        4
     373: new           #396                // class java/lang/StringBuilder
     376: dup
     377: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     380: astore_1
     381: aload_1
     382: aload         4
     384: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     387: pop
     388: aload_1
     389: aload_0
     390: getfield      #117                // Field b:Ljava/util/ArrayList;
     393: iload_2
     394: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     397: invokevirtual #432                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     400: pop
     401: aload_1
     402: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     405: astore_1
     406: iload_2
     407: iconst_1
     408: iadd
     409: istore_2
     410: goto          323
     413: aload_1
     414: astore        4
     416: aload_0
     417: getfield      #119                // Field c:Ljava/util/ArrayList;
     420: invokevirtual #349                // Method java/util/ArrayList.size:()I
     423: ifle          521
     426: iload_3
     427: istore_2
     428: aload_1
     429: astore        4
     431: iload_2
     432: aload_0
     433: getfield      #119                // Field c:Ljava/util/ArrayList;
     436: invokevirtual #349                // Method java/util/ArrayList.size:()I
     439: if_icmpge     521
     442: aload_1
     443: astore        4
     445: iload_2
     446: ifle          481
     449: new           #396                // class java/lang/StringBuilder
     452: dup
     453: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     456: astore        4
     458: aload         4
     460: aload_1
     461: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     464: pop
     465: aload         4
     467: ldc_w         #436                // String ,
     470: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     473: pop
     474: aload         4
     476: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     479: astore        4
     481: new           #396                // class java/lang/StringBuilder
     484: dup
     485: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     488: astore_1
     489: aload_1
     490: aload         4
     492: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     495: pop
     496: aload_1
     497: aload_0
     498: getfield      #119                // Field c:Ljava/util/ArrayList;
     501: iload_2
     502: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     505: invokevirtual #432                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     508: pop
     509: aload_1
     510: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     513: astore_1
     514: iload_2
     515: iconst_1
     516: iadd
     517: istore_2
     518: goto          428
     521: new           #396                // class java/lang/StringBuilder
     524: dup
     525: invokespecial #397                // Method java/lang/StringBuilder."<init>":()V
     528: astore_1
     529: aload_1
     530: aload         4
     532: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     535: pop
     536: aload_1
     537: ldc_w         #438                // String )
     540: invokevirtual #401                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     543: pop
     544: aload_1
     545: invokevirtual #418                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     548: astore        4
     550: aload         4
     552: areturn

  protected void a(android.animation.Animator);
    Code:
       0: aload_1
       1: ifnonnull     9
       4: aload_0
       5: invokevirtual #440                // Method k:()V
       8: return
       9: aload_0
      10: invokevirtual #443                // Method b:()J
      13: lconst_0
      14: lcmp
      15: iflt          27
      18: aload_1
      19: aload_0
      20: invokevirtual #443                // Method b:()J
      23: invokevirtual #447                // Method android/animation/Animator.setDuration:(J)Landroid/animation/Animator;
      26: pop
      27: aload_0
      28: invokevirtual #449                // Method c:()J
      31: lconst_0
      32: lcmp
      33: iflt          44
      36: aload_1
      37: aload_0
      38: invokevirtual #449                // Method c:()J
      41: invokevirtual #453                // Method android/animation/Animator.setStartDelay:(J)V
      44: aload_0
      45: invokevirtual #456                // Method d:()Landroid/animation/TimeInterpolator;
      48: ifnull        59
      51: aload_1
      52: aload_0
      53: invokevirtual #456                // Method d:()Landroid/animation/TimeInterpolator;
      56: invokevirtual #460                // Method android/animation/Animator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
      59: aload_1
      60: new           #12                 // class android/support/transition/u$3
      63: dup
      64: aload_0
      65: invokespecial #463                // Method android/support/transition/u$3."<init>":(Landroid/support/transition/u;)V
      68: invokevirtual #177                // Method android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
      71: aload_1
      72: invokevirtual #466                // Method android/animation/Animator.start:()V
      75: return

  public abstract void a(android.support.transition.aa);

  public void a(android.support.transition.u$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #469                // Field H:Landroid/support/transition/u$b;
       5: return

  void a(android.view.ViewGroup);
    Code:
       0: aload_0
       1: new           #114                // class java/util/ArrayList
       4: dup
       5: invokespecial #115                // Method java/util/ArrayList."<init>":()V
       8: putfield      #301                // Field x:Ljava/util/ArrayList;
      11: aload_0
      12: new           #114                // class java/util/ArrayList
      15: dup
      16: invokespecial #115                // Method java/util/ArrayList."<init>":()V
      19: putfield      #306                // Field y:Ljava/util/ArrayList;
      22: aload_0
      23: aload_0
      24: getfield      #142                // Field u:Landroid/support/transition/ab;
      27: aload_0
      28: getfield      #144                // Field v:Landroid/support/transition/ab;
      31: invokespecial #472                // Method a:(Landroid/support/transition/ab;Landroid/support/transition/ab;)V
      34: invokestatic  #474                // Method o:()Landroid/support/v4/g/a;
      37: astore        4
      39: aload         4
      41: invokevirtual #282                // Method android/support/v4/g/a.size:()I
      44: istore_2
      45: aload_1
      46: invokestatic  #479                // Method android/support/transition/am.b:(Landroid/view/View;)Landroid/support/transition/aw;
      49: astore        5
      51: iload_2
      52: iconst_1
      53: isub
      54: istore_2
      55: iload_2
      56: iflt          223
      59: aload         4
      61: iload_2
      62: invokevirtual #285                // Method android/support/v4/g/a.b:(I)Ljava/lang/Object;
      65: checkcast     #173                // class android/animation/Animator
      68: astore        6
      70: aload         6
      72: ifnull        216
      75: aload         4
      77: aload         6
      79: invokevirtual #312                // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
      82: checkcast     #14                 // class android/support/transition/u$a
      85: astore        7
      87: aload         7
      89: ifnull        216
      92: aload         7
      94: getfield      #481                // Field android/support/transition/u$a.a:Landroid/view/View;
      97: ifnull        216
     100: aload         5
     102: aload         7
     104: getfield      #484                // Field android/support/transition/u$a.d:Landroid/support/transition/aw;
     107: invokevirtual #339                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
     110: ifeq          216
     113: aload         7
     115: getfield      #487                // Field android/support/transition/u$a.c:Landroid/support/transition/aa;
     118: astore        8
     120: aload         7
     122: getfield      #481                // Field android/support/transition/u$a.a:Landroid/view/View;
     125: astore        10
     127: aload_0
     128: aload         10
     130: iconst_1
     131: invokevirtual #488                // Method a:(Landroid/view/View;Z)Landroid/support/transition/aa;
     134: astore        9
     136: aload_0
     137: aload         10
     139: iconst_1
     140: invokevirtual #490                // Method b:(Landroid/view/View;Z)Landroid/support/transition/aa;
     143: astore        10
     145: aload         9
     147: ifnonnull     155
     150: aload         10
     152: ifnull        175
     155: aload         7
     157: getfield      #493                // Field android/support/transition/u$a.e:Landroid/support/transition/u;
     160: aload         8
     162: aload         10
     164: invokevirtual #496                // Method a:(Landroid/support/transition/aa;Landroid/support/transition/aa;)Z
     167: ifeq          175
     170: iconst_1
     171: istore_3
     172: goto          177
     175: iconst_0
     176: istore_3
     177: iload_3
     178: ifeq          216
     181: aload         6
     183: invokevirtual #499                // Method android/animation/Animator.isRunning:()Z
     186: ifne          211
     189: aload         6
     191: invokevirtual #502                // Method android/animation/Animator.isStarted:()Z
     194: ifeq          200
     197: goto          211
     200: aload         4
     202: aload         6
     204: invokevirtual #292                // Method android/support/v4/g/a.remove:(Ljava/lang/Object;)Ljava/lang/Object;
     207: pop
     208: goto          216
     211: aload         6
     213: invokevirtual #505                // Method android/animation/Animator.cancel:()V
     216: iload_2
     217: iconst_1
     218: isub
     219: istore_2
     220: goto          55
     223: aload_0
     224: aload_1
     225: aload_0
     226: getfield      #142                // Field u:Landroid/support/transition/ab;
     229: aload_0
     230: getfield      #144                // Field v:Landroid/support/transition/ab;
     233: aload_0
     234: getfield      #301                // Field x:Ljava/util/ArrayList;
     237: aload_0
     238: getfield      #306                // Field y:Ljava/util/ArrayList;
     241: invokevirtual #508                // Method a:(Landroid/view/ViewGroup;Landroid/support/transition/ab;Landroid/support/transition/ab;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
     244: aload_0
     245: invokevirtual #510                // Method e:()V
     248: return

  protected void a(android.view.ViewGroup, android.support.transition.ab, android.support.transition.ab, java.util.ArrayList<android.support.transition.aa>, java.util.ArrayList<android.support.transition.aa>);
    Code:
       0: invokestatic  #474                // Method o:()Landroid/support/v4/g/a;
       3: astore        20
       5: new           #512                // class android/util/SparseIntArray
       8: dup
       9: invokespecial #513                // Method android/util/SparseIntArray."<init>":()V
      12: astore        19
      14: aload         4
      16: invokevirtual #349                // Method java/util/ArrayList.size:()I
      19: istore        8
      21: ldc2_w        #514                // long 9223372036854775807l
      24: lstore        10
      26: iconst_0
      27: istore        6
      29: iload         6
      31: iload         8
      33: if_icmpge     555
      36: aload         4
      38: iload         6
      40: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      43: checkcast     #294                // class android/support/transition/aa
      46: astore        14
      48: aload         5
      50: iload         6
      52: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      55: checkcast     #294                // class android/support/transition/aa
      58: astore_2
      59: aload         14
      61: astore        15
      63: aload         14
      65: ifnull        87
      68: aload         14
      70: astore        15
      72: aload         14
      74: getfield      #362                // Field android/support/transition/aa.c:Ljava/util/ArrayList;
      77: aload_0
      78: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      81: ifne          87
      84: aconst_null
      85: astore        15
      87: aload_2
      88: astore        16
      90: aload_2
      91: ifnull        111
      94: aload_2
      95: astore        16
      97: aload_2
      98: getfield      #362                // Field android/support/transition/aa.c:Ljava/util/ArrayList;
     101: aload_0
     102: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     105: ifne          111
     108: aconst_null
     109: astore        16
     111: aload         15
     113: ifnonnull     132
     116: aload         16
     118: ifnonnull     132
     121: lload         10
     123: lstore        12
     125: iload         6
     127: istore        7
     129: goto          542
     132: aload         15
     134: ifnull        162
     137: aload         16
     139: ifnull        162
     142: aload_0
     143: aload         15
     145: aload         16
     147: invokevirtual #496                // Method a:(Landroid/support/transition/aa;Landroid/support/transition/aa;)Z
     150: ifeq          156
     153: goto          162
     156: iconst_0
     157: istore        7
     159: goto          165
     162: iconst_1
     163: istore        7
     165: iload         7
     167: ifeq          121
     170: aload_0
     171: aload_1
     172: aload         15
     174: aload         16
     176: invokevirtual #517                // Method a:(Landroid/view/ViewGroup;Landroid/support/transition/aa;Landroid/support/transition/aa;)Landroid/animation/Animator;
     179: astore_2
     180: aload_2
     181: ifnull        121
     184: aload         16
     186: ifnull        430
     189: aload         16
     191: getfield      #297                // Field android/support/transition/aa.b:Landroid/view/View;
     194: astore        17
     196: aload_0
     197: invokevirtual #520                // Method a:()[Ljava/lang/String;
     200: astore        21
     202: aload         17
     204: ifnull        424
     207: aload         21
     209: ifnull        424
     212: aload         21
     214: arraylength
     215: ifle          424
     218: new           #294                // class android/support/transition/aa
     221: dup
     222: invokespecial #356                // Method android/support/transition/aa."<init>":()V
     225: astore        18
     227: aload         18
     229: aload         17
     231: putfield      #297                // Field android/support/transition/aa.b:Landroid/view/View;
     234: aload_3
     235: getfield      #187                // Field android/support/transition/ab.a:Landroid/support/v4/g/a;
     238: aload         17
     240: invokevirtual #312                // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
     243: checkcast     #294                // class android/support/transition/aa
     246: astore        14
     248: iload         6
     250: istore        7
     252: aload         14
     254: ifnull        312
     257: iconst_0
     258: istore        9
     260: iload         6
     262: istore        7
     264: iload         9
     266: aload         21
     268: arraylength
     269: if_icmpge     312
     272: aload         18
     274: getfield      #333                // Field android/support/transition/aa.a:Ljava/util/Map;
     277: aload         21
     279: iload         9
     281: aaload
     282: aload         14
     284: getfield      #333                // Field android/support/transition/aa.a:Ljava/util/Map;
     287: aload         21
     289: iload         9
     291: aaload
     292: invokeinterface #336,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     297: invokeinterface #521,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     302: pop
     303: iload         9
     305: iconst_1
     306: iadd
     307: istore        9
     309: goto          260
     312: iload         7
     314: istore        6
     316: aload         20
     318: invokevirtual #282                // Method android/support/v4/g/a.size:()I
     321: istore        9
     323: iconst_0
     324: istore        7
     326: iload         7
     328: iload         9
     330: if_icmpge     417
     333: aload         20
     335: aload         20
     337: iload         7
     339: invokevirtual #285                // Method android/support/v4/g/a.b:(I)Ljava/lang/Object;
     342: checkcast     #173                // class android/animation/Animator
     345: invokevirtual #312                // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
     348: checkcast     #14                 // class android/support/transition/u$a
     351: astore        14
     353: aload         14
     355: getfield      #487                // Field android/support/transition/u$a.c:Landroid/support/transition/aa;
     358: ifnull        408
     361: aload         14
     363: getfield      #481                // Field android/support/transition/u$a.a:Landroid/view/View;
     366: aload         17
     368: if_acmpne     408
     371: aload         14
     373: getfield      #523                // Field android/support/transition/u$a.b:Ljava/lang/String;
     376: aload_0
     377: invokevirtual #525                // Method n:()Ljava/lang/String;
     380: invokevirtual #528                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     383: ifeq          408
     386: aload         14
     388: getfield      #487                // Field android/support/transition/u$a.c:Landroid/support/transition/aa;
     391: aload         18
     393: invokevirtual #529                // Method android/support/transition/aa.equals:(Ljava/lang/Object;)Z
     396: ifeq          408
     399: aconst_null
     400: astore_2
     401: aload         18
     403: astore        14
     405: goto          427
     408: iload         7
     410: iconst_1
     411: iadd
     412: istore        7
     414: goto          326
     417: aload         18
     419: astore        14
     421: goto          427
     424: aconst_null
     425: astore        14
     427: goto          440
     430: aload         15
     432: getfield      #297                // Field android/support/transition/aa.b:Landroid/view/View;
     435: astore        17
     437: aconst_null
     438: astore        14
     440: lload         10
     442: lstore        12
     444: iload         6
     446: istore        7
     448: aload_2
     449: ifnull        542
     452: lload         10
     454: lstore        12
     456: aload_0
     457: getfield      #531                // Field f:Landroid/support/transition/x;
     460: ifnull        502
     463: aload_0
     464: getfield      #531                // Field f:Landroid/support/transition/x;
     467: aload_1
     468: aload_0
     469: aload         15
     471: aload         16
     473: invokevirtual #536                // Method android/support/transition/x.a:(Landroid/view/ViewGroup;Landroid/support/transition/u;Landroid/support/transition/aa;Landroid/support/transition/aa;)J
     476: lstore        12
     478: aload         19
     480: aload_0
     481: getfield      #164                // Field G:Ljava/util/ArrayList;
     484: invokevirtual #349                // Method java/util/ArrayList.size:()I
     487: lload         12
     489: l2i
     490: invokevirtual #539                // Method android/util/SparseIntArray.put:(II)V
     493: lload         12
     495: lload         10
     497: invokestatic  #545                // Method java/lang/Math.min:(JJ)J
     500: lstore        12
     502: aload         20
     504: aload_2
     505: new           #14                 // class android/support/transition/u$a
     508: dup
     509: aload         17
     511: aload_0
     512: invokevirtual #525                // Method n:()Ljava/lang/String;
     515: aload_0
     516: aload_1
     517: invokestatic  #479                // Method android/support/transition/am.b:(Landroid/view/View;)Landroid/support/transition/aw;
     520: aload         14
     522: invokespecial #548                // Method android/support/transition/u$a."<init>":(Landroid/view/View;Ljava/lang/String;Landroid/support/transition/u;Landroid/support/transition/aw;Landroid/support/transition/aa;)V
     525: invokevirtual #217                // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     528: pop
     529: aload_0
     530: getfield      #164                // Field G:Ljava/util/ArrayList;
     533: aload_2
     534: invokevirtual #304                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     537: pop
     538: iload         6
     540: istore        7
     542: iload         7
     544: iconst_1
     545: iadd
     546: istore        6
     548: lload         12
     550: lstore        10
     552: goto          29
     555: lload         10
     557: lconst_0
     558: lcmp
     559: ifeq          626
     562: iconst_0
     563: istore        6
     565: iload         6
     567: aload         19
     569: invokevirtual #549                // Method android/util/SparseIntArray.size:()I
     572: if_icmpge     626
     575: aload         19
     577: iload         6
     579: invokevirtual #550                // Method android/util/SparseIntArray.keyAt:(I)I
     582: istore        7
     584: aload_0
     585: getfield      #164                // Field G:Ljava/util/ArrayList;
     588: iload         7
     590: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     593: checkcast     #173                // class android/animation/Animator
     596: astore_1
     597: aload_1
     598: aload         19
     600: iload         6
     602: invokevirtual #552                // Method android/util/SparseIntArray.valueAt:(I)I
     605: i2l
     606: lload         10
     608: lsub
     609: aload_1
     610: invokevirtual #555                // Method android/animation/Animator.getStartDelay:()J
     613: ladd
     614: invokevirtual #453                // Method android/animation/Animator.setStartDelay:(J)V
     617: iload         6
     619: iconst_1
     620: iadd
     621: istore        6
     623: goto          565
     626: return

  void a(android.view.ViewGroup, boolean);
    Code:
       0: aload_0
       1: iload_2
       2: invokevirtual #560                // Method a:(Z)V
       5: aload_0
       6: getfield      #117                // Field b:Ljava/util/ArrayList;
       9: invokevirtual #349                // Method java/util/ArrayList.size:()I
      12: istore_3
      13: iconst_0
      14: istore        5
      16: iload_3
      17: ifgt          30
      20: aload_0
      21: getfield      #119                // Field c:Ljava/util/ArrayList;
      24: invokevirtual #349                // Method java/util/ArrayList.size:()I
      27: ifle          67
      30: aload_0
      31: getfield      #121                // Field l:Ljava/util/ArrayList;
      34: ifnull        47
      37: aload_0
      38: getfield      #121                // Field l:Ljava/util/ArrayList;
      41: invokevirtual #563                // Method java/util/ArrayList.isEmpty:()Z
      44: ifeq          67
      47: aload_0
      48: getfield      #123                // Field m:Ljava/util/ArrayList;
      51: ifnull        76
      54: aload_0
      55: getfield      #123                // Field m:Ljava/util/ArrayList;
      58: invokevirtual #563                // Method java/util/ArrayList.isEmpty:()Z
      61: ifeq          67
      64: goto          76
      67: aload_0
      68: aload_1
      69: iload_2
      70: invokespecial #375                // Method c:(Landroid/view/View;Z)V
      73: goto          315
      76: iconst_0
      77: istore_3
      78: iload_3
      79: aload_0
      80: getfield      #117                // Field b:Ljava/util/ArrayList;
      83: invokevirtual #349                // Method java/util/ArrayList.size:()I
      86: if_icmpge     203
      89: aload_1
      90: aload_0
      91: getfield      #117                // Field b:Ljava/util/ArrayList;
      94: iload_3
      95: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      98: checkcast     #341                // class java/lang/Integer
     101: invokevirtual #566                // Method java/lang/Integer.intValue:()I
     104: invokevirtual #569                // Method android/view/ViewGroup.findViewById:(I)Landroid/view/View;
     107: astore        8
     109: aload         8
     111: ifnull        196
     114: new           #294                // class android/support/transition/aa
     117: dup
     118: invokespecial #356                // Method android/support/transition/aa."<init>":()V
     121: astore        9
     123: aload         9
     125: aload         8
     127: putfield      #297                // Field android/support/transition/aa.b:Landroid/view/View;
     130: iload_2
     131: ifeq          143
     134: aload_0
     135: aload         9
     137: invokevirtual #359                // Method a:(Landroid/support/transition/aa;)V
     140: goto          149
     143: aload_0
     144: aload         9
     146: invokevirtual #361                // Method b:(Landroid/support/transition/aa;)V
     149: aload         9
     151: getfield      #362                // Field android/support/transition/aa.c:Ljava/util/ArrayList;
     154: aload_0
     155: invokevirtual #304                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     158: pop
     159: aload_0
     160: aload         9
     162: invokevirtual #364                // Method c:(Landroid/support/transition/aa;)V
     165: iload_2
     166: ifeq          187
     169: aload_0
     170: getfield      #142                // Field u:Landroid/support/transition/ab;
     173: astore        7
     175: aload         7
     177: aload         8
     179: aload         9
     181: invokestatic  #366                // Method a:(Landroid/support/transition/ab;Landroid/view/View;Landroid/support/transition/aa;)V
     184: goto          196
     187: aload_0
     188: getfield      #144                // Field v:Landroid/support/transition/ab;
     191: astore        7
     193: goto          175
     196: iload_3
     197: iconst_1
     198: iadd
     199: istore_3
     200: goto          78
     203: iconst_0
     204: istore_3
     205: iload_3
     206: aload_0
     207: getfield      #119                // Field c:Ljava/util/ArrayList;
     210: invokevirtual #349                // Method java/util/ArrayList.size:()I
     213: if_icmpge     315
     216: aload_0
     217: getfield      #119                // Field c:Ljava/util/ArrayList;
     220: iload_3
     221: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     224: checkcast     #219                // class android/view/View
     227: astore        7
     229: new           #294                // class android/support/transition/aa
     232: dup
     233: invokespecial #356                // Method android/support/transition/aa."<init>":()V
     236: astore        8
     238: aload         8
     240: aload         7
     242: putfield      #297                // Field android/support/transition/aa.b:Landroid/view/View;
     245: iload_2
     246: ifeq          258
     249: aload_0
     250: aload         8
     252: invokevirtual #359                // Method a:(Landroid/support/transition/aa;)V
     255: goto          264
     258: aload_0
     259: aload         8
     261: invokevirtual #361                // Method b:(Landroid/support/transition/aa;)V
     264: aload         8
     266: getfield      #362                // Field android/support/transition/aa.c:Ljava/util/ArrayList;
     269: aload_0
     270: invokevirtual #304                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     273: pop
     274: aload_0
     275: aload         8
     277: invokevirtual #364                // Method c:(Landroid/support/transition/aa;)V
     280: iload_2
     281: ifeq          300
     284: aload_0
     285: getfield      #142                // Field u:Landroid/support/transition/ab;
     288: astore_1
     289: aload_1
     290: aload         7
     292: aload         8
     294: invokestatic  #366                // Method a:(Landroid/support/transition/ab;Landroid/view/View;Landroid/support/transition/aa;)V
     297: goto          308
     300: aload_0
     301: getfield      #144                // Field v:Landroid/support/transition/ab;
     304: astore_1
     305: goto          289
     308: iload_3
     309: iconst_1
     310: iadd
     311: istore_3
     312: goto          205
     315: iload_2
     316: ifne          455
     319: aload_0
     320: getfield      #571                // Field I:Landroid/support/v4/g/a;
     323: ifnull        455
     326: aload_0
     327: getfield      #571                // Field I:Landroid/support/v4/g/a;
     330: invokevirtual #282                // Method android/support/v4/g/a.size:()I
     333: istore        6
     335: new           #114                // class java/util/ArrayList
     338: dup
     339: iload         6
     341: invokespecial #574                // Method java/util/ArrayList."<init>":(I)V
     344: astore_1
     345: iconst_0
     346: istore_3
     347: iload         5
     349: istore        4
     351: iload_3
     352: iload         6
     354: if_icmpge     394
     357: aload_0
     358: getfield      #571                // Field I:Landroid/support/v4/g/a;
     361: iload_3
     362: invokevirtual #285                // Method android/support/v4/g/a.b:(I)Ljava/lang/Object;
     365: checkcast     #527                // class java/lang/String
     368: astore        7
     370: aload_1
     371: aload_0
     372: getfield      #142                // Field u:Landroid/support/transition/ab;
     375: getfield      #204                // Field android/support/transition/ab.d:Landroid/support/v4/g/a;
     378: aload         7
     380: invokevirtual #292                // Method android/support/v4/g/a.remove:(Ljava/lang/Object;)Ljava/lang/Object;
     383: invokevirtual #304                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     386: pop
     387: iload_3
     388: iconst_1
     389: iadd
     390: istore_3
     391: goto          347
     394: iload         4
     396: iload         6
     398: if_icmpge     455
     401: aload_1
     402: iload         4
     404: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     407: checkcast     #219                // class android/view/View
     410: astore        7
     412: aload         7
     414: ifnull        446
     417: aload_0
     418: getfield      #571                // Field I:Landroid/support/v4/g/a;
     421: iload         4
     423: invokevirtual #309                // Method android/support/v4/g/a.c:(I)Ljava/lang/Object;
     426: checkcast     #527                // class java/lang/String
     429: astore        8
     431: aload_0
     432: getfield      #142                // Field u:Landroid/support/transition/ab;
     435: getfield      #204                // Field android/support/transition/ab.d:Landroid/support/v4/g/a;
     438: aload         8
     440: aload         7
     442: invokevirtual #217                // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     445: pop
     446: iload         4
     448: iconst_1
     449: iadd
     450: istore        4
     452: goto          394
     455: return

  void a(boolean);
    Code:
       0: iload_1
       1: ifeq          37
       4: aload_0
       5: getfield      #142                // Field u:Landroid/support/transition/ab;
       8: getfield      #187                // Field android/support/transition/ab.a:Landroid/support/v4/g/a;
      11: invokevirtual #577                // Method android/support/v4/g/a.clear:()V
      14: aload_0
      15: getfield      #142                // Field u:Landroid/support/transition/ab;
      18: getfield      #199                // Field android/support/transition/ab.b:Landroid/util/SparseArray;
      21: invokevirtual #578                // Method android/util/SparseArray.clear:()V
      24: aload_0
      25: getfield      #142                // Field u:Landroid/support/transition/ab;
      28: astore_2
      29: aload_2
      30: getfield      #193                // Field android/support/transition/ab.c:Landroid/support/v4/g/f;
      33: invokevirtual #580                // Method android/support/v4/g/f.c:()V
      36: return
      37: aload_0
      38: getfield      #144                // Field v:Landroid/support/transition/ab;
      41: getfield      #187                // Field android/support/transition/ab.a:Landroid/support/v4/g/a;
      44: invokevirtual #577                // Method android/support/v4/g/a.clear:()V
      47: aload_0
      48: getfield      #144                // Field v:Landroid/support/transition/ab;
      51: getfield      #199                // Field android/support/transition/ab.b:Landroid/util/SparseArray;
      54: invokevirtual #578                // Method android/util/SparseArray.clear:()V
      57: aload_0
      58: getfield      #144                // Field v:Landroid/support/transition/ab;
      61: astore_2
      62: goto          29

  public boolean a(android.support.transition.aa, android.support.transition.aa);
    Code:
       0: iconst_0
       1: istore        6
       3: iload         6
       5: istore        5
       7: aload_1
       8: ifnull        120
      11: iload         6
      13: istore        5
      15: aload_2
      16: ifnull        120
      19: aload_0
      20: invokevirtual #520                // Method a:()[Ljava/lang/String;
      23: astore        7
      25: aload         7
      27: ifnull        69
      30: aload         7
      32: arraylength
      33: istore        4
      35: iconst_0
      36: istore_3
      37: iload         6
      39: istore        5
      41: iload_3
      42: iload         4
      44: if_icmpge     120
      47: aload_1
      48: aload_2
      49: aload         7
      51: iload_3
      52: aaload
      53: invokestatic  #582                // Method a:(Landroid/support/transition/aa;Landroid/support/transition/aa;Ljava/lang/String;)Z
      56: ifeq          62
      59: goto          117
      62: iload_3
      63: iconst_1
      64: iadd
      65: istore_3
      66: goto          37
      69: aload_1
      70: getfield      #333                // Field android/support/transition/aa.a:Ljava/util/Map;
      73: invokeinterface #586,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      78: invokeinterface #592,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      83: astore        7
      85: iload         6
      87: istore        5
      89: aload         7
      91: invokeinterface #597,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      96: ifeq          120
      99: aload_1
     100: aload_2
     101: aload         7
     103: invokeinterface #600,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     108: checkcast     #527                // class java/lang/String
     111: invokestatic  #582                // Method a:(Landroid/support/transition/aa;Landroid/support/transition/aa;Ljava/lang/String;)Z
     114: ifeq          85
     117: iconst_1
     118: istore        5
     120: iload         5
     122: ireturn

  boolean a(android.view.View);
    Code:
       0: aload_1
       1: invokevirtual #223                // Method android/view/View.getId:()I
       4: istore_3
       5: aload_0
       6: getfield      #125                // Field n:Ljava/util/ArrayList;
       9: ifnull        28
      12: aload_0
      13: getfield      #125                // Field n:Ljava/util/ArrayList;
      16: iload_3
      17: invokestatic  #345                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      20: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      23: ifeq          28
      26: iconst_0
      27: ireturn
      28: aload_0
      29: getfield      #127                // Field o:Ljava/util/ArrayList;
      32: ifnull        48
      35: aload_0
      36: getfield      #127                // Field o:Ljava/util/ArrayList;
      39: aload_1
      40: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      43: ifeq          48
      46: iconst_0
      47: ireturn
      48: aload_0
      49: getfield      #129                // Field p:Ljava/util/ArrayList;
      52: ifnull        99
      55: aload_0
      56: getfield      #129                // Field p:Ljava/util/ArrayList;
      59: invokevirtual #349                // Method java/util/ArrayList.size:()I
      62: istore        4
      64: iconst_0
      65: istore_2
      66: iload_2
      67: iload         4
      69: if_icmpge     99
      72: aload_0
      73: getfield      #129                // Field p:Ljava/util/ArrayList;
      76: iload_2
      77: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      80: checkcast     #98                 // class java/lang/Class
      83: aload_1
      84: invokevirtual #353                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
      87: ifeq          92
      90: iconst_0
      91: ireturn
      92: iload_2
      93: iconst_1
      94: iadd
      95: istore_2
      96: goto          66
      99: aload_0
     100: getfield      #131                // Field q:Ljava/util/ArrayList;
     103: ifnull        129
     106: aload_1
     107: invokestatic  #237                // Method android/support/v4/view/s.m:(Landroid/view/View;)Ljava/lang/String;
     110: ifnull        129
     113: aload_0
     114: getfield      #131                // Field q:Ljava/util/ArrayList;
     117: aload_1
     118: invokestatic  #237                // Method android/support/v4/view/s.m:(Landroid/view/View;)Ljava/lang/String;
     121: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     124: ifeq          129
     127: iconst_0
     128: ireturn
     129: aload_0
     130: getfield      #117                // Field b:Ljava/util/ArrayList;
     133: invokevirtual #349                // Method java/util/ArrayList.size:()I
     136: ifne          185
     139: aload_0
     140: getfield      #119                // Field c:Ljava/util/ArrayList;
     143: invokevirtual #349                // Method java/util/ArrayList.size:()I
     146: ifne          185
     149: aload_0
     150: getfield      #123                // Field m:Ljava/util/ArrayList;
     153: ifnull        166
     156: aload_0
     157: getfield      #123                // Field m:Ljava/util/ArrayList;
     160: invokevirtual #563                // Method java/util/ArrayList.isEmpty:()Z
     163: ifeq          185
     166: aload_0
     167: getfield      #121                // Field l:Ljava/util/ArrayList;
     170: ifnull        183
     173: aload_0
     174: getfield      #121                // Field l:Ljava/util/ArrayList;
     177: invokevirtual #563                // Method java/util/ArrayList.isEmpty:()Z
     180: ifeq          185
     183: iconst_1
     184: ireturn
     185: aload_0
     186: getfield      #117                // Field b:Ljava/util/ArrayList;
     189: iload_3
     190: invokestatic  #345                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     193: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     196: ifne          284
     199: aload_0
     200: getfield      #119                // Field c:Ljava/util/ArrayList;
     203: aload_1
     204: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     207: ifeq          212
     210: iconst_1
     211: ireturn
     212: aload_0
     213: getfield      #121                // Field l:Ljava/util/ArrayList;
     216: ifnull        235
     219: aload_0
     220: getfield      #121                // Field l:Ljava/util/ArrayList;
     223: aload_1
     224: invokestatic  #237                // Method android/support/v4/view/s.m:(Landroid/view/View;)Ljava/lang/String;
     227: invokevirtual #348                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     230: ifeq          235
     233: iconst_1
     234: ireturn
     235: aload_0
     236: getfield      #123                // Field m:Ljava/util/ArrayList;
     239: ifnull        282
     242: iconst_0
     243: istore_2
     244: iload_2
     245: aload_0
     246: getfield      #123                // Field m:Ljava/util/ArrayList;
     249: invokevirtual #349                // Method java/util/ArrayList.size:()I
     252: if_icmpge     282
     255: aload_0
     256: getfield      #123                // Field m:Ljava/util/ArrayList;
     259: iload_2
     260: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     263: checkcast     #98                 // class java/lang/Class
     266: aload_1
     267: invokevirtual #353                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
     270: ifeq          275
     273: iconst_1
     274: ireturn
     275: iload_2
     276: iconst_1
     277: iadd
     278: istore_2
     279: goto          244
     282: iconst_0
     283: ireturn
     284: iconst_1
     285: ireturn

  public java.lang.String[] a();
    Code:
       0: aconst_null
       1: areturn

  public long b();
    Code:
       0: aload_0
       1: getfield      #110                // Field a:J
       4: lreturn

  android.support.transition.aa b(android.view.View, boolean);
    Code:
       0: aload_0
       1: getfield      #146                // Field d:Landroid/support/transition/y;
       4: ifnull        17
       7: aload_0
       8: getfield      #146                // Field d:Landroid/support/transition/y;
      11: aload_1
      12: iload_2
      13: invokevirtual #601                // Method android/support/transition/y.b:(Landroid/view/View;Z)Landroid/support/transition/aa;
      16: areturn
      17: iload_2
      18: ifeq          30
      21: aload_0
      22: getfield      #301                // Field x:Ljava/util/ArrayList;
      25: astore        7
      27: goto          36
      30: aload_0
      31: getfield      #306                // Field y:Ljava/util/ArrayList;
      34: astore        7
      36: aconst_null
      37: astore        8
      39: aload         7
      41: ifnonnull     46
      44: aconst_null
      45: areturn
      46: aload         7
      48: invokevirtual #349                // Method java/util/ArrayList.size:()I
      51: istore        6
      53: iconst_m1
      54: istore        5
      56: iconst_0
      57: istore_3
      58: iload         5
      60: istore        4
      62: iload_3
      63: iload         6
      65: if_icmpge     108
      68: aload         7
      70: iload_3
      71: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      74: checkcast     #294                // class android/support/transition/aa
      77: astore        9
      79: aload         9
      81: ifnonnull     86
      84: aconst_null
      85: areturn
      86: aload         9
      88: getfield      #297                // Field android/support/transition/aa.b:Landroid/view/View;
      91: aload_1
      92: if_acmpne     101
      95: iload_3
      96: istore        4
      98: goto          108
     101: iload_3
     102: iconst_1
     103: iadd
     104: istore_3
     105: goto          58
     108: aload         8
     110: astore_1
     111: iload         4
     113: iflt          143
     116: iload_2
     117: ifeq          128
     120: aload_0
     121: getfield      #306                // Field y:Ljava/util/ArrayList;
     124: astore_1
     125: goto          133
     128: aload_0
     129: getfield      #301                // Field x:Ljava/util/ArrayList;
     132: astore_1
     133: aload_1
     134: iload         4
     136: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     139: checkcast     #294                // class android/support/transition/aa
     142: astore_1
     143: aload_1
     144: areturn

  public android.support.transition.u b(long);
    Code:
       0: aload_0
       1: lload_1
       2: putfield      #108                // Field j:J
       5: aload_0
       6: areturn

  public android.support.transition.u b(android.support.transition.u$c);
    Code:
       0: aload_0
       1: getfield      #162                // Field F:Ljava/util/ArrayList;
       4: ifnonnull     9
       7: aload_0
       8: areturn
       9: aload_0
      10: getfield      #162                // Field F:Ljava/util/ArrayList;
      13: aload_1
      14: invokevirtual #603                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      17: pop
      18: aload_0
      19: getfield      #162                // Field F:Ljava/util/ArrayList;
      22: invokevirtual #349                // Method java/util/ArrayList.size:()I
      25: ifne          33
      28: aload_0
      29: aconst_null
      30: putfield      #162                // Field F:Ljava/util/ArrayList;
      33: aload_0
      34: areturn

  public android.support.transition.u b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #119                // Field c:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #304                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       8: pop
       9: aload_0
      10: areturn

  public abstract void b(android.support.transition.aa);

  public long c();
    Code:
       0: aload_0
       1: getfield      #108                // Field j:J
       4: lreturn

  public android.support.transition.u c(android.view.View);
    Code:
       0: aload_0
       1: getfield      #119                // Field c:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #603                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
       8: pop
       9: aload_0
      10: areturn

  void c(android.support.transition.aa);
    Code:
       0: aload_0
       1: getfield      #531                // Field f:Landroid/support/transition/x;
       4: ifnull        87
       7: aload_1
       8: getfield      #333                // Field android/support/transition/aa.a:Ljava/util/Map;
      11: invokeinterface #605,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
      16: ifne          87
      19: aload_0
      20: getfield      #531                // Field f:Landroid/support/transition/x;
      23: invokevirtual #606                // Method android/support/transition/x.a:()[Ljava/lang/String;
      26: astore        4
      28: aload         4
      30: ifnonnull     34
      33: return
      34: iconst_0
      35: istore_3
      36: iconst_0
      37: istore_2
      38: iload_2
      39: aload         4
      41: arraylength
      42: if_icmpge     73
      45: aload_1
      46: getfield      #333                // Field android/support/transition/aa.a:Ljava/util/Map;
      49: aload         4
      51: iload_2
      52: aaload
      53: invokeinterface #607,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      58: ifne          66
      61: iload_3
      62: istore_2
      63: goto          75
      66: iload_2
      67: iconst_1
      68: iadd
      69: istore_2
      70: goto          38
      73: iconst_1
      74: istore_2
      75: iload_2
      76: ifne          87
      79: aload_0
      80: getfield      #531                // Field f:Landroid/support/transition/x;
      83: aload_1
      84: invokevirtual #608                // Method android/support/transition/x.a:(Landroid/support/transition/aa;)V
      87: return

  public java.lang.Object clone();
    Code:
       0: aload_0
       1: invokevirtual #612                // Method m:()Landroid/support/transition/u;
       4: areturn

  public android.animation.TimeInterpolator d();
    Code:
       0: aload_0
       1: getfield      #112                // Field k:Landroid/animation/TimeInterpolator;
       4: areturn

  public void d(android.view.View);
    Code:
       0: aload_0
       1: getfield      #160                // Field E:Z
       4: ifne          147
       7: invokestatic  #474                // Method o:()Landroid/support/v4/g/a;
      10: astore        4
      12: aload         4
      14: invokevirtual #282                // Method android/support/v4/g/a.size:()I
      17: istore_2
      18: aload_1
      19: invokestatic  #479                // Method android/support/transition/am.b:(Landroid/view/View;)Landroid/support/transition/aw;
      22: astore_1
      23: iload_2
      24: iconst_1
      25: isub
      26: istore_2
      27: iload_2
      28: iflt          81
      31: aload         4
      33: iload_2
      34: invokevirtual #309                // Method android/support/v4/g/a.c:(I)Ljava/lang/Object;
      37: checkcast     #14                 // class android/support/transition/u$a
      40: astore        5
      42: aload         5
      44: getfield      #481                // Field android/support/transition/u$a.a:Landroid/view/View;
      47: ifnull        74
      50: aload_1
      51: aload         5
      53: getfield      #484                // Field android/support/transition/u$a.d:Landroid/support/transition/aw;
      56: invokevirtual #339                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      59: ifeq          74
      62: aload         4
      64: iload_2
      65: invokevirtual #285                // Method android/support/v4/g/a.b:(I)Ljava/lang/Object;
      68: checkcast     #173                // class android/animation/Animator
      71: invokestatic  #616                // Method android/support/transition/a.a:(Landroid/animation/Animator;)V
      74: iload_2
      75: iconst_1
      76: isub
      77: istore_2
      78: goto          27
      81: aload_0
      82: getfield      #162                // Field F:Ljava/util/ArrayList;
      85: ifnull        142
      88: aload_0
      89: getfield      #162                // Field F:Ljava/util/ArrayList;
      92: invokevirtual #349                // Method java/util/ArrayList.size:()I
      95: ifle          142
      98: aload_0
      99: getfield      #162                // Field F:Ljava/util/ArrayList;
     102: invokevirtual #618                // Method java/util/ArrayList.clone:()Ljava/lang/Object;
     105: checkcast     #114                // class java/util/ArrayList
     108: astore_1
     109: aload_1
     110: invokevirtual #349                // Method java/util/ArrayList.size:()I
     113: istore_3
     114: iconst_0
     115: istore_2
     116: iload_2
     117: iload_3
     118: if_icmpge     142
     121: aload_1
     122: iload_2
     123: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     126: checkcast     #20                 // class android/support/transition/u$c
     129: aload_0
     130: invokeinterface #620,  2          // InterfaceMethod android/support/transition/u$c.b:(Landroid/support/transition/u;)V
     135: iload_2
     136: iconst_1
     137: iadd
     138: istore_2
     139: goto          116
     142: aload_0
     143: iconst_1
     144: putfield      #158                // Field D:Z
     147: return

  protected void e();
    Code:
       0: aload_0
       1: invokevirtual #622                // Method j:()V
       4: invokestatic  #474                // Method o:()Landroid/support/v4/g/a;
       7: astore_1
       8: aload_0
       9: getfield      #164                // Field G:Ljava/util/ArrayList;
      12: invokevirtual #623                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      15: astore_2
      16: aload_2
      17: invokeinterface #597,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      22: ifeq          56
      25: aload_2
      26: invokeinterface #600,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      31: checkcast     #173                // class android/animation/Animator
      34: astore_3
      35: aload_1
      36: aload_3
      37: invokevirtual #241                // Method android/support/v4/g/a.containsKey:(Ljava/lang/Object;)Z
      40: ifeq          16
      43: aload_0
      44: invokevirtual #622                // Method j:()V
      47: aload_0
      48: aload_3
      49: aload_1
      50: invokespecial #625                // Method a:(Landroid/animation/Animator;Landroid/support/v4/g/a;)V
      53: goto          16
      56: aload_0
      57: getfield      #164                // Field G:Ljava/util/ArrayList;
      60: invokevirtual #626                // Method java/util/ArrayList.clear:()V
      63: aload_0
      64: invokevirtual #440                // Method k:()V
      67: return

  public void e(android.view.View);
    Code:
       0: aload_0
       1: getfield      #158                // Field D:Z
       4: ifeq          154
       7: aload_0
       8: getfield      #160                // Field E:Z
      11: ifne          149
      14: invokestatic  #474                // Method o:()Landroid/support/v4/g/a;
      17: astore        4
      19: aload         4
      21: invokevirtual #282                // Method android/support/v4/g/a.size:()I
      24: istore_2
      25: aload_1
      26: invokestatic  #479                // Method android/support/transition/am.b:(Landroid/view/View;)Landroid/support/transition/aw;
      29: astore_1
      30: iload_2
      31: iconst_1
      32: isub
      33: istore_2
      34: iload_2
      35: iflt          88
      38: aload         4
      40: iload_2
      41: invokevirtual #309                // Method android/support/v4/g/a.c:(I)Ljava/lang/Object;
      44: checkcast     #14                 // class android/support/transition/u$a
      47: astore        5
      49: aload         5
      51: getfield      #481                // Field android/support/transition/u$a.a:Landroid/view/View;
      54: ifnull        81
      57: aload_1
      58: aload         5
      60: getfield      #484                // Field android/support/transition/u$a.d:Landroid/support/transition/aw;
      63: invokevirtual #339                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      66: ifeq          81
      69: aload         4
      71: iload_2
      72: invokevirtual #285                // Method android/support/v4/g/a.b:(I)Ljava/lang/Object;
      75: checkcast     #173                // class android/animation/Animator
      78: invokestatic  #628                // Method android/support/transition/a.b:(Landroid/animation/Animator;)V
      81: iload_2
      82: iconst_1
      83: isub
      84: istore_2
      85: goto          34
      88: aload_0
      89: getfield      #162                // Field F:Ljava/util/ArrayList;
      92: ifnull        149
      95: aload_0
      96: getfield      #162                // Field F:Ljava/util/ArrayList;
      99: invokevirtual #349                // Method java/util/ArrayList.size:()I
     102: ifle          149
     105: aload_0
     106: getfield      #162                // Field F:Ljava/util/ArrayList;
     109: invokevirtual #618                // Method java/util/ArrayList.clone:()Ljava/lang/Object;
     112: checkcast     #114                // class java/util/ArrayList
     115: astore_1
     116: aload_1
     117: invokevirtual #349                // Method java/util/ArrayList.size:()I
     120: istore_3
     121: iconst_0
     122: istore_2
     123: iload_2
     124: iload_3
     125: if_icmpge     149
     128: aload_1
     129: iload_2
     130: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     133: checkcast     #20                 // class android/support/transition/u$c
     136: aload_0
     137: invokeinterface #630,  2          // InterfaceMethod android/support/transition/u$c.c:(Landroid/support/transition/u;)V
     142: iload_2
     143: iconst_1
     144: iadd
     145: istore_2
     146: goto          123
     149: aload_0
     150: iconst_0
     151: putfield      #158                // Field D:Z
     154: return

  public java.util.List<java.lang.Integer> f();
    Code:
       0: aload_0
       1: getfield      #117                // Field b:Ljava/util/ArrayList;
       4: areturn

  public java.util.List<android.view.View> g();
    Code:
       0: aload_0
       1: getfield      #119                // Field c:Ljava/util/ArrayList;
       4: areturn

  public java.util.List<java.lang.String> h();
    Code:
       0: aload_0
       1: getfield      #121                // Field l:Ljava/util/ArrayList;
       4: areturn

  public java.util.List<java.lang.Class> i();
    Code:
       0: aload_0
       1: getfield      #123                // Field m:Ljava/util/ArrayList;
       4: areturn

  protected void j();
    Code:
       0: aload_0
       1: getfield      #156                // Field C:I
       4: ifne          73
       7: aload_0
       8: getfield      #162                // Field F:Ljava/util/ArrayList;
      11: ifnull        68
      14: aload_0
      15: getfield      #162                // Field F:Ljava/util/ArrayList;
      18: invokevirtual #349                // Method java/util/ArrayList.size:()I
      21: ifle          68
      24: aload_0
      25: getfield      #162                // Field F:Ljava/util/ArrayList;
      28: invokevirtual #618                // Method java/util/ArrayList.clone:()Ljava/lang/Object;
      31: checkcast     #114                // class java/util/ArrayList
      34: astore_3
      35: aload_3
      36: invokevirtual #349                // Method java/util/ArrayList.size:()I
      39: istore_2
      40: iconst_0
      41: istore_1
      42: iload_1
      43: iload_2
      44: if_icmpge     68
      47: aload_3
      48: iload_1
      49: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      52: checkcast     #20                 // class android/support/transition/u$c
      55: aload_0
      56: invokeinterface #637,  2          // InterfaceMethod android/support/transition/u$c.d:(Landroid/support/transition/u;)V
      61: iload_1
      62: iconst_1
      63: iadd
      64: istore_1
      65: goto          42
      68: aload_0
      69: iconst_0
      70: putfield      #160                // Field E:Z
      73: aload_0
      74: aload_0
      75: getfield      #156                // Field C:I
      78: iconst_1
      79: iadd
      80: putfield      #156                // Field C:I
      83: return

  protected void k();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #156                // Field C:I
       5: iconst_1
       6: isub
       7: putfield      #156                // Field C:I
      10: aload_0
      11: getfield      #156                // Field C:I
      14: ifne          177
      17: aload_0
      18: getfield      #162                // Field F:Ljava/util/ArrayList;
      21: ifnull        78
      24: aload_0
      25: getfield      #162                // Field F:Ljava/util/ArrayList;
      28: invokevirtual #349                // Method java/util/ArrayList.size:()I
      31: ifle          78
      34: aload_0
      35: getfield      #162                // Field F:Ljava/util/ArrayList;
      38: invokevirtual #618                // Method java/util/ArrayList.clone:()Ljava/lang/Object;
      41: checkcast     #114                // class java/util/ArrayList
      44: astore_3
      45: aload_3
      46: invokevirtual #349                // Method java/util/ArrayList.size:()I
      49: istore_2
      50: iconst_0
      51: istore_1
      52: iload_1
      53: iload_2
      54: if_icmpge     78
      57: aload_3
      58: iload_1
      59: invokevirtual #350                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      62: checkcast     #20                 // class android/support/transition/u$c
      65: aload_0
      66: invokeinterface #639,  2          // InterfaceMethod android/support/transition/u$c.a:(Landroid/support/transition/u;)V
      71: iload_1
      72: iconst_1
      73: iadd
      74: istore_1
      75: goto          52
      78: iconst_0
      79: istore_1
      80: iload_1
      81: aload_0
      82: getfield      #142                // Field u:Landroid/support/transition/ab;
      85: getfield      #193                // Field android/support/transition/ab.c:Landroid/support/v4/g/f;
      88: invokevirtual #315                // Method android/support/v4/g/f.b:()I
      91: if_icmpge     125
      94: aload_0
      95: getfield      #142                // Field u:Landroid/support/transition/ab;
      98: getfield      #193                // Field android/support/transition/ab.c:Landroid/support/v4/g/f;
     101: iload_1
     102: invokevirtual #316                // Method android/support/v4/g/f.c:(I)Ljava/lang/Object;
     105: checkcast     #219                // class android/view/View
     108: astore_3
     109: aload_3
     110: ifnull        118
     113: aload_3
     114: iconst_0
     115: invokestatic  #276                // Method android/support/v4/view/s.a:(Landroid/view/View;Z)V
     118: iload_1
     119: iconst_1
     120: iadd
     121: istore_1
     122: goto          80
     125: iconst_0
     126: istore_1
     127: iload_1
     128: aload_0
     129: getfield      #144                // Field v:Landroid/support/transition/ab;
     132: getfield      #193                // Field android/support/transition/ab.c:Landroid/support/v4/g/f;
     135: invokevirtual #315                // Method android/support/v4/g/f.b:()I
     138: if_icmpge     172
     141: aload_0
     142: getfield      #144                // Field v:Landroid/support/transition/ab;
     145: getfield      #193                // Field android/support/transition/ab.c:Landroid/support/v4/g/f;
     148: iload_1
     149: invokevirtual #316                // Method android/support/v4/g/f.c:(I)Ljava/lang/Object;
     152: checkcast     #219                // class android/view/View
     155: astore_3
     156: aload_3
     157: ifnull        165
     160: aload_3
     161: iconst_0
     162: invokestatic  #276                // Method android/support/v4/view/s.a:(Landroid/view/View;Z)V
     165: iload_1
     166: iconst_1
     167: iadd
     168: istore_1
     169: goto          127
     172: aload_0
     173: iconst_1
     174: putfield      #160                // Field E:Z
     177: return

  public android.support.transition.l l();
    Code:
       0: aload_0
       1: getfield      #166                // Field J:Landroid/support/transition/l;
       4: areturn

  public android.support.transition.u m();
    Code:
       0: aload_0
       1: invokespecial #643                // Method java/lang/Object.clone:()Ljava/lang/Object;
       4: checkcast     #2                  // class android/support/transition/u
       7: astore_1
       8: aload_1
       9: new           #114                // class java/util/ArrayList
      12: dup
      13: invokespecial #115                // Method java/util/ArrayList."<init>":()V
      16: putfield      #164                // Field G:Ljava/util/ArrayList;
      19: aload_1
      20: new           #139                // class android/support/transition/ab
      23: dup
      24: invokespecial #140                // Method android/support/transition/ab."<init>":()V
      27: putfield      #142                // Field u:Landroid/support/transition/ab;
      30: aload_1
      31: new           #139                // class android/support/transition/ab
      34: dup
      35: invokespecial #140                // Method android/support/transition/ab."<init>":()V
      38: putfield      #144                // Field v:Landroid/support/transition/ab;
      41: aload_1
      42: aconst_null
      43: putfield      #301                // Field x:Ljava/util/ArrayList;
      46: aload_1
      47: aconst_null
      48: putfield      #306                // Field y:Ljava/util/ArrayList;
      51: aload_1
      52: areturn
      53: astore_1
      54: aconst_null
      55: areturn
    Exception table:
       from    to  target type
           0    51    53   Class java/lang/CloneNotSupportedException

  public java.lang.String n();
    Code:
       0: aload_0
       1: getfield      #104                // Field i:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: ldc_w         #645                // String
       4: invokevirtual #647                // Method a:(Ljava/lang/String;)Ljava/lang/String;
       7: areturn
}
