final class android.support.v4.app.o extends android.support.v4.app.n implements android.view.LayoutInflater$Factory2 {
  static final android.view.animation.Interpolator F;

  static final android.view.animation.Interpolator G;

  static final android.view.animation.Interpolator H;

  static final android.view.animation.Interpolator I;

  static boolean a;

  static java.lang.reflect.Field q;

  android.os.Bundle A;

  android.util.SparseArray<android.os.Parcelable> B;

  java.util.ArrayList<android.support.v4.app.o$i> C;

  android.support.v4.app.p D;

  java.lang.Runnable E;

  java.util.ArrayList<android.support.v4.app.o$g> b;

  boolean c;

  int d;

  final java.util.ArrayList<android.support.v4.app.i> e;

  android.util.SparseArray<android.support.v4.app.i> f;

  java.util.ArrayList<android.support.v4.app.c> g;

  java.util.ArrayList<android.support.v4.app.i> h;

  java.util.ArrayList<android.support.v4.app.c> i;

  java.util.ArrayList<java.lang.Integer> j;

  java.util.ArrayList<android.support.v4.app.n$b> k;

  int l;

  android.support.v4.app.m m;

  android.support.v4.app.k n;

  android.support.v4.app.i o;

  android.support.v4.app.i p;

  boolean r;

  boolean s;

  boolean t;

  boolean u;

  java.lang.String v;

  boolean w;

  java.util.ArrayList<android.support.v4.app.c> x;

  java.util.ArrayList<java.lang.Boolean> y;

  java.util.ArrayList<android.support.v4.app.i> z;

  static {};
    Code:
       0: new           #100                // class android/view/animation/DecelerateInterpolator
       3: dup
       4: ldc           #101                // float 2.5f
       6: invokespecial #105                // Method android/view/animation/DecelerateInterpolator."<init>":(F)V
       9: putstatic     #107                // Field F:Landroid/view/animation/Interpolator;
      12: new           #100                // class android/view/animation/DecelerateInterpolator
      15: dup
      16: ldc           #108                // float 1.5f
      18: invokespecial #105                // Method android/view/animation/DecelerateInterpolator."<init>":(F)V
      21: putstatic     #110                // Field G:Landroid/view/animation/Interpolator;
      24: new           #112                // class android/view/animation/AccelerateInterpolator
      27: dup
      28: ldc           #101                // float 2.5f
      30: invokespecial #113                // Method android/view/animation/AccelerateInterpolator."<init>":(F)V
      33: putstatic     #115                // Field H:Landroid/view/animation/Interpolator;
      36: new           #112                // class android/view/animation/AccelerateInterpolator
      39: dup
      40: ldc           #108                // float 1.5f
      42: invokespecial #113                // Method android/view/animation/AccelerateInterpolator."<init>":(F)V
      45: putstatic     #117                // Field I:Landroid/view/animation/Interpolator;
      48: return

  android.support.v4.app.o();
    Code:
       0: aload_0
       1: invokespecial #120                // Method android/support/v4/app/n."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #122                // Field d:I
       9: aload_0
      10: new           #124                // class java/util/ArrayList
      13: dup
      14: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      17: putfield      #127                // Field e:Ljava/util/ArrayList;
      20: aload_0
      21: new           #129                // class java/util/concurrent/CopyOnWriteArrayList
      24: dup
      25: invokespecial #130                // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
      28: putfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      31: aload_0
      32: iconst_0
      33: putfield      #134                // Field l:I
      36: aload_0
      37: aconst_null
      38: putfield      #136                // Field A:Landroid/os/Bundle;
      41: aload_0
      42: aconst_null
      43: putfield      #138                // Field B:Landroid/util/SparseArray;
      46: aload_0
      47: new           #8                  // class android/support/v4/app/o$1
      50: dup
      51: aload_0
      52: invokespecial #141                // Method android/support/v4/app/o$1."<init>":(Landroid/support/v4/app/o;)V
      55: putfield      #143                // Field E:Ljava/lang/Runnable;
      58: return

  static android.support.v4.app.o$c a(android.content.Context, float, float);
    Code:
       0: new           #284                // class android/view/animation/AlphaAnimation
       3: dup
       4: fload_1
       5: fload_2
       6: invokespecial #287                // Method android/view/animation/AlphaAnimation."<init>":(FF)V
       9: astore_0
      10: aload_0
      11: getstatic     #110                // Field G:Landroid/view/animation/Interpolator;
      14: invokevirtual #291                // Method android/view/animation/AlphaAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
      17: aload_0
      18: ldc2_w        #292                // long 220l
      21: invokevirtual #297                // Method android/view/animation/AlphaAnimation.setDuration:(J)V
      24: new           #26                 // class android/support/v4/app/o$c
      27: dup
      28: aload_0
      29: aconst_null
      30: invokespecial #300                // Method android/support/v4/app/o$c."<init>":(Landroid/view/animation/Animation;Landroid/support/v4/app/o$1;)V
      33: areturn

  static android.support.v4.app.o$c a(android.content.Context, float, float, float, float);
    Code:
       0: new           #303                // class android/view/animation/AnimationSet
       3: dup
       4: iconst_0
       5: invokespecial #305                // Method android/view/animation/AnimationSet."<init>":(Z)V
       8: astore_0
       9: new           #307                // class android/view/animation/ScaleAnimation
      12: dup
      13: fload_1
      14: fload_2
      15: fload_1
      16: fload_2
      17: iconst_1
      18: ldc_w         #308                // float 0.5f
      21: iconst_1
      22: ldc_w         #308                // float 0.5f
      25: invokespecial #311                // Method android/view/animation/ScaleAnimation."<init>":(FFFFIFIF)V
      28: astore        5
      30: aload         5
      32: getstatic     #107                // Field F:Landroid/view/animation/Interpolator;
      35: invokevirtual #312                // Method android/view/animation/ScaleAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
      38: aload         5
      40: ldc2_w        #292                // long 220l
      43: invokevirtual #313                // Method android/view/animation/ScaleAnimation.setDuration:(J)V
      46: aload_0
      47: aload         5
      49: invokevirtual #317                // Method android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
      52: new           #284                // class android/view/animation/AlphaAnimation
      55: dup
      56: fload_3
      57: fload         4
      59: invokespecial #287                // Method android/view/animation/AlphaAnimation."<init>":(FF)V
      62: astore        5
      64: aload         5
      66: getstatic     #110                // Field G:Landroid/view/animation/Interpolator;
      69: invokevirtual #291                // Method android/view/animation/AlphaAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
      72: aload         5
      74: ldc2_w        #292                // long 220l
      77: invokevirtual #297                // Method android/view/animation/AlphaAnimation.setDuration:(J)V
      80: aload_0
      81: aload         5
      83: invokevirtual #317                // Method android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
      86: new           #26                 // class android/support/v4/app/o$c
      89: dup
      90: aload_0
      91: aconst_null
      92: invokespecial #300                // Method android/support/v4/app/o$c."<init>":(Landroid/view/animation/Animation;Landroid/support/v4/app/o$1;)V
      95: areturn

  static void a(android.support.v4.app.o);
    Code:
       0: aload_0
       1: invokespecial #445                // Method A:()V
       4: return

