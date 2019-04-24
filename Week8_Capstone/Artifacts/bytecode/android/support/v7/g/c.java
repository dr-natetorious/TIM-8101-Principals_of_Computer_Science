public class android.support.v7.g.c {
  static {};
    Code:
       0: new           #6                  // class android/support/v7/g/c$1
       3: dup
       4: invokespecial #31                 // Method android/support/v7/g/c$1."<init>":()V
       7: putstatic     #33                 // Field a:Ljava/util/Comparator;
      10: return

  public static android.support.v7.g.c$b a(android.support.v7.g.c$a);
    Code:
       0: aload_0
       1: iconst_1
       2: invokestatic  #38                 // Method a:(Landroid/support/v7/g/c$a;Z)Landroid/support/v7/g/c$b;
       5: areturn

  public static android.support.v7.g.c$b a(android.support.v7.g.c$a, boolean);
    Code:
       0: aload_0
       1: invokevirtual #41                 // Method android/support/v7/g/c$a.a:()I
       4: istore_2
       5: aload_0
       6: invokevirtual #43                 // Method android/support/v7/g/c$a.b:()I
       9: istore_3
      10: new           #45                 // class java/util/ArrayList
      13: dup
      14: invokespecial #46                 // Method java/util/ArrayList."<init>":()V
      17: astore        5
      19: new           #45                 // class java/util/ArrayList
      22: dup
      23: invokespecial #46                 // Method java/util/ArrayList."<init>":()V
      26: astore        6
      28: aload         6
      30: new           #20                 // class android/support/v7/g/c$e
      33: dup
      34: iconst_0
      35: iload_2
      36: iconst_0
      37: iload_3
      38: invokespecial #49                 // Method android/support/v7/g/c$e."<init>":(IIII)V
      41: invokeinterface #55,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      46: pop
      47: iload_2
      48: iload_3
      49: isub
      50: invokestatic  #61                 // Method java/lang/Math.abs:(I)I
      53: iload_2
      54: iload_3
      55: iadd
      56: iadd
      57: istore_3
      58: iload_3
      59: iconst_2
      60: imul
      61: istore_2
      62: iload_2
      63: newarray       int
      65: astore        7
      67: iload_2
      68: newarray       int
      70: astore        8
      72: new           #45                 // class java/util/ArrayList
      75: dup
      76: invokespecial #46                 // Method java/util/ArrayList."<init>":()V
      79: astore        9
      81: aload         6
      83: invokeinterface #65,  1           // InterfaceMethod java/util/List.isEmpty:()Z
      88: ifne          474
      91: aload         6
      93: aload         6
      95: invokeinterface #68,  1           // InterfaceMethod java/util/List.size:()I
     100: iconst_1
     101: isub
     102: invokeinterface #72,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
     107: checkcast     #20                 // class android/support/v7/g/c$e
     110: astore        10
     112: aload_0
     113: aload         10
     115: getfield      #75                 // Field android/support/v7/g/c$e.a:I
     118: aload         10
     120: getfield      #77                 // Field android/support/v7/g/c$e.b:I
     123: aload         10
     125: getfield      #79                 // Field android/support/v7/g/c$e.c:I
     128: aload         10
     130: getfield      #81                 // Field android/support/v7/g/c$e.d:I
     133: aload         7
     135: aload         8
     137: iload_3
     138: invokestatic  #84                 // Method a:(Landroid/support/v7/g/c$a;IIII[I[II)Landroid/support/v7/g/c$f;
     141: astore        11
     143: aload         11
     145: ifnull        461
     148: aload         11
     150: getfield      #85                 // Field android/support/v7/g/c$f.c:I
     153: ifle          166
     156: aload         5
     158: aload         11
     160: invokeinterface #55,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     165: pop
     166: aload         11
     168: aload         11
     170: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     173: aload         10
     175: getfield      #75                 // Field android/support/v7/g/c$e.a:I
     178: iadd
     179: putfield      #86                 // Field android/support/v7/g/c$f.a:I
     182: aload         11
     184: aload         11
     186: getfield      #87                 // Field android/support/v7/g/c$f.b:I
     189: aload         10
     191: getfield      #79                 // Field android/support/v7/g/c$e.c:I
     194: iadd
     195: putfield      #87                 // Field android/support/v7/g/c$f.b:I
     198: aload         9
     200: invokeinterface #65,  1           // InterfaceMethod java/util/List.isEmpty:()Z
     205: ifeq          220
     208: new           #20                 // class android/support/v7/g/c$e
     211: dup
     212: invokespecial #88                 // Method android/support/v7/g/c$e."<init>":()V
     215: astore        4
     217: goto          241
     220: aload         9
     222: aload         9
     224: invokeinterface #68,  1           // InterfaceMethod java/util/List.size:()I
     229: iconst_1
     230: isub
     231: invokeinterface #72,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
     236: checkcast     #20                 // class android/support/v7/g/c$e
     239: astore        4
     241: aload         4
     243: aload         10
     245: getfield      #75                 // Field android/support/v7/g/c$e.a:I
     248: putfield      #75                 // Field android/support/v7/g/c$e.a:I
     251: aload         4
     253: aload         10
     255: getfield      #79                 // Field android/support/v7/g/c$e.c:I
     258: putfield      #79                 // Field android/support/v7/g/c$e.c:I
     261: aload         11
     263: getfield      #91                 // Field android/support/v7/g/c$f.e:Z
     266: ifeq          296
     269: aload         11
     271: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     274: istore_2
     275: aload         4
     277: iload_2
     278: putfield      #77                 // Field android/support/v7/g/c$e.b:I
     281: aload         11
     283: getfield      #87                 // Field android/support/v7/g/c$f.b:I
     286: istore_2
     287: aload         4
     289: iload_2
     290: putfield      #81                 // Field android/support/v7/g/c$e.d:I
     293: goto          336
     296: aload         11
     298: getfield      #93                 // Field android/support/v7/g/c$f.d:Z
     301: ifeq          315
     304: aload         11
     306: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     309: iconst_1
     310: isub
     311: istore_2
     312: goto          275
     315: aload         4
     317: aload         11
     319: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     322: putfield      #77                 // Field android/support/v7/g/c$e.b:I
     325: aload         11
     327: getfield      #87                 // Field android/support/v7/g/c$f.b:I
     330: iconst_1
     331: isub
     332: istore_2
     333: goto          287
     336: aload         6
     338: aload         4
     340: invokeinterface #55,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     345: pop
     346: aload         11
     348: getfield      #91                 // Field android/support/v7/g/c$f.e:Z
     351: ifeq          412
     354: aload         11
     356: getfield      #93                 // Field android/support/v7/g/c$f.d:Z
     359: ifeq          379
     362: aload         11
     364: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     367: aload         11
     369: getfield      #85                 // Field android/support/v7/g/c$f.c:I
     372: iadd
     373: iconst_1
     374: iadd
     375: istore_2
     376: goto          424
     379: aload         10
     381: aload         11
     383: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     386: aload         11
     388: getfield      #85                 // Field android/support/v7/g/c$f.c:I
     391: iadd
     392: putfield      #75                 // Field android/support/v7/g/c$e.a:I
     395: aload         11
     397: getfield      #87                 // Field android/support/v7/g/c$f.b:I
     400: aload         11
     402: getfield      #85                 // Field android/support/v7/g/c$f.c:I
     405: iadd
     406: iconst_1
     407: iadd
     408: istore_2
     409: goto          442
     412: aload         11
     414: getfield      #86                 // Field android/support/v7/g/c$f.a:I
     417: aload         11
     419: getfield      #85                 // Field android/support/v7/g/c$f.c:I
     422: iadd
     423: istore_2
     424: aload         10
     426: iload_2
     427: putfield      #75                 // Field android/support/v7/g/c$e.a:I
     430: aload         11
     432: getfield      #87                 // Field android/support/v7/g/c$f.b:I
     435: aload         11
     437: getfield      #85                 // Field android/support/v7/g/c$f.c:I
     440: iadd
     441: istore_2
     442: aload         10
     444: iload_2
     445: putfield      #79                 // Field android/support/v7/g/c$e.c:I
     448: aload         6
     450: aload         10
     452: invokeinterface #55,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     457: pop
     458: goto          81
     461: aload         9
     463: aload         10
     465: invokeinterface #55,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     470: pop
     471: goto          81
     474: aload         5
     476: getstatic     #33                 // Field a:Ljava/util/Comparator;
     479: invokestatic  #99                 // Method java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
     482: new           #11                 // class android/support/v7/g/c$b
     485: dup
     486: aload_0
     487: aload         5
     489: aload         7
     491: aload         8
     493: iload_1
     494: invokespecial #102                // Method android/support/v7/g/c$b."<init>":(Landroid/support/v7/g/c$a;Ljava/util/List;[I[IZ)V
     497: areturn
}
