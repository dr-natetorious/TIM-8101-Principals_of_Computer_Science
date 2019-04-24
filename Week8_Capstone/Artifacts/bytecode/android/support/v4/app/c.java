final class android.support.v4.app.c extends android.support.v4.app.u implements android.support.v4.app.o$g {
  final android.support.v4.app.o a;

  java.util.ArrayList<android.support.v4.app.c$a> b;

  int c;

  int d;

  int e;

  int f;

  int g;

  int h;

  boolean i;

  boolean j;

  java.lang.String k;

  boolean l;

  int m;

  int n;

  java.lang.CharSequence o;

  int p;

  java.lang.CharSequence q;

  java.util.ArrayList<java.lang.String> r;

  java.util.ArrayList<java.lang.String> s;

  boolean t;

  java.util.ArrayList<java.lang.Runnable> u;

  public android.support.v4.app.c(android.support.v4.app.o);
    Code:
       0: aload_0
       1: invokespecial #43                 // Method android/support/v4/app/u."<init>":()V
       4: aload_0
       5: new           #45                 // class java/util/ArrayList
       8: dup
       9: invokespecial #46                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #48                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: iconst_1
      17: putfield      #50                 // Field j:Z
      20: aload_0
      21: iconst_m1
      22: putfield      #52                 // Field m:I
      25: aload_0
      26: iconst_0
      27: putfield      #54                 // Field t:Z
      30: aload_0
      31: aload_1
      32: putfield      #56                 // Field a:Landroid/support/v4/app/o;
      35: return

  int a(boolean);
    Code:
       0: aload_0
       1: getfield      #183                // Field l:Z
       4: ifeq          17
       7: new           #118                // class java/lang/IllegalStateException
      10: dup
      11: ldc           #185                // String commit already called
      13: invokespecial #125                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: getstatic     #189                // Field android/support/v4/app/o.a:Z
      20: ifeq          84
      23: new           #102                // class java/lang/StringBuilder
      26: dup
      27: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
      30: astore_3
      31: aload_3
      32: ldc           #191                // String Commit:
      34: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: aload_3
      39: aload_0
      40: invokevirtual #112                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      43: pop
      44: ldc           #193                // String FragmentManager
      46: aload_3
      47: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      50: invokestatic  #199                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      53: pop
      54: new           #201                // class java/io/PrintWriter
      57: dup
      58: new           #203                // class android/support/v4/g/e
      61: dup
      62: ldc           #193                // String FragmentManager
      64: invokespecial #204                // Method android/support/v4/g/e."<init>":(Ljava/lang/String;)V
      67: invokespecial #207                // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
      70: astore_3
      71: aload_0
      72: ldc           #209                // String
      74: aconst_null
      75: aload_3
      76: aconst_null
      77: invokevirtual #212                // Method a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
      80: aload_3
      81: invokevirtual #215                // Method java/io/PrintWriter.close:()V
      84: aload_0
      85: iconst_1
      86: putfield      #183                // Field l:Z
      89: aload_0
      90: getfield      #217                // Field i:Z
      93: ifeq          113
      96: aload_0
      97: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     100: aload_0
     101: invokevirtual #220                // Method android/support/v4/app/o.a:(Landroid/support/v4/app/c;)I
     104: istore_2
     105: aload_0
     106: iload_2
     107: putfield      #52                 // Field m:I
     110: goto          118
     113: iconst_m1
     114: istore_2
     115: goto          105
     118: aload_0
     119: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     122: aload_0
     123: iload_1
     124: invokevirtual #223                // Method android/support/v4/app/o.a:(Landroid/support/v4/app/o$g;Z)V
     127: aload_0
     128: getfield      #52                 // Field m:I
     131: ireturn

  android.support.v4.app.i a(java.util.ArrayList<android.support.v4.app.i>, android.support.v4.app.i);
    Code:
       0: iconst_0
       1: istore_3
       2: aload_2
       3: astore        9
       5: iload_3
       6: aload_0
       7: getfield      #48                 // Field b:Ljava/util/ArrayList;
      10: invokevirtual #227                // Method java/util/ArrayList.size:()I
      13: if_icmpge     465
      16: aload_0
      17: getfield      #48                 // Field b:Ljava/util/ArrayList;
      20: iload_3
      21: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      24: checkcast     #8                  // class android/support/v4/app/c$a
      27: astore        10
      29: aload         10
      31: getfield      #233                // Field android/support/v4/app/c$a.a:I
      34: tableswitch   { // 1 to 8
                     1: 438
                     2: 180
                     3: 122
                     4: 80
                     5: 80
                     6: 122
                     7: 438
                     8: 89
               default: 80
          }
      80: aload         9
      82: astore_2
      83: iload_3
      84: istore        4
      86: goto          454
      89: aload_0
      90: getfield      #48                 // Field b:Ljava/util/ArrayList;
      93: iload_3
      94: new           #8                  // class android/support/v4/app/c$a
      97: dup
      98: bipush        9
     100: aload         9
     102: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
     105: invokevirtual #237                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
     108: iload_3
     109: iconst_1
     110: iadd
     111: istore        4
     113: aload         10
     115: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     118: astore_2
     119: goto          454
     122: aload_1
     123: aload         10
     125: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     128: invokevirtual #240                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     131: pop
     132: aload         9
     134: astore_2
     135: iload_3
     136: istore        4
     138: aload         10
     140: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     143: aload         9
     145: if_acmpne     454
     148: aload_0
     149: getfield      #48                 // Field b:Ljava/util/ArrayList;
     152: iload_3
     153: new           #8                  // class android/support/v4/app/c$a
     156: dup
     157: bipush        9
     159: aload         10
     161: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     164: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
     167: invokevirtual #237                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
     170: iload_3
     171: iconst_1
     172: iadd
     173: istore        4
     175: aconst_null
     176: astore_2
     177: goto          454
     180: aload         10
     182: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     185: astore        11
     187: aload         11
     189: getfield      #145                // Field android/support/v4/app/i.mContainerId:I
     192: istore        8
     194: aload_1
     195: invokevirtual #227                // Method java/util/ArrayList.size:()I
     198: iconst_1
     199: isub
     200: istore        4
     202: aload         9
     204: astore_2
     205: iconst_0
     206: istore        5
     208: iload         4
     210: iflt          395
     213: aload_1
     214: iload         4
     216: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     219: checkcast     #88                 // class android/support/v4/app/i
     222: astore        12
     224: iload_3
     225: istore        6
     227: aload_2
     228: astore        9
     230: iload         5
     232: istore        7
     234: aload         12
     236: getfield      #145                // Field android/support/v4/app/i.mContainerId:I
     239: iload         8
     241: if_icmpne     376
     244: aload         12
     246: aload         11
     248: if_acmpne     263
     251: iconst_1
     252: istore        7
     254: iload_3
     255: istore        6
     257: aload_2
     258: astore        9
     260: goto          376
     263: iload_3
     264: istore        6
     266: aload_2
     267: astore        9
     269: aload         12
     271: aload_2
     272: if_acmpne     302
     275: aload_0
     276: getfield      #48                 // Field b:Ljava/util/ArrayList;
     279: iload_3
     280: new           #8                  // class android/support/v4/app/c$a
     283: dup
     284: bipush        9
     286: aload         12
     288: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
     291: invokevirtual #237                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
     294: iload_3
     295: iconst_1
     296: iadd
     297: istore        6
     299: aconst_null
     300: astore        9
     302: new           #8                  // class android/support/v4/app/c$a
     305: dup
     306: iconst_3
     307: aload         12
     309: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
     312: astore_2
     313: aload_2
     314: aload         10
     316: getfield      #242                // Field android/support/v4/app/c$a.c:I
     319: putfield      #242                // Field android/support/v4/app/c$a.c:I
     322: aload_2
     323: aload         10
     325: getfield      #244                // Field android/support/v4/app/c$a.e:I
     328: putfield      #244                // Field android/support/v4/app/c$a.e:I
     331: aload_2
     332: aload         10
     334: getfield      #246                // Field android/support/v4/app/c$a.d:I
     337: putfield      #246                // Field android/support/v4/app/c$a.d:I
     340: aload_2
     341: aload         10
     343: getfield      #248                // Field android/support/v4/app/c$a.f:I
     346: putfield      #248                // Field android/support/v4/app/c$a.f:I
     349: aload_0
     350: getfield      #48                 // Field b:Ljava/util/ArrayList;
     353: iload         6
     355: aload_2
     356: invokevirtual #237                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
     359: aload_1
     360: aload         12
     362: invokevirtual #240                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     365: pop
     366: iload         6
     368: iconst_1
     369: iadd
     370: istore        6
     372: iload         5
     374: istore        7
     376: iload         4
     378: iconst_1
     379: isub
     380: istore        4
     382: iload         6
     384: istore_3
     385: aload         9
     387: astore_2
     388: iload         7
     390: istore        5
     392: goto          208
     395: iload         5
     397: ifeq          416
     400: aload_0
     401: getfield      #48                 // Field b:Ljava/util/ArrayList;
     404: iload_3
     405: invokevirtual #250                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
     408: pop
     409: iload_3
     410: iconst_1
     411: isub
     412: istore_3
     413: goto          432
     416: aload         10
     418: iconst_1
     419: putfield      #233                // Field android/support/v4/app/c$a.a:I
     422: aload_1
     423: aload         11
     425: invokevirtual #252                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     428: pop
     429: goto          413
     432: iload_3
     433: istore        4
     435: goto          454
     438: aload_1
     439: aload         10
     441: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     444: invokevirtual #252                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     447: pop
     448: iload_3
     449: istore        4
     451: aload         9
     453: astore_2
     454: iload         4
     456: iconst_1
     457: iadd
     458: istore_3
     459: aload_2
     460: astore        9
     462: goto          5
     465: aload         9
     467: areturn

  public android.support.v4.app.u a();
    Code:
       0: aload_0
       1: getfield      #217                // Field i:Z
       4: ifeq          18
       7: new           #118                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #257                // String This transaction is already being added to the back stack
      14: invokespecial #125                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: iconst_0
      20: putfield      #50                 // Field j:Z
      23: aload_0
      24: areturn

  public android.support.v4.app.u a(int, android.support.v4.app.i);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aconst_null
       4: iconst_1
       5: invokespecial #260                // Method a:(ILandroid/support/v4/app/i;Ljava/lang/String;I)V
       8: aload_0
       9: areturn

  public android.support.v4.app.u a(int, android.support.v4.app.i, java.lang.String);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: iconst_1
       5: invokespecial #260                // Method a:(ILandroid/support/v4/app/i;Ljava/lang/String;I)V
       8: aload_0
       9: areturn

  public android.support.v4.app.u a(android.support.v4.app.i);
    Code:
       0: aload_0
       1: new           #8                  // class android/support/v4/app/c$a
       4: dup
       5: iconst_3
       6: aload_1
       7: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
      10: invokevirtual #151                // Method a:(Landroid/support/v4/app/c$a;)V
      13: aload_0
      14: areturn

  public android.support.v4.app.u a(android.support.v4.app.i, java.lang.String);
    Code:
       0: aload_0
       1: iconst_0
       2: aload_1
       3: aload_2
       4: iconst_1
       5: invokespecial #260                // Method a:(ILandroid/support/v4/app/i;Ljava/lang/String;I)V
       8: aload_0
       9: areturn

  public android.support.v4.app.u a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #50                 // Field j:Z
       4: ifne          18
       7: new           #118                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #266                // String This FragmentTransaction is not allowed to be added to the back stack.
      14: invokespecial #125                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: iconst_1
      20: putfield      #217                // Field i:Z
      23: aload_0
      24: aload_1
      25: putfield      #268                // Field k:Ljava/lang/String;
      28: aload_0
      29: areturn

  void a(int);
    Code:
       0: aload_0
       1: getfield      #217                // Field i:Z
       4: ifne          8
       7: return
       8: getstatic     #189                // Field android/support/v4/app/o.a:Z
      11: ifeq          66
      14: new           #102                // class java/lang/StringBuilder
      17: dup
      18: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
      21: astore        4
      23: aload         4
      25: ldc_w         #271                // String Bump nesting in
      28: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: pop
      32: aload         4
      34: aload_0
      35: invokevirtual #112                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      38: pop
      39: aload         4
      41: ldc_w         #273                // String  by
      44: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: pop
      48: aload         4
      50: iload_1
      51: invokevirtual #142                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      54: pop
      55: ldc           #193                // String FragmentManager
      57: aload         4
      59: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      62: invokestatic  #199                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      65: pop
      66: aload_0
      67: getfield      #48                 // Field b:Ljava/util/ArrayList;
      70: invokevirtual #227                // Method java/util/ArrayList.size:()I
      73: istore_3
      74: iconst_0
      75: istore_2
      76: iload_2
      77: iload_3
      78: if_icmpge     197
      81: aload_0
      82: getfield      #48                 // Field b:Ljava/util/ArrayList;
      85: iload_2
      86: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      89: checkcast     #8                  // class android/support/v4/app/c$a
      92: astore        4
      94: aload         4
      96: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      99: ifnull        190
     102: aload         4
     104: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     107: astore        5
     109: aload         5
     111: aload         5
     113: getfield      #276                // Field android/support/v4/app/i.mBackStackNesting:I
     116: iload_1
     117: iadd
     118: putfield      #276                // Field android/support/v4/app/i.mBackStackNesting:I
     121: getstatic     #189                // Field android/support/v4/app/o.a:Z
     124: ifeq          190
     127: new           #102                // class java/lang/StringBuilder
     130: dup
     131: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
     134: astore        5
     136: aload         5
     138: ldc_w         #278                // String Bump nesting of
     141: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     144: pop
     145: aload         5
     147: aload         4
     149: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     152: invokevirtual #112                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     155: pop
     156: aload         5
     158: ldc_w         #280                // String  to
     161: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     164: pop
     165: aload         5
     167: aload         4
     169: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     172: getfield      #276                // Field android/support/v4/app/i.mBackStackNesting:I
     175: invokevirtual #142                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     178: pop
     179: ldc           #193                // String FragmentManager
     181: aload         5
     183: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     186: invokestatic  #199                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     189: pop
     190: iload_2
     191: iconst_1
     192: iadd
     193: istore_2
     194: goto          76
     197: return

  void a(android.support.v4.app.c$a);
    Code:
       0: aload_0
       1: getfield      #48                 // Field b:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #252                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       8: pop
       9: aload_1
      10: aload_0
      11: getfield      #281                // Field c:I
      14: putfield      #242                // Field android/support/v4/app/c$a.c:I
      17: aload_1
      18: aload_0
      19: getfield      #282                // Field d:I
      22: putfield      #246                // Field android/support/v4/app/c$a.d:I
      25: aload_1
      26: aload_0
      27: getfield      #283                // Field e:I
      30: putfield      #244                // Field android/support/v4/app/c$a.e:I
      33: aload_1
      34: aload_0
      35: getfield      #284                // Field f:I
      38: putfield      #248                // Field android/support/v4/app/c$a.f:I
      41: return

  void a(android.support.v4.app.i$c);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #48                 // Field b:Ljava/util/ArrayList;
       7: invokevirtual #227                // Method java/util/ArrayList.size:()I
      10: if_icmpge     47
      13: aload_0
      14: getfield      #48                 // Field b:Ljava/util/ArrayList;
      17: iload_2
      18: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #8                  // class android/support/v4/app/c$a
      24: astore_3
      25: aload_3
      26: invokestatic  #287                // Method b:(Landroid/support/v4/app/c$a;)Z
      29: ifeq          40
      32: aload_3
      33: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      36: aload_1
      37: invokevirtual #290                // Method android/support/v4/app/i.setOnStartEnterTransitionListener:(Landroid/support/v4/app/i$c;)V
      40: iload_2
      41: iconst_1
      42: iadd
      43: istore_2
      44: goto          2
      47: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_0
       1: aload_1
       2: aload_3
       3: iconst_1
       4: invokevirtual #293                // Method a:(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
       7: return

  public void a(java.lang.String, java.io.PrintWriter, boolean);
    Code:
       0: iload_3
       1: ifeq          316
       4: aload_2
       5: aload_1
       6: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
       9: aload_2
      10: ldc_w         #298                // String mName=
      13: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      16: aload_2
      17: aload_0
      18: getfield      #268                // Field k:Ljava/lang/String;
      21: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      24: aload_2
      25: ldc_w         #300                // String  mIndex=
      28: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      31: aload_2
      32: aload_0
      33: getfield      #52                 // Field m:I
      36: invokevirtual #302                // Method java/io/PrintWriter.print:(I)V
      39: aload_2
      40: ldc_w         #304                // String  mCommitted=
      43: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      46: aload_2
      47: aload_0
      48: getfield      #183                // Field l:Z
      51: invokevirtual #308                // Method java/io/PrintWriter.println:(Z)V
      54: aload_0
      55: getfield      #310                // Field g:I
      58: ifeq          102
      61: aload_2
      62: aload_1
      63: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      66: aload_2
      67: ldc_w         #312                // String mTransition=#
      70: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      73: aload_2
      74: aload_0
      75: getfield      #310                // Field g:I
      78: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      81: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      84: aload_2
      85: ldc_w         #320                // String  mTransitionStyle=#
      88: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      91: aload_2
      92: aload_0
      93: getfield      #322                // Field h:I
      96: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      99: invokevirtual #324                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     102: aload_0
     103: getfield      #281                // Field c:I
     106: ifne          116
     109: aload_0
     110: getfield      #282                // Field d:I
     113: ifeq          157
     116: aload_2
     117: aload_1
     118: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     121: aload_2
     122: ldc_w         #326                // String mEnterAnim=#
     125: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     128: aload_2
     129: aload_0
     130: getfield      #281                // Field c:I
     133: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     136: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     139: aload_2
     140: ldc_w         #328                // String  mExitAnim=#
     143: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     146: aload_2
     147: aload_0
     148: getfield      #282                // Field d:I
     151: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     154: invokevirtual #324                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     157: aload_0
     158: getfield      #283                // Field e:I
     161: ifne          171
     164: aload_0
     165: getfield      #284                // Field f:I
     168: ifeq          212
     171: aload_2
     172: aload_1
     173: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     176: aload_2
     177: ldc_w         #330                // String mPopEnterAnim=#
     180: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     183: aload_2
     184: aload_0
     185: getfield      #283                // Field e:I
     188: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     191: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     194: aload_2
     195: ldc_w         #332                // String  mPopExitAnim=#
     198: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     201: aload_2
     202: aload_0
     203: getfield      #284                // Field f:I
     206: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     209: invokevirtual #324                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     212: aload_0
     213: getfield      #334                // Field n:I
     216: ifne          226
     219: aload_0
     220: getfield      #336                // Field o:Ljava/lang/CharSequence;
     223: ifnull        264
     226: aload_2
     227: aload_1
     228: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     231: aload_2
     232: ldc_w         #338                // String mBreadCrumbTitleRes=#
     235: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     238: aload_2
     239: aload_0
     240: getfield      #334                // Field n:I
     243: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     246: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     249: aload_2
     250: ldc_w         #340                // String  mBreadCrumbTitleText=
     253: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     256: aload_2
     257: aload_0
     258: getfield      #336                // Field o:Ljava/lang/CharSequence;
     261: invokevirtual #343                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     264: aload_0
     265: getfield      #345                // Field p:I
     268: ifne          278
     271: aload_0
     272: getfield      #347                // Field q:Ljava/lang/CharSequence;
     275: ifnull        316
     278: aload_2
     279: aload_1
     280: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     283: aload_2
     284: ldc_w         #349                // String mBreadCrumbShortTitleRes=#
     287: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     290: aload_2
     291: aload_0
     292: getfield      #345                // Field p:I
     295: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     298: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     301: aload_2
     302: ldc_w         #351                // String  mBreadCrumbShortTitleText=
     305: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     308: aload_2
     309: aload_0
     310: getfield      #347                // Field q:Ljava/lang/CharSequence;
     313: invokevirtual #343                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     316: aload_0
     317: getfield      #48                 // Field b:Ljava/util/ArrayList;
     320: invokevirtual #354                // Method java/util/ArrayList.isEmpty:()Z
     323: ifne          754
     326: aload_2
     327: aload_1
     328: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     331: aload_2
     332: ldc_w         #356                // String Operations:
     335: invokevirtual #324                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     338: new           #102                // class java/lang/StringBuilder
     341: dup
     342: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
     345: astore        6
     347: aload         6
     349: aload_1
     350: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     353: pop
     354: aload         6
     356: ldc_w         #358                // String
     359: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     362: pop
     363: aload         6
     365: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     368: pop
     369: aload_0
     370: getfield      #48                 // Field b:Ljava/util/ArrayList;
     373: invokevirtual #227                // Method java/util/ArrayList.size:()I
     376: istore        5
     378: iconst_0
     379: istore        4
     381: iload         4
     383: iload         5
     385: if_icmpge     754
     388: aload_0
     389: getfield      #48                 // Field b:Ljava/util/ArrayList;
     392: iload         4
     394: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     397: checkcast     #8                  // class android/support/v4/app/c$a
     400: astore        7
     402: aload         7
     404: getfield      #233                // Field android/support/v4/app/c$a.a:I
     407: tableswitch   { // 0 to 9
                     0: 571
                     1: 563
                     2: 555
                     3: 547
                     4: 539
                     5: 531
                     6: 523
                     7: 515
                     8: 507
                     9: 499
               default: 460
          }
     460: new           #102                // class java/lang/StringBuilder
     463: dup
     464: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
     467: astore        6
     469: aload         6
     471: ldc_w         #360                // String cmd=
     474: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     477: pop
     478: aload         6
     480: aload         7
     482: getfield      #233                // Field android/support/v4/app/c$a.a:I
     485: invokevirtual #142                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     488: pop
     489: aload         6
     491: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     494: astore        6
     496: goto          576
     499: ldc_w         #362                // String UNSET_PRIMARY_NAV
     502: astore        6
     504: goto          576
     507: ldc_w         #364                // String SET_PRIMARY_NAV
     510: astore        6
     512: goto          576
     515: ldc_w         #366                // String ATTACH
     518: astore        6
     520: goto          576
     523: ldc_w         #368                // String DETACH
     526: astore        6
     528: goto          576
     531: ldc_w         #370                // String SHOW
     534: astore        6
     536: goto          576
     539: ldc_w         #372                // String HIDE
     542: astore        6
     544: goto          576
     547: ldc_w         #374                // String REMOVE
     550: astore        6
     552: goto          576
     555: ldc_w         #376                // String REPLACE
     558: astore        6
     560: goto          576
     563: ldc_w         #378                // String ADD
     566: astore        6
     568: goto          576
     571: ldc_w         #380                // String NULL
     574: astore        6
     576: aload_2
     577: aload_1
     578: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     581: aload_2
     582: ldc_w         #382                // String   Op #
     585: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     588: aload_2
     589: iload         4
     591: invokevirtual #302                // Method java/io/PrintWriter.print:(I)V
     594: aload_2
     595: ldc_w         #384                // String :
     598: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     601: aload_2
     602: aload         6
     604: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     607: aload_2
     608: ldc_w         #386                // String
     611: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     614: aload_2
     615: aload         7
     617: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     620: invokevirtual #343                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     623: iload_3
     624: ifeq          745
     627: aload         7
     629: getfield      #242                // Field android/support/v4/app/c$a.c:I
     632: ifne          643
     635: aload         7
     637: getfield      #246                // Field android/support/v4/app/c$a.d:I
     640: ifeq          686
     643: aload_2
     644: aload_1
     645: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     648: aload_2
     649: ldc_w         #388                // String enterAnim=#
     652: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     655: aload_2
     656: aload         7
     658: getfield      #242                // Field android/support/v4/app/c$a.c:I
     661: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     664: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     667: aload_2
     668: ldc_w         #390                // String  exitAnim=#
     671: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     674: aload_2
     675: aload         7
     677: getfield      #246                // Field android/support/v4/app/c$a.d:I
     680: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     683: invokevirtual #324                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     686: aload         7
     688: getfield      #244                // Field android/support/v4/app/c$a.e:I
     691: ifne          702
     694: aload         7
     696: getfield      #248                // Field android/support/v4/app/c$a.f:I
     699: ifeq          745
     702: aload_2
     703: aload_1
     704: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     707: aload_2
     708: ldc_w         #392                // String popEnterAnim=#
     711: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     714: aload_2
     715: aload         7
     717: getfield      #244                // Field android/support/v4/app/c$a.e:I
     720: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     723: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     726: aload_2
     727: ldc_w         #394                // String  popExitAnim=#
     730: invokevirtual #296                // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     733: aload_2
     734: aload         7
     736: getfield      #248                // Field android/support/v4/app/c$a.f:I
     739: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
     742: invokevirtual #324                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     745: iload         4
     747: iconst_1
     748: iadd
     749: istore        4
     751: goto          381
     754: return

  boolean a(java.util.ArrayList<android.support.v4.app.c>, int, int);
    Code:
       0: iload_3
       1: iload_2
       2: if_icmpne     7
       5: iconst_0
       6: ireturn
       7: aload_0
       8: getfield      #48                 // Field b:Ljava/util/ArrayList;
      11: invokevirtual #227                // Method java/util/ArrayList.size:()I
      14: istore        9
      16: iconst_0
      17: istore        5
      19: iconst_m1
      20: istore        6
      22: iload         5
      24: iload         9
      26: if_icmpge     210
      29: aload_0
      30: getfield      #48                 // Field b:Ljava/util/ArrayList;
      33: iload         5
      35: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      38: checkcast     #8                  // class android/support/v4/app/c$a
      41: astore        11
      43: aload         11
      45: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      48: ifnull        64
      51: aload         11
      53: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      56: getfield      #145                // Field android/support/v4/app/i.mContainerId:I
      59: istore        4
      61: goto          67
      64: iconst_0
      65: istore        4
      67: iload         6
      69: istore        7
      71: iload         4
      73: ifeq          197
      76: iload         6
      78: istore        7
      80: iload         4
      82: iload         6
      84: if_icmpeq     197
      87: iload_2
      88: istore        6
      90: iload         6
      92: iload_3
      93: if_icmpge     193
      96: aload_1
      97: iload         6
      99: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     102: checkcast     #2                  // class android/support/v4/app/c
     105: astore        11
     107: aload         11
     109: getfield      #48                 // Field b:Ljava/util/ArrayList;
     112: invokevirtual #227                // Method java/util/ArrayList.size:()I
     115: istore        10
     117: iconst_0
     118: istore        7
     120: iload         7
     122: iload         10
     124: if_icmpge     184
     127: aload         11
     129: getfield      #48                 // Field b:Ljava/util/ArrayList;
     132: iload         7
     134: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     137: checkcast     #8                  // class android/support/v4/app/c$a
     140: astore        12
     142: aload         12
     144: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     147: ifnull        163
     150: aload         12
     152: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     155: getfield      #145                // Field android/support/v4/app/i.mContainerId:I
     158: istore        8
     160: goto          166
     163: iconst_0
     164: istore        8
     166: iload         8
     168: iload         4
     170: if_icmpne     175
     173: iconst_1
     174: ireturn
     175: iload         7
     177: iconst_1
     178: iadd
     179: istore        7
     181: goto          120
     184: iload         6
     186: iconst_1
     187: iadd
     188: istore        6
     190: goto          90
     193: iload         4
     195: istore        7
     197: iload         5
     199: iconst_1
     200: iadd
     201: istore        5
     203: iload         7
     205: istore        6
     207: goto          22
     210: iconst_0
     211: ireturn

  public boolean a(java.util.ArrayList<android.support.v4.app.c>, java.util.ArrayList<java.lang.Boolean>);
    Code:
       0: getstatic     #189                // Field android/support/v4/app/o.a:Z
       3: ifeq          38
       6: new           #102                // class java/lang/StringBuilder
       9: dup
      10: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
      13: astore_3
      14: aload_3
      15: ldc_w         #399                // String Run:
      18: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_3
      23: aload_0
      24: invokevirtual #112                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      27: pop
      28: ldc           #193                // String FragmentManager
      30: aload_3
      31: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      34: invokestatic  #199                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      37: pop
      38: aload_1
      39: aload_0
      40: invokevirtual #252                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      43: pop
      44: aload_2
      45: iconst_0
      46: invokestatic  #405                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      49: invokevirtual #252                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      52: pop
      53: aload_0
      54: getfield      #217                // Field i:Z
      57: ifeq          68
      60: aload_0
      61: getfield      #56                 // Field a:Landroid/support/v4/app/o;
      64: aload_0
      65: invokevirtual #408                // Method android/support/v4/app/o.b:(Landroid/support/v4/app/c;)V
      68: iconst_1
      69: ireturn

  android.support.v4.app.i b(java.util.ArrayList<android.support.v4.app.i>, android.support.v4.app.i);
    Code:
       0: iconst_0
       1: istore_3
       2: iload_3
       3: aload_0
       4: getfield      #48                 // Field b:Ljava/util/ArrayList;
       7: invokevirtual #227                // Method java/util/ArrayList.size:()I
      10: if_icmpge     123
      13: aload_0
      14: getfield      #48                 // Field b:Ljava/util/ArrayList;
      17: iload_3
      18: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #8                  // class android/support/v4/app/c$a
      24: astore        5
      26: aload         5
      28: getfield      #233                // Field android/support/v4/app/c$a.a:I
      31: istore        4
      33: iload         4
      35: iconst_1
      36: if_icmpeq     106
      39: iload         4
      41: iconst_3
      42: if_icmpeq     93
      45: iload         4
      47: tableswitch   { // 6 to 9
                     6: 93
                     7: 106
                     8: 88
                     9: 79
               default: 76
          }
      76: goto          116
      79: aload         5
      81: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      84: astore_2
      85: goto          116
      88: aconst_null
      89: astore_2
      90: goto          116
      93: aload_1
      94: aload         5
      96: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      99: invokevirtual #252                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     102: pop
     103: goto          116
     106: aload_1
     107: aload         5
     109: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     112: invokevirtual #240                // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
     115: pop
     116: iload_3
     117: iconst_1
     118: iadd
     119: istore_3
     120: goto          2
     123: aload_2
     124: areturn

  public android.support.v4.app.u b(int, android.support.v4.app.i);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aconst_null
       4: invokevirtual #411                // Method b:(ILandroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
       7: areturn

  public android.support.v4.app.u b(int, android.support.v4.app.i, java.lang.String);
    Code:
       0: iload_1
       1: ifne          15
       4: new           #133                // class java/lang/IllegalArgumentException
       7: dup
       8: ldc_w         #413                // String Must use non-zero containerViewId
      11: invokespecial #134                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      14: athrow
      15: aload_0
      16: iload_1
      17: aload_2
      18: aload_3
      19: iconst_2
      20: invokespecial #260                // Method a:(ILandroid/support/v4/app/i;Ljava/lang/String;I)V
      23: aload_0
      24: areturn

  public android.support.v4.app.u b(android.support.v4.app.i);
    Code:
       0: aload_0
       1: new           #8                  // class android/support/v4/app/c$a
       4: dup
       5: bipush        6
       7: aload_1
       8: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
      11: invokevirtual #151                // Method a:(Landroid/support/v4/app/c$a;)V
      14: aload_0
      15: areturn

  public void b();
    Code:
       0: aload_0
       1: getfield      #415                // Field u:Ljava/util/ArrayList;
       4: ifnull        50
       7: iconst_0
       8: istore_1
       9: aload_0
      10: getfield      #415                // Field u:Ljava/util/ArrayList;
      13: invokevirtual #227                // Method java/util/ArrayList.size:()I
      16: istore_2
      17: iload_1
      18: iload_2
      19: if_icmpge     45
      22: aload_0
      23: getfield      #415                // Field u:Ljava/util/ArrayList;
      26: iload_1
      27: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      30: checkcast     #417                // class java/lang/Runnable
      33: invokeinterface #420,  1          // InterfaceMethod java/lang/Runnable.run:()V
      38: iload_1
      39: iconst_1
      40: iadd
      41: istore_1
      42: goto          17
      45: aload_0
      46: aconst_null
      47: putfield      #415                // Field u:Ljava/util/ArrayList;
      50: return

  void b(boolean);
    Code:
       0: aload_0
       1: getfield      #48                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #227                // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_2
      10: iload_2
      11: iflt          340
      14: aload_0
      15: getfield      #48                 // Field b:Ljava/util/ArrayList;
      18: iload_2
      19: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #8                  // class android/support/v4/app/c$a
      25: astore        4
      27: aload         4
      29: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      32: astore        5
      34: aload         5
      36: ifnull        55
      39: aload         5
      41: aload_0
      42: getfield      #310                // Field g:I
      45: invokestatic  #423                // Method android/support/v4/app/o.d:(I)I
      48: aload_0
      49: getfield      #322                // Field h:I
      52: invokevirtual #427                // Method android/support/v4/app/i.setNextTransition:(II)V
      55: aload         4
      57: getfield      #233                // Field android/support/v4/app/c$a.a:I
      60: istore_3
      61: iload_3
      62: iconst_1
      63: if_icmpeq     284
      66: iload_3
      67: tableswitch   { // 3 to 9
                     3: 261
                     4: 239
                     5: 217
                     6: 195
                     7: 173
                     8: 162
                     9: 150
               default: 108
          }
     108: new           #102                // class java/lang/StringBuilder
     111: dup
     112: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
     115: astore        5
     117: aload         5
     119: ldc_w         #429                // String Unknown cmd:
     122: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     125: pop
     126: aload         5
     128: aload         4
     130: getfield      #233                // Field android/support/v4/app/c$a.a:I
     133: invokevirtual #142                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     136: pop
     137: new           #133                // class java/lang/IllegalArgumentException
     140: dup
     141: aload         5
     143: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     146: invokespecial #134                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     149: athrow
     150: aload_0
     151: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     154: aload         5
     156: invokevirtual #432                // Method android/support/v4/app/o.p:(Landroid/support/v4/app/i;)V
     159: goto          303
     162: aload_0
     163: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     166: aconst_null
     167: invokevirtual #432                // Method android/support/v4/app/o.p:(Landroid/support/v4/app/i;)V
     170: goto          303
     173: aload         5
     175: aload         4
     177: getfield      #248                // Field android/support/v4/app/c$a.f:I
     180: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     183: aload_0
     184: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     187: aload         5
     189: invokevirtual #437                // Method android/support/v4/app/o.l:(Landroid/support/v4/app/i;)V
     192: goto          303
     195: aload         5
     197: aload         4
     199: getfield      #244                // Field android/support/v4/app/c$a.e:I
     202: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     205: aload_0
     206: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     209: aload         5
     211: invokevirtual #439                // Method android/support/v4/app/o.m:(Landroid/support/v4/app/i;)V
     214: goto          303
     217: aload         5
     219: aload         4
     221: getfield      #248                // Field android/support/v4/app/c$a.f:I
     224: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     227: aload_0
     228: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     231: aload         5
     233: invokevirtual #441                // Method android/support/v4/app/o.j:(Landroid/support/v4/app/i;)V
     236: goto          303
     239: aload         5
     241: aload         4
     243: getfield      #244                // Field android/support/v4/app/c$a.e:I
     246: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     249: aload_0
     250: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     253: aload         5
     255: invokevirtual #443                // Method android/support/v4/app/o.k:(Landroid/support/v4/app/i;)V
     258: goto          303
     261: aload         5
     263: aload         4
     265: getfield      #244                // Field android/support/v4/app/c$a.e:I
     268: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     271: aload_0
     272: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     275: aload         5
     277: iconst_0
     278: invokevirtual #446                // Method android/support/v4/app/o.a:(Landroid/support/v4/app/i;Z)V
     281: goto          303
     284: aload         5
     286: aload         4
     288: getfield      #248                // Field android/support/v4/app/c$a.f:I
     291: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     294: aload_0
     295: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     298: aload         5
     300: invokevirtual #448                // Method android/support/v4/app/o.i:(Landroid/support/v4/app/i;)V
     303: aload_0
     304: getfield      #54                 // Field t:Z
     307: ifne          333
     310: aload         4
     312: getfield      #233                // Field android/support/v4/app/c$a.a:I
     315: iconst_3
     316: if_icmpeq     333
     319: aload         5
     321: ifnull        333
     324: aload_0
     325: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     328: aload         5
     330: invokevirtual #450                // Method android/support/v4/app/o.f:(Landroid/support/v4/app/i;)V
     333: iload_2
     334: iconst_1
     335: isub
     336: istore_2
     337: goto          10
     340: aload_0
     341: getfield      #54                 // Field t:Z
     344: ifne          366
     347: iload_1
     348: ifeq          366
     351: aload_0
     352: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     355: aload_0
     356: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     359: getfield      #452                // Field android/support/v4/app/o.l:I
     362: iconst_1
     363: invokevirtual #455                // Method android/support/v4/app/o.a:(IZ)V
     366: return

  boolean b(int);
    Code:
       0: aload_0
       1: getfield      #48                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #227                // Method java/util/ArrayList.size:()I
       7: istore        4
       9: iconst_0
      10: istore_2
      11: iload_2
      12: iload         4
      14: if_icmpge     70
      17: aload_0
      18: getfield      #48                 // Field b:Ljava/util/ArrayList;
      21: iload_2
      22: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #8                  // class android/support/v4/app/c$a
      28: astore        5
      30: aload         5
      32: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      35: ifnull        50
      38: aload         5
      40: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      43: getfield      #145                // Field android/support/v4/app/i.mContainerId:I
      46: istore_3
      47: goto          52
      50: iconst_0
      51: istore_3
      52: iload_3
      53: ifeq          63
      56: iload_3
      57: iload_1
      58: if_icmpne     63
      61: iconst_1
      62: ireturn
      63: iload_2
      64: iconst_1
      65: iadd
      66: istore_2
      67: goto          11
      70: iconst_0
      71: ireturn

  public int c();
    Code:
       0: aload_0
       1: iconst_0
       2: invokevirtual #457                // Method a:(Z)I
       5: ireturn

  public android.support.v4.app.u c(android.support.v4.app.i);
    Code:
       0: aload_0
       1: new           #8                  // class android/support/v4/app/c$a
       4: dup
       5: bipush        7
       7: aload_1
       8: invokespecial #148                // Method android/support/v4/app/c$a."<init>":(ILandroid/support/v4/app/i;)V
      11: invokevirtual #151                // Method a:(Landroid/support/v4/app/c$a;)V
      14: aload_0
      15: areturn

  public int d();
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #457                // Method a:(Z)I
       5: ireturn

  public void e();
    Code:
       0: aload_0
       1: invokevirtual #459                // Method a:()Landroid/support/v4/app/u;
       4: pop
       5: aload_0
       6: getfield      #56                 // Field a:Landroid/support/v4/app/o;
       9: aload_0
      10: iconst_1
      11: invokevirtual #461                // Method android/support/v4/app/o.b:(Landroid/support/v4/app/o$g;Z)V
      14: return

  void f();
    Code:
       0: aload_0
       1: getfield      #48                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #227                // Method java/util/ArrayList.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     340
      15: aload_0
      16: getfield      #48                 // Field b:Ljava/util/ArrayList;
      19: iload_1
      20: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #8                  // class android/support/v4/app/c$a
      26: astore        4
      28: aload         4
      30: getfield      #164                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
      33: astore        5
      35: aload         5
      37: ifnull        53
      40: aload         5
      42: aload_0
      43: getfield      #310                // Field g:I
      46: aload_0
      47: getfield      #322                // Field h:I
      50: invokevirtual #427                // Method android/support/v4/app/i.setNextTransition:(II)V
      53: aload         4
      55: getfield      #233                // Field android/support/v4/app/c$a.a:I
      58: istore_3
      59: iload_3
      60: iconst_1
      61: if_icmpeq     283
      64: iload_3
      65: tableswitch   { // 3 to 9
                     3: 261
                     4: 239
                     5: 217
                     6: 195
                     7: 173
                     8: 161
                     9: 150
               default: 108
          }
     108: new           #102                // class java/lang/StringBuilder
     111: dup
     112: invokespecial #103                // Method java/lang/StringBuilder."<init>":()V
     115: astore        5
     117: aload         5
     119: ldc_w         #429                // String Unknown cmd:
     122: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     125: pop
     126: aload         5
     128: aload         4
     130: getfield      #233                // Field android/support/v4/app/c$a.a:I
     133: invokevirtual #142                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     136: pop
     137: new           #133                // class java/lang/IllegalArgumentException
     140: dup
     141: aload         5
     143: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     146: invokespecial #134                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     149: athrow
     150: aload_0
     151: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     154: aconst_null
     155: invokevirtual #432                // Method android/support/v4/app/o.p:(Landroid/support/v4/app/i;)V
     158: goto          303
     161: aload_0
     162: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     165: aload         5
     167: invokevirtual #432                // Method android/support/v4/app/o.p:(Landroid/support/v4/app/i;)V
     170: goto          303
     173: aload         5
     175: aload         4
     177: getfield      #242                // Field android/support/v4/app/c$a.c:I
     180: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     183: aload_0
     184: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     187: aload         5
     189: invokevirtual #439                // Method android/support/v4/app/o.m:(Landroid/support/v4/app/i;)V
     192: goto          303
     195: aload         5
     197: aload         4
     199: getfield      #246                // Field android/support/v4/app/c$a.d:I
     202: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     205: aload_0
     206: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     209: aload         5
     211: invokevirtual #437                // Method android/support/v4/app/o.l:(Landroid/support/v4/app/i;)V
     214: goto          303
     217: aload         5
     219: aload         4
     221: getfield      #242                // Field android/support/v4/app/c$a.c:I
     224: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     227: aload_0
     228: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     231: aload         5
     233: invokevirtual #443                // Method android/support/v4/app/o.k:(Landroid/support/v4/app/i;)V
     236: goto          303
     239: aload         5
     241: aload         4
     243: getfield      #246                // Field android/support/v4/app/c$a.d:I
     246: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     249: aload_0
     250: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     253: aload         5
     255: invokevirtual #441                // Method android/support/v4/app/o.j:(Landroid/support/v4/app/i;)V
     258: goto          303
     261: aload         5
     263: aload         4
     265: getfield      #246                // Field android/support/v4/app/c$a.d:I
     268: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     271: aload_0
     272: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     275: aload         5
     277: invokevirtual #448                // Method android/support/v4/app/o.i:(Landroid/support/v4/app/i;)V
     280: goto          303
     283: aload         5
     285: aload         4
     287: getfield      #242                // Field android/support/v4/app/c$a.c:I
     290: invokevirtual #435                // Method android/support/v4/app/i.setNextAnim:(I)V
     293: aload_0
     294: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     297: aload         5
     299: iconst_0
     300: invokevirtual #446                // Method android/support/v4/app/o.a:(Landroid/support/v4/app/i;Z)V
     303: aload_0
     304: getfield      #54                 // Field t:Z
     307: ifne          333
     310: aload         4
     312: getfield      #233                // Field android/support/v4/app/c$a.a:I
     315: iconst_1
     316: if_icmpeq     333
     319: aload         5
     321: ifnull        333
     324: aload_0
     325: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     328: aload         5
     330: invokevirtual #450                // Method android/support/v4/app/o.f:(Landroid/support/v4/app/i;)V
     333: iload_1
     334: iconst_1
     335: iadd
     336: istore_1
     337: goto          10
     340: aload_0
     341: getfield      #54                 // Field t:Z
     344: ifne          362
     347: aload_0
     348: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     351: aload_0
     352: getfield      #56                 // Field a:Landroid/support/v4/app/o;
     355: getfield      #452                // Field android/support/v4/app/o.l:I
     358: iconst_1
     359: invokevirtual #455                // Method android/support/v4/app/o.a:(IZ)V
     362: return

  boolean g();
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: aload_0
       4: getfield      #48                 // Field b:Ljava/util/ArrayList;
       7: invokevirtual #227                // Method java/util/ArrayList.size:()I
      10: if_icmpge     39
      13: aload_0
      14: getfield      #48                 // Field b:Ljava/util/ArrayList;
      17: iload_1
      18: invokevirtual #231                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #8                  // class android/support/v4/app/c$a
      24: invokestatic  #287                // Method b:(Landroid/support/v4/app/c$a;)Z
      27: ifeq          32
      30: iconst_1
      31: ireturn
      32: iload_1
      33: iconst_1
      34: iadd
      35: istore_1
      36: goto          2
      39: iconst_0
      40: ireturn

  public java.lang.String h();
    Code:
       0: aload_0
       1: getfield      #268                // Field k:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: new           #102                // class java/lang/StringBuilder
       3: dup
       4: sipush        128
       7: invokespecial #463                // Method java/lang/StringBuilder."<init>":(I)V
      10: astore_1
      11: aload_1
      12: ldc_w         #465                // String BackStackEntry{
      15: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      18: pop
      19: aload_1
      20: aload_0
      21: invokestatic  #471                // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      24: invokestatic  #318                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      27: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_0
      32: getfield      #52                 // Field m:I
      35: iflt          55
      38: aload_1
      39: ldc_w         #473                // String  #
      42: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: aload_1
      47: aload_0
      48: getfield      #52                 // Field m:I
      51: invokevirtual #142                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      54: pop
      55: aload_0
      56: getfield      #268                // Field k:Ljava/lang/String;
      59: ifnull        79
      62: aload_1
      63: ldc_w         #386                // String
      66: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      69: pop
      70: aload_1
      71: aload_0
      72: getfield      #268                // Field k:Ljava/lang/String;
      75: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_1
      80: ldc_w         #475                // String }
      83: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      86: pop
      87: aload_1
      88: invokevirtual #122                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      91: areturn
}