  static void a(android.support.v4.app.o, android.support.v4.app.c, boolean, boolean, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #448                // Method a:(Landroid/support/v4/app/c;ZZZ)V
       9: return

  static boolean a(android.animation.Animator);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_0
       7: instanceof    #580                // class android/animation/ValueAnimator
      10: ifeq          53
      13: aload_0
      14: checkcast     #580                // class android/animation/ValueAnimator
      17: invokevirtual #584                // Method android/animation/ValueAnimator.getValues:()[Landroid/animation/PropertyValuesHolder;
      20: astore_0
      21: iconst_0
      22: istore_1
      23: iload_1
      24: aload_0
      25: arraylength
      26: if_icmpge     105
      29: ldc_w         #586                // String alpha
      32: aload_0
      33: iload_1
      34: aaload
      35: invokevirtual #591                // Method android/animation/PropertyValuesHolder.getPropertyName:()Ljava/lang/String;
      38: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      41: ifeq          46
      44: iconst_1
      45: ireturn
      46: iload_1
      47: iconst_1
      48: iadd
      49: istore_1
      50: goto          23
      53: aload_0
      54: instanceof    #596                // class android/animation/AnimatorSet
      57: ifeq          105
      60: aload_0
      61: checkcast     #596                // class android/animation/AnimatorSet
      64: invokevirtual #600                // Method android/animation/AnimatorSet.getChildAnimations:()Ljava/util/ArrayList;
      67: astore_0
      68: iconst_0
      69: istore_1
      70: iload_1
      71: aload_0
      72: invokeinterface #601,  1          // InterfaceMethod java/util/List.size:()I
      77: if_icmpge     105
      80: aload_0
      81: iload_1
      82: invokeinterface #602,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      87: checkcast     #231                // class android/animation/Animator
      90: invokestatic  #604                // Method a:(Landroid/animation/Animator;)Z
      93: ifeq          98
      96: iconst_1
      97: ireturn
      98: iload_1
      99: iconst_1
     100: iadd
     101: istore_1
     102: goto          70
     105: iconst_0
     106: ireturn

  static boolean a(android.support.v4.app.o$c);
    Code:
       0: aload_0
       1: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
       4: instanceof    #284                // class android/view/animation/AlphaAnimation
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: aload_0
      13: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
      16: instanceof    #303                // class android/view/animation/AnimationSet
      19: ifeq          69
      22: aload_0
      23: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
      26: checkcast     #303                // class android/view/animation/AnimationSet
      29: invokevirtual #608                // Method android/view/animation/AnimationSet.getAnimations:()Ljava/util/List;
      32: astore_0
      33: iconst_0
      34: istore_1
      35: iload_1
      36: aload_0
      37: invokeinterface #601,  1          // InterfaceMethod java/util/List.size:()I
      42: if_icmpge     67
      45: aload_0
      46: iload_1
      47: invokeinterface #602,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      52: instanceof    #284                // class android/view/animation/AlphaAnimation
      55: ifeq          60
      58: iconst_1
      59: ireturn
      60: iload_1
      61: iconst_1
      62: iadd
      63: istore_1
      64: goto          35
      67: iconst_0
      68: ireturn
      69: aload_0
      70: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
      73: invokestatic  #604                // Method a:(Landroid/animation/Animator;)Z
      76: ireturn

  static boolean a(android.view.View, android.support.v4.app.o$c);
    Code:
       0: iconst_0
       1: istore_3
       2: iload_3
       3: istore_2
       4: aload_0
       5: ifnull        53
       8: aload_1
       9: ifnonnull     14
      12: iconst_0
      13: ireturn
      14: iload_3
      15: istore_2
      16: getstatic     #614                // Field android/os/Build$VERSION.SDK_INT:I
      19: bipush        19
      21: if_icmplt     53
      24: iload_3
      25: istore_2
      26: aload_0
      27: invokevirtual #617                // Method android/view/View.getLayerType:()I
      30: ifne          53
      33: iload_3
      34: istore_2
      35: aload_0
      36: invokestatic  #622                // Method android/support/v4/view/s.q:(Landroid/view/View;)Z
      39: ifeq          53
      42: iload_3
      43: istore_2
      44: aload_1
      45: invokestatic  #624                // Method a:(Landroid/support/v4/app/o$c;)Z
      48: ifeq          53
      51: iconst_1
      52: istore_2
      53: iload_2
      54: ireturn

  public static int b(int, boolean);
    Code:
       0: iload_0
       1: sipush        4097
       4: if_icmpeq     40
       7: iload_0
       8: sipush        4099
      11: if_icmpeq     31
      14: iload_0
      15: sipush        8194
      18: if_icmpeq     23
      21: iconst_m1
      22: ireturn
      23: iload_1
      24: ifeq          29
      27: iconst_3
      28: ireturn
      29: iconst_4
      30: ireturn
      31: iload_1
      32: ifeq          37
      35: iconst_5
      36: ireturn
      37: bipush        6
      39: ireturn
      40: iload_1
      41: ifeq          46
      44: iconst_1
      45: ireturn
      46: iconst_2
      47: ireturn

  public static int d(int);
    Code:
       0: sipush        8194
       3: istore_1
       4: iload_0
       5: sipush        4097
       8: if_icmpeq     35
      11: iload_0
      12: sipush        4099
      15: if_icmpeq     31
      18: iload_0
      19: sipush        8194
      22: if_icmpeq     27
      25: iconst_0
      26: ireturn
      27: sipush        4097
      30: ireturn
      31: sipush        4099
      34: istore_1
      35: iload_1
      36: ireturn

  public int a(android.support.v4.app.c);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #731                // Field j:Ljava/util/ArrayList;
       6: ifnull        112
       9: aload_0
      10: getfield      #731                // Field j:Ljava/util/ArrayList;
      13: invokevirtual #155                // Method java/util/ArrayList.size:()I
      16: ifgt          22
      19: goto          112
      22: aload_0
      23: getfield      #731                // Field j:Ljava/util/ArrayList;
      26: aload_0
      27: getfield      #731                // Field j:Ljava/util/ArrayList;
      30: invokevirtual #155                // Method java/util/ArrayList.size:()I
      33: iconst_1
      34: isub
      35: invokevirtual #185                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      38: checkcast     #733                // class java/lang/Integer
      41: invokevirtual #736                // Method java/lang/Integer.intValue:()I
      44: istore_2
      45: getstatic     #738                // Field a:Z
      48: ifeq          98
      51: new           #718                // class java/lang/StringBuilder
      54: dup
      55: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      58: astore_3
      59: aload_3
      60: ldc_w         #740                // String Adding back stack index
      63: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      66: pop
      67: aload_3
      68: iload_2
      69: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      72: pop
      73: aload_3
      74: ldc_w         #745                // String  with
      77: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      80: pop
      81: aload_3
      82: aload_1
      83: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      86: pop
      87: ldc_w         #348                // String FragmentManager
      90: aload_3
      91: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      94: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      97: pop
      98: aload_0
      99: getfield      #752                // Field i:Ljava/util/ArrayList;
     102: iload_2
     103: aload_1
     104: invokevirtual #756                // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
     107: pop
     108: aload_0
     109: monitorexit
     110: iload_2
     111: ireturn
     112: aload_0
     113: getfield      #752                // Field i:Ljava/util/ArrayList;
     116: ifnonnull     130
     119: aload_0
     120: new           #124                // class java/util/ArrayList
     123: dup
     124: invokespecial #125                // Method java/util/ArrayList."<init>":()V
     127: putfield      #752                // Field i:Ljava/util/ArrayList;
     130: aload_0
     131: getfield      #752                // Field i:Ljava/util/ArrayList;
     134: invokevirtual #155                // Method java/util/ArrayList.size:()I
     137: istore_2
     138: getstatic     #738                // Field a:Z
     141: ifeq          191
     144: new           #718                // class java/lang/StringBuilder
     147: dup
     148: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     151: astore_3
     152: aload_3
     153: ldc_w         #758                // String Setting back stack index
     156: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     159: pop
     160: aload_3
     161: iload_2
     162: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     165: pop
     166: aload_3
     167: ldc_w         #760                // String  to
     170: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     173: pop
     174: aload_3
     175: aload_1
     176: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     179: pop
     180: ldc_w         #348                // String FragmentManager
     183: aload_3
     184: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     187: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     190: pop
     191: aload_0
     192: getfield      #752                // Field i:Ljava/util/ArrayList;
     195: aload_1
     196: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     199: pop
     200: aload_0
     201: monitorexit
     202: iload_2
     203: ireturn
     204: astore_1
     205: aload_0
     206: monitorexit
     207: aload_1
     208: athrow
    Exception table:
       from    to  target type
           2    19   204   any
          22    98   204   any
          98   110   204   any
         112   130   204   any
         130   191   204   any
         191   202   204   any
         205   207   204   any

  public android.support.v4.app.i$d a(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #764                // Field android/support/v4/app/i.mIndex:I
       4: ifge          52
       7: new           #718                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      14: astore_3
      15: aload_3
      16: ldc_w         #766                // String Fragment
      19: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_3
      24: aload_1
      25: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_3
      30: ldc_w         #768                // String  is not currently in the FragmentManager
      33: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload_0
      38: new           #683                // class java/lang/IllegalStateException
      41: dup
      42: aload_3
      43: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      46: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      49: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
      52: aload_1
      53: getfield      #656                // Field android/support/v4/app/i.mState:I
      56: istore_2
      57: aconst_null
      58: astore        4
      60: aload         4
      62: astore_3
      63: iload_2
      64: ifle          89
      67: aload_0
      68: aload_1
      69: invokevirtual #773                // Method o:(Landroid/support/v4/app/i;)Landroid/os/Bundle;
      72: astore_1
      73: aload         4
      75: astore_3
      76: aload_1
      77: ifnull        89
      80: new           #775                // class android/support/v4/app/i$d
      83: dup
      84: aload_1
      85: invokespecial #778                // Method android/support/v4/app/i$d."<init>":(Landroid/os/Bundle;)V
      88: astore_3
      89: aload_3
      90: areturn

  public android.support.v4.app.i a(android.os.Bundle, java.lang.String);
    Code:
       0: aload_1
       1: aload_2
       2: iconst_m1
       3: invokevirtual #785                // Method android/os/Bundle.getInt:(Ljava/lang/String;I)I
       6: istore_3
       7: iload_3
       8: iconst_m1
       9: if_icmpne     14
      12: aconst_null
      13: areturn
      14: aload_0
      15: getfield      #189                // Field f:Landroid/util/SparseArray;
      18: iload_3
      19: invokevirtual #786                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
      22: checkcast     #197                // class android/support/v4/app/i
      25: astore_1
      26: aload_1
      27: ifnonnull     87
      30: new           #718                // class java/lang/StringBuilder
      33: dup
      34: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      37: astore        4
      39: aload         4
      41: ldc_w         #788                // String Fragment no longer exists for key
      44: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: pop
      48: aload         4
      50: aload_2
      51: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      54: pop
      55: aload         4
      57: ldc_w         #790                // String : index
      60: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload         4
      66: iload_3
      67: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      70: pop
      71: aload_0
      72: new           #683                // class java/lang/IllegalStateException
      75: dup
      76: aload         4
      78: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      81: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      84: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
      87: aload_1
      88: areturn

  public android.support.v4.app.i a(java.lang.String);
    Code:
       0: aload_1
       1: ifnull        54
       4: aload_0
       5: getfield      #127                // Field e:Ljava/util/ArrayList;
       8: invokevirtual #155                // Method java/util/ArrayList.size:()I
      11: iconst_1
      12: isub
      13: istore_2
      14: iload_2
      15: iflt          54
      18: aload_0
      19: getfield      #127                // Field e:Ljava/util/ArrayList;
      22: iload_2
      23: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      26: checkcast     #197                // class android/support/v4/app/i
      29: astore_3
      30: aload_3
      31: ifnull        47
      34: aload_1
      35: aload_3
      36: getfield      #794                // Field android/support/v4/app/i.mTag:Ljava/lang/String;
      39: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      42: ifeq          47
      45: aload_3
      46: areturn
      47: iload_2
      48: iconst_1
      49: isub
      50: istore_2
      51: goto          14
      54: aload_0
      55: getfield      #189                // Field f:Landroid/util/SparseArray;
      58: ifnull        115
      61: aload_1
      62: ifnull        115
      65: aload_0
      66: getfield      #189                // Field f:Landroid/util/SparseArray;
      69: invokevirtual #192                // Method android/util/SparseArray.size:()I
      72: iconst_1
      73: isub
      74: istore_2
      75: iload_2
      76: iflt          115
      79: aload_0
      80: getfield      #189                // Field f:Landroid/util/SparseArray;
      83: iload_2
      84: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      87: checkcast     #197                // class android/support/v4/app/i
      90: astore_3
      91: aload_3
      92: ifnull        108
      95: aload_1
      96: aload_3
      97: getfield      #794                // Field android/support/v4/app/i.mTag:Ljava/lang/String;
     100: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     103: ifeq          108
     106: aload_3
     107: areturn
     108: iload_2
     109: iconst_1
     110: isub
     111: istore_2
     112: goto          75
     115: aconst_null
     116: areturn

  android.support.v4.app.o$c a(android.support.v4.app.i, int, boolean, int);
    Code:
       0: aload_1
       1: invokevirtual #659                // Method android/support/v4/app/i.getNextAnim:()I
       4: istore        7
       6: aload_1
       7: iload_2
       8: iload_3
       9: iload         7
      11: invokevirtual #801                // Method android/support/v4/app/i.onCreateAnimation:(IZI)Landroid/view/animation/Animation;
      14: astore        9
      16: aload         9
      18: ifnull        32
      21: new           #26                 // class android/support/v4/app/o$c
      24: dup
      25: aload         9
      27: aconst_null
      28: invokespecial #300                // Method android/support/v4/app/o$c."<init>":(Landroid/view/animation/Animation;Landroid/support/v4/app/o$1;)V
      31: areturn
      32: aload_1
      33: iload_2
      34: iload_3
      35: iload         7
      37: invokevirtual #805                // Method android/support/v4/app/i.onCreateAnimator:(IZI)Landroid/animation/Animator;
      40: astore_1
      41: aload_1
      42: ifnull        55
      45: new           #26                 // class android/support/v4/app/o$c
      48: dup
      49: aload_1
      50: aconst_null
      51: invokespecial #808                // Method android/support/v4/app/o$c."<init>":(Landroid/animation/Animator;Landroid/support/v4/app/o$1;)V
      54: areturn
      55: iload         7
      57: ifeq          202
      60: ldc_w         #810                // String anim
      63: aload_0
      64: getfield      #157                // Field m:Landroid/support/v4/app/m;
      67: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
      70: invokevirtual #819                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      73: iload         7
      75: invokevirtual #825                // Method android/content/res/Resources.getResourceTypeName:(I)Ljava/lang/String;
      78: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      81: istore        8
      83: iconst_0
      84: istore        6
      86: iload         6
      88: istore        5
      90: iload         8
      92: ifeq          133
      95: aload_0
      96: getfield      #157                // Field m:Landroid/support/v4/app/m;
      99: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     102: iload         7
     104: invokestatic  #831                // Method android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
     107: astore_1
     108: aload_1
     109: ifnull        124
     112: new           #26                 // class android/support/v4/app/o$c
     115: dup
     116: aload_1
     117: aconst_null
     118: invokespecial #300                // Method android/support/v4/app/o$c."<init>":(Landroid/view/animation/Animation;Landroid/support/v4/app/o$1;)V
     121: astore_1
     122: aload_1
     123: areturn
     124: iconst_1
     125: istore        5
     127: goto          133
     130: astore_1
     131: aload_1
     132: athrow
     133: iload         5
     135: ifne          202
     138: aload_0
     139: getfield      #157                // Field m:Landroid/support/v4/app/m;
     142: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     145: iload         7
     147: invokestatic  #837                // Method android/animation/AnimatorInflater.loadAnimator:(Landroid/content/Context;I)Landroid/animation/Animator;
     150: astore_1
     151: aload_1
     152: ifnull        202
     155: new           #26                 // class android/support/v4/app/o$c
     158: dup
     159: aload_1
     160: aconst_null
     161: invokespecial #808                // Method android/support/v4/app/o$c."<init>":(Landroid/animation/Animator;Landroid/support/v4/app/o$1;)V
     164: astore_1
     165: aload_1
     166: areturn
     167: astore_1
     168: iload         8
     170: ifeq          175
     173: aload_1
     174: athrow
     175: aload_0
     176: getfield      #157                // Field m:Landroid/support/v4/app/m;
     179: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     182: iload         7
     184: invokestatic  #831                // Method android/view/animation/AnimationUtils.loadAnimation:(Landroid/content/Context;I)Landroid/view/animation/Animation;
     187: astore_1
     188: aload_1
     189: ifnull        202
     192: new           #26                 // class android/support/v4/app/o$c
     195: dup
     196: aload_1
     197: aconst_null
     198: invokespecial #300                // Method android/support/v4/app/o$c."<init>":(Landroid/view/animation/Animation;Landroid/support/v4/app/o$1;)V
     201: areturn
     202: iload_2
     203: ifne          208
     206: aconst_null
     207: areturn
     208: iload_2
     209: iload_3
     210: invokestatic  #839                // Method b:(IZ)I
     213: istore_2
     214: iload_2
     215: ifge          220
     218: aconst_null
     219: areturn
     220: iload_2
     221: tableswitch   { // 1 to 6
                     1: 369
                     2: 352
                     3: 335
                     4: 318
                     5: 305
                     6: 292
               default: 260
          }
     260: iload         4
     262: istore_2
     263: iload         4
     265: ifne          386
     268: iload         4
     270: istore_2
     271: aload_0
     272: getfield      #157                // Field m:Landroid/support/v4/app/m;
     275: invokevirtual #840                // Method android/support/v4/app/m.e:()Z
     278: ifeq          386
     281: aload_0
     282: getfield      #157                // Field m:Landroid/support/v4/app/m;
     285: invokevirtual #842                // Method android/support/v4/app/m.f:()I
     288: istore_2
     289: goto          386
     292: aload_0
     293: getfield      #157                // Field m:Landroid/support/v4/app/m;
     296: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     299: fconst_1
     300: fconst_0
     301: invokestatic  #844                // Method a:(Landroid/content/Context;FF)Landroid/support/v4/app/o$c;
     304: areturn
     305: aload_0
     306: getfield      #157                // Field m:Landroid/support/v4/app/m;
     309: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     312: fconst_0
     313: fconst_1
     314: invokestatic  #844                // Method a:(Landroid/content/Context;FF)Landroid/support/v4/app/o$c;
     317: areturn
     318: aload_0
     319: getfield      #157                // Field m:Landroid/support/v4/app/m;
     322: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     325: fconst_1
     326: ldc_w         #845                // float 1.075f
     329: fconst_1
     330: fconst_0
     331: invokestatic  #847                // Method a:(Landroid/content/Context;FFFF)Landroid/support/v4/app/o$c;
     334: areturn
     335: aload_0
     336: getfield      #157                // Field m:Landroid/support/v4/app/m;
     339: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     342: ldc_w         #848                // float 0.975f
     345: fconst_1
     346: fconst_0
     347: fconst_1
     348: invokestatic  #847                // Method a:(Landroid/content/Context;FFFF)Landroid/support/v4/app/o$c;
     351: areturn
     352: aload_0
     353: getfield      #157                // Field m:Landroid/support/v4/app/m;
     356: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     359: fconst_1
     360: ldc_w         #848                // float 0.975f
     363: fconst_1
     364: fconst_0
     365: invokestatic  #847                // Method a:(Landroid/content/Context;FFFF)Landroid/support/v4/app/o$c;
     368: areturn
     369: aload_0
     370: getfield      #157                // Field m:Landroid/support/v4/app/m;
     373: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     376: ldc_w         #849                // float 1.125f
     379: fconst_1
     380: fconst_0
     381: fconst_1
     382: invokestatic  #847                // Method a:(Landroid/content/Context;FFFF)Landroid/support/v4/app/o$c;
     385: areturn
     386: iload_2
     387: ifne          390
     390: aconst_null
     391: areturn
     392: astore_1
     393: iload         6
     395: istore        5
     397: goto          133
    Exception table:
       from    to  target type
          95   108   130   Class android/content/res/Resources$NotFoundException
          95   108   392   Class java/lang/RuntimeException
         112   122   130   Class android/content/res/Resources$NotFoundException
         112   122   392   Class java/lang/RuntimeException
         138   151   167   Class java/lang/RuntimeException
         155   165   167   Class java/lang/RuntimeException

  public android.support.v4.app.u a();
    Code:
       0: new           #248                // class android/support/v4/app/c
       3: dup
       4: aload_0
       5: invokespecial #851                // Method android/support/v4/app/c."<init>":(Landroid/support/v4/app/o;)V
       8: areturn

  public void a(int, int);
    Code:
       0: iload_1
       1: ifge          38
       4: new           #718                // class java/lang/StringBuilder
       7: dup
       8: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      11: astore_3
      12: aload_3
      13: ldc_w         #854                // String Bad id:
      16: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: pop
      20: aload_3
      21: iload_1
      22: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      25: pop
      26: new           #856                // class java/lang/IllegalArgumentException
      29: dup
      30: aload_3
      31: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      34: invokespecial #857                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      37: athrow
      38: aload_0
      39: new           #41                 // class android/support/v4/app/o$h
      42: dup
      43: aload_0
      44: aconst_null
      45: iload_1
      46: iload_2
      47: invokespecial #860                // Method android/support/v4/app/o$h."<init>":(Landroid/support/v4/app/o;Ljava/lang/String;II)V
      50: iconst_0
      51: invokevirtual #863                // Method a:(Landroid/support/v4/app/o$g;Z)V
      54: return

  public void a(int, android.support.v4.app.c);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #752                // Field i:Ljava/util/ArrayList;
       6: ifnonnull     20
       9: aload_0
      10: new           #124                // class java/util/ArrayList
      13: dup
      14: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      17: putfield      #752                // Field i:Ljava/util/ArrayList;
      20: aload_0
      21: getfield      #752                // Field i:Ljava/util/ArrayList;
      24: invokevirtual #155                // Method java/util/ArrayList.size:()I
      27: istore        4
      29: iload         4
      31: istore_3
      32: iload_1
      33: iload         4
      35: if_icmpge     110
      38: getstatic     #738                // Field a:Z
      41: ifeq          97
      44: new           #718                // class java/lang/StringBuilder
      47: dup
      48: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      51: astore        5
      53: aload         5
      55: ldc_w         #758                // String Setting back stack index
      58: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      61: pop
      62: aload         5
      64: iload_1
      65: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      68: pop
      69: aload         5
      71: ldc_w         #760                // String  to
      74: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      77: pop
      78: aload         5
      80: aload_2
      81: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      84: pop
      85: ldc_w         #348                // String FragmentManager
      88: aload         5
      90: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      93: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      96: pop
      97: aload_0
      98: getfield      #752                // Field i:Ljava/util/ArrayList;
     101: iload_1
     102: aload_2
     103: invokevirtual #756                // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
     106: pop
     107: goto          272
     110: iload_3
     111: iload_1
     112: if_icmpge     204
     115: aload_0
     116: getfield      #752                // Field i:Ljava/util/ArrayList;
     119: aconst_null
     120: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     123: pop
     124: aload_0
     125: getfield      #731                // Field j:Ljava/util/ArrayList;
     128: ifnonnull     142
     131: aload_0
     132: new           #124                // class java/util/ArrayList
     135: dup
     136: invokespecial #125                // Method java/util/ArrayList."<init>":()V
     139: putfield      #731                // Field j:Ljava/util/ArrayList;
     142: getstatic     #738                // Field a:Z
     145: ifeq          185
     148: new           #718                // class java/lang/StringBuilder
     151: dup
     152: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     155: astore        5
     157: aload         5
     159: ldc_w         #866                // String Adding available back stack index
     162: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     165: pop
     166: aload         5
     168: iload_3
     169: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     172: pop
     173: ldc_w         #348                // String FragmentManager
     176: aload         5
     178: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     181: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     184: pop
     185: aload_0
     186: getfield      #731                // Field j:Ljava/util/ArrayList;
     189: iload_3
     190: invokestatic  #869                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     193: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     196: pop
     197: iload_3
     198: iconst_1
     199: iadd
     200: istore_3
     201: goto          110
     204: getstatic     #738                // Field a:Z
     207: ifeq          263
     210: new           #718                // class java/lang/StringBuilder
     213: dup
     214: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     217: astore        5
     219: aload         5
     221: ldc_w         #740                // String Adding back stack index
     224: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     227: pop
     228: aload         5
     230: iload_1
     231: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     234: pop
     235: aload         5
     237: ldc_w         #745                // String  with
     240: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     243: pop
     244: aload         5
     246: aload_2
     247: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     250: pop
     251: ldc_w         #348                // String FragmentManager
     254: aload         5
     256: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     259: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     262: pop
     263: aload_0
     264: getfield      #752                // Field i:Ljava/util/ArrayList;
     267: aload_2
     268: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     271: pop
     272: aload_0
     273: monitorexit
     274: return
     275: astore_2
     276: aload_0
     277: monitorexit
     278: aload_2
     279: athrow
    Exception table:
       from    to  target type
           2    20   275   any
          20    29   275   any
          38    97   275   any
          97   107   275   any
         115   142   275   any
         142   185   275   any
         185   197   275   any
         204   263   275   any
         263   272   275   any
         272   274   275   any
         276   278   275   any

  void a(int, boolean);
    Code:
       0: aload_0
       1: getfield      #157                // Field m:Landroid/support/v4/app/m;
       4: ifnonnull     22
       7: iload_1
       8: ifeq          22
      11: new           #683                // class java/lang/IllegalStateException
      14: dup
      15: ldc_w         #871                // String No activity
      18: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      21: athrow
      22: iload_2
      23: ifne          35
      26: iload_1
      27: aload_0
      28: getfield      #134                // Field l:I
      31: if_icmpne     35
      34: return
      35: aload_0
      36: iload_1
      37: putfield      #134                // Field l:I
      40: aload_0
      41: getfield      #189                // Field f:Landroid/util/SparseArray;
      44: ifnull        192
      47: aload_0
      48: getfield      #127                // Field e:Ljava/util/ArrayList;
      51: invokevirtual #155                // Method java/util/ArrayList.size:()I
      54: istore_3
      55: iconst_0
      56: istore_1
      57: iload_1
      58: iload_3
      59: if_icmpge     84
      62: aload_0
      63: aload_0
      64: getfield      #127                // Field e:Ljava/util/ArrayList;
      67: iload_1
      68: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      71: checkcast     #197                // class android/support/v4/app/i
      74: invokevirtual #874                // Method f:(Landroid/support/v4/app/i;)V
      77: iload_1
      78: iconst_1
      79: iadd
      80: istore_1
      81: goto          57
      84: aload_0
      85: getfield      #189                // Field f:Landroid/util/SparseArray;
      88: invokevirtual #192                // Method android/util/SparseArray.size:()I
      91: istore_3
      92: iconst_0
      93: istore_1
      94: iload_1
      95: iload_3
      96: if_icmpge     154
      99: aload_0
     100: getfield      #189                // Field f:Landroid/util/SparseArray;
     103: iload_1
     104: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
     107: checkcast     #197                // class android/support/v4/app/i
     110: astore        4
     112: aload         4
     114: ifnull        147
     117: aload         4
     119: getfield      #877                // Field android/support/v4/app/i.mRemoving:Z
     122: ifne          133
     125: aload         4
     127: getfield      #880                // Field android/support/v4/app/i.mDetached:Z
     130: ifeq          147
     133: aload         4
     135: getfield      #375                // Field android/support/v4/app/i.mIsNewlyAdded:Z
     138: ifne          147
     141: aload_0
     142: aload         4
     144: invokevirtual #874                // Method f:(Landroid/support/v4/app/i;)V
     147: iload_1
     148: iconst_1
     149: iadd
     150: istore_1
     151: goto          94
     154: aload_0
     155: invokevirtual #881                // Method f:()V
     158: aload_0
     159: getfield      #883                // Field r:Z
     162: ifeq          192
     165: aload_0
     166: getfield      #157                // Field m:Landroid/support/v4/app/m;
     169: ifnull        192
     172: aload_0
     173: getfield      #134                // Field l:I
     176: iconst_5
     177: if_icmpne     192
     180: aload_0
     181: getfield      #157                // Field m:Landroid/support/v4/app/m;
     184: invokevirtual #884                // Method android/support/v4/app/m.d:()V
     187: aload_0
     188: iconst_0
     189: putfield      #883                // Field r:Z
     192: return

  public void a(android.content.res.Configuration);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #127                // Field e:Ljava/util/ArrayList;
       7: invokevirtual #155                // Method java/util/ArrayList.size:()I
      10: if_icmpge     41
      13: aload_0
      14: getfield      #127                // Field e:Ljava/util/ArrayList;
      17: iload_2
      18: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #197                // class android/support/v4/app/i
      24: astore_3
      25: aload_3
      26: ifnull        34
      29: aload_3
      30: aload_1
      31: invokevirtual #888                // Method android/support/v4/app/i.performConfigurationChanged:(Landroid/content/res/Configuration;)V
      34: iload_2
      35: iconst_1
      36: iadd
      37: istore_2
      38: goto          2
      41: return

  public void a(android.os.Bundle, java.lang.String, android.support.v4.app.i);
    Code:
       0: aload_3
       1: getfield      #764                // Field android/support/v4/app/i.mIndex:I
       4: ifge          57
       7: new           #718                // class java/lang/StringBuilder
      10: dup
      11: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      14: astore        4
      16: aload         4
      18: ldc_w         #766                // String Fragment
      21: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload         4
      27: aload_3
      28: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      31: pop
      32: aload         4
      34: ldc_w         #768                // String  is not currently in the FragmentManager
      37: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: aload_0
      42: new           #683                // class java/lang/IllegalStateException
      45: dup
      46: aload         4
      48: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      54: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
      57: aload_1
      58: aload_2
      59: aload_3
      60: getfield      #764                // Field android/support/v4/app/i.mIndex:I
      63: invokevirtual #893                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      66: return

  void a(android.os.Parcelable, android.support.v4.app.p);
    Code:
       0: aload_1
       1: ifnonnull     5
       4: return
       5: aload_1
       6: checkcast     #896                // class android/support/v4/app/q
       9: astore        9
      11: aload         9
      13: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
      16: ifnonnull     20
      19: return
      20: aload_2
      21: ifnull        328
      24: aload_2
      25: invokevirtual #454                // Method android/support/v4/app/p.a:()Ljava/util/List;
      28: astore        10
      30: aload_2
      31: invokevirtual #474                // Method android/support/v4/app/p.b:()Ljava/util/List;
      34: astore        7
      36: aload_2
      37: invokevirtual #901                // Method android/support/v4/app/p.c:()Ljava/util/List;
      40: astore        8
      42: aload         10
      44: ifnull        58
      47: aload         10
      49: invokeinterface #601,  1          // InterfaceMethod java/util/List.size:()I
      54: istore_3
      55: goto          60
      58: iconst_0
      59: istore_3
      60: iconst_0
      61: istore        4
      63: aload         7
      65: astore        6
      67: aload         8
      69: astore_1
      70: iload         4
      72: iload_3
      73: if_icmpge     334
      76: aload         10
      78: iload         4
      80: invokeinterface #602,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      85: checkcast     #197                // class android/support/v4/app/i
      88: astore_1
      89: getstatic     #738                // Field a:Z
      92: ifeq          132
      95: new           #718                // class java/lang/StringBuilder
      98: dup
      99: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     102: astore        6
     104: aload         6
     106: ldc_w         #903                // String restoreAllState: re-attaching retained
     109: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     112: pop
     113: aload         6
     115: aload_1
     116: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     119: pop
     120: ldc_w         #348                // String FragmentManager
     123: aload         6
     125: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     128: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     131: pop
     132: iconst_0
     133: istore        5
     135: iload         5
     137: aload         9
     139: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     142: arraylength
     143: if_icmpge     173
     146: aload         9
     148: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     151: iload         5
     153: aaload
     154: getfield      #907                // Field android/support/v4/app/s.b:I
     157: aload_1
     158: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     161: if_icmpeq     173
     164: iload         5
     166: iconst_1
     167: iadd
     168: istore        5
     170: goto          135
     173: iload         5
     175: aload         9
     177: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     180: arraylength
     181: if_icmpne     228
     184: new           #718                // class java/lang/StringBuilder
     187: dup
     188: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     191: astore        6
     193: aload         6
     195: ldc_w         #909                // String Could not find active fragment with index
     198: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     201: pop
     202: aload         6
     204: aload_1
     205: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     208: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     211: pop
     212: aload_0
     213: new           #683                // class java/lang/IllegalStateException
     216: dup
     217: aload         6
     219: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     222: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     225: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
     228: aload         9
     230: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     233: iload         5
     235: aaload
     236: astore        6
     238: aload         6
     240: aload_1
     241: putfield      #911                // Field android/support/v4/app/s.l:Landroid/support/v4/app/i;
     244: aload_1
     245: aconst_null
     246: putfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
     249: aload_1
     250: iconst_0
     251: putfield      #917                // Field android/support/v4/app/i.mBackStackNesting:I
     254: aload_1
     255: iconst_0
     256: putfield      #920                // Field android/support/v4/app/i.mInLayout:Z
     259: aload_1
     260: iconst_0
     261: putfield      #484                // Field android/support/v4/app/i.mAdded:Z
     264: aload_1
     265: aconst_null
     266: putfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     269: aload         6
     271: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     274: ifnull        319
     277: aload         6
     279: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     282: aload_0
     283: getfield      #157                // Field m:Landroid/support/v4/app/m;
     286: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     289: invokevirtual #929                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
     292: invokevirtual #933                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
     295: aload_1
     296: aload         6
     298: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     301: ldc_w         #935                // String android:view_state
     304: invokevirtual #939                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
     307: putfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
     310: aload_1
     311: aload         6
     313: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     316: putfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     319: iload         4
     321: iconst_1
     322: iadd
     323: istore        4
     325: goto          63
     328: aconst_null
     329: astore        6
     331: aload         6
     333: astore_1
     334: aload_0
     335: new           #191                // class android/util/SparseArray
     338: dup
     339: aload         9
     341: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     344: arraylength
     345: invokespecial #943                // Method android/util/SparseArray."<init>":(I)V
     348: putfield      #189                // Field f:Landroid/util/SparseArray;
     351: iconst_0
     352: istore_3
     353: iload_3
     354: aload         9
     356: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     359: arraylength
     360: if_icmpge     554
     363: aload         9
     365: getfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     368: iload_3
     369: aaload
     370: astore        10
     372: aload         10
     374: ifnull        547
     377: aload         6
     379: ifnull        409
     382: iload_3
     383: aload         6
     385: invokeinterface #601,  1          // InterfaceMethod java/util/List.size:()I
     390: if_icmpge     409
     393: aload         6
     395: iload_3
     396: invokeinterface #602,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     401: checkcast     #451                // class android/support/v4/app/p
     404: astore        7
     406: goto          412
     409: aconst_null
     410: astore        7
     412: aload_1
     413: ifnull        441
     416: iload_3
     417: aload_1
     418: invokeinterface #601,  1          // InterfaceMethod java/util/List.size:()I
     423: if_icmpge     441
     426: aload_1
     427: iload_3
     428: invokeinterface #602,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     433: checkcast     #945                // class android/arch/lifecycle/p
     436: astore        8
     438: goto          444
     441: aconst_null
     442: astore        8
     444: aload         10
     446: aload_0
     447: getfield      #157                // Field m:Landroid/support/v4/app/m;
     450: aload_0
     451: getfield      #947                // Field n:Landroid/support/v4/app/k;
     454: aload_0
     455: getfield      #949                // Field o:Landroid/support/v4/app/i;
     458: aload         7
     460: aload         8
     462: invokevirtual #952                // Method android/support/v4/app/s.a:(Landroid/support/v4/app/m;Landroid/support/v4/app/k;Landroid/support/v4/app/i;Landroid/support/v4/app/p;Landroid/arch/lifecycle/p;)Landroid/support/v4/app/i;
     465: astore        7
     467: getstatic     #738                // Field a:Z
     470: ifeq          527
     473: new           #718                // class java/lang/StringBuilder
     476: dup
     477: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     480: astore        8
     482: aload         8
     484: ldc_w         #954                // String restoreAllState: active #
     487: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     490: pop
     491: aload         8
     493: iload_3
     494: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     497: pop
     498: aload         8
     500: ldc_w         #956                // String :
     503: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     506: pop
     507: aload         8
     509: aload         7
     511: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     514: pop
     515: ldc_w         #348                // String FragmentManager
     518: aload         8
     520: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     523: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     526: pop
     527: aload_0
     528: getfield      #189                // Field f:Landroid/util/SparseArray;
     531: aload         7
     533: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     536: aload         7
     538: invokevirtual #959                // Method android/util/SparseArray.put:(ILjava/lang/Object;)V
     541: aload         10
     543: aconst_null
     544: putfield      #911                // Field android/support/v4/app/s.l:Landroid/support/v4/app/i;
     547: iload_3
     548: iconst_1
     549: iadd
     550: istore_3
     551: goto          353
     554: aload_2
     555: ifnull        697
     558: aload_2
     559: invokevirtual #454                // Method android/support/v4/app/p.a:()Ljava/util/List;
     562: astore_1
     563: aload_1
     564: ifnull        577
     567: aload_1
     568: invokeinterface #601,  1          // InterfaceMethod java/util/List.size:()I
     573: istore_3
     574: goto          579
     577: iconst_0
     578: istore_3
     579: iconst_0
     580: istore        4
     582: iload         4
     584: iload_3
     585: if_icmpge     697
     588: aload_1
     589: iload         4
     591: invokeinterface #602,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     596: checkcast     #197                // class android/support/v4/app/i
     599: astore_2
     600: aload_2
     601: getfield      #962                // Field android/support/v4/app/i.mTargetIndex:I
     604: iflt          688
     607: aload_2
     608: aload_0
     609: getfield      #189                // Field f:Landroid/util/SparseArray;
     612: aload_2
     613: getfield      #962                // Field android/support/v4/app/i.mTargetIndex:I
     616: invokevirtual #786                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
     619: checkcast     #197                // class android/support/v4/app/i
     622: putfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     625: aload_2
     626: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     629: ifnonnull     688
     632: new           #718                // class java/lang/StringBuilder
     635: dup
     636: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     639: astore        6
     641: aload         6
     643: ldc_w         #964                // String Re-attaching retained fragment
     646: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     649: pop
     650: aload         6
     652: aload_2
     653: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     656: pop
     657: aload         6
     659: ldc_w         #966                // String  target no longer exists:
     662: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     665: pop
     666: aload         6
     668: aload_2
     669: getfield      #962                // Field android/support/v4/app/i.mTargetIndex:I
     672: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     675: pop
     676: ldc_w         #348                // String FragmentManager
     679: aload         6
     681: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     684: invokestatic  #968                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
     687: pop
     688: iload         4
     690: iconst_1
     691: iadd
     692: istore        4
     694: goto          582
     697: aload_0
     698: getfield      #127                // Field e:Ljava/util/ArrayList;
     701: invokevirtual #179                // Method java/util/ArrayList.clear:()V
     704: aload         9
     706: getfield      #971                // Field android/support/v4/app/q.b:[I
     709: ifnull        899
     712: iconst_0
     713: istore_3
     714: iload_3
     715: aload         9
     717: getfield      #971                // Field android/support/v4/app/q.b:[I
     720: arraylength
     721: if_icmpge     899
     724: aload_0
     725: getfield      #189                // Field f:Landroid/util/SparseArray;
     728: aload         9
     730: getfield      #971                // Field android/support/v4/app/q.b:[I
     733: iload_3
     734: iaload
     735: invokevirtual #786                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
     738: checkcast     #197                // class android/support/v4/app/i
     741: astore_1
     742: aload_1
     743: ifnonnull     789
     746: new           #718                // class java/lang/StringBuilder
     749: dup
     750: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     753: astore_2
     754: aload_2
     755: ldc_w         #973                // String No instantiated fragment for index #
     758: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     761: pop
     762: aload_2
     763: aload         9
     765: getfield      #971                // Field android/support/v4/app/q.b:[I
     768: iload_3
     769: iaload
     770: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     773: pop
     774: aload_0
     775: new           #683                // class java/lang/IllegalStateException
     778: dup
     779: aload_2
     780: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     783: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     786: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
     789: aload_1
     790: iconst_1
     791: putfield      #484                // Field android/support/v4/app/i.mAdded:Z
     794: getstatic     #738                // Field a:Z
     797: ifeq          847
     800: new           #718                // class java/lang/StringBuilder
     803: dup
     804: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     807: astore_2
     808: aload_2
     809: ldc_w         #975                // String restoreAllState: added #
     812: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     815: pop
     816: aload_2
     817: iload_3
     818: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     821: pop
     822: aload_2
     823: ldc_w         #956                // String :
     826: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     829: pop
     830: aload_2
     831: aload_1
     832: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     835: pop
     836: ldc_w         #348                // String FragmentManager
     839: aload_2
     840: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     843: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     846: pop
     847: aload_0
     848: getfield      #127                // Field e:Ljava/util/ArrayList;
     851: aload_1
     852: invokevirtual #978                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     855: ifeq          869
     858: new           #683                // class java/lang/IllegalStateException
     861: dup
     862: ldc_w         #980                // String Already added!
     865: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     868: athrow
     869: aload_0
     870: getfield      #127                // Field e:Ljava/util/ArrayList;
     873: astore_2
     874: aload_2
     875: monitorenter
     876: aload_0
     877: getfield      #127                // Field e:Ljava/util/ArrayList;
     880: aload_1
     881: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     884: pop
     885: aload_2
     886: monitorexit
     887: iload_3
     888: iconst_1
     889: iadd
     890: istore_3
     891: goto          714
     894: astore_1
     895: aload_2
     896: monitorexit
     897: aload_1
     898: athrow
     899: aload         9
     901: getfield      #983                // Field android/support/v4/app/q.c:[Landroid/support/v4/app/d;
     904: ifnull        1081
     907: aload_0
     908: new           #124                // class java/util/ArrayList
     911: dup
     912: aload         9
     914: getfield      #983                // Field android/support/v4/app/q.c:[Landroid/support/v4/app/d;
     917: arraylength
     918: invokespecial #356                // Method java/util/ArrayList."<init>":(I)V
     921: putfield      #985                // Field g:Ljava/util/ArrayList;
     924: iconst_0
     925: istore_3
     926: iload_3
     927: aload         9
     929: getfield      #983                // Field android/support/v4/app/q.c:[Landroid/support/v4/app/d;
     932: arraylength
     933: if_icmpge     1086
     936: aload         9
     938: getfield      #983                // Field android/support/v4/app/q.c:[Landroid/support/v4/app/d;
     941: iload_3
     942: aaload
     943: aload_0
     944: invokevirtual #990                // Method android/support/v4/app/d.a:(Landroid/support/v4/app/o;)Landroid/support/v4/app/c;
     947: astore_1
     948: getstatic     #738                // Field a:Z
     951: ifeq          1049
     954: new           #718                // class java/lang/StringBuilder
     957: dup
     958: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     961: astore_2
     962: aload_2
     963: ldc_w         #992                // String restoreAllState: back stack #
     966: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     969: pop
     970: aload_2
     971: iload_3
     972: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     975: pop
     976: aload_2
     977: ldc_w         #994                // String  (index
     980: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     983: pop
     984: aload_2
     985: aload_1
     986: getfield      #570                // Field android/support/v4/app/c.m:I
     989: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     992: pop
     993: aload_2
     994: ldc_w         #996                // String ):
     997: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1000: pop
    1001: aload_2
    1002: aload_1
    1003: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1006: pop
    1007: ldc_w         #348                // String FragmentManager
    1010: aload_2
    1011: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1014: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1017: pop
    1018: new           #508                // class java/io/PrintWriter
    1021: dup
    1022: new           #510                // class android/support/v4/g/e
    1025: dup
    1026: ldc_w         #348                // String FragmentManager
    1029: invokespecial #513                // Method android/support/v4/g/e."<init>":(Ljava/lang/String;)V
    1032: invokespecial #516                // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
    1035: astore_2
    1036: aload_1
    1037: ldc_w         #518                // String
    1040: aload_2
    1041: iconst_0
    1042: invokevirtual #999                // Method android/support/v4/app/c.a:(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    1045: aload_2
    1046: invokevirtual #1002               // Method java/io/PrintWriter.close:()V
    1049: aload_0
    1050: getfield      #985                // Field g:Ljava/util/ArrayList;
    1053: aload_1
    1054: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
    1057: pop
    1058: aload_1
    1059: getfield      #570                // Field android/support/v4/app/c.m:I
    1062: iflt          1074
    1065: aload_0
    1066: aload_1
    1067: getfield      #570                // Field android/support/v4/app/c.m:I
    1070: aload_1
    1071: invokevirtual #1004               // Method a:(ILandroid/support/v4/app/c;)V
    1074: iload_3
    1075: iconst_1
    1076: iadd
    1077: istore_3
    1078: goto          926
    1081: aload_0
    1082: aconst_null
    1083: putfield      #985                // Field g:Ljava/util/ArrayList;
    1086: aload         9
    1088: getfield      #1005               // Field android/support/v4/app/q.d:I
    1091: iflt          1113
    1094: aload_0
    1095: aload_0
    1096: getfield      #189                // Field f:Landroid/util/SparseArray;
    1099: aload         9
    1101: getfield      #1005               // Field android/support/v4/app/q.d:I
    1104: invokevirtual #786                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
    1107: checkcast     #197                // class android/support/v4/app/i
    1110: putfield      #630                // Field p:Landroid/support/v4/app/i;
    1113: aload_0
    1114: aload         9
    1116: getfield      #1007               // Field android/support/v4/app/q.e:I
    1119: putfield      #122                // Field d:I
    1122: return
    Exception table:
       from    to  target type
         876   887   894   any
         895   897   894   any

  void a(android.support.v4.app.i, int, int, int, boolean);
    Code:
       0: aload_1
       1: getfield      #484                // Field android/support/v4/app/i.mAdded:Z
       4: istore        9
       6: iconst_1
       7: istore        7
       9: iconst_1
      10: istore        8
      12: iload         9
      14: ifeq          30
      17: aload_1
      18: getfield      #880                // Field android/support/v4/app/i.mDetached:Z
      21: ifeq          27
      24: goto          30
      27: goto          44
      30: iload_2
      31: istore        6
      33: iload         6
      35: istore_2
      36: iload         6
      38: iconst_1
      39: if_icmple     44
      42: iconst_1
      43: istore_2
      44: iload_2
      45: istore        6
      47: aload_1
      48: getfield      #877                // Field android/support/v4/app/i.mRemoving:Z
      51: ifeq          91
      54: iload_2
      55: istore        6
      57: iload_2
      58: aload_1
      59: getfield      #656                // Field android/support/v4/app/i.mState:I
      62: if_icmple     91
      65: aload_1
      66: getfield      #656                // Field android/support/v4/app/i.mState:I
      69: ifne          85
      72: aload_1
      73: invokevirtual #1010               // Method android/support/v4/app/i.isInBackStack:()Z
      76: ifeq          85
      79: iconst_1
      80: istore        6
      82: goto          91
      85: aload_1
      86: getfield      #656                // Field android/support/v4/app/i.mState:I
      89: istore        6
      91: aload_1
      92: getfield      #1013               // Field android/support/v4/app/i.mDeferStart:Z
      95: ifeq          117
      98: aload_1
      99: getfield      #656                // Field android/support/v4/app/i.mState:I
     102: iconst_4
     103: if_icmpge     117
     106: iload         6
     108: iconst_3
     109: if_icmple     117
     112: iconst_3
     113: istore_2
     114: goto          120
     117: iload         6
     119: istore_2
     120: aload_1
     121: getfield      #656                // Field android/support/v4/app/i.mState:I
     124: iload_2
     125: if_icmpgt     1402
     128: aload_1
     129: getfield      #1016               // Field android/support/v4/app/i.mFromLayout:Z
     132: ifeq          143
     135: aload_1
     136: getfield      #920                // Field android/support/v4/app/i.mInLayout:Z
     139: ifne          143
     142: return
     143: aload_1
     144: invokevirtual #201                // Method android/support/v4/app/i.getAnimatingAway:()Landroid/view/View;
     147: ifnonnull     157
     150: aload_1
     151: invokevirtual #229                // Method android/support/v4/app/i.getAnimator:()Landroid/animation/Animator;
     154: ifnull        179
     157: aload_1
     158: aconst_null
     159: invokevirtual #222                // Method android/support/v4/app/i.setAnimatingAway:(Landroid/view/View;)V
     162: aload_1
     163: aconst_null
     164: invokevirtual #429                // Method android/support/v4/app/i.setAnimator:(Landroid/animation/Animator;)V
     167: aload_0
     168: aload_1
     169: aload_1
     170: invokevirtual #204                // Method android/support/v4/app/i.getStateAfterAnimating:()I
     173: iconst_0
     174: iconst_0
     175: iconst_1
     176: invokevirtual #225                // Method a:(Landroid/support/v4/app/i;IIIZ)V
     179: iload_2
     180: istore        4
     182: iload_2
     183: istore        6
     185: iload_2
     186: istore        7
     188: iload_2
     189: istore_3
     190: aload_1
     191: getfield      #656                // Field android/support/v4/app/i.mState:I
     194: tableswitch   { // 0 to 4
                     0: 234
                     1: 774
                     2: 1241
                     3: 1260
                     4: 1325
               default: 228
          }
     228: iload_2
     229: istore        6
     231: goto          2063
     234: iload_2
     235: istore        4
     237: iload_2
     238: ifle          774
     241: getstatic     #738                // Field a:Z
     244: ifeq          284
     247: new           #718                // class java/lang/StringBuilder
     250: dup
     251: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     254: astore        10
     256: aload         10
     258: ldc_w         #1018               // String moveto CREATED:
     261: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     264: pop
     265: aload         10
     267: aload_1
     268: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     271: pop
     272: ldc_w         #348                // String FragmentManager
     275: aload         10
     277: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     280: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     283: pop
     284: iload_2
     285: istore        4
     287: aload_1
     288: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     291: ifnull        429
     294: aload_1
     295: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     298: aload_0
     299: getfield      #157                // Field m:Landroid/support/v4/app/m;
     302: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     305: invokevirtual #929                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
     308: invokevirtual #933                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
     311: aload_1
     312: aload_1
     313: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     316: ldc_w         #935                // String android:view_state
     319: invokevirtual #939                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
     322: putfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
     325: aload_1
     326: aload_0
     327: aload_1
     328: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     331: ldc_w         #1020               // String android:target_state
     334: invokevirtual #1022               // Method a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/i;
     337: putfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     340: aload_1
     341: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     344: ifnull        362
     347: aload_1
     348: aload_1
     349: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     352: ldc_w         #1024               // String android:target_req_state
     355: iconst_0
     356: invokevirtual #785                // Method android/os/Bundle.getInt:(Ljava/lang/String;I)I
     359: putfield      #1027               // Field android/support/v4/app/i.mTargetRequestCode:I
     362: aload_1
     363: getfield      #1031               // Field android/support/v4/app/i.mSavedUserVisibleHint:Ljava/lang/Boolean;
     366: ifnull        388
     369: aload_1
     370: aload_1
     371: getfield      #1031               // Field android/support/v4/app/i.mSavedUserVisibleHint:Ljava/lang/Boolean;
     374: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
     377: putfield      #1034               // Field android/support/v4/app/i.mUserVisibleHint:Z
     380: aload_1
     381: aconst_null
     382: putfield      #1031               // Field android/support/v4/app/i.mSavedUserVisibleHint:Ljava/lang/Boolean;
     385: goto          403
     388: aload_1
     389: aload_1
     390: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     393: ldc_w         #1036               // String android:user_visible_hint
     396: iconst_1
     397: invokevirtual #1040               // Method android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
     400: putfield      #1034               // Field android/support/v4/app/i.mUserVisibleHint:Z
     403: iload_2
     404: istore        4
     406: aload_1
     407: getfield      #1034               // Field android/support/v4/app/i.mUserVisibleHint:Z
     410: ifne          429
     413: aload_1
     414: iconst_1
     415: putfield      #1013               // Field android/support/v4/app/i.mDeferStart:Z
     418: iload_2
     419: istore        4
     421: iload_2
     422: iconst_3
     423: if_icmple     429
     426: iconst_3
     427: istore        4
     429: aload_1
     430: aload_0
     431: getfield      #157                // Field m:Landroid/support/v4/app/m;
     434: putfield      #1043               // Field android/support/v4/app/i.mHost:Landroid/support/v4/app/m;
     437: aload_1
     438: aload_0
     439: getfield      #949                // Field o:Landroid/support/v4/app/i;
     442: putfield      #1046               // Field android/support/v4/app/i.mParentFragment:Landroid/support/v4/app/i;
     445: aload_0
     446: getfield      #949                // Field o:Landroid/support/v4/app/i;
     449: ifnull        464
     452: aload_0
     453: getfield      #949                // Field o:Landroid/support/v4/app/i;
     456: getfield      #1050               // Field android/support/v4/app/i.mChildFragmentManager:Landroid/support/v4/app/o;
     459: astore        10
     461: goto          473
     464: aload_0
     465: getfield      #157                // Field m:Landroid/support/v4/app/m;
     468: invokevirtual #1053               // Method android/support/v4/app/m.k:()Landroid/support/v4/app/o;
     471: astore        10
     473: aload_1
     474: aload         10
     476: putfield      #1056               // Field android/support/v4/app/i.mFragmentManager:Landroid/support/v4/app/o;
     479: aload_1
     480: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     483: ifnull        596
     486: aload_0
     487: getfield      #189                // Field f:Landroid/util/SparseArray;
     490: aload_1
     491: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     494: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     497: invokevirtual #786                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
     500: aload_1
     501: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     504: if_acmpeq     573
     507: new           #718                // class java/lang/StringBuilder
     510: dup
     511: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     514: astore        10
     516: aload         10
     518: ldc_w         #766                // String Fragment
     521: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     524: pop
     525: aload         10
     527: aload_1
     528: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     531: pop
     532: aload         10
     534: ldc_w         #1058               // String  declared target fragment
     537: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     540: pop
     541: aload         10
     543: aload_1
     544: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     547: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     550: pop
     551: aload         10
     553: ldc_w         #1060               // String  that does not belong to this FragmentManager!
     556: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     559: pop
     560: new           #683                // class java/lang/IllegalStateException
     563: dup
     564: aload         10
     566: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     569: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     572: athrow
     573: aload_1
     574: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     577: getfield      #656                // Field android/support/v4/app/i.mState:I
     580: iconst_1
     581: if_icmpge     596
     584: aload_0
     585: aload_1
     586: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     589: iconst_1
     590: iconst_0
     591: iconst_0
     592: iconst_1
     593: invokevirtual #225                // Method a:(Landroid/support/v4/app/i;IIIZ)V
     596: aload_0
     597: aload_1
     598: aload_0
     599: getfield      #157                // Field m:Landroid/support/v4/app/m;
     602: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     605: iconst_0
     606: invokevirtual #1063               // Method a:(Landroid/support/v4/app/i;Landroid/content/Context;Z)V
     609: aload_1
     610: iconst_0
     611: putfield      #1066               // Field android/support/v4/app/i.mCalled:Z
     614: aload_1
     615: aload_0
     616: getfield      #157                // Field m:Landroid/support/v4/app/m;
     619: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     622: invokevirtual #1070               // Method android/support/v4/app/i.onAttach:(Landroid/content/Context;)V
     625: aload_1
     626: getfield      #1066               // Field android/support/v4/app/i.mCalled:Z
     629: ifne          679
     632: new           #718                // class java/lang/StringBuilder
     635: dup
     636: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     639: astore        10
     641: aload         10
     643: ldc_w         #766                // String Fragment
     646: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     649: pop
     650: aload         10
     652: aload_1
     653: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     656: pop
     657: aload         10
     659: ldc_w         #1072               // String  did not call through to super.onAttach()
     662: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     665: pop
     666: new           #1074               // class android/support/v4/app/ai
     669: dup
     670: aload         10
     672: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     675: invokespecial #1075               // Method android/support/v4/app/ai."<init>":(Ljava/lang/String;)V
     678: athrow
     679: aload_1
     680: getfield      #1046               // Field android/support/v4/app/i.mParentFragment:Landroid/support/v4/app/i;
     683: ifnonnull     697
     686: aload_0
     687: getfield      #157                // Field m:Landroid/support/v4/app/m;
     690: aload_1
     691: invokevirtual #1077               // Method android/support/v4/app/m.b:(Landroid/support/v4/app/i;)V
     694: goto          705
     697: aload_1
     698: getfield      #1046               // Field android/support/v4/app/i.mParentFragment:Landroid/support/v4/app/i;
     701: aload_1
     702: invokevirtual #1080               // Method android/support/v4/app/i.onAttachFragment:(Landroid/support/v4/app/i;)V
     705: aload_0
     706: aload_1
     707: aload_0
     708: getfield      #157                // Field m:Landroid/support/v4/app/m;
     711: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     714: iconst_0
     715: invokevirtual #1082               // Method b:(Landroid/support/v4/app/i;Landroid/content/Context;Z)V
     718: aload_1
     719: getfield      #1085               // Field android/support/v4/app/i.mIsCreated:Z
     722: ifne          756
     725: aload_0
     726: aload_1
     727: aload_1
     728: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     731: iconst_0
     732: invokevirtual #1088               // Method a:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
     735: aload_1
     736: aload_1
     737: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     740: invokevirtual #1091               // Method android/support/v4/app/i.performCreate:(Landroid/os/Bundle;)V
     743: aload_0
     744: aload_1
     745: aload_1
     746: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     749: iconst_0
     750: invokevirtual #1093               // Method b:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
     753: goto          769
     756: aload_1
     757: aload_1
     758: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     761: invokevirtual #1096               // Method android/support/v4/app/i.restoreChildFragmentState:(Landroid/os/Bundle;)V
     764: aload_1
     765: iconst_1
     766: putfield      #656                // Field android/support/v4/app/i.mState:I
     769: aload_1
     770: iconst_0
     771: putfield      #472                // Field android/support/v4/app/i.mRetaining:Z
     774: aload_0
     775: aload_1
     776: invokevirtual #1098               // Method d:(Landroid/support/v4/app/i;)V
     779: iload         4
     781: istore        6
     783: iload         4
     785: iconst_1
     786: if_icmple     1241
     789: getstatic     #738                // Field a:Z
     792: ifeq          832
     795: new           #718                // class java/lang/StringBuilder
     798: dup
     799: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     802: astore        10
     804: aload         10
     806: ldc_w         #1100               // String moveto ACTIVITY_CREATED:
     809: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     812: pop
     813: aload         10
     815: aload_1
     816: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     819: pop
     820: ldc_w         #348                // String FragmentManager
     823: aload         10
     825: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     828: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     831: pop
     832: aload_1
     833: getfield      #1016               // Field android/support/v4/app/i.mFromLayout:Z
     836: ifne          1199
     839: aload_1
     840: getfield      #378                // Field android/support/v4/app/i.mContainerId:I
     843: ifeq          1048
     846: aload_1
     847: getfield      #378                // Field android/support/v4/app/i.mContainerId:I
     850: iconst_m1
     851: if_icmpne     904
     854: new           #718                // class java/lang/StringBuilder
     857: dup
     858: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     861: astore        10
     863: aload         10
     865: ldc_w         #1102               // String Cannot create fragment
     868: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     871: pop
     872: aload         10
     874: aload_1
     875: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     878: pop
     879: aload         10
     881: ldc_w         #1104               // String  for a container view with no id
     884: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     887: pop
     888: aload_0
     889: new           #856                // class java/lang/IllegalArgumentException
     892: dup
     893: aload         10
     895: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     898: invokespecial #857                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     901: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
     904: aload_0
     905: getfield      #947                // Field n:Landroid/support/v4/app/k;
     908: aload_1
     909: getfield      #378                // Field android/support/v4/app/i.mContainerId:I
     912: invokevirtual #1109               // Method android/support/v4/app/k.a:(I)Landroid/view/View;
     915: checkcast     #395                // class android/view/ViewGroup
     918: astore        11
     920: aload         11
     922: astore        10
     924: aload         11
     926: ifnonnull     1051
     929: aload         11
     931: astore        10
     933: aload_1
     934: getfield      #1112               // Field android/support/v4/app/i.mRestored:Z
     937: ifne          1051
     940: aload_1
     941: invokevirtual #1113               // Method android/support/v4/app/i.getResources:()Landroid/content/res/Resources;
     944: aload_1
     945: getfield      #378                // Field android/support/v4/app/i.mContainerId:I
     948: invokevirtual #1116               // Method android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
     951: astore        10
     953: goto          961
     956: ldc_w         #1118               // String unknown
     959: astore        10
     961: new           #718                // class java/lang/StringBuilder
     964: dup
     965: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     968: astore        12
     970: aload         12
     972: ldc_w         #1120               // String No view found for id 0x
     975: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     978: pop
     979: aload         12
     981: aload_1
     982: getfield      #378                // Field android/support/v4/app/i.mContainerId:I
     985: invokestatic  #1123               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     988: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     991: pop
     992: aload         12
     994: ldc_w         #1125               // String  (
     997: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1000: pop
    1001: aload         12
    1003: aload         10
    1005: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1008: pop
    1009: aload         12
    1011: ldc_w         #1127               // String ) for fragment
    1014: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1017: pop
    1018: aload         12
    1020: aload_1
    1021: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1024: pop
    1025: aload_0
    1026: new           #856                // class java/lang/IllegalArgumentException
    1029: dup
    1030: aload         12
    1032: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1035: invokespecial #857                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
    1038: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
    1041: aload         11
    1043: astore        10
    1045: goto          1051
    1048: aconst_null
    1049: astore        10
    1051: aload_1
    1052: aload         10
    1054: putfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
    1057: aload_1
    1058: aload_1
    1059: aload_1
    1060: aload_1
    1061: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1064: invokevirtual #1131               // Method android/support/v4/app/i.performGetLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    1067: aload         10
    1069: aload_1
    1070: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1073: invokevirtual #1135               // Method android/support/v4/app/i.performCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    1076: putfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1079: aload_1
    1080: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1083: ifnull        1194
    1086: aload_1
    1087: aload_1
    1088: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1091: putfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
    1094: aload_1
    1095: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1098: iconst_0
    1099: invokevirtual #1141               // Method android/view/View.setSaveFromParentEnabled:(Z)V
    1102: aload         10
    1104: ifnull        1116
    1107: aload         10
    1109: aload_1
    1110: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1113: invokevirtual #1144               // Method android/view/ViewGroup.addView:(Landroid/view/View;)V
    1116: aload_1
    1117: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
    1120: ifeq          1132
    1123: aload_1
    1124: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1127: bipush        8
    1129: invokevirtual #1147               // Method android/view/View.setVisibility:(I)V
    1132: aload_1
    1133: aload_1
    1134: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1137: aload_1
    1138: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1141: invokevirtual #1151               // Method android/support/v4/app/i.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
    1144: aload_0
    1145: aload_1
    1146: aload_1
    1147: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1150: aload_1
    1151: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1154: iconst_0
    1155: invokevirtual #1154               // Method a:(Landroid/support/v4/app/i;Landroid/view/View;Landroid/os/Bundle;Z)V
    1158: aload_1
    1159: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1162: invokevirtual #1157               // Method android/view/View.getVisibility:()I
    1165: ifne          1182
    1168: aload_1
    1169: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
    1172: ifnull        1182
    1175: iload         8
    1177: istore        5
    1179: goto          1185
    1182: iconst_0
    1183: istore        5
    1185: aload_1
    1186: iload         5
    1188: putfield      #375                // Field android/support/v4/app/i.mIsNewlyAdded:Z
    1191: goto          1199
    1194: aload_1
    1195: aconst_null
    1196: putfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
    1199: aload_1
    1200: aload_1
    1201: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1204: invokevirtual #1160               // Method android/support/v4/app/i.performActivityCreated:(Landroid/os/Bundle;)V
    1207: aload_0
    1208: aload_1
    1209: aload_1
    1210: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1213: iconst_0
    1214: invokevirtual #1162               // Method c:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
    1217: aload_1
    1218: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1221: ifnull        1232
    1224: aload_1
    1225: aload_1
    1226: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1229: invokevirtual #1165               // Method android/support/v4/app/i.restoreViewState:(Landroid/os/Bundle;)V
    1232: aload_1
    1233: aconst_null
    1234: putfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1237: iload         4
    1239: istore        6
    1241: iload         6
    1243: istore        7
    1245: iload         6
    1247: iconst_2
    1248: if_icmple     1260
    1251: aload_1
    1252: iconst_3
    1253: putfield      #656                // Field android/support/v4/app/i.mState:I
    1256: iload         6
    1258: istore        7
    1260: iload         7
    1262: istore_3
    1263: iload         7
    1265: iconst_3
    1266: if_icmple     1325
    1269: getstatic     #738                // Field a:Z
    1272: ifeq          1312
    1275: new           #718                // class java/lang/StringBuilder
    1278: dup
    1279: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1282: astore        10
    1284: aload         10
    1286: ldc_w         #1167               // String moveto STARTED:
    1289: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1292: pop
    1293: aload         10
    1295: aload_1
    1296: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1299: pop
    1300: ldc_w         #348                // String FragmentManager
    1303: aload         10
    1305: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1308: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1311: pop
    1312: aload_1
    1313: invokevirtual #1170               // Method android/support/v4/app/i.performStart:()V
    1316: aload_0
    1317: aload_1
    1318: iconst_0
    1319: invokevirtual #1173               // Method b:(Landroid/support/v4/app/i;Z)V
    1322: iload         7
    1324: istore_3
    1325: iload_3
    1326: istore        6
    1328: iload_3
    1329: iconst_4
    1330: if_icmple     2063
    1333: getstatic     #738                // Field a:Z
    1336: ifeq          1376
    1339: new           #718                // class java/lang/StringBuilder
    1342: dup
    1343: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1346: astore        10
    1348: aload         10
    1350: ldc_w         #1175               // String moveto RESUMED:
    1353: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1356: pop
    1357: aload         10
    1359: aload_1
    1360: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1363: pop
    1364: ldc_w         #348                // String FragmentManager
    1367: aload         10
    1369: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1372: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1375: pop
    1376: aload_1
    1377: invokevirtual #1178               // Method android/support/v4/app/i.performResume:()V
    1380: aload_0
    1381: aload_1
    1382: iconst_0
    1383: invokevirtual #1180               // Method c:(Landroid/support/v4/app/i;Z)V
    1386: aload_1
    1387: aconst_null
    1388: putfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
    1391: aload_1
    1392: aconst_null
    1393: putfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
    1396: iload_3
    1397: istore        6
    1399: goto          2063
    1402: iload_2
    1403: istore        6
    1405: aload_1
    1406: getfield      #656                // Field android/support/v4/app/i.mState:I
    1409: iload_2
    1410: if_icmple     2063
    1413: aload_1
    1414: getfield      #656                // Field android/support/v4/app/i.mState:I
    1417: tableswitch   { // 1 to 5
                     1: 1845
                     2: 1626
                     3: 1574
                     4: 1516
                     5: 1458
               default: 1452
          }
    1452: iload_2
    1453: istore        6
    1455: goto          2063
    1458: iload_2
    1459: iconst_5
    1460: if_icmpge     1516
    1463: getstatic     #738                // Field a:Z
    1466: ifeq          1506
    1469: new           #718                // class java/lang/StringBuilder
    1472: dup
    1473: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1476: astore        10
    1478: aload         10
    1480: ldc_w         #1182               // String movefrom RESUMED:
    1483: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1486: pop
    1487: aload         10
    1489: aload_1
    1490: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1493: pop
    1494: ldc_w         #348                // String FragmentManager
    1497: aload         10
    1499: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1502: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1505: pop
    1506: aload_1
    1507: invokevirtual #1185               // Method android/support/v4/app/i.performPause:()V
    1510: aload_0
    1511: aload_1
    1512: iconst_0
    1513: invokevirtual #1187               // Method d:(Landroid/support/v4/app/i;Z)V
    1516: iload_2
    1517: iconst_4
    1518: if_icmpge     1574
    1521: getstatic     #738                // Field a:Z
    1524: ifeq          1564
    1527: new           #718                // class java/lang/StringBuilder
    1530: dup
    1531: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1534: astore        10
    1536: aload         10
    1538: ldc_w         #1189               // String movefrom STARTED:
    1541: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1544: pop
    1545: aload         10
    1547: aload_1
    1548: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1551: pop
    1552: ldc_w         #348                // String FragmentManager
    1555: aload         10
    1557: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1560: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1563: pop
    1564: aload_1
    1565: invokevirtual #1192               // Method android/support/v4/app/i.performStop:()V
    1568: aload_0
    1569: aload_1
    1570: iconst_0
    1571: invokevirtual #1194               // Method e:(Landroid/support/v4/app/i;Z)V
    1574: iload_2
    1575: iconst_3
    1576: if_icmpge     1626
    1579: getstatic     #738                // Field a:Z
    1582: ifeq          1622
    1585: new           #718                // class java/lang/StringBuilder
    1588: dup
    1589: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1592: astore        10
    1594: aload         10
    1596: ldc_w         #1196               // String movefrom STOPPED:
    1599: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1602: pop
    1603: aload         10
    1605: aload_1
    1606: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1609: pop
    1610: ldc_w         #348                // String FragmentManager
    1613: aload         10
    1615: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1618: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1621: pop
    1622: aload_1
    1623: invokevirtual #1199               // Method android/support/v4/app/i.performReallyStop:()V
    1626: iload_2
    1627: iconst_2
    1628: if_icmpge     1845
    1631: getstatic     #738                // Field a:Z
    1634: ifeq          1674
    1637: new           #718                // class java/lang/StringBuilder
    1640: dup
    1641: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1644: astore        10
    1646: aload         10
    1648: ldc_w         #1201               // String movefrom ACTIVITY_CREATED:
    1651: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1654: pop
    1655: aload         10
    1657: aload_1
    1658: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1661: pop
    1662: ldc_w         #348                // String FragmentManager
    1665: aload         10
    1667: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1670: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1673: pop
    1674: aload_1
    1675: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1678: ifnull        1704
    1681: aload_0
    1682: getfield      #157                // Field m:Landroid/support/v4/app/m;
    1685: aload_1
    1686: invokevirtual #1204               // Method android/support/v4/app/m.a:(Landroid/support/v4/app/i;)Z
    1689: ifeq          1704
    1692: aload_1
    1693: getfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
    1696: ifnonnull     1704
    1699: aload_0
    1700: aload_1
    1701: invokevirtual #1206               // Method n:(Landroid/support/v4/app/i;)V
    1704: aload_1
    1705: invokevirtual #1209               // Method android/support/v4/app/i.performDestroyView:()V
    1708: aload_0
    1709: aload_1
    1710: iconst_0
    1711: invokevirtual #1211               // Method f:(Landroid/support/v4/app/i;Z)V
    1714: aload_1
    1715: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1718: ifnull        1825
    1721: aload_1
    1722: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
    1725: ifnull        1825
    1728: aload_1
    1729: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
    1732: aload_1
    1733: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1736: invokevirtual #1214               // Method android/view/ViewGroup.endViewTransition:(Landroid/view/View;)V
    1739: aload_1
    1740: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1743: invokevirtual #218                // Method android/view/View.clearAnimation:()V
    1746: aload_0
    1747: getfield      #134                // Field l:I
    1750: ifle          1793
    1753: aload_0
    1754: getfield      #1216               // Field u:Z
    1757: ifne          1793
    1760: aload_1
    1761: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1764: invokevirtual #1157               // Method android/view/View.getVisibility:()I
    1767: ifne          1793
    1770: aload_1
    1771: getfield      #384                // Field android/support/v4/app/i.mPostponedAlpha:F
    1774: fconst_0
    1775: fcmpl
    1776: iflt          1793
    1779: aload_0
    1780: aload_1
    1781: iload_3
    1782: iconst_0
    1783: iload         4
    1785: invokevirtual #1218               // Method a:(Landroid/support/v4/app/i;IZI)Landroid/support/v4/app/o$c;
    1788: astore        10
    1790: goto          1796
    1793: aconst_null
    1794: astore        10
    1796: aload_1
    1797: fconst_0
    1798: putfield      #384                // Field android/support/v4/app/i.mPostponedAlpha:F
    1801: aload         10
    1803: ifnull        1814
    1806: aload_0
    1807: aload_1
    1808: aload         10
    1810: iload_2
    1811: invokespecial #1220               // Method a:(Landroid/support/v4/app/i;Landroid/support/v4/app/o$c;I)V
    1814: aload_1
    1815: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
    1818: aload_1
    1819: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1822: invokevirtual #1223               // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
    1825: aload_1
    1826: aconst_null
    1827: putfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
    1830: aload_1
    1831: aconst_null
    1832: putfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
    1835: aload_1
    1836: aconst_null
    1837: putfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
    1840: aload_1
    1841: iconst_0
    1842: putfield      #920                // Field android/support/v4/app/i.mInLayout:Z
    1845: iload_2
    1846: istore        6
    1848: iload_2
    1849: iconst_1
    1850: if_icmpge     2063
    1853: aload_0
    1854: getfield      #1216               // Field u:Z
    1857: ifeq          1909
    1860: aload_1
    1861: invokevirtual #201                // Method android/support/v4/app/i.getAnimatingAway:()Landroid/view/View;
    1864: ifnull        1886
    1867: aload_1
    1868: invokevirtual #201                // Method android/support/v4/app/i.getAnimatingAway:()Landroid/view/View;
    1871: astore        10
    1873: aload_1
    1874: aconst_null
    1875: invokevirtual #222                // Method android/support/v4/app/i.setAnimatingAway:(Landroid/view/View;)V
    1878: aload         10
    1880: invokevirtual #218                // Method android/view/View.clearAnimation:()V
    1883: goto          1909
    1886: aload_1
    1887: invokevirtual #229                // Method android/support/v4/app/i.getAnimator:()Landroid/animation/Animator;
    1890: ifnull        1909
    1893: aload_1
    1894: invokevirtual #229                // Method android/support/v4/app/i.getAnimator:()Landroid/animation/Animator;
    1897: astore        10
    1899: aload_1
    1900: aconst_null
    1901: invokevirtual #429                // Method android/support/v4/app/i.setAnimator:(Landroid/animation/Animator;)V
    1904: aload         10
    1906: invokevirtual #1224               // Method android/animation/Animator.cancel:()V
    1909: aload_1
    1910: invokevirtual #201                // Method android/support/v4/app/i.getAnimatingAway:()Landroid/view/View;
    1913: ifnonnull     2051
    1916: aload_1
    1917: invokevirtual #229                // Method android/support/v4/app/i.getAnimator:()Landroid/animation/Animator;
    1920: ifnull        1926
    1923: goto          2051
    1926: getstatic     #738                // Field a:Z
    1929: ifeq          1969
    1932: new           #718                // class java/lang/StringBuilder
    1935: dup
    1936: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    1939: astore        10
    1941: aload         10
    1943: ldc_w         #1226               // String movefrom CREATED:
    1946: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    1949: pop
    1950: aload         10
    1952: aload_1
    1953: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    1956: pop
    1957: ldc_w         #348                // String FragmentManager
    1960: aload         10
    1962: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    1965: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
    1968: pop
    1969: aload_1
    1970: getfield      #472                // Field android/support/v4/app/i.mRetaining:Z
    1973: ifne          1989
    1976: aload_1
    1977: invokevirtual #1229               // Method android/support/v4/app/i.performDestroy:()V
    1980: aload_0
    1981: aload_1
    1982: iconst_0
    1983: invokevirtual #1231               // Method g:(Landroid/support/v4/app/i;Z)V
    1986: goto          1994
    1989: aload_1
    1990: iconst_0
    1991: putfield      #656                // Field android/support/v4/app/i.mState:I
    1994: aload_1
    1995: invokevirtual #1234               // Method android/support/v4/app/i.performDetach:()V
    1998: aload_0
    1999: aload_1
    2000: iconst_0
    2001: invokevirtual #1236               // Method h:(Landroid/support/v4/app/i;Z)V
    2004: iload_2
    2005: istore        6
    2007: iload         5
    2009: ifne          2063
    2012: aload_1
    2013: getfield      #472                // Field android/support/v4/app/i.mRetaining:Z
    2016: ifne          2030
    2019: aload_0
    2020: aload_1
    2021: invokevirtual #1238               // Method h:(Landroid/support/v4/app/i;)V
    2024: iload_2
    2025: istore        6
    2027: goto          2063
    2030: aload_1
    2031: aconst_null
    2032: putfield      #1043               // Field android/support/v4/app/i.mHost:Landroid/support/v4/app/m;
    2035: aload_1
    2036: aconst_null
    2037: putfield      #1046               // Field android/support/v4/app/i.mParentFragment:Landroid/support/v4/app/i;
    2040: aload_1
    2041: aconst_null
    2042: putfield      #1056               // Field android/support/v4/app/i.mFragmentManager:Landroid/support/v4/app/o;
    2045: iload_2
    2046: istore        6
    2048: goto          2063
    2051: aload_1
    2052: iload_2
    2053: invokevirtual #401                // Method android/support/v4/app/i.setStateAfterAnimating:(I)V
    2056: iload         7
    2058: istore        6
    2060: goto          2063
    2063: aload_1
    2064: getfield      #656                // Field android/support/v4/app/i.mState:I
    2067: iload         6
    2069: if_icmpeq     2160
    2072: new           #718                // class java/lang/StringBuilder
    2075: dup
    2076: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
    2079: astore        10
    2081: aload         10
    2083: ldc_w         #1240               // String moveToState: Fragment state for
    2086: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    2089: pop
    2090: aload         10
    2092: aload_1
    2093: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    2096: pop
    2097: aload         10
    2099: ldc_w         #1242               // String  not updated inline;
    2102: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    2105: pop
    2106: aload         10
    2108: ldc_w         #1244               // String expected state
    2111: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    2114: pop
    2115: aload         10
    2117: iload         6
    2119: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
    2122: pop
    2123: aload         10
    2125: ldc_w         #1246               // String  found
    2128: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
    2131: pop
    2132: aload         10
    2134: aload_1
    2135: getfield      #656                // Field android/support/v4/app/i.mState:I
    2138: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
    2141: pop
    2142: ldc_w         #348                // String FragmentManager
    2145: aload         10
    2147: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    2150: invokestatic  #968                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
    2153: pop
    2154: aload_1
    2155: iload         6
    2157: putfield      #656                // Field android/support/v4/app/i.mState:I
    2160: return
    2161: astore        10
    2163: goto          956
    Exception table:
       from    to  target type
         940   953  2161   Class android/content/res/Resources$NotFoundException

  void a(android.support.v4.app.i, android.content.Context, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        35
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        4
      16: aload         4
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          35
      24: aload         4
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: iconst_1
      32: invokevirtual #1063               // Method a:(Landroid/support/v4/app/i;Landroid/content/Context;Z)V
      35: aload_0
      36: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      39: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      42: astore        4
      44: aload         4
      46: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          101
      54: aload         4
      56: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      61: checkcast     #1252               // class android/support/v4/g/j
      64: astore        5
      66: iload_3
      67: ifeq          84
      70: aload         5
      72: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      75: checkcast     #250                // class java/lang/Boolean
      78: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          44
      84: aload         5
      86: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      89: checkcast     #1259               // class android/support/v4/app/n$a
      92: aload_0
      93: aload_1
      94: aload_2
      95: invokevirtual #1262               // Method android/support/v4/app/n$a.a:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/content/Context;)V
      98: goto          44
     101: return

  void a(android.support.v4.app.i, android.os.Bundle, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        35
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        4
      16: aload         4
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          35
      24: aload         4
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: iconst_1
      32: invokevirtual #1088               // Method a:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
      35: aload_0
      36: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      39: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      42: astore        4
      44: aload         4
      46: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          101
      54: aload         4
      56: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      61: checkcast     #1252               // class android/support/v4/g/j
      64: astore        5
      66: iload_3
      67: ifeq          84
      70: aload         5
      72: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      75: checkcast     #250                // class java/lang/Boolean
      78: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          44
      84: aload         5
      86: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      89: checkcast     #1259               // class android/support/v4/app/n$a
      92: aload_0
      93: aload_1
      94: aload_2
      95: invokevirtual #1265               // Method android/support/v4/app/n$a.a:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/os/Bundle;)V
      98: goto          44
     101: return

  void a(android.support.v4.app.i, android.view.View, android.os.Bundle, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        36
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        5
      16: aload         5
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          36
      24: aload         5
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: aload_3
      32: iconst_1
      33: invokevirtual #1154               // Method a:(Landroid/support/v4/app/i;Landroid/view/View;Landroid/os/Bundle;Z)V
      36: aload_0
      37: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      40: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      43: astore        5
      45: aload         5
      47: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      52: ifeq          104
      55: aload         5
      57: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      62: checkcast     #1252               // class android/support/v4/g/j
      65: astore        6
      67: iload         4
      69: ifeq          86
      72: aload         6
      74: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      77: checkcast     #250                // class java/lang/Boolean
      80: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      83: ifeq          45
      86: aload         6
      88: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      91: checkcast     #1259               // class android/support/v4/app/n$a
      94: aload_0
      95: aload_1
      96: aload_2
      97: aload_3
      98: invokevirtual #1268               // Method android/support/v4/app/n$a.a:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/view/View;Landroid/os/Bundle;)V
     101: goto          45
     104: return

  public void a(android.support.v4.app.i, boolean);
    Code:
       0: getstatic     #738                // Field a:Z
       3: ifeq          39
       6: new           #718                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      13: astore_3
      14: aload_3
      15: ldc_w         #1270               // String add:
      18: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_3
      23: aload_1
      24: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc_w         #348                // String FragmentManager
      31: aload_3
      32: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      38: pop
      39: aload_0
      40: aload_1
      41: invokevirtual #1272               // Method g:(Landroid/support/v4/app/i;)V
      44: aload_1
      45: getfield      #880                // Field android/support/v4/app/i.mDetached:Z
      48: ifne          170
      51: aload_0
      52: getfield      #127                // Field e:Ljava/util/ArrayList;
      55: aload_1
      56: invokevirtual #978                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      59: ifeq          96
      62: new           #718                // class java/lang/StringBuilder
      65: dup
      66: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      69: astore_3
      70: aload_3
      71: ldc_w         #1274               // String Fragment already added:
      74: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      77: pop
      78: aload_3
      79: aload_1
      80: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      83: pop
      84: new           #683                // class java/lang/IllegalStateException
      87: dup
      88: aload_3
      89: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      92: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      95: athrow
      96: aload_0
      97: getfield      #127                // Field e:Ljava/util/ArrayList;
     100: astore_3
     101: aload_3
     102: monitorenter
     103: aload_0
     104: getfield      #127                // Field e:Ljava/util/ArrayList;
     107: aload_1
     108: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     111: pop
     112: aload_3
     113: monitorexit
     114: aload_1
     115: iconst_1
     116: putfield      #484                // Field android/support/v4/app/i.mAdded:Z
     119: aload_1
     120: iconst_0
     121: putfield      #877                // Field android/support/v4/app/i.mRemoving:Z
     124: aload_1
     125: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     128: ifnonnull     136
     131: aload_1
     132: iconst_0
     133: putfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
     136: aload_1
     137: getfield      #1280               // Field android/support/v4/app/i.mHasMenu:Z
     140: ifeq          155
     143: aload_1
     144: getfield      #1283               // Field android/support/v4/app/i.mMenuVisible:Z
     147: ifeq          155
     150: aload_0
     151: iconst_1
     152: putfield      #883                // Field r:Z
     155: iload_2
     156: ifeq          170
     159: aload_0
     160: aload_1
     161: invokevirtual #1285               // Method c:(Landroid/support/v4/app/i;)V
     164: return
     165: astore_1
     166: aload_3
     167: monitorexit
     168: aload_1
     169: athrow
     170: return
    Exception table:
       from    to  target type
         103   114   165   any
         166   168   165   any

  public void a(android.support.v4.app.m, android.support.v4.app.k, android.support.v4.app.i);
    Code:
       0: aload_0
       1: getfield      #157                // Field m:Landroid/support/v4/app/m;
       4: ifnull        18
       7: new           #683                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #1288               // String Already attached
      14: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: putfield      #157                // Field m:Landroid/support/v4/app/m;
      23: aload_0
      24: aload_2
      25: putfield      #947                // Field n:Landroid/support/v4/app/k;
      28: aload_0
      29: aload_3
      30: putfield      #949                // Field o:Landroid/support/v4/app/i;
      33: return

  public void a(android.support.v4.app.o$g, boolean);
    Code:
       0: iload_2
       1: ifne          8
       4: aload_0
       5: invokespecial #705                // Method z:()V
       8: aload_0
       9: monitorenter
      10: aload_0
      11: getfield      #1216               // Field u:Z
      14: ifne          61
      17: aload_0
      18: getfield      #157                // Field m:Landroid/support/v4/app/m;
      21: ifnonnull     27
      24: goto          61
      27: aload_0
      28: getfield      #151                // Field b:Ljava/util/ArrayList;
      31: ifnonnull     45
      34: aload_0
      35: new           #124                // class java/util/ArrayList
      38: dup
      39: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      42: putfield      #151                // Field b:Ljava/util/ArrayList;
      45: aload_0
      46: getfield      #151                // Field b:Ljava/util/ArrayList;
      49: aload_1
      50: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      53: pop
      54: aload_0
      55: invokespecial #445                // Method A:()V
      58: aload_0
      59: monitorexit
      60: return
      61: iload_2
      62: ifeq          68
      65: aload_0
      66: monitorexit
      67: return
      68: new           #683                // class java/lang/IllegalStateException
      71: dup
      72: ldc_w         #1290               // String Activity has been destroyed
      75: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      78: athrow
      79: astore_1
      80: aload_0
      81: monitorexit
      82: aload_1
      83: athrow
    Exception table:
       from    to  target type
          10    24    79   any
          27    45    79   any
          45    60    79   any
          65    67    79   any
          68    79    79   any
          80    82    79   any

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: new           #718                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
       7: astore        8
       9: aload         8
      11: aload_1
      12: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      15: pop
      16: aload         8
      18: ldc_w         #1292               // String
      21: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload         8
      27: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      30: astore        8
      32: aload_0
      33: getfield      #189                // Field f:Landroid/util/SparseArray;
      36: astore        9
      38: iconst_0
      39: istore        6
      41: aload         9
      43: ifnull        170
      46: aload_0
      47: getfield      #189                // Field f:Landroid/util/SparseArray;
      50: invokevirtual #192                // Method android/util/SparseArray.size:()I
      53: istore        7
      55: iload         7
      57: ifle          170
      60: aload_3
      61: aload_1
      62: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      65: aload_3
      66: ldc_w         #1297               // String Active Fragments in
      69: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      72: aload_3
      73: aload_0
      74: invokestatic  #1302               // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      77: invokestatic  #1123               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      80: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      83: aload_3
      84: ldc_w         #1304               // String :
      87: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      90: iconst_0
      91: istore        5
      93: iload         5
      95: iload         7
      97: if_icmpge     170
     100: aload_0
     101: getfield      #189                // Field f:Landroid/util/SparseArray;
     104: iload         5
     106: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
     109: checkcast     #197                // class android/support/v4/app/i
     112: astore        9
     114: aload_3
     115: aload_1
     116: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     119: aload_3
     120: ldc_w         #1309               // String   #
     123: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     126: aload_3
     127: iload         5
     129: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     132: aload_3
     133: ldc_w         #956                // String :
     136: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     139: aload_3
     140: aload         9
     142: invokevirtual #1313               // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     145: aload         9
     147: ifnull        161
     150: aload         9
     152: aload         8
     154: aload_2
     155: aload_3
     156: aload         4
     158: invokevirtual #1316               // Method android/support/v4/app/i.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     161: iload         5
     163: iconst_1
     164: iadd
     165: istore        5
     167: goto          93
     170: aload_0
     171: getfield      #127                // Field e:Ljava/util/ArrayList;
     174: invokevirtual #155                // Method java/util/ArrayList.size:()I
     177: istore        7
     179: iload         7
     181: ifle          263
     184: aload_3
     185: aload_1
     186: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     189: aload_3
     190: ldc_w         #1318               // String Added Fragments:
     193: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     196: iconst_0
     197: istore        5
     199: iload         5
     201: iload         7
     203: if_icmpge     263
     206: aload_0
     207: getfield      #127                // Field e:Ljava/util/ArrayList;
     210: iload         5
     212: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     215: checkcast     #197                // class android/support/v4/app/i
     218: astore        9
     220: aload_3
     221: aload_1
     222: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     225: aload_3
     226: ldc_w         #1309               // String   #
     229: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     232: aload_3
     233: iload         5
     235: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     238: aload_3
     239: ldc_w         #956                // String :
     242: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     245: aload_3
     246: aload         9
     248: invokevirtual #1319               // Method android/support/v4/app/i.toString:()Ljava/lang/String;
     251: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     254: iload         5
     256: iconst_1
     257: iadd
     258: istore        5
     260: goto          199
     263: aload_0
     264: getfield      #1321               // Field h:Ljava/util/ArrayList;
     267: ifnull        363
     270: aload_0
     271: getfield      #1321               // Field h:Ljava/util/ArrayList;
     274: invokevirtual #155                // Method java/util/ArrayList.size:()I
     277: istore        7
     279: iload         7
     281: ifle          363
     284: aload_3
     285: aload_1
     286: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     289: aload_3
     290: ldc_w         #1323               // String Fragments Created Menus:
     293: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     296: iconst_0
     297: istore        5
     299: iload         5
     301: iload         7
     303: if_icmpge     363
     306: aload_0
     307: getfield      #1321               // Field h:Ljava/util/ArrayList;
     310: iload         5
     312: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     315: checkcast     #197                // class android/support/v4/app/i
     318: astore        9
     320: aload_3
     321: aload_1
     322: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     325: aload_3
     326: ldc_w         #1309               // String   #
     329: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     332: aload_3
     333: iload         5
     335: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     338: aload_3
     339: ldc_w         #956                // String :
     342: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     345: aload_3
     346: aload         9
     348: invokevirtual #1319               // Method android/support/v4/app/i.toString:()Ljava/lang/String;
     351: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     354: iload         5
     356: iconst_1
     357: iadd
     358: istore        5
     360: goto          299
     363: aload_0
     364: getfield      #985                // Field g:Ljava/util/ArrayList;
     367: ifnull        474
     370: aload_0
     371: getfield      #985                // Field g:Ljava/util/ArrayList;
     374: invokevirtual #155                // Method java/util/ArrayList.size:()I
     377: istore        7
     379: iload         7
     381: ifle          474
     384: aload_3
     385: aload_1
     386: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     389: aload_3
     390: ldc_w         #1325               // String Back Stack:
     393: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     396: iconst_0
     397: istore        5
     399: iload         5
     401: iload         7
     403: if_icmpge     474
     406: aload_0
     407: getfield      #985                // Field g:Ljava/util/ArrayList;
     410: iload         5
     412: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     415: checkcast     #248                // class android/support/v4/app/c
     418: astore        9
     420: aload_3
     421: aload_1
     422: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     425: aload_3
     426: ldc_w         #1309               // String   #
     429: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     432: aload_3
     433: iload         5
     435: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     438: aload_3
     439: ldc_w         #956                // String :
     442: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     445: aload_3
     446: aload         9
     448: invokevirtual #1326               // Method android/support/v4/app/c.toString:()Ljava/lang/String;
     451: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     454: aload         9
     456: aload         8
     458: aload_2
     459: aload_3
     460: aload         4
     462: invokevirtual #1327               // Method android/support/v4/app/c.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     465: iload         5
     467: iconst_1
     468: iadd
     469: istore        5
     471: goto          399
     474: aload_0
     475: monitorenter
     476: aload_0
     477: getfield      #752                // Field i:Ljava/util/ArrayList;
     480: ifnull        571
     483: aload_0
     484: getfield      #752                // Field i:Ljava/util/ArrayList;
     487: invokevirtual #155                // Method java/util/ArrayList.size:()I
     490: istore        7
     492: iload         7
     494: ifle          571
     497: aload_3
     498: aload_1
     499: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     502: aload_3
     503: ldc_w         #1329               // String Back Stack Indices:
     506: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     509: iconst_0
     510: istore        5
     512: iload         5
     514: iload         7
     516: if_icmpge     571
     519: aload_0
     520: getfield      #752                // Field i:Ljava/util/ArrayList;
     523: iload         5
     525: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     528: checkcast     #248                // class android/support/v4/app/c
     531: astore_2
     532: aload_3
     533: aload_1
     534: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     537: aload_3
     538: ldc_w         #1309               // String   #
     541: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     544: aload_3
     545: iload         5
     547: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     550: aload_3
     551: ldc_w         #956                // String :
     554: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     557: aload_3
     558: aload_2
     559: invokevirtual #1313               // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     562: iload         5
     564: iconst_1
     565: iadd
     566: istore        5
     568: goto          512
     571: aload_0
     572: getfield      #731                // Field j:Ljava/util/ArrayList;
     575: ifnull        614
     578: aload_0
     579: getfield      #731                // Field j:Ljava/util/ArrayList;
     582: invokevirtual #155                // Method java/util/ArrayList.size:()I
     585: ifle          614
     588: aload_3
     589: aload_1
     590: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     593: aload_3
     594: ldc_w         #1331               // String mAvailBackStackIndices:
     597: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     600: aload_3
     601: aload_0
     602: getfield      #731                // Field j:Ljava/util/ArrayList;
     605: invokevirtual #1335               // Method java/util/ArrayList.toArray:()[Ljava/lang/Object;
     608: invokestatic  #1340               // Method java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
     611: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     614: aload_0
     615: monitorexit
     616: aload_0
     617: getfield      #151                // Field b:Ljava/util/ArrayList;
     620: ifnull        712
     623: aload_0
     624: getfield      #151                // Field b:Ljava/util/ArrayList;
     627: invokevirtual #155                // Method java/util/ArrayList.size:()I
     630: istore        7
     632: iload         7
     634: ifle          712
     637: aload_3
     638: aload_1
     639: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     642: aload_3
     643: ldc_w         #1342               // String Pending Actions:
     646: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     649: iload         6
     651: istore        5
     653: iload         5
     655: iload         7
     657: if_icmpge     712
     660: aload_0
     661: getfield      #151                // Field b:Ljava/util/ArrayList;
     664: iload         5
     666: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     669: checkcast     #38                 // class android/support/v4/app/o$g
     672: astore_2
     673: aload_3
     674: aload_1
     675: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     678: aload_3
     679: ldc_w         #1309               // String   #
     682: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     685: aload_3
     686: iload         5
     688: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     691: aload_3
     692: ldc_w         #956                // String :
     695: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     698: aload_3
     699: aload_2
     700: invokevirtual #1313               // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     703: iload         5
     705: iconst_1
     706: iadd
     707: istore        5
     709: goto          653
     712: aload_3
     713: aload_1
     714: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     717: aload_3
     718: ldc_w         #1344               // String FragmentManager misc state:
     721: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     724: aload_3
     725: aload_1
     726: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     729: aload_3
     730: ldc_w         #1346               // String   mHost=
     733: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     736: aload_3
     737: aload_0
     738: getfield      #157                // Field m:Landroid/support/v4/app/m;
     741: invokevirtual #1313               // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     744: aload_3
     745: aload_1
     746: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     749: aload_3
     750: ldc_w         #1348               // String   mContainer=
     753: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     756: aload_3
     757: aload_0
     758: getfield      #947                // Field n:Landroid/support/v4/app/k;
     761: invokevirtual #1313               // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     764: aload_0
     765: getfield      #949                // Field o:Landroid/support/v4/app/i;
     768: ifnull        791
     771: aload_3
     772: aload_1
     773: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     776: aload_3
     777: ldc_w         #1350               // String   mParent=
     780: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     783: aload_3
     784: aload_0
     785: getfield      #949                // Field o:Landroid/support/v4/app/i;
     788: invokevirtual #1313               // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     791: aload_3
     792: aload_1
     793: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     796: aload_3
     797: ldc_w         #1352               // String   mCurState=
     800: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     803: aload_3
     804: aload_0
     805: getfield      #134                // Field l:I
     808: invokevirtual #1311               // Method java/io/PrintWriter.print:(I)V
     811: aload_3
     812: ldc_w         #1354               // String  mStateSaved=
     815: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     818: aload_3
     819: aload_0
     820: getfield      #1356               // Field s:Z
     823: invokevirtual #1358               // Method java/io/PrintWriter.print:(Z)V
     826: aload_3
     827: ldc_w         #1360               // String  mStopped=
     830: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     833: aload_3
     834: aload_0
     835: getfield      #1361               // Field t:Z
     838: invokevirtual #1358               // Method java/io/PrintWriter.print:(Z)V
     841: aload_3
     842: ldc_w         #1363               // String  mDestroyed=
     845: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     848: aload_3
     849: aload_0
     850: getfield      #1216               // Field u:Z
     853: invokevirtual #1365               // Method java/io/PrintWriter.println:(Z)V
     856: aload_0
     857: getfield      #883                // Field r:Z
     860: ifeq          883
     863: aload_3
     864: aload_1
     865: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     868: aload_3
     869: ldc_w         #1367               // String   mNeedMenuInvalidate=
     872: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     875: aload_3
     876: aload_0
     877: getfield      #883                // Field r:Z
     880: invokevirtual #1365               // Method java/io/PrintWriter.println:(Z)V
     883: aload_0
     884: getfield      #716                // Field v:Ljava/lang/String;
     887: ifnull        910
     890: aload_3
     891: aload_1
     892: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     895: aload_3
     896: ldc_w         #1369               // String   mNoTransactionsBecause=
     899: invokevirtual #1295               // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     902: aload_3
     903: aload_0
     904: getfield      #716                // Field v:Ljava/lang/String;
     907: invokevirtual #1307               // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     910: return
     911: astore_1
     912: aload_0
     913: monitorexit
     914: aload_1
     915: athrow
    Exception table:
       from    to  target type
         476   492   911   any
         497   509   911   any
         519   562   911   any
         571   614   911   any
         614   616   911   any
         912   914   911   any

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #127                // Field e:Ljava/util/ArrayList;
       4: invokevirtual #155                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_2
      10: iload_2
      11: iflt          42
      14: aload_0
      15: getfield      #127                // Field e:Ljava/util/ArrayList;
      18: iload_2
      19: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #197                // class android/support/v4/app/i
      25: astore_3
      26: aload_3
      27: ifnull        35
      30: aload_3
      31: iload_1
      32: invokevirtual #1372               // Method android/support/v4/app/i.performMultiWindowModeChanged:(Z)V
      35: iload_2
      36: iconst_1
      37: isub
      38: istore_2
      39: goto          10
      42: return

  boolean a(int);
    Code:
       0: aload_0
       1: getfield      #134                // Field l:I
       4: iload_1
       5: if_icmplt     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public boolean a(android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #134                // Field l:I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_3
       8: iconst_1
       9: if_icmpge     14
      12: iconst_0
      13: ireturn
      14: iconst_0
      15: istore        4
      17: iload_2
      18: aload_0
      19: getfield      #127                // Field e:Ljava/util/ArrayList;
      22: invokevirtual #155                // Method java/util/ArrayList.size:()I
      25: if_icmpge     77
      28: aload_0
      29: getfield      #127                // Field e:Ljava/util/ArrayList;
      32: iload_2
      33: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      36: checkcast     #197                // class android/support/v4/app/i
      39: astore        6
      41: iload         4
      43: istore        5
      45: aload         6
      47: ifnull        66
      50: iload         4
      52: istore        5
      54: aload         6
      56: aload_1
      57: invokevirtual #1376               // Method android/support/v4/app/i.performPrepareOptionsMenu:(Landroid/view/Menu;)Z
      60: ifeq          66
      63: iconst_1
      64: istore        5
      66: iload_2
      67: iconst_1
      68: iadd
      69: istore_2
      70: iload         5
      72: istore        4
      74: goto          17
      77: iload         4
      79: ireturn

  public boolean a(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_0
       1: getfield      #134                // Field l:I
       4: istore_3
       5: iconst_0
       6: istore        4
       8: iload_3
       9: iconst_1
      10: if_icmpge     15
      13: iconst_0
      14: ireturn
      15: aconst_null
      16: astore        7
      18: iconst_0
      19: istore_3
      20: iconst_0
      21: istore        5
      23: iload_3
      24: aload_0
      25: getfield      #127                // Field e:Ljava/util/ArrayList;
      28: invokevirtual #155                // Method java/util/ArrayList.size:()I
      31: if_icmpge     122
      34: aload_0
      35: getfield      #127                // Field e:Ljava/util/ArrayList;
      38: iload_3
      39: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      42: checkcast     #197                // class android/support/v4/app/i
      45: astore        9
      47: aload         7
      49: astore        8
      51: iload         5
      53: istore        6
      55: aload         9
      57: ifnull        107
      60: aload         7
      62: astore        8
      64: iload         5
      66: istore        6
      68: aload         9
      70: aload_1
      71: aload_2
      72: invokevirtual #1380               // Method android/support/v4/app/i.performCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
      75: ifeq          107
      78: aload         7
      80: astore        8
      82: aload         7
      84: ifnonnull     96
      87: new           #124                // class java/util/ArrayList
      90: dup
      91: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      94: astore        8
      96: aload         8
      98: aload         9
     100: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     103: pop
     104: iconst_1
     105: istore        6
     107: iload_3
     108: iconst_1
     109: iadd
     110: istore_3
     111: aload         8
     113: astore        7
     115: iload         6
     117: istore        5
     119: goto          23
     122: aload_0
     123: getfield      #1321               // Field h:Ljava/util/ArrayList;
     126: ifnull        180
     129: iload         4
     131: istore_3
     132: iload_3
     133: aload_0
     134: getfield      #1321               // Field h:Ljava/util/ArrayList;
     137: invokevirtual #155                // Method java/util/ArrayList.size:()I
     140: if_icmpge     180
     143: aload_0
     144: getfield      #1321               // Field h:Ljava/util/ArrayList;
     147: iload_3
     148: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     151: checkcast     #197                // class android/support/v4/app/i
     154: astore_1
     155: aload         7
     157: ifnull        169
     160: aload         7
     162: aload_1
     163: invokevirtual #978                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
     166: ifne          173
     169: aload_1
     170: invokevirtual #1383               // Method android/support/v4/app/i.onDestroyOptionsMenu:()V
     173: iload_3
     174: iconst_1
     175: iadd
     176: istore_3
     177: goto          132
     180: aload_0
     181: aload         7
     183: putfield      #1321               // Field h:Ljava/util/ArrayList;
     186: iload         5
     188: ireturn

  public boolean a(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #134                // Field l:I
       4: iconst_1
       5: if_icmpge     10
       8: iconst_0
       9: ireturn
      10: iconst_0
      11: istore_2
      12: iload_2
      13: aload_0
      14: getfield      #127                // Field e:Ljava/util/ArrayList;
      17: invokevirtual #155                // Method java/util/ArrayList.size:()I
      20: if_icmpge     56
      23: aload_0
      24: getfield      #127                // Field e:Ljava/util/ArrayList;
      27: iload_2
      28: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      31: checkcast     #197                // class android/support/v4/app/i
      34: astore_3
      35: aload_3
      36: ifnull        49
      39: aload_3
      40: aload_1
      41: invokevirtual #1387               // Method android/support/v4/app/i.performOptionsItemSelected:(Landroid/view/MenuItem;)Z
      44: ifeq          49
      47: iconst_1
      48: ireturn
      49: iload_2
      50: iconst_1
      51: iadd
      52: istore_2
      53: goto          12
      56: iconst_0
      57: ireturn

  boolean a(java.util.ArrayList<android.support.v4.app.c>, java.util.ArrayList<java.lang.Boolean>, java.lang.String, int, int);
    Code:
       0: aload_0
       1: getfield      #985                // Field g:Ljava/util/ArrayList;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_3
      10: ifnonnull     68
      13: iload         4
      15: ifge          68
      18: iload         5
      20: iconst_1
      21: iand
      22: ifne          68
      25: aload_0
      26: getfield      #985                // Field g:Ljava/util/ArrayList;
      29: invokevirtual #155                // Method java/util/ArrayList.size:()I
      32: iconst_1
      33: isub
      34: istore        4
      36: iload         4
      38: ifge          43
      41: iconst_0
      42: ireturn
      43: aload_1
      44: aload_0
      45: getfield      #985                // Field g:Ljava/util/ArrayList;
      48: iload         4
      50: invokevirtual #185                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      53: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      56: pop
      57: aload_2
      58: iconst_1
      59: invokestatic  #360                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      62: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      65: pop
      66: iconst_1
      67: ireturn
      68: aload_3
      69: ifnonnull     86
      72: iload         4
      74: iflt          80
      77: goto          86
      80: iconst_m1
      81: istore        7
      83: goto          259
      86: aload_0
      87: getfield      #985                // Field g:Ljava/util/ArrayList;
      90: invokevirtual #155                // Method java/util/ArrayList.size:()I
      93: iconst_1
      94: isub
      95: istore        6
      97: iload         6
      99: iflt          162
     102: aload_0
     103: getfield      #985                // Field g:Ljava/util/ArrayList;
     106: iload         6
     108: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     111: checkcast     #248                // class android/support/v4/app/c
     114: astore        8
     116: aload_3
     117: ifnull        135
     120: aload_3
     121: aload         8
     123: invokevirtual #1389               // Method android/support/v4/app/c.h:()Ljava/lang/String;
     126: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     129: ifeq          135
     132: goto          162
     135: iload         4
     137: iflt          153
     140: iload         4
     142: aload         8
     144: getfield      #570                // Field android/support/v4/app/c.m:I
     147: if_icmpne     153
     150: goto          162
     153: iload         6
     155: iconst_1
     156: isub
     157: istore        6
     159: goto          97
     162: iload         6
     164: ifge          169
     167: iconst_0
     168: ireturn
     169: iload         6
     171: istore        7
     173: iload         5
     175: iconst_1
     176: iand
     177: ifeq          259
     180: iload         6
     182: iconst_1
     183: isub
     184: istore        5
     186: iload         5
     188: istore        7
     190: iload         5
     192: iflt          259
     195: aload_0
     196: getfield      #985                // Field g:Ljava/util/ArrayList;
     199: iload         5
     201: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     204: checkcast     #248                // class android/support/v4/app/c
     207: astore        8
     209: aload_3
     210: ifnull        229
     213: iload         5
     215: istore        6
     217: aload_3
     218: aload         8
     220: invokevirtual #1389               // Method android/support/v4/app/c.h:()Ljava/lang/String;
     223: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     226: ifne          180
     229: iload         5
     231: istore        7
     233: iload         4
     235: iflt          259
     238: iload         5
     240: istore        7
     242: iload         4
     244: aload         8
     246: getfield      #570                // Field android/support/v4/app/c.m:I
     249: if_icmpne     259
     252: iload         5
     254: istore        6
     256: goto          180
     259: iload         7
     261: aload_0
     262: getfield      #985                // Field g:Ljava/util/ArrayList;
     265: invokevirtual #155                // Method java/util/ArrayList.size:()I
     268: iconst_1
     269: isub
     270: if_icmpne     275
     273: iconst_0
     274: ireturn
     275: aload_0
     276: getfield      #985                // Field g:Ljava/util/ArrayList;
     279: invokevirtual #155                // Method java/util/ArrayList.size:()I
     282: iconst_1
     283: isub
     284: istore        4
     286: iload         4
     288: iload         7
     290: if_icmple     325
     293: aload_1
     294: aload_0
     295: getfield      #985                // Field g:Ljava/util/ArrayList;
     298: iload         4
     300: invokevirtual #185                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     303: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     306: pop
     307: aload_2
     308: iconst_1
     309: invokestatic  #360                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     312: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     315: pop
     316: iload         4
     318: iconst_1
     319: isub
     320: istore        4
     322: goto          286
     325: iconst_1
     326: ireturn

  public android.support.v4.app.i b(int);
    Code:
       0: aload_0
       1: getfield      #127                // Field e:Ljava/util/ArrayList;
       4: invokevirtual #155                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_2
      10: iload_2
      11: iflt          47
      14: aload_0
      15: getfield      #127                // Field e:Ljava/util/ArrayList;
      18: iload_2
      19: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #197                // class android/support/v4/app/i
      25: astore_3
      26: aload_3
      27: ifnull        40
      30: aload_3
      31: getfield      #1394               // Field android/support/v4/app/i.mFragmentId:I
      34: iload_1
      35: if_icmpne     40
      38: aload_3
      39: areturn
      40: iload_2
      41: iconst_1
      42: isub
      43: istore_2
      44: goto          10
      47: aload_0
      48: getfield      #189                // Field f:Landroid/util/SparseArray;
      51: ifnull        101
      54: aload_0
      55: getfield      #189                // Field f:Landroid/util/SparseArray;
      58: invokevirtual #192                // Method android/util/SparseArray.size:()I
      61: iconst_1
      62: isub
      63: istore_2
      64: iload_2
      65: iflt          101
      68: aload_0
      69: getfield      #189                // Field f:Landroid/util/SparseArray;
      72: iload_2
      73: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      76: checkcast     #197                // class android/support/v4/app/i
      79: astore_3
      80: aload_3
      81: ifnull        94
      84: aload_3
      85: getfield      #1394               // Field android/support/v4/app/i.mFragmentId:I
      88: iload_1
      89: if_icmpne     94
      92: aload_3
      93: areturn
      94: iload_2
      95: iconst_1
      96: isub
      97: istore_2
      98: goto          64
     101: aconst_null
     102: areturn

  public android.support.v4.app.i b(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #189                // Field f:Landroid/util/SparseArray;
       4: ifnull        60
       7: aload_1
       8: ifnull        60
      11: aload_0
      12: getfield      #189                // Field f:Landroid/util/SparseArray;
      15: invokevirtual #192                // Method android/util/SparseArray.size:()I
      18: iconst_1
      19: isub
      20: istore_2
      21: iload_2
      22: iflt          60
      25: aload_0
      26: getfield      #189                // Field f:Landroid/util/SparseArray;
      29: iload_2
      30: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      33: checkcast     #197                // class android/support/v4/app/i
      36: astore_3
      37: aload_3
      38: ifnull        53
      41: aload_3
      42: aload_1
      43: invokevirtual #1397               // Method android/support/v4/app/i.findFragmentByWho:(Ljava/lang/String;)Landroid/support/v4/app/i;
      46: astore_3
      47: aload_3
      48: ifnull        53
      51: aload_3
      52: areturn
      53: iload_2
      54: iconst_1
      55: isub
      56: istore_2
      57: goto          21
      60: aconst_null
      61: areturn

  void b(android.support.v4.app.c);
    Code:
       0: aload_0
       1: getfield      #985                // Field g:Ljava/util/ArrayList;
       4: ifnonnull     18
       7: aload_0
       8: new           #124                // class java/util/ArrayList
      11: dup
      12: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      15: putfield      #985                // Field g:Ljava/util/ArrayList;
      18: aload_0
      19: getfield      #985                // Field g:Ljava/util/ArrayList;
      22: aload_1
      23: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      26: pop
      27: return

  public void b(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #1013               // Field android/support/v4/app/i.mDeferStart:Z
       4: ifeq          37
       7: aload_0
       8: getfield      #174                // Field c:Z
      11: ifeq          20
      14: aload_0
      15: iconst_1
      16: putfield      #1400               // Field w:Z
      19: return
      20: aload_1
      21: iconst_0
      22: putfield      #1013               // Field android/support/v4/app/i.mDeferStart:Z
      25: aload_0
      26: aload_1
      27: aload_0
      28: getfield      #134                // Field l:I
      31: iconst_0
      32: iconst_0
      33: iconst_0
      34: invokevirtual #225                // Method a:(Landroid/support/v4/app/i;IIIZ)V
      37: return

  void b(android.support.v4.app.i, android.content.Context, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        35
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        4
      16: aload         4
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          35
      24: aload         4
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: iconst_1
      32: invokevirtual #1082               // Method b:(Landroid/support/v4/app/i;Landroid/content/Context;Z)V
      35: aload_0
      36: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      39: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      42: astore        4
      44: aload         4
      46: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          101
      54: aload         4
      56: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      61: checkcast     #1252               // class android/support/v4/g/j
      64: astore        5
      66: iload_3
      67: ifeq          84
      70: aload         5
      72: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      75: checkcast     #250                // class java/lang/Boolean
      78: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          44
      84: aload         5
      86: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      89: checkcast     #1259               // class android/support/v4/app/n$a
      92: aload_0
      93: aload_1
      94: aload_2
      95: invokevirtual #1402               // Method android/support/v4/app/n$a.b:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/content/Context;)V
      98: goto          44
     101: return

  void b(android.support.v4.app.i, android.os.Bundle, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        35
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        4
      16: aload         4
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          35
      24: aload         4
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: iconst_1
      32: invokevirtual #1093               // Method b:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
      35: aload_0
      36: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      39: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      42: astore        4
      44: aload         4
      46: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          101
      54: aload         4
      56: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      61: checkcast     #1252               // class android/support/v4/g/j
      64: astore        5
      66: iload_3
      67: ifeq          84
      70: aload         5
      72: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      75: checkcast     #250                // class java/lang/Boolean
      78: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          44
      84: aload         5
      86: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      89: checkcast     #1259               // class android/support/v4/app/n$a
      92: aload_0
      93: aload_1
      94: aload_2
      95: invokevirtual #1404               // Method android/support/v4/app/n$a.b:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/os/Bundle;)V
      98: goto          44
     101: return

  void b(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1173               // Method b:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1407               // Method android/support/v4/app/n$a.a:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  public void b(android.support.v4.app.o$g, boolean);
    Code:
       0: iload_2
       1: ifeq          19
       4: aload_0
       5: getfield      #157                // Field m:Landroid/support/v4/app/m;
       8: ifnull        18
      11: aload_0
      12: getfield      #1216               // Field u:Z
      15: ifeq          19
      18: return
      19: aload_0
      20: iload_2
      21: invokespecial #628                // Method c:(Z)V
      24: aload_1
      25: aload_0
      26: getfield      #181                // Field x:Ljava/util/ArrayList;
      29: aload_0
      30: getfield      #176                // Field y:Ljava/util/ArrayList;
      33: invokeinterface #708,  3          // InterfaceMethod android/support/v4/app/o$g.a:(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
      38: ifeq          72
      41: aload_0
      42: iconst_1
      43: putfield      #174                // Field c:Z
      46: aload_0
      47: aload_0
      48: getfield      #181                // Field x:Ljava/util/ArrayList;
      51: aload_0
      52: getfield      #176                // Field y:Ljava/util/ArrayList;
      55: invokespecial #640                // Method b:(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      58: aload_0
      59: invokespecial #642                // Method B:()V
      62: goto          72
      65: astore_1
      66: aload_0
      67: invokespecial #642                // Method B:()V
      70: aload_1
      71: athrow
      72: aload_0
      73: invokevirtual #644                // Method h:()V
      76: aload_0
      77: invokespecial #646                // Method E:()V
      80: return
    Exception table:
       from    to  target type
          46    58    65   any

  public void b(android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #134                // Field l:I
       4: iconst_1
       5: if_icmpge     9
       8: return
       9: iconst_0
      10: istore_2
      11: iload_2
      12: aload_0
      13: getfield      #127                // Field e:Ljava/util/ArrayList;
      16: invokevirtual #155                // Method java/util/ArrayList.size:()I
      19: if_icmpge     50
      22: aload_0
      23: getfield      #127                // Field e:Ljava/util/ArrayList;
      26: iload_2
      27: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      30: checkcast     #197                // class android/support/v4/app/i
      33: astore_3
      34: aload_3
      35: ifnull        43
      38: aload_3
      39: aload_1
      40: invokevirtual #1411               // Method android/support/v4/app/i.performOptionsMenuClosed:(Landroid/view/Menu;)V
      43: iload_2
      44: iconst_1
      45: iadd
      46: istore_2
      47: goto          11
      50: return

  public void b(boolean);
    Code:
       0: aload_0
       1: getfield      #127                // Field e:Ljava/util/ArrayList;
       4: invokevirtual #155                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_2
      10: iload_2
      11: iflt          42
      14: aload_0
      15: getfield      #127                // Field e:Ljava/util/ArrayList;
      18: iload_2
      19: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #197                // class android/support/v4/app/i
      25: astore_3
      26: aload_3
      27: ifnull        35
      30: aload_3
      31: iload_1
      32: invokevirtual #1414               // Method android/support/v4/app/i.performPictureInPictureModeChanged:(Z)V
      35: iload_2
      36: iconst_1
      37: isub
      38: istore_2
      39: goto          10
      42: return

  public boolean b();
    Code:
       0: aload_0
       1: invokevirtual #626                // Method g:()Z
       4: istore_1
       5: aload_0
       6: invokespecial #1416               // Method C:()V
       9: iload_1
      10: ireturn

  public boolean b(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #134                // Field l:I
       4: iconst_1
       5: if_icmpge     10
       8: iconst_0
       9: ireturn
      10: iconst_0
      11: istore_2
      12: iload_2
      13: aload_0
      14: getfield      #127                // Field e:Ljava/util/ArrayList;
      17: invokevirtual #155                // Method java/util/ArrayList.size:()I
      20: if_icmpge     56
      23: aload_0
      24: getfield      #127                // Field e:Ljava/util/ArrayList;
      27: iload_2
      28: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      31: checkcast     #197                // class android/support/v4/app/i
      34: astore_3
      35: aload_3
      36: ifnull        49
      39: aload_3
      40: aload_1
      41: invokevirtual #1419               // Method android/support/v4/app/i.performContextItemSelected:(Landroid/view/MenuItem;)Z
      44: ifeq          49
      47: iconst_1
      48: ireturn
      49: iload_2
      50: iconst_1
      51: iadd
      52: istore_2
      53: goto          12
      56: iconst_0
      57: ireturn

  public void c(int);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #752                // Field i:Ljava/util/ArrayList;
       6: iload_1
       7: aconst_null
       8: invokevirtual #756                // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
      11: pop
      12: aload_0
      13: getfield      #731                // Field j:Ljava/util/ArrayList;
      16: ifnonnull     30
      19: aload_0
      20: new           #124                // class java/util/ArrayList
      23: dup
      24: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      27: putfield      #731                // Field j:Ljava/util/ArrayList;
      30: getstatic     #738                // Field a:Z
      33: ifeq          69
      36: new           #718                // class java/lang/StringBuilder
      39: dup
      40: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      43: astore_2
      44: aload_2
      45: ldc_w         #1421               // String Freeing back stack index
      48: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload_2
      53: iload_1
      54: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      57: pop
      58: ldc_w         #348                // String FragmentManager
      61: aload_2
      62: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      65: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      68: pop
      69: aload_0
      70: getfield      #731                // Field j:Ljava/util/ArrayList;
      73: iload_1
      74: invokestatic  #869                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      77: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      80: pop
      81: aload_0
      82: monitorexit
      83: return
      84: astore_2
      85: aload_0
      86: monitorexit
      87: aload_2
      88: athrow
    Exception table:
       from    to  target type
           2    30    84   any
          30    69    84   any
          69    83    84   any
          85    87    84   any

  void c(android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: aload_0
       3: getfield      #134                // Field l:I
       6: iconst_0
       7: iconst_0
       8: iconst_0
       9: invokevirtual #225                // Method a:(Landroid/support/v4/app/i;IIIZ)V
      12: return

  void c(android.support.v4.app.i, android.os.Bundle, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        35
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        4
      16: aload         4
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          35
      24: aload         4
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: iconst_1
      32: invokevirtual #1162               // Method c:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
      35: aload_0
      36: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      39: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      42: astore        4
      44: aload         4
      46: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          101
      54: aload         4
      56: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      61: checkcast     #1252               // class android/support/v4/g/j
      64: astore        5
      66: iload_3
      67: ifeq          84
      70: aload         5
      72: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      75: checkcast     #250                // class java/lang/Boolean
      78: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          44
      84: aload         5
      86: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      89: checkcast     #1259               // class android/support/v4/app/n$a
      92: aload_0
      93: aload_1
      94: aload_2
      95: invokevirtual #1423               // Method android/support/v4/app/n$a.c:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/os/Bundle;)V
      98: goto          44
     101: return

  void c(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1180               // Method c:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1425               // Method android/support/v4/app/n$a.b:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  public boolean c();
    Code:
       0: aload_0
       1: invokespecial #705                // Method z:()V
       4: aload_0
       5: aconst_null
       6: iconst_m1
       7: iconst_0
       8: invokespecial #1427               // Method a:(Ljava/lang/String;II)Z
      11: ireturn

  public java.util.List<android.support.v4.app.i> d();
    Code:
       0: aload_0
       1: getfield      #127                // Field e:Ljava/util/ArrayList;
       4: invokevirtual #149                // Method java/util/ArrayList.isEmpty:()Z
       7: ifeq          14
      10: getstatic     #1433               // Field java/util/Collections.EMPTY_LIST:Ljava/util/List;
      13: areturn
      14: aload_0
      15: getfield      #127                // Field e:Ljava/util/ArrayList;
      18: astore_1
      19: aload_1
      20: monitorenter
      21: aload_0
      22: getfield      #127                // Field e:Ljava/util/ArrayList;
      25: invokevirtual #1436               // Method java/util/ArrayList.clone:()Ljava/lang/Object;
      28: checkcast     #456                // class java/util/List
      31: astore_2
      32: aload_1
      33: monitorexit
      34: aload_2
      35: areturn
      36: astore_2
      37: aload_1
      38: monitorexit
      39: aload_2
      40: athrow
    Exception table:
       from    to  target type
          21    34    36   any
          37    39    36   any

  void d(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #1016               // Field android/support/v4/app/i.mFromLayout:Z
       4: ifeq          106
       7: aload_1
       8: getfield      #1440               // Field android/support/v4/app/i.mPerformedCreateView:Z
      11: ifne          106
      14: aload_1
      15: aload_1
      16: aload_1
      17: aload_1
      18: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
      21: invokevirtual #1131               // Method android/support/v4/app/i.performGetLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
      24: aconst_null
      25: aload_1
      26: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
      29: invokevirtual #1135               // Method android/support/v4/app/i.performCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
      32: putfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      35: aload_1
      36: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      39: ifnull        101
      42: aload_1
      43: aload_1
      44: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      47: putfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
      50: aload_1
      51: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      54: iconst_0
      55: invokevirtual #1141               // Method android/view/View.setSaveFromParentEnabled:(Z)V
      58: aload_1
      59: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
      62: ifeq          74
      65: aload_1
      66: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      69: bipush        8
      71: invokevirtual #1147               // Method android/view/View.setVisibility:(I)V
      74: aload_1
      75: aload_1
      76: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      79: aload_1
      80: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
      83: invokevirtual #1151               // Method android/support/v4/app/i.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
      86: aload_0
      87: aload_1
      88: aload_1
      89: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      92: aload_1
      93: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
      96: iconst_0
      97: invokevirtual #1154               // Method a:(Landroid/support/v4/app/i;Landroid/view/View;Landroid/os/Bundle;Z)V
     100: return
     101: aload_1
     102: aconst_null
     103: putfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
     106: return

  void d(android.support.v4.app.i, android.os.Bundle, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        35
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore        4
      16: aload         4
      18: instanceof    #2                  // class android/support/v4/app/o
      21: ifeq          35
      24: aload         4
      26: checkcast     #2                  // class android/support/v4/app/o
      29: aload_1
      30: aload_2
      31: iconst_1
      32: invokevirtual #1442               // Method d:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
      35: aload_0
      36: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      39: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      42: astore        4
      44: aload         4
      46: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          101
      54: aload         4
      56: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      61: checkcast     #1252               // class android/support/v4/g/j
      64: astore        5
      66: iload_3
      67: ifeq          84
      70: aload         5
      72: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      75: checkcast     #250                // class java/lang/Boolean
      78: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      81: ifeq          44
      84: aload         5
      86: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      89: checkcast     #1259               // class android/support/v4/app/n$a
      92: aload_0
      93: aload_1
      94: aload_2
      95: invokevirtual #1444               // Method android/support/v4/app/n$a.d:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;Landroid/os/Bundle;)V
      98: goto          44
     101: return

  void d(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1187               // Method d:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1446               // Method android/support/v4/app/n$a.c:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  void e(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
       4: ifnull        211
       7: aload_0
       8: aload_1
       9: aload_1
      10: invokevirtual #662                // Method android/support/v4/app/i.getNextTransition:()I
      13: aload_1
      14: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
      17: iconst_1
      18: ixor
      19: aload_1
      20: invokevirtual #1449               // Method android/support/v4/app/i.getNextTransitionStyle:()I
      23: invokevirtual #1218               // Method a:(Landroid/support/v4/app/i;IZI)Landroid/support/v4/app/o$c;
      26: astore_3
      27: aload_3
      28: ifnull        139
      31: aload_3
      32: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
      35: ifnull        139
      38: aload_3
      39: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
      42: aload_1
      43: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      46: invokevirtual #440                // Method android/animation/Animator.setTarget:(Ljava/lang/Object;)V
      49: aload_1
      50: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
      53: ifeq          113
      56: aload_1
      57: invokevirtual #1452               // Method android/support/v4/app/i.isHideReplaced:()Z
      60: ifeq          71
      63: aload_1
      64: iconst_0
      65: invokevirtual #1455               // Method android/support/v4/app/i.setHideReplaced:(Z)V
      68: goto          121
      71: aload_1
      72: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
      75: astore        4
      77: aload_1
      78: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      81: astore        5
      83: aload         4
      85: aload         5
      87: invokevirtual #398                // Method android/view/ViewGroup.startViewTransition:(Landroid/view/View;)V
      90: aload_3
      91: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
      94: new           #16                 // class android/support/v4/app/o$4
      97: dup
      98: aload_0
      99: aload         4
     101: aload         5
     103: aload_1
     104: invokespecial #1456               // Method android/support/v4/app/o$4."<init>":(Landroid/support/v4/app/o;Landroid/view/ViewGroup;Landroid/view/View;Landroid/support/v4/app/i;)V
     107: invokevirtual #436                // Method android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
     110: goto          121
     113: aload_1
     114: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     117: iconst_0
     118: invokevirtual #1147               // Method android/view/View.setVisibility:(I)V
     121: aload_1
     122: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     125: aload_3
     126: invokestatic  #419                // Method b:(Landroid/view/View;Landroid/support/v4/app/o$c;)V
     129: aload_3
     130: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
     133: invokevirtual #443                // Method android/animation/Animator.start:()V
     136: goto          211
     139: aload_3
     140: ifnull        169
     143: aload_1
     144: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     147: aload_3
     148: invokestatic  #419                // Method b:(Landroid/view/View;Landroid/support/v4/app/o$c;)V
     151: aload_1
     152: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     155: aload_3
     156: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
     159: invokevirtual #422                // Method android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
     162: aload_3
     163: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
     166: invokevirtual #1457               // Method android/view/animation/Animation.start:()V
     169: aload_1
     170: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
     173: ifeq          189
     176: aload_1
     177: invokevirtual #1452               // Method android/support/v4/app/i.isHideReplaced:()Z
     180: ifne          189
     183: bipush        8
     185: istore_2
     186: goto          191
     189: iconst_0
     190: istore_2
     191: aload_1
     192: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     195: iload_2
     196: invokevirtual #1147               // Method android/view/View.setVisibility:(I)V
     199: aload_1
     200: invokevirtual #1452               // Method android/support/v4/app/i.isHideReplaced:()Z
     203: ifeq          211
     206: aload_1
     207: iconst_0
     208: invokevirtual #1455               // Method android/support/v4/app/i.setHideReplaced:(Z)V
     211: aload_1
     212: getfield      #484                // Field android/support/v4/app/i.mAdded:Z
     215: ifeq          237
     218: aload_1
     219: getfield      #1280               // Field android/support/v4/app/i.mHasMenu:Z
     222: ifeq          237
     225: aload_1
     226: getfield      #1283               // Field android/support/v4/app/i.mMenuVisible:Z
     229: ifeq          237
     232: aload_0
     233: iconst_1
     234: putfield      #883                // Field r:Z
     237: aload_1
     238: iconst_0
     239: putfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
     242: aload_1
     243: aload_1
     244: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
     247: invokevirtual #1460               // Method android/support/v4/app/i.onHiddenChanged:(Z)V
     250: return

  void e(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1194               // Method e:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1462               // Method android/support/v4/app/n$a.d:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #1356               // Field s:Z
       4: ifne          19
       7: aload_0
       8: getfield      #1361               // Field t:Z
      11: ifeq          17
      14: goto          19
      17: iconst_0
      18: ireturn
      19: iconst_1
      20: ireturn

  void f();
    Code:
       0: aload_0
       1: getfield      #189                // Field f:Landroid/util/SparseArray;
       4: ifnonnull     8
       7: return
       8: iconst_0
       9: istore_1
      10: iload_1
      11: aload_0
      12: getfield      #189                // Field f:Landroid/util/SparseArray;
      15: invokevirtual #192                // Method android/util/SparseArray.size:()I
      18: if_icmpge     49
      21: aload_0
      22: getfield      #189                // Field f:Landroid/util/SparseArray;
      25: iload_1
      26: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      29: checkcast     #197                // class android/support/v4/app/i
      32: astore_2
      33: aload_2
      34: ifnull        42
      37: aload_0
      38: aload_2
      39: invokevirtual #1463               // Method b:(Landroid/support/v4/app/i;)V
      42: iload_1
      43: iconst_1
      44: iadd
      45: istore_1
      46: goto          10
      49: return

  void f(android.support.v4.app.i);
    Code:
       0: aload_1
       1: ifnonnull     5
       4: return
       5: aload_0
       6: getfield      #134                // Field l:I
       9: istore_3
      10: iload_3
      11: istore_2
      12: aload_1
      13: getfield      #877                // Field android/support/v4/app/i.mRemoving:Z
      16: ifeq          41
      19: aload_1
      20: invokevirtual #1010               // Method android/support/v4/app/i.isInBackStack:()Z
      23: ifeq          35
      26: iload_3
      27: iconst_1
      28: invokestatic  #653                // Method java/lang/Math.min:(II)I
      31: istore_2
      32: goto          41
      35: iload_3
      36: iconst_0
      37: invokestatic  #653                // Method java/lang/Math.min:(II)I
      40: istore_2
      41: aload_0
      42: aload_1
      43: iload_2
      44: aload_1
      45: invokevirtual #662                // Method android/support/v4/app/i.getNextTransition:()I
      48: aload_1
      49: invokevirtual #1449               // Method android/support/v4/app/i.getNextTransitionStyle:()I
      52: iconst_0
      53: invokevirtual #225                // Method a:(Landroid/support/v4/app/i;IIIZ)V
      56: aload_1
      57: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      60: ifnull        244
      63: aload_0
      64: aload_1
      65: invokespecial #1465               // Method q:(Landroid/support/v4/app/i;)Landroid/support/v4/app/i;
      68: astore        4
      70: aload         4
      72: ifnull        127
      75: aload         4
      77: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      80: astore        4
      82: aload_1
      83: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
      86: astore        5
      88: aload         5
      90: aload         4
      92: invokevirtual #1469               // Method android/view/ViewGroup.indexOfChild:(Landroid/view/View;)I
      95: istore_2
      96: aload         5
      98: aload_1
      99: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     102: invokevirtual #1469               // Method android/view/ViewGroup.indexOfChild:(Landroid/view/View;)I
     105: istore_3
     106: iload_3
     107: iload_2
     108: if_icmpge     127
     111: aload         5
     113: iload_3
     114: invokevirtual #1472               // Method android/view/ViewGroup.removeViewAt:(I)V
     117: aload         5
     119: aload_1
     120: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     123: iload_2
     124: invokevirtual #1475               // Method android/view/ViewGroup.addView:(Landroid/view/View;I)V
     127: aload_1
     128: getfield      #375                // Field android/support/v4/app/i.mIsNewlyAdded:Z
     131: ifeq          244
     134: aload_1
     135: getfield      #393                // Field android/support/v4/app/i.mContainer:Landroid/view/ViewGroup;
     138: ifnull        244
     141: aload_1
     142: getfield      #384                // Field android/support/v4/app/i.mPostponedAlpha:F
     145: fconst_0
     146: fcmpl
     147: ifle          161
     150: aload_1
     151: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     154: aload_1
     155: getfield      #384                // Field android/support/v4/app/i.mPostponedAlpha:F
     158: invokevirtual #387                // Method android/view/View.setAlpha:(F)V
     161: aload_1
     162: fconst_0
     163: putfield      #384                // Field android/support/v4/app/i.mPostponedAlpha:F
     166: aload_1
     167: iconst_0
     168: putfield      #375                // Field android/support/v4/app/i.mIsNewlyAdded:Z
     171: aload_0
     172: aload_1
     173: aload_1
     174: invokevirtual #662                // Method android/support/v4/app/i.getNextTransition:()I
     177: iconst_1
     178: aload_1
     179: invokevirtual #1449               // Method android/support/v4/app/i.getNextTransitionStyle:()I
     182: invokevirtual #1218               // Method a:(Landroid/support/v4/app/i;IZI)Landroid/support/v4/app/o$c;
     185: astore        4
     187: aload         4
     189: ifnull        244
     192: aload_1
     193: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     196: aload         4
     198: invokestatic  #419                // Method b:(Landroid/view/View;Landroid/support/v4/app/o$c;)V
     201: aload         4
     203: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
     206: ifnull        224
     209: aload_1
     210: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     213: aload         4
     215: getfield      #404                // Field android/support/v4/app/o$c.a:Landroid/view/animation/Animation;
     218: invokevirtual #422                // Method android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
     221: goto          244
     224: aload         4
     226: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
     229: aload_1
     230: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     233: invokevirtual #440                // Method android/animation/Animator.setTarget:(Ljava/lang/Object;)V
     236: aload         4
     238: getfield      #425                // Field android/support/v4/app/o$c.b:Landroid/animation/Animator;
     241: invokevirtual #443                // Method android/animation/Animator.start:()V
     244: aload_1
     245: getfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
     248: ifeq          256
     251: aload_0
     252: aload_1
     253: invokevirtual #1477               // Method e:(Landroid/support/v4/app/i;)V
     256: return

  void f(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1211               // Method f:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1479               // Method android/support/v4/app/n$a.e:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  void g(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #764                // Field android/support/v4/app/i.mIndex:I
       4: iflt          8
       7: return
       8: aload_0
       9: getfield      #122                // Field d:I
      12: istore_2
      13: aload_0
      14: iload_2
      15: iconst_1
      16: iadd
      17: putfield      #122                // Field d:I
      20: aload_1
      21: iload_2
      22: aload_0
      23: getfield      #949                // Field o:Landroid/support/v4/app/i;
      26: invokevirtual #1483               // Method android/support/v4/app/i.setIndex:(ILandroid/support/v4/app/i;)V
      29: aload_0
      30: getfield      #189                // Field f:Landroid/util/SparseArray;
      33: ifnonnull     47
      36: aload_0
      37: new           #191                // class android/util/SparseArray
      40: dup
      41: invokespecial #1484               // Method android/util/SparseArray."<init>":()V
      44: putfield      #189                // Field f:Landroid/util/SparseArray;
      47: aload_0
      48: getfield      #189                // Field f:Landroid/util/SparseArray;
      51: aload_1
      52: getfield      #764                // Field android/support/v4/app/i.mIndex:I
      55: aload_1
      56: invokevirtual #959                // Method android/util/SparseArray.put:(ILjava/lang/Object;)V
      59: getstatic     #738                // Field a:Z
      62: ifeq          98
      65: new           #718                // class java/lang/StringBuilder
      68: dup
      69: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      72: astore_3
      73: aload_3
      74: ldc_w         #1486               // String Allocated fragment index
      77: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      80: pop
      81: aload_3
      82: aload_1
      83: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      86: pop
      87: ldc_w         #348                // String FragmentManager
      90: aload_3
      91: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      94: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      97: pop
      98: return

  void g(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1231               // Method g:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1488               // Method android/support/v4/app/n$a.f:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  public boolean g();
    Code:
       0: aload_0
       1: iconst_1
       2: invokespecial #628                // Method c:(Z)V
       5: iconst_0
       6: istore_1
       7: aload_0
       8: aload_0
       9: getfield      #181                // Field x:Ljava/util/ArrayList;
      12: aload_0
      13: getfield      #176                // Field y:Ljava/util/ArrayList;
      16: invokespecial #1490               // Method c:(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
      19: ifeq          55
      22: aload_0
      23: iconst_1
      24: putfield      #174                // Field c:Z
      27: aload_0
      28: aload_0
      29: getfield      #181                // Field x:Ljava/util/ArrayList;
      32: aload_0
      33: getfield      #176                // Field y:Ljava/util/ArrayList;
      36: invokespecial #640                // Method b:(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      39: aload_0
      40: invokespecial #642                // Method B:()V
      43: iconst_1
      44: istore_1
      45: goto          7
      48: astore_2
      49: aload_0
      50: invokespecial #642                // Method B:()V
      53: aload_2
      54: athrow
      55: aload_0
      56: invokevirtual #644                // Method h:()V
      59: aload_0
      60: invokespecial #646                // Method E:()V
      63: iload_1
      64: ireturn
    Exception table:
       from    to  target type
          27    39    48   any

  void h();
    Code:
       0: aload_0
       1: getfield      #1400               // Field w:Z
       4: ifeq          16
       7: aload_0
       8: iconst_0
       9: putfield      #1400               // Field w:Z
      12: aload_0
      13: invokevirtual #881                // Method f:()V
      16: return

  void h(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #764                // Field android/support/v4/app/i.mIndex:I
       4: ifge          8
       7: return
       8: getstatic     #738                // Field a:Z
      11: ifeq          47
      14: new           #718                // class java/lang/StringBuilder
      17: dup
      18: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      21: astore_2
      22: aload_2
      23: ldc_w         #1492               // String Freeing fragment index
      26: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_2
      31: aload_1
      32: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      35: pop
      36: ldc_w         #348                // String FragmentManager
      39: aload_2
      40: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      46: pop
      47: aload_0
      48: getfield      #189                // Field f:Landroid/util/SparseArray;
      51: aload_1
      52: getfield      #764                // Field android/support/v4/app/i.mIndex:I
      55: aconst_null
      56: invokevirtual #959                // Method android/util/SparseArray.put:(ILjava/lang/Object;)V
      59: aload_1
      60: invokevirtual #1495               // Method android/support/v4/app/i.initState:()V
      63: return

  void h(android.support.v4.app.i, boolean);
    Code:
       0: aload_0
       1: getfield      #949                // Field o:Landroid/support/v4/app/i;
       4: ifnull        31
       7: aload_0
       8: getfield      #949                // Field o:Landroid/support/v4/app/i;
      11: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      14: astore_3
      15: aload_3
      16: instanceof    #2                  // class android/support/v4/app/o
      19: ifeq          31
      22: aload_3
      23: checkcast     #2                  // class android/support/v4/app/o
      26: aload_1
      27: iconst_1
      28: invokevirtual #1236               // Method h:(Landroid/support/v4/app/i;Z)V
      31: aload_0
      32: getfield      #132                // Field J:Ljava/util/concurrent/CopyOnWriteArrayList;
      35: invokevirtual #1250               // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      38: astore_3
      39: aload_3
      40: invokeinterface #465,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      45: ifeq          93
      48: aload_3
      49: invokeinterface #469,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #1252               // class android/support/v4/g/j
      57: astore        4
      59: iload_2
      60: ifeq          77
      63: aload         4
      65: getfield      #1255               // Field android/support/v4/g/j.b:Ljava/lang/Object;
      68: checkcast     #250                // class java/lang/Boolean
      71: invokevirtual #253                // Method java/lang/Boolean.booleanValue:()Z
      74: ifeq          39
      77: aload         4
      79: getfield      #1257               // Field android/support/v4/g/j.a:Ljava/lang/Object;
      82: checkcast     #1259               // class android/support/v4/app/n$a
      85: aload_0
      86: aload_1
      87: invokevirtual #1497               // Method android/support/v4/app/n$a.g:(Landroid/support/v4/app/n;Landroid/support/v4/app/i;)V
      90: goto          39
      93: return

  void i();
    Code:
       0: aload_0
       1: getfield      #1499               // Field k:Ljava/util/ArrayList;
       4: ifnull        43
       7: iconst_0
       8: istore_1
       9: iload_1
      10: aload_0
      11: getfield      #1499               // Field k:Ljava/util/ArrayList;
      14: invokevirtual #155                // Method java/util/ArrayList.size:()I
      17: if_icmpge     43
      20: aload_0
      21: getfield      #1499               // Field k:Ljava/util/ArrayList;
      24: iload_1
      25: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #1501               // class android/support/v4/app/n$b
      31: invokeinterface #1503,  1         // InterfaceMethod android/support/v4/app/n$b.a:()V
      36: iload_1
      37: iconst_1
      38: iadd
      39: istore_1
      40: goto          9
      43: return

  public void i(android.support.v4.app.i);
    Code:
       0: getstatic     #738                // Field a:Z
       3: ifeq          56
       6: new           #718                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      13: astore_3
      14: aload_3
      15: ldc_w         #1505               // String remove:
      18: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_3
      23: aload_1
      24: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: aload_3
      29: ldc_w         #1507               // String  nesting=
      32: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      35: pop
      36: aload_3
      37: aload_1
      38: getfield      #917                // Field android/support/v4/app/i.mBackStackNesting:I
      41: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      44: pop
      45: ldc_w         #348                // String FragmentManager
      48: aload_3
      49: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      52: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      55: pop
      56: aload_1
      57: invokevirtual #1010               // Method android/support/v4/app/i.isInBackStack:()Z
      60: istore_2
      61: aload_1
      62: getfield      #880                // Field android/support/v4/app/i.mDetached:Z
      65: ifeq          74
      68: iload_2
      69: iconst_1
      70: ixor
      71: ifeq          121
      74: aload_0
      75: getfield      #127                // Field e:Ljava/util/ArrayList;
      78: astore_3
      79: aload_3
      80: monitorenter
      81: aload_0
      82: getfield      #127                // Field e:Ljava/util/ArrayList;
      85: aload_1
      86: invokevirtual #1509               // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      89: pop
      90: aload_3
      91: monitorexit
      92: aload_1
      93: getfield      #1280               // Field android/support/v4/app/i.mHasMenu:Z
      96: ifeq          111
      99: aload_1
     100: getfield      #1283               // Field android/support/v4/app/i.mMenuVisible:Z
     103: ifeq          111
     106: aload_0
     107: iconst_1
     108: putfield      #883                // Field r:Z
     111: aload_1
     112: iconst_0
     113: putfield      #484                // Field android/support/v4/app/i.mAdded:Z
     116: aload_1
     117: iconst_1
     118: putfield      #877                // Field android/support/v4/app/i.mRemoving:Z
     121: return
     122: astore_1
     123: aload_3
     124: monitorexit
     125: aload_1
     126: athrow
    Exception table:
       from    to  target type
          81    92   122   any
         123   125   122   any

  android.support.v4.app.p j();
    Code:
       0: aload_0
       1: getfield      #1512               // Field D:Landroid/support/v4/app/p;
       4: invokestatic  #476                // Method a:(Landroid/support/v4/app/p;)V
       7: aload_0
       8: getfield      #1512               // Field D:Landroid/support/v4/app/p;
      11: areturn

  public void j(android.support.v4.app.i);
    Code:
       0: getstatic     #738                // Field a:Z
       3: ifeq          39
       6: new           #718                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc_w         #1514               // String hide:
      18: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_2
      23: aload_1
      24: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc_w         #348                // String FragmentManager
      31: aload_2
      32: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      38: pop
      39: aload_1
      40: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
      43: ifne          61
      46: aload_1
      47: iconst_1
      48: putfield      #665                // Field android/support/v4/app/i.mHidden:Z
      51: aload_1
      52: iconst_1
      53: aload_1
      54: getfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
      57: ixor
      58: putfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
      61: return

  void k();
    Code:
       0: aload_0
       1: getfield      #189                // Field f:Landroid/util/SparseArray;
       4: ifnull        401
       7: aconst_null
       8: astore_3
       9: aload_3
      10: astore        5
      12: aload         5
      14: astore        4
      16: iconst_0
      17: istore_1
      18: aload_3
      19: astore        8
      21: aload         5
      23: astore        7
      25: aload         4
      27: astore        6
      29: iload_1
      30: aload_0
      31: getfield      #189                // Field f:Landroid/util/SparseArray;
      34: invokevirtual #192                // Method android/util/SparseArray.size:()I
      37: if_icmpge     413
      40: aload_0
      41: getfield      #189                // Field f:Landroid/util/SparseArray;
      44: iload_1
      45: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      48: checkcast     #197                // class android/support/v4/app/i
      51: astore        10
      53: aload_3
      54: astore        7
      56: aload         5
      58: astore        8
      60: aload         4
      62: astore        9
      64: aload         10
      66: ifnull        383
      69: aload_3
      70: astore        6
      72: aload         10
      74: getfield      #1517               // Field android/support/v4/app/i.mRetainInstance:Z
      77: ifeq          180
      80: aload_3
      81: astore        7
      83: aload_3
      84: ifnonnull     96
      87: new           #124                // class java/util/ArrayList
      90: dup
      91: invokespecial #125                // Method java/util/ArrayList."<init>":()V
      94: astore        7
      96: aload         7
      98: aload         10
     100: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     103: pop
     104: aload         10
     106: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     109: ifnull        124
     112: aload         10
     114: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     117: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     120: istore_2
     121: goto          126
     124: iconst_m1
     125: istore_2
     126: aload         10
     128: iload_2
     129: putfield      #962                // Field android/support/v4/app/i.mTargetIndex:I
     132: aload         7
     134: astore        6
     136: getstatic     #738                // Field a:Z
     139: ifeq          180
     142: new           #718                // class java/lang/StringBuilder
     145: dup
     146: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     149: astore_3
     150: aload_3
     151: ldc_w         #1519               // String retainNonConfig: keeping retained
     154: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     157: pop
     158: aload_3
     159: aload         10
     161: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     164: pop
     165: ldc_w         #348                // String FragmentManager
     168: aload_3
     169: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     172: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     175: pop
     176: aload         7
     178: astore        6
     180: aload         10
     182: getfield      #1050               // Field android/support/v4/app/i.mChildFragmentManager:Landroid/support/v4/app/o;
     185: ifnull        209
     188: aload         10
     190: getfield      #1050               // Field android/support/v4/app/i.mChildFragmentManager:Landroid/support/v4/app/o;
     193: invokevirtual #1521               // Method k:()V
     196: aload         10
     198: getfield      #1050               // Field android/support/v4/app/i.mChildFragmentManager:Landroid/support/v4/app/o;
     201: getfield      #1512               // Field D:Landroid/support/v4/app/p;
     204: astore        7
     206: goto          216
     209: aload         10
     211: getfield      #1524               // Field android/support/v4/app/i.mChildNonConfig:Landroid/support/v4/app/p;
     214: astore        7
     216: aload         5
     218: astore_3
     219: aload         5
     221: ifnonnull     272
     224: aload         5
     226: astore_3
     227: aload         7
     229: ifnull        272
     232: new           #124                // class java/util/ArrayList
     235: dup
     236: aload_0
     237: getfield      #189                // Field f:Landroid/util/SparseArray;
     240: invokevirtual #192                // Method android/util/SparseArray.size:()I
     243: invokespecial #356                // Method java/util/ArrayList."<init>":(I)V
     246: astore        5
     248: iconst_0
     249: istore_2
     250: aload         5
     252: astore_3
     253: iload_2
     254: iload_1
     255: if_icmpge     272
     258: aload         5
     260: aconst_null
     261: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     264: pop
     265: iload_2
     266: iconst_1
     267: iadd
     268: istore_2
     269: goto          250
     272: aload_3
     273: ifnull        283
     276: aload_3
     277: aload         7
     279: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     282: pop
     283: aload         4
     285: astore        5
     287: aload         4
     289: ifnonnull     345
     292: aload         4
     294: astore        5
     296: aload         10
     298: getfield      #1528               // Field android/support/v4/app/i.mViewModelStore:Landroid/arch/lifecycle/p;
     301: ifnull        345
     304: new           #124                // class java/util/ArrayList
     307: dup
     308: aload_0
     309: getfield      #189                // Field f:Landroid/util/SparseArray;
     312: invokevirtual #192                // Method android/util/SparseArray.size:()I
     315: invokespecial #356                // Method java/util/ArrayList."<init>":(I)V
     318: astore        4
     320: iconst_0
     321: istore_2
     322: aload         4
     324: astore        5
     326: iload_2
     327: iload_1
     328: if_icmpge     345
     331: aload         4
     333: aconst_null
     334: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     337: pop
     338: iload_2
     339: iconst_1
     340: iadd
     341: istore_2
     342: goto          322
     345: aload         6
     347: astore        7
     349: aload_3
     350: astore        8
     352: aload         5
     354: astore        9
     356: aload         5
     358: ifnull        383
     361: aload         5
     363: aload         10
     365: getfield      #1528               // Field android/support/v4/app/i.mViewModelStore:Landroid/arch/lifecycle/p;
     368: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     371: pop
     372: aload         5
     374: astore        9
     376: aload_3
     377: astore        8
     379: aload         6
     381: astore        7
     383: iload_1
     384: iconst_1
     385: iadd
     386: istore_1
     387: aload         7
     389: astore_3
     390: aload         8
     392: astore        5
     394: aload         9
     396: astore        4
     398: goto          18
     401: aconst_null
     402: astore        8
     404: aload         8
     406: astore_3
     407: aload_3
     408: astore        6
     410: aload_3
     411: astore        7
     413: aload         8
     415: ifnonnull     434
     418: aload         7
     420: ifnonnull     434
     423: aload         6
     425: ifnonnull     434
     428: aload_0
     429: aconst_null
     430: putfield      #1512               // Field D:Landroid/support/v4/app/p;
     433: return
     434: aload_0
     435: new           #451                // class android/support/v4/app/p
     438: dup
     439: aload         8
     441: aload         7
     443: aload         6
     445: invokespecial #1531               // Method android/support/v4/app/p."<init>":(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
     448: putfield      #1512               // Field D:Landroid/support/v4/app/p;
     451: return

  public void k(android.support.v4.app.i);
    Code:
       0: getstatic     #738                // Field a:Z
       3: ifeq          39
       6: new           #718                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc_w         #1533               // String show:
      18: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_2
      23: aload_1
      24: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc_w         #348                // String FragmentManager
      31: aload_2
      32: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      38: pop
      39: aload_1
      40: getfield      #665                // Field android/support/v4/app/i.mHidden:Z
      43: ifeq          61
      46: aload_1
      47: iconst_0
      48: putfield      #665                // Field android/support/v4/app/i.mHidden:Z
      51: aload_1
      52: aload_1
      53: getfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
      56: iconst_1
      57: ixor
      58: putfield      #1277               // Field android/support/v4/app/i.mHiddenChanged:Z
      61: return

  android.os.Parcelable l();
    Code:
       0: aload_0
       1: invokespecial #1416               // Method C:()V
       4: aload_0
       5: invokespecial #1536               // Method D:()V
       8: aload_0
       9: invokevirtual #626                // Method g:()Z
      12: pop
      13: aload_0
      14: iconst_1
      15: putfield      #1356               // Field s:Z
      18: aconst_null
      19: astore        7
      21: aload_0
      22: aconst_null
      23: putfield      #1512               // Field D:Landroid/support/v4/app/p;
      26: aload_0
      27: getfield      #189                // Field f:Landroid/util/SparseArray;
      30: ifnull        855
      33: aload_0
      34: getfield      #189                // Field f:Landroid/util/SparseArray;
      37: invokevirtual #192                // Method android/util/SparseArray.size:()I
      40: ifgt          45
      43: aconst_null
      44: areturn
      45: aload_0
      46: getfield      #189                // Field f:Landroid/util/SparseArray;
      49: invokevirtual #192                // Method android/util/SparseArray.size:()I
      52: istore        4
      54: iload         4
      56: anewarray     #905                // class android/support/v4/app/s
      59: astore        8
      61: iconst_0
      62: istore_3
      63: iconst_0
      64: istore_1
      65: iconst_0
      66: istore_2
      67: iload_1
      68: iload         4
      70: if_icmpge     433
      73: aload_0
      74: getfield      #189                // Field f:Landroid/util/SparseArray;
      77: iload_1
      78: invokevirtual #195                // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      81: checkcast     #197                // class android/support/v4/app/i
      84: astore        5
      86: aload         5
      88: ifnull        426
      91: aload         5
      93: getfield      #764                // Field android/support/v4/app/i.mIndex:I
      96: ifge          161
      99: new           #718                // class java/lang/StringBuilder
     102: dup
     103: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     106: astore        6
     108: aload         6
     110: ldc_w         #1538               // String Failure saving state: active
     113: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     116: pop
     117: aload         6
     119: aload         5
     121: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     124: pop
     125: aload         6
     127: ldc_w         #1540               // String  has cleared index:
     130: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     133: pop
     134: aload         6
     136: aload         5
     138: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     141: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     144: pop
     145: aload_0
     146: new           #683                // class java/lang/IllegalStateException
     149: dup
     150: aload         6
     152: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     155: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     158: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
     161: new           #905                // class android/support/v4/app/s
     164: dup
     165: aload         5
     167: invokespecial #1542               // Method android/support/v4/app/s."<init>":(Landroid/support/v4/app/i;)V
     170: astore        6
     172: aload         8
     174: iload_1
     175: aload         6
     177: aastore
     178: aload         5
     180: getfield      #656                // Field android/support/v4/app/i.mState:I
     183: ifle          350
     186: aload         6
     188: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     191: ifnonnull     350
     194: aload         6
     196: aload_0
     197: aload         5
     199: invokevirtual #773                // Method o:(Landroid/support/v4/app/i;)Landroid/os/Bundle;
     202: putfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     205: aload         5
     207: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     210: ifnull        360
     213: aload         5
     215: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     218: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     221: ifge          286
     224: new           #718                // class java/lang/StringBuilder
     227: dup
     228: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     231: astore        9
     233: aload         9
     235: ldc_w         #1544               // String Failure saving state:
     238: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     241: pop
     242: aload         9
     244: aload         5
     246: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     249: pop
     250: aload         9
     252: ldc_w         #1546               // String  has target not in fragment manager:
     255: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     258: pop
     259: aload         9
     261: aload         5
     263: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     266: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     269: pop
     270: aload_0
     271: new           #683                // class java/lang/IllegalStateException
     274: dup
     275: aload         9
     277: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     280: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     283: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
     286: aload         6
     288: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     291: ifnonnull     306
     294: aload         6
     296: new           #781                // class android/os/Bundle
     299: dup
     300: invokespecial #1547               // Method android/os/Bundle."<init>":()V
     303: putfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     306: aload_0
     307: aload         6
     309: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     312: ldc_w         #1020               // String android:target_state
     315: aload         5
     317: getfield      #923                // Field android/support/v4/app/i.mTarget:Landroid/support/v4/app/i;
     320: invokevirtual #1549               // Method a:(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/i;)V
     323: aload         5
     325: getfield      #1027               // Field android/support/v4/app/i.mTargetRequestCode:I
     328: ifeq          360
     331: aload         6
     333: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     336: ldc_w         #1024               // String android:target_req_state
     339: aload         5
     341: getfield      #1027               // Field android/support/v4/app/i.mTargetRequestCode:I
     344: invokevirtual #893                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
     347: goto          360
     350: aload         6
     352: aload         5
     354: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     357: putfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     360: getstatic     #738                // Field a:Z
     363: ifeq          424
     366: new           #718                // class java/lang/StringBuilder
     369: dup
     370: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     373: astore        9
     375: aload         9
     377: ldc_w         #1551               // String Saved state of
     380: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     383: pop
     384: aload         9
     386: aload         5
     388: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     391: pop
     392: aload         9
     394: ldc_w         #956                // String :
     397: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     400: pop
     401: aload         9
     403: aload         6
     405: getfield      #925                // Field android/support/v4/app/s.k:Landroid/os/Bundle;
     408: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     411: pop
     412: ldc_w         #348                // String FragmentManager
     415: aload         9
     417: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     420: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     423: pop
     424: iconst_1
     425: istore_2
     426: iload_1
     427: iconst_1
     428: iadd
     429: istore_1
     430: goto          67
     433: iload_2
     434: ifne          455
     437: getstatic     #738                // Field a:Z
     440: ifeq          453
     443: ldc_w         #348                // String FragmentManager
     446: ldc_w         #1553               // String saveAllState: no fragments!
     449: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     452: pop
     453: aconst_null
     454: areturn
     455: aload_0
     456: getfield      #127                // Field e:Ljava/util/ArrayList;
     459: invokevirtual #155                // Method java/util/ArrayList.size:()I
     462: istore_2
     463: iload_2
     464: ifle          648
     467: iload_2
     468: newarray       int
     470: astore        6
     472: iconst_0
     473: istore_1
     474: aload         6
     476: astore        5
     478: iload_1
     479: iload_2
     480: if_icmpge     651
     483: aload         6
     485: iload_1
     486: aload_0
     487: getfield      #127                // Field e:Ljava/util/ArrayList;
     490: iload_1
     491: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     494: checkcast     #197                // class android/support/v4/app/i
     497: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     500: iastore
     501: aload         6
     503: iload_1
     504: iaload
     505: ifge          575
     508: new           #718                // class java/lang/StringBuilder
     511: dup
     512: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     515: astore        5
     517: aload         5
     519: ldc_w         #1538               // String Failure saving state: active
     522: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     525: pop
     526: aload         5
     528: aload_0
     529: getfield      #127                // Field e:Ljava/util/ArrayList;
     532: iload_1
     533: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     536: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     539: pop
     540: aload         5
     542: ldc_w         #1540               // String  has cleared index:
     545: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     548: pop
     549: aload         5
     551: aload         6
     553: iload_1
     554: iaload
     555: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     558: pop
     559: aload_0
     560: new           #683                // class java/lang/IllegalStateException
     563: dup
     564: aload         5
     566: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     569: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     572: invokespecial #770                // Method a:(Ljava/lang/RuntimeException;)V
     575: getstatic     #738                // Field a:Z
     578: ifeq          641
     581: new           #718                // class java/lang/StringBuilder
     584: dup
     585: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     588: astore        5
     590: aload         5
     592: ldc_w         #1555               // String saveAllState: adding fragment #
     595: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     598: pop
     599: aload         5
     601: iload_1
     602: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     605: pop
     606: aload         5
     608: ldc_w         #956                // String :
     611: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     614: pop
     615: aload         5
     617: aload_0
     618: getfield      #127                // Field e:Ljava/util/ArrayList;
     621: iload_1
     622: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     625: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     628: pop
     629: ldc_w         #348                // String FragmentManager
     632: aload         5
     634: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     637: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     640: pop
     641: iload_1
     642: iconst_1
     643: iadd
     644: istore_1
     645: goto          474
     648: aconst_null
     649: astore        5
     651: aload         7
     653: astore        6
     655: aload_0
     656: getfield      #985                // Field g:Ljava/util/ArrayList;
     659: ifnull        790
     662: aload_0
     663: getfield      #985                // Field g:Ljava/util/ArrayList;
     666: invokevirtual #155                // Method java/util/ArrayList.size:()I
     669: istore_2
     670: aload         7
     672: astore        6
     674: iload_2
     675: ifle          790
     678: iload_2
     679: anewarray     #987                // class android/support/v4/app/d
     682: astore        7
     684: iload_3
     685: istore_1
     686: aload         7
     688: astore        6
     690: iload_1
     691: iload_2
     692: if_icmpge     790
     695: aload         7
     697: iload_1
     698: new           #987                // class android/support/v4/app/d
     701: dup
     702: aload_0
     703: getfield      #985                // Field g:Ljava/util/ArrayList;
     706: iload_1
     707: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     710: checkcast     #248                // class android/support/v4/app/c
     713: invokespecial #1557               // Method android/support/v4/app/d."<init>":(Landroid/support/v4/app/c;)V
     716: aastore
     717: getstatic     #738                // Field a:Z
     720: ifeq          783
     723: new           #718                // class java/lang/StringBuilder
     726: dup
     727: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     730: astore        6
     732: aload         6
     734: ldc_w         #1559               // String saveAllState: adding back stack #
     737: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     740: pop
     741: aload         6
     743: iload_1
     744: invokevirtual #743                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     747: pop
     748: aload         6
     750: ldc_w         #956                // String :
     753: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     756: pop
     757: aload         6
     759: aload_0
     760: getfield      #985                // Field g:Ljava/util/ArrayList;
     763: iload_1
     764: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     767: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     770: pop
     771: ldc_w         #348                // String FragmentManager
     774: aload         6
     776: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     779: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     782: pop
     783: iload_1
     784: iconst_1
     785: iadd
     786: istore_1
     787: goto          686
     790: new           #896                // class android/support/v4/app/q
     793: dup
     794: invokespecial #1560               // Method android/support/v4/app/q."<init>":()V
     797: astore        7
     799: aload         7
     801: aload         8
     803: putfield      #899                // Field android/support/v4/app/q.a:[Landroid/support/v4/app/s;
     806: aload         7
     808: aload         5
     810: putfield      #971                // Field android/support/v4/app/q.b:[I
     813: aload         7
     815: aload         6
     817: putfield      #983                // Field android/support/v4/app/q.c:[Landroid/support/v4/app/d;
     820: aload_0
     821: getfield      #630                // Field p:Landroid/support/v4/app/i;
     824: ifnull        839
     827: aload         7
     829: aload_0
     830: getfield      #630                // Field p:Landroid/support/v4/app/i;
     833: getfield      #764                // Field android/support/v4/app/i.mIndex:I
     836: putfield      #1005               // Field android/support/v4/app/q.d:I
     839: aload         7
     841: aload_0
     842: getfield      #122                // Field d:I
     845: putfield      #1007               // Field android/support/v4/app/q.e:I
     848: aload_0
     849: invokevirtual #1521               // Method k:()V
     852: aload         7
     854: areturn
     855: aconst_null
     856: areturn

  public void l(android.support.v4.app.i);
    Code:
       0: getstatic     #738                // Field a:Z
       3: ifeq          39
       6: new           #718                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc_w         #1562               // String detach:
      18: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_2
      23: aload_1
      24: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc_w         #348                // String FragmentManager
      31: aload_2
      32: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      38: pop
      39: aload_1
      40: getfield      #880                // Field android/support/v4/app/i.mDetached:Z
      43: ifne          145
      46: aload_1
      47: iconst_1
      48: putfield      #880                // Field android/support/v4/app/i.mDetached:Z
      51: aload_1
      52: getfield      #484                // Field android/support/v4/app/i.mAdded:Z
      55: ifeq          145
      58: getstatic     #738                // Field a:Z
      61: ifeq          97
      64: new           #718                // class java/lang/StringBuilder
      67: dup
      68: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      71: astore_2
      72: aload_2
      73: ldc_w         #1564               // String remove from detach:
      76: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: aload_2
      81: aload_1
      82: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      85: pop
      86: ldc_w         #348                // String FragmentManager
      89: aload_2
      90: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      93: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      96: pop
      97: aload_0
      98: getfield      #127                // Field e:Ljava/util/ArrayList;
     101: astore_2
     102: aload_2
     103: monitorenter
     104: aload_0
     105: getfield      #127                // Field e:Ljava/util/ArrayList;
     108: aload_1
     109: invokevirtual #1509               // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     112: pop
     113: aload_2
     114: monitorexit
     115: aload_1
     116: getfield      #1280               // Field android/support/v4/app/i.mHasMenu:Z
     119: ifeq          134
     122: aload_1
     123: getfield      #1283               // Field android/support/v4/app/i.mMenuVisible:Z
     126: ifeq          134
     129: aload_0
     130: iconst_1
     131: putfield      #883                // Field r:Z
     134: aload_1
     135: iconst_0
     136: putfield      #484                // Field android/support/v4/app/i.mAdded:Z
     139: return
     140: astore_1
     141: aload_2
     142: monitorexit
     143: aload_1
     144: athrow
     145: return
    Exception table:
       from    to  target type
         104   115   140   any
         141   143   140   any

  public void m();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #1512               // Field D:Landroid/support/v4/app/p;
       5: iconst_0
       6: istore_1
       7: aload_0
       8: iconst_0
       9: putfield      #1356               // Field s:Z
      12: aload_0
      13: iconst_0
      14: putfield      #1361               // Field t:Z
      17: aload_0
      18: getfield      #127                // Field e:Ljava/util/ArrayList;
      21: invokevirtual #155                // Method java/util/ArrayList.size:()I
      24: istore_2
      25: iload_1
      26: iload_2
      27: if_icmpge     57
      30: aload_0
      31: getfield      #127                // Field e:Ljava/util/ArrayList;
      34: iload_1
      35: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      38: checkcast     #197                // class android/support/v4/app/i
      41: astore_3
      42: aload_3
      43: ifnull        50
      46: aload_3
      47: invokevirtual #1567               // Method android/support/v4/app/i.noteStateNotSaved:()V
      50: iload_1
      51: iconst_1
      52: iadd
      53: istore_1
      54: goto          25
      57: return

  public void m(android.support.v4.app.i);
    Code:
       0: getstatic     #738                // Field a:Z
       3: ifeq          39
       6: new           #718                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc_w         #1569               // String attach:
      18: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_2
      23: aload_1
      24: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc_w         #348                // String FragmentManager
      31: aload_2
      32: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      38: pop
      39: aload_1
      40: getfield      #880                // Field android/support/v4/app/i.mDetached:Z
      43: ifeq          190
      46: aload_1
      47: iconst_0
      48: putfield      #880                // Field android/support/v4/app/i.mDetached:Z
      51: aload_1
      52: getfield      #484                // Field android/support/v4/app/i.mAdded:Z
      55: ifne          190
      58: aload_0
      59: getfield      #127                // Field e:Ljava/util/ArrayList;
      62: aload_1
      63: invokevirtual #978                // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      66: ifeq          103
      69: new           #718                // class java/lang/StringBuilder
      72: dup
      73: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      76: astore_2
      77: aload_2
      78: ldc_w         #1274               // String Fragment already added:
      81: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      84: pop
      85: aload_2
      86: aload_1
      87: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      90: pop
      91: new           #683                // class java/lang/IllegalStateException
      94: dup
      95: aload_2
      96: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      99: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     102: athrow
     103: getstatic     #738                // Field a:Z
     106: ifeq          142
     109: new           #718                // class java/lang/StringBuilder
     112: dup
     113: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     116: astore_2
     117: aload_2
     118: ldc_w         #1571               // String add from attach:
     121: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     124: pop
     125: aload_2
     126: aload_1
     127: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     130: pop
     131: ldc_w         #348                // String FragmentManager
     134: aload_2
     135: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     138: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     141: pop
     142: aload_0
     143: getfield      #127                // Field e:Ljava/util/ArrayList;
     146: astore_2
     147: aload_2
     148: monitorenter
     149: aload_0
     150: getfield      #127                // Field e:Ljava/util/ArrayList;
     153: aload_1
     154: invokevirtual #265                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     157: pop
     158: aload_2
     159: monitorexit
     160: aload_1
     161: iconst_1
     162: putfield      #484                // Field android/support/v4/app/i.mAdded:Z
     165: aload_1
     166: getfield      #1280               // Field android/support/v4/app/i.mHasMenu:Z
     169: ifeq          190
     172: aload_1
     173: getfield      #1283               // Field android/support/v4/app/i.mMenuVisible:Z
     176: ifeq          190
     179: aload_0
     180: iconst_1
     181: putfield      #883                // Field r:Z
     184: return
     185: astore_1
     186: aload_2
     187: monitorexit
     188: aload_1
     189: athrow
     190: return
    Exception table:
       from    to  target type
         149   160   185   any
         186   188   185   any

  public void n();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #1356               // Field s:Z
       5: aload_0
       6: iconst_0
       7: putfield      #1361               // Field t:Z
      10: aload_0
      11: iconst_1
      12: invokespecial #1573               // Method e:(I)V
      15: return

  void n(android.support.v4.app.i);
    Code:
       0: aload_1
       1: getfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
       4: ifnonnull     8
       7: return
       8: aload_0
       9: getfield      #138                // Field B:Landroid/util/SparseArray;
      12: ifnonnull     29
      15: aload_0
      16: new           #191                // class android/util/SparseArray
      19: dup
      20: invokespecial #1484               // Method android/util/SparseArray."<init>":()V
      23: putfield      #138                // Field B:Landroid/util/SparseArray;
      26: goto          36
      29: aload_0
      30: getfield      #138                // Field B:Landroid/util/SparseArray;
      33: invokevirtual #1574               // Method android/util/SparseArray.clear:()V
      36: aload_1
      37: getfield      #1138               // Field android/support/v4/app/i.mInnerView:Landroid/view/View;
      40: aload_0
      41: getfield      #138                // Field B:Landroid/util/SparseArray;
      44: invokevirtual #1578               // Method android/view/View.saveHierarchyState:(Landroid/util/SparseArray;)V
      47: aload_0
      48: getfield      #138                // Field B:Landroid/util/SparseArray;
      51: invokevirtual #192                // Method android/util/SparseArray.size:()I
      54: ifle          70
      57: aload_1
      58: aload_0
      59: getfield      #138                // Field B:Landroid/util/SparseArray;
      62: putfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
      65: aload_0
      66: aconst_null
      67: putfield      #138                // Field B:Landroid/util/SparseArray;
      70: return

  android.os.Bundle o(android.support.v4.app.i);
    Code:
       0: aload_0
       1: getfield      #136                // Field A:Landroid/os/Bundle;
       4: ifnonnull     18
       7: aload_0
       8: new           #781                // class android/os/Bundle
      11: dup
      12: invokespecial #1547               // Method android/os/Bundle."<init>":()V
      15: putfield      #136                // Field A:Landroid/os/Bundle;
      18: aload_1
      19: aload_0
      20: getfield      #136                // Field A:Landroid/os/Bundle;
      23: invokevirtual #1581               // Method android/support/v4/app/i.performSaveInstanceState:(Landroid/os/Bundle;)V
      26: aload_0
      27: aload_1
      28: aload_0
      29: getfield      #136                // Field A:Landroid/os/Bundle;
      32: iconst_0
      33: invokevirtual #1442               // Method d:(Landroid/support/v4/app/i;Landroid/os/Bundle;Z)V
      36: aload_0
      37: getfield      #136                // Field A:Landroid/os/Bundle;
      40: invokevirtual #1582               // Method android/os/Bundle.isEmpty:()Z
      43: ifne          59
      46: aload_0
      47: getfield      #136                // Field A:Landroid/os/Bundle;
      50: astore_3
      51: aload_0
      52: aconst_null
      53: putfield      #136                // Field A:Landroid/os/Bundle;
      56: goto          61
      59: aconst_null
      60: astore_3
      61: aload_1
      62: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
      65: ifnull        73
      68: aload_0
      69: aload_1
      70: invokevirtual #1206               // Method n:(Landroid/support/v4/app/i;)V
      73: aload_3
      74: astore_2
      75: aload_1
      76: getfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
      79: ifnull        107
      82: aload_3
      83: astore_2
      84: aload_3
      85: ifnonnull     96
      88: new           #781                // class android/os/Bundle
      91: dup
      92: invokespecial #1547               // Method android/os/Bundle."<init>":()V
      95: astore_2
      96: aload_2
      97: ldc_w         #935                // String android:view_state
     100: aload_1
     101: getfield      #914                // Field android/support/v4/app/i.mSavedViewState:Landroid/util/SparseArray;
     104: invokevirtual #1586               // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
     107: aload_2
     108: astore_3
     109: aload_1
     110: getfield      #1034               // Field android/support/v4/app/i.mUserVisibleHint:Z
     113: ifne          141
     116: aload_2
     117: astore_3
     118: aload_2
     119: ifnonnull     130
     122: new           #781                // class android/os/Bundle
     125: dup
     126: invokespecial #1547               // Method android/os/Bundle."<init>":()V
     129: astore_3
     130: aload_3
     131: ldc_w         #1036               // String android:user_visible_hint
     134: aload_1
     135: getfield      #1034               // Field android/support/v4/app/i.mUserVisibleHint:Z
     138: invokevirtual #1590               // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     141: aload_3
     142: areturn

  public void o();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #1356               // Field s:Z
       5: aload_0
       6: iconst_0
       7: putfield      #1361               // Field t:Z
      10: aload_0
      11: iconst_2
      12: invokespecial #1573               // Method e:(I)V
      15: return

  public android.view.View onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: ldc_w         #1594               // String fragment
       3: aload_2
       4: invokevirtual #594                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       7: ifne          12
      10: aconst_null
      11: areturn
      12: aload         4
      14: aconst_null
      15: ldc_w         #1596               // String class
      18: invokeinterface #1602,  3         // InterfaceMethod android/util/AttributeSet.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      23: astore_2
      24: aload_3
      25: aload         4
      27: getstatic     #1604               // Field android/support/v4/app/o$f.a:[I
      30: invokevirtual #1608               // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      33: astore        10
      35: iconst_0
      36: istore        5
      38: aload_2
      39: astore        8
      41: aload_2
      42: ifnonnull     53
      45: aload         10
      47: iconst_0
      48: invokevirtual #1613               // Method android/content/res/TypedArray.getString:(I)Ljava/lang/String;
      51: astore        8
      53: aload         10
      55: iconst_1
      56: iconst_m1
      57: invokevirtual #1616               // Method android/content/res/TypedArray.getResourceId:(II)I
      60: istore        7
      62: aload         10
      64: iconst_2
      65: invokevirtual #1613               // Method android/content/res/TypedArray.getString:(I)Ljava/lang/String;
      68: astore        9
      70: aload         10
      72: invokevirtual #1619               // Method android/content/res/TypedArray.recycle:()V
      75: aload_0
      76: getfield      #157                // Field m:Landroid/support/v4/app/m;
      79: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
      82: aload         8
      84: invokestatic  #1623               // Method android/support/v4/app/i.isSupportFragmentClass:(Landroid/content/Context;Ljava/lang/String;)Z
      87: ifne          92
      90: aconst_null
      91: areturn
      92: aload_1
      93: ifnull        102
      96: aload_1
      97: invokevirtual #1626               // Method android/view/View.getId:()I
     100: istore        5
     102: iload         5
     104: iconst_m1
     105: if_icmpne     166
     108: iload         7
     110: iconst_m1
     111: if_icmpne     166
     114: aload         9
     116: ifnonnull     166
     119: new           #718                // class java/lang/StringBuilder
     122: dup
     123: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     126: astore_1
     127: aload_1
     128: aload         4
     130: invokeinterface #1629,  1         // InterfaceMethod android/util/AttributeSet.getPositionDescription:()Ljava/lang/String;
     135: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     138: pop
     139: aload_1
     140: ldc_w         #1631               // String : Must specify unique android:id, android:tag, or have a parent with an id for
     143: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     146: pop
     147: aload_1
     148: aload         8
     150: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     153: pop
     154: new           #856                // class java/lang/IllegalArgumentException
     157: dup
     158: aload_1
     159: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     162: invokespecial #857                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     165: athrow
     166: iload         7
     168: iconst_m1
     169: if_icmpeq     182
     172: aload_0
     173: iload         7
     175: invokevirtual #1633               // Method b:(I)Landroid/support/v4/app/i;
     178: astore_2
     179: goto          184
     182: aconst_null
     183: astore_2
     184: aload_2
     185: astore_1
     186: aload_2
     187: ifnonnull     204
     190: aload_2
     191: astore_1
     192: aload         9
     194: ifnull        204
     197: aload_0
     198: aload         9
     200: invokevirtual #1635               // Method a:(Ljava/lang/String;)Landroid/support/v4/app/i;
     203: astore_1
     204: aload_1
     205: astore_2
     206: aload_1
     207: ifnonnull     225
     210: aload_1
     211: astore_2
     212: iload         5
     214: iconst_m1
     215: if_icmpeq     225
     218: aload_0
     219: iload         5
     221: invokevirtual #1633               // Method b:(I)Landroid/support/v4/app/i;
     224: astore_2
     225: getstatic     #738                // Field a:Z
     228: ifeq          297
     231: new           #718                // class java/lang/StringBuilder
     234: dup
     235: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     238: astore_1
     239: aload_1
     240: ldc_w         #1637               // String onCreateView: id=0x
     243: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     246: pop
     247: aload_1
     248: iload         7
     250: invokestatic  #1123               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     253: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     256: pop
     257: aload_1
     258: ldc_w         #1639               // String  fname=
     261: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     264: pop
     265: aload_1
     266: aload         8
     268: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     271: pop
     272: aload_1
     273: ldc_w         #1641               // String  existing=
     276: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     279: pop
     280: aload_1
     281: aload_2
     282: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     285: pop
     286: ldc_w         #348                // String FragmentManager
     289: aload_1
     290: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     293: invokestatic  #750                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     296: pop
     297: aload_2
     298: ifnonnull     396
     301: aload_0
     302: getfield      #947                // Field n:Landroid/support/v4/app/k;
     305: aload_3
     306: aload         8
     308: aconst_null
     309: invokevirtual #1644               // Method android/support/v4/app/k.a:(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/i;
     312: astore_1
     313: aload_1
     314: iconst_1
     315: putfield      #1016               // Field android/support/v4/app/i.mFromLayout:Z
     318: iload         7
     320: ifeq          330
     323: iload         7
     325: istore        6
     327: goto          334
     330: iload         5
     332: istore        6
     334: aload_1
     335: iload         6
     337: putfield      #1394               // Field android/support/v4/app/i.mFragmentId:I
     340: aload_1
     341: iload         5
     343: putfield      #378                // Field android/support/v4/app/i.mContainerId:I
     346: aload_1
     347: aload         9
     349: putfield      #794                // Field android/support/v4/app/i.mTag:Ljava/lang/String;
     352: aload_1
     353: iconst_1
     354: putfield      #920                // Field android/support/v4/app/i.mInLayout:Z
     357: aload_1
     358: aload_0
     359: putfield      #1056               // Field android/support/v4/app/i.mFragmentManager:Landroid/support/v4/app/o;
     362: aload_1
     363: aload_0
     364: getfield      #157                // Field m:Landroid/support/v4/app/m;
     367: putfield      #1043               // Field android/support/v4/app/i.mHost:Landroid/support/v4/app/m;
     370: aload_1
     371: aload_0
     372: getfield      #157                // Field m:Landroid/support/v4/app/m;
     375: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     378: aload         4
     380: aload_1
     381: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     384: invokevirtual #1648               // Method android/support/v4/app/i.onInflate:(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
     387: aload_0
     388: aload_1
     389: iconst_1
     390: invokevirtual #1650               // Method a:(Landroid/support/v4/app/i;Z)V
     393: goto          540
     396: aload_2
     397: getfield      #920                // Field android/support/v4/app/i.mInLayout:Z
     400: ifeq          501
     403: new           #718                // class java/lang/StringBuilder
     406: dup
     407: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     410: astore_1
     411: aload_1
     412: aload         4
     414: invokeinterface #1629,  1         // InterfaceMethod android/util/AttributeSet.getPositionDescription:()Ljava/lang/String;
     419: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     422: pop
     423: aload_1
     424: ldc_w         #1652               // String : Duplicate id 0x
     427: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     430: pop
     431: aload_1
     432: iload         7
     434: invokestatic  #1123               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     437: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     440: pop
     441: aload_1
     442: ldc_w         #1654               // String , tag
     445: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     448: pop
     449: aload_1
     450: aload         9
     452: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     455: pop
     456: aload_1
     457: ldc_w         #1656               // String , or parent id 0x
     460: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     463: pop
     464: aload_1
     465: iload         5
     467: invokestatic  #1123               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     470: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     473: pop
     474: aload_1
     475: ldc_w         #1658               // String  with another fragment for
     478: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     481: pop
     482: aload_1
     483: aload         8
     485: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     488: pop
     489: new           #856                // class java/lang/IllegalArgumentException
     492: dup
     493: aload_1
     494: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     497: invokespecial #857                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     500: athrow
     501: aload_2
     502: iconst_1
     503: putfield      #920                // Field android/support/v4/app/i.mInLayout:Z
     506: aload_2
     507: aload_0
     508: getfield      #157                // Field m:Landroid/support/v4/app/m;
     511: putfield      #1043               // Field android/support/v4/app/i.mHost:Landroid/support/v4/app/m;
     514: aload_2
     515: getfield      #472                // Field android/support/v4/app/i.mRetaining:Z
     518: ifne          538
     521: aload_2
     522: aload_0
     523: getfield      #157                // Field m:Landroid/support/v4/app/m;
     526: invokevirtual #813                // Method android/support/v4/app/m.i:()Landroid/content/Context;
     529: aload         4
     531: aload_2
     532: getfield      #942                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     535: invokevirtual #1648               // Method android/support/v4/app/i.onInflate:(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
     538: aload_2
     539: astore_1
     540: aload_0
     541: getfield      #134                // Field l:I
     544: iconst_1
     545: if_icmpge     567
     548: aload_1
     549: getfield      #1016               // Field android/support/v4/app/i.mFromLayout:Z
     552: ifeq          567
     555: aload_0
     556: aload_1
     557: iconst_1
     558: iconst_0
     559: iconst_0
     560: iconst_0
     561: invokevirtual #225                // Method a:(Landroid/support/v4/app/i;IIIZ)V
     564: goto          572
     567: aload_0
     568: aload_1
     569: invokevirtual #1285               // Method c:(Landroid/support/v4/app/i;)V
     572: aload_1
     573: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     576: ifnonnull     622
     579: new           #718                // class java/lang/StringBuilder
     582: dup
     583: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
     586: astore_1
     587: aload_1
     588: ldc_w         #766                // String Fragment
     591: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     594: pop
     595: aload_1
     596: aload         8
     598: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     601: pop
     602: aload_1
     603: ldc_w         #1660               // String  did not create a view.
     606: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     609: pop
     610: new           #683                // class java/lang/IllegalStateException
     613: dup
     614: aload_1
     615: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     618: invokespecial #686                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     621: athrow
     622: iload         7
     624: ifeq          636
     627: aload_1
     628: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     631: iload         7
     633: invokevirtual #1663               // Method android/view/View.setId:(I)V
     636: aload_1
     637: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     640: invokevirtual #1666               // Method android/view/View.getTag:()Ljava/lang/Object;
     643: ifnonnull     655
     646: aload_1
     647: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     650: aload         9
     652: invokevirtual #1669               // Method android/view/View.setTag:(Ljava/lang/Object;)V
     655: aload_1
     656: getfield      #372                // Field android/support/v4/app/i.mView:Landroid/view/View;
     659: areturn

  public android.view.View onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aconst_null
       2: aload_1
       3: aload_2
       4: aload_3
       5: invokevirtual #1672               // Method onCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
       8: areturn

  public void p();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #1356               // Field s:Z
       5: aload_0
       6: iconst_0
       7: putfield      #1361               // Field t:Z
      10: aload_0
      11: iconst_4
      12: invokespecial #1573               // Method e:(I)V
      15: return

  public void p(android.support.v4.app.i);
    Code:
       0: aload_1
       1: ifnull        82
       4: aload_0
       5: getfield      #189                // Field f:Landroid/util/SparseArray;
       8: aload_1
       9: getfield      #764                // Field android/support/v4/app/i.mIndex:I
      12: invokevirtual #786                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
      15: aload_1
      16: if_acmpne     34
      19: aload_1
      20: getfield      #1043               // Field android/support/v4/app/i.mHost:Landroid/support/v4/app/m;
      23: ifnull        82
      26: aload_1
      27: invokevirtual #1249               // Method android/support/v4/app/i.getFragmentManager:()Landroid/support/v4/app/n;
      30: aload_0
      31: if_acmpeq     82
      34: new           #718                // class java/lang/StringBuilder
      37: dup
      38: invokespecial #719                // Method java/lang/StringBuilder."<init>":()V
      41: astore_2
      42: aload_2
      43: ldc_w         #766                // String Fragment
      46: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: aload_2
      51: aload_1
      52: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      55: pop
      56: aload_2
      57: ldc_w         #1674               // String  is not an active fragment of FragmentManager
      60: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload_2
      65: aload_0
      66: invokevirtual #748                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      69: pop
      70: new           #856                // class java/lang/IllegalArgumentException
      73: dup
      74: aload_2
      75: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      78: invokespecial #857                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      81: athrow
      82: aload_0
      83: aload_1
      84: putfield      #630                // Field p:Landroid/support/v4/app/i;
      87: return

  public void q();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #1356               // Field s:Z
       5: aload_0
       6: iconst_0
       7: putfield      #1361               // Field t:Z
      10: aload_0
      11: iconst_5
      12: invokespecial #1573               // Method e:(I)V
      15: return

  public void r();
    Code:
       0: aload_0
       1: iconst_4
       2: invokespecial #1573               // Method e:(I)V
       5: return

  public void s();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #1361               // Field t:Z
       5: aload_0
       6: iconst_3
       7: invokespecial #1573               // Method e:(I)V
      10: return

  public void t();
    Code:
       0: aload_0
       1: iconst_2
       2: invokespecial #1573               // Method e:(I)V
       5: return

  public java.lang.String toString();
    Code:
       0: new           #718                // class java/lang/StringBuilder
       3: dup
       4: sipush        128
       7: invokespecial #1675               // Method java/lang/StringBuilder."<init>":(I)V
      10: astore_2
      11: aload_2
      12: ldc_w         #1677               // String FragmentManager{
      15: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      18: pop
      19: aload_2
      20: aload_0
      21: invokestatic  #1302               // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      24: invokestatic  #1123               // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      27: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_2
      32: ldc_w         #1679               // String  in
      35: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: aload_0
      40: getfield      #949                // Field o:Landroid/support/v4/app/i;
      43: ifnull        59
      46: aload_0
      47: getfield      #949                // Field o:Landroid/support/v4/app/i;
      50: astore_1
      51: aload_1
      52: aload_2
      53: invokestatic  #1684               // Method android/support/v4/g/d.a:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
      56: goto          67
      59: aload_0
      60: getfield      #157                // Field m:Landroid/support/v4/app/m;
      63: astore_1
      64: goto          51
      67: aload_2
      68: ldc_w         #1686               // String }}
      71: invokevirtual #725                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: aload_2
      76: invokevirtual #728                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      79: areturn

  public void u();
    Code:
       0: aload_0
       1: iconst_1
       2: invokespecial #1573               // Method e:(I)V
       5: return

  public void v();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #1216               // Field u:Z
       5: aload_0
       6: invokevirtual #626                // Method g:()Z
       9: pop
      10: aload_0
      11: iconst_0
      12: invokespecial #1573               // Method e:(I)V
      15: aload_0
      16: aconst_null
      17: putfield      #157                // Field m:Landroid/support/v4/app/m;
      20: aload_0
      21: aconst_null
      22: putfield      #947                // Field n:Landroid/support/v4/app/k;
      25: aload_0
      26: aconst_null
      27: putfield      #949                // Field o:Landroid/support/v4/app/i;
      30: return

  public void w();
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: aload_0
       4: getfield      #127                // Field e:Ljava/util/ArrayList;
       7: invokevirtual #155                // Method java/util/ArrayList.size:()I
      10: if_icmpge     40
      13: aload_0
      14: getfield      #127                // Field e:Ljava/util/ArrayList;
      17: iload_1
      18: invokevirtual #246                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #197                // class android/support/v4/app/i
      24: astore_2
      25: aload_2
      26: ifnull        33
      29: aload_2
      30: invokevirtual #1689               // Method android/support/v4/app/i.performLowMemory:()V
      33: iload_1
      34: iconst_1
      35: iadd
      36: istore_1
      37: goto          2
      40: return

  public android.support.v4.app.i x();
    Code:
       0: aload_0
       1: getfield      #630                // Field p:Landroid/support/v4/app/i;
       4: areturn

  android.view.LayoutInflater$Factory2 y();
    Code:
       0: aload_0
       1: areturn
}
