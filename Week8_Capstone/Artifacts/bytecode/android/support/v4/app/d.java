final class android.support.v4.app.d implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.app.d> CREATOR;

  final int[] a;

  final int b;

  final int c;

  final java.lang.String d;

  final int e;

  final int f;

  final java.lang.CharSequence g;

  final int h;

  final java.lang.CharSequence i;

  final java.util.ArrayList<java.lang.String> j;

  final java.util.ArrayList<java.lang.String> k;

  final boolean l;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/app/d$1
       3: dup
       4: invokespecial #35                 // Method android/support/v4/app/d$1."<init>":()V
       7: putstatic     #37                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.v4.app.d(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #40                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #46                 // Method android/os/Parcel.createIntArray:()[I
       9: putfield      #48                 // Field a:[I
      12: aload_0
      13: aload_1
      14: invokevirtual #52                 // Method android/os/Parcel.readInt:()I
      17: putfield      #54                 // Field b:I
      20: aload_0
      21: aload_1
      22: invokevirtual #52                 // Method android/os/Parcel.readInt:()I
      25: putfield      #56                 // Field c:I
      28: aload_0
      29: aload_1
      30: invokevirtual #60                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      33: putfield      #62                 // Field d:Ljava/lang/String;
      36: aload_0
      37: aload_1
      38: invokevirtual #52                 // Method android/os/Parcel.readInt:()I
      41: putfield      #64                 // Field e:I
      44: aload_0
      45: aload_1
      46: invokevirtual #52                 // Method android/os/Parcel.readInt:()I
      49: putfield      #66                 // Field f:I
      52: aload_0
      53: getstatic     #71                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      56: aload_1
      57: invokeinterface #77,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      62: checkcast     #79                 // class java/lang/CharSequence
      65: putfield      #81                 // Field g:Ljava/lang/CharSequence;
      68: aload_0
      69: aload_1
      70: invokevirtual #52                 // Method android/os/Parcel.readInt:()I
      73: putfield      #83                 // Field h:I
      76: aload_0
      77: getstatic     #71                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      80: aload_1
      81: invokeinterface #77,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      86: checkcast     #79                 // class java/lang/CharSequence
      89: putfield      #85                 // Field i:Ljava/lang/CharSequence;
      92: aload_0
      93: aload_1
      94: invokevirtual #89                 // Method android/os/Parcel.createStringArrayList:()Ljava/util/ArrayList;
      97: putfield      #91                 // Field j:Ljava/util/ArrayList;
     100: aload_0
     101: aload_1
     102: invokevirtual #89                 // Method android/os/Parcel.createStringArrayList:()Ljava/util/ArrayList;
     105: putfield      #93                 // Field k:Ljava/util/ArrayList;
     108: aload_1
     109: invokevirtual #52                 // Method android/os/Parcel.readInt:()I
     112: ifeq          120
     115: iconst_1
     116: istore_2
     117: goto          122
     120: iconst_0
     121: istore_2
     122: aload_0
     123: iload_2
     124: putfield      #95                 // Field l:Z
     127: return

  public android.support.v4.app.d(android.support.v4.app.c);
    Code:
       0: aload_0
       1: invokespecial #40                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: getfield      #100                // Field android/support/v4/app/c.b:Ljava/util/ArrayList;
       8: invokevirtual #105                // Method java/util/ArrayList.size:()I
      11: istore        4
      13: aload_0
      14: iload         4
      16: bipush        6
      18: imul
      19: newarray       int
      21: putfield      #48                 // Field a:[I
      24: aload_1
      25: getfield      #107                // Field android/support/v4/app/c.i:Z
      28: ifne          41
      31: new           #109                // class java/lang/IllegalStateException
      34: dup
      35: ldc           #111                // String Not on back stack
      37: invokespecial #114                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      40: athrow
      41: iconst_0
      42: istore_2
      43: iconst_0
      44: istore_3
      45: iload_2
      46: iload         4
      48: if_icmpge     208
      51: aload_1
      52: getfield      #100                // Field android/support/v4/app/c.b:Ljava/util/ArrayList;
      55: iload_2
      56: invokevirtual #118                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      59: checkcast     #120                // class android/support/v4/app/c$a
      62: astore        7
      64: aload_0
      65: getfield      #48                 // Field a:[I
      68: astore        8
      70: iload_3
      71: iconst_1
      72: iadd
      73: istore        5
      75: aload         8
      77: iload_3
      78: aload         7
      80: getfield      #122                // Field android/support/v4/app/c$a.a:I
      83: iastore
      84: aload_0
      85: getfield      #48                 // Field a:[I
      88: astore        8
      90: iload         5
      92: iconst_1
      93: iadd
      94: istore        6
      96: aload         7
      98: getfield      #125                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     101: ifnull        116
     104: aload         7
     106: getfield      #125                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     109: getfield      #130                // Field android/support/v4/app/i.mIndex:I
     112: istore_3
     113: goto          118
     116: iconst_m1
     117: istore_3
     118: aload         8
     120: iload         5
     122: iload_3
     123: iastore
     124: aload_0
     125: getfield      #48                 // Field a:[I
     128: astore        8
     130: iload         6
     132: iconst_1
     133: iadd
     134: istore_3
     135: aload         8
     137: iload         6
     139: aload         7
     141: getfield      #131                // Field android/support/v4/app/c$a.c:I
     144: iastore
     145: aload_0
     146: getfield      #48                 // Field a:[I
     149: astore        8
     151: iload_3
     152: iconst_1
     153: iadd
     154: istore        5
     156: aload         8
     158: iload_3
     159: aload         7
     161: getfield      #133                // Field android/support/v4/app/c$a.d:I
     164: iastore
     165: aload_0
     166: getfield      #48                 // Field a:[I
     169: astore        8
     171: iload         5
     173: iconst_1
     174: iadd
     175: istore_3
     176: aload         8
     178: iload         5
     180: aload         7
     182: getfield      #134                // Field android/support/v4/app/c$a.e:I
     185: iastore
     186: aload_0
     187: getfield      #48                 // Field a:[I
     190: iload_3
     191: aload         7
     193: getfield      #135                // Field android/support/v4/app/c$a.f:I
     196: iastore
     197: iload_2
     198: iconst_1
     199: iadd
     200: istore_2
     201: iload_3
     202: iconst_1
     203: iadd
     204: istore_3
     205: goto          45
     208: aload_0
     209: aload_1
     210: getfield      #137                // Field android/support/v4/app/c.g:I
     213: putfield      #54                 // Field b:I
     216: aload_0
     217: aload_1
     218: getfield      #138                // Field android/support/v4/app/c.h:I
     221: putfield      #56                 // Field c:I
     224: aload_0
     225: aload_1
     226: getfield      #140                // Field android/support/v4/app/c.k:Ljava/lang/String;
     229: putfield      #62                 // Field d:Ljava/lang/String;
     232: aload_0
     233: aload_1
     234: getfield      #143                // Field android/support/v4/app/c.m:I
     237: putfield      #64                 // Field e:I
     240: aload_0
     241: aload_1
     242: getfield      #146                // Field android/support/v4/app/c.n:I
     245: putfield      #66                 // Field f:I
     248: aload_0
     249: aload_1
     250: getfield      #149                // Field android/support/v4/app/c.o:Ljava/lang/CharSequence;
     253: putfield      #81                 // Field g:Ljava/lang/CharSequence;
     256: aload_0
     257: aload_1
     258: getfield      #152                // Field android/support/v4/app/c.p:I
     261: putfield      #83                 // Field h:I
     264: aload_0
     265: aload_1
     266: getfield      #155                // Field android/support/v4/app/c.q:Ljava/lang/CharSequence;
     269: putfield      #85                 // Field i:Ljava/lang/CharSequence;
     272: aload_0
     273: aload_1
     274: getfield      #158                // Field android/support/v4/app/c.r:Ljava/util/ArrayList;
     277: putfield      #91                 // Field j:Ljava/util/ArrayList;
     280: aload_0
     281: aload_1
     282: getfield      #161                // Field android/support/v4/app/c.s:Ljava/util/ArrayList;
     285: putfield      #93                 // Field k:Ljava/util/ArrayList;
     288: aload_0
     289: aload_1
     290: getfield      #164                // Field android/support/v4/app/c.t:Z
     293: putfield      #95                 // Field l:Z
     296: return

  public android.support.v4.app.c a(android.support.v4.app.o);
    Code:
       0: new           #98                 // class android/support/v4/app/c
       3: dup
       4: aload_1
       5: invokespecial #168                // Method android/support/v4/app/c."<init>":(Landroid/support/v4/app/o;)V
       8: astore        6
      10: iconst_0
      11: istore_3
      12: iconst_0
      13: istore_2
      14: iload_3
      15: aload_0
      16: getfield      #48                 // Field a:[I
      19: arraylength
      20: if_icmpge     315
      23: new           #120                // class android/support/v4/app/c$a
      26: dup
      27: invokespecial #169                // Method android/support/v4/app/c$a."<init>":()V
      30: astore        7
      32: aload_0
      33: getfield      #48                 // Field a:[I
      36: astore        5
      38: iload_3
      39: iconst_1
      40: iadd
      41: istore        4
      43: aload         7
      45: aload         5
      47: iload_3
      48: iaload
      49: putfield      #122                // Field android/support/v4/app/c$a.a:I
      52: getstatic     #173                // Field android/support/v4/app/o.a:Z
      55: ifeq          130
      58: new           #175                // class java/lang/StringBuilder
      61: dup
      62: invokespecial #176                // Method java/lang/StringBuilder."<init>":()V
      65: astore        5
      67: aload         5
      69: ldc           #178                // String Instantiate
      71: invokevirtual #182                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: aload         5
      77: aload         6
      79: invokevirtual #185                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      82: pop
      83: aload         5
      85: ldc           #187                // String  op #
      87: invokevirtual #182                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      90: pop
      91: aload         5
      93: iload_2
      94: invokevirtual #190                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      97: pop
      98: aload         5
     100: ldc           #192                // String  base fragment #
     102: invokevirtual #182                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     105: pop
     106: aload         5
     108: aload_0
     109: getfield      #48                 // Field a:[I
     112: iload         4
     114: iaload
     115: invokevirtual #190                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     118: pop
     119: ldc           #194                // String FragmentManager
     121: aload         5
     123: invokevirtual #197                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     126: invokestatic  #203                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     129: pop
     130: aload_0
     131: getfield      #48                 // Field a:[I
     134: astore        5
     136: iload         4
     138: iconst_1
     139: iadd
     140: istore_3
     141: aload         5
     143: iload         4
     145: iaload
     146: istore        4
     148: iload         4
     150: iflt          177
     153: aload_1
     154: getfield      #206                // Field android/support/v4/app/o.f:Landroid/util/SparseArray;
     157: iload         4
     159: invokevirtual #209                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
     162: checkcast     #127                // class android/support/v4/app/i
     165: astore        5
     167: aload         7
     169: aload         5
     171: putfield      #125                // Field android/support/v4/app/c$a.b:Landroid/support/v4/app/i;
     174: goto          183
     177: aconst_null
     178: astore        5
     180: goto          167
     183: aload_0
     184: getfield      #48                 // Field a:[I
     187: astore        5
     189: iload_3
     190: iconst_1
     191: iadd
     192: istore        4
     194: aload         7
     196: aload         5
     198: iload_3
     199: iaload
     200: putfield      #131                // Field android/support/v4/app/c$a.c:I
     203: aload_0
     204: getfield      #48                 // Field a:[I
     207: astore        5
     209: iload         4
     211: iconst_1
     212: iadd
     213: istore_3
     214: aload         7
     216: aload         5
     218: iload         4
     220: iaload
     221: putfield      #133                // Field android/support/v4/app/c$a.d:I
     224: aload_0
     225: getfield      #48                 // Field a:[I
     228: astore        5
     230: iload_3
     231: iconst_1
     232: iadd
     233: istore        4
     235: aload         7
     237: aload         5
     239: iload_3
     240: iaload
     241: putfield      #134                // Field android/support/v4/app/c$a.e:I
     244: aload         7
     246: aload_0
     247: getfield      #48                 // Field a:[I
     250: iload         4
     252: iaload
     253: putfield      #135                // Field android/support/v4/app/c$a.f:I
     256: aload         6
     258: aload         7
     260: getfield      #131                // Field android/support/v4/app/c$a.c:I
     263: putfield      #210                // Field android/support/v4/app/c.c:I
     266: aload         6
     268: aload         7
     270: getfield      #133                // Field android/support/v4/app/c$a.d:I
     273: putfield      #211                // Field android/support/v4/app/c.d:I
     276: aload         6
     278: aload         7
     280: getfield      #134                // Field android/support/v4/app/c$a.e:I
     283: putfield      #212                // Field android/support/v4/app/c.e:I
     286: aload         6
     288: aload         7
     290: getfield      #135                // Field android/support/v4/app/c$a.f:I
     293: putfield      #213                // Field android/support/v4/app/c.f:I
     296: aload         6
     298: aload         7
     300: invokevirtual #216                // Method android/support/v4/app/c.a:(Landroid/support/v4/app/c$a;)V
     303: iload_2
     304: iconst_1
     305: iadd
     306: istore_2
     307: iload         4
     309: iconst_1
     310: iadd
     311: istore_3
     312: goto          14
     315: aload         6
     317: aload_0
     318: getfield      #54                 // Field b:I
     321: putfield      #137                // Field android/support/v4/app/c.g:I
     324: aload         6
     326: aload_0
     327: getfield      #56                 // Field c:I
     330: putfield      #138                // Field android/support/v4/app/c.h:I
     333: aload         6
     335: aload_0
     336: getfield      #62                 // Field d:Ljava/lang/String;
     339: putfield      #140                // Field android/support/v4/app/c.k:Ljava/lang/String;
     342: aload         6
     344: aload_0
     345: getfield      #64                 // Field e:I
     348: putfield      #143                // Field android/support/v4/app/c.m:I
     351: aload         6
     353: iconst_1
     354: putfield      #107                // Field android/support/v4/app/c.i:Z
     357: aload         6
     359: aload_0
     360: getfield      #66                 // Field f:I
     363: putfield      #146                // Field android/support/v4/app/c.n:I
     366: aload         6
     368: aload_0
     369: getfield      #81                 // Field g:Ljava/lang/CharSequence;
     372: putfield      #149                // Field android/support/v4/app/c.o:Ljava/lang/CharSequence;
     375: aload         6
     377: aload_0
     378: getfield      #83                 // Field h:I
     381: putfield      #152                // Field android/support/v4/app/c.p:I
     384: aload         6
     386: aload_0
     387: getfield      #85                 // Field i:Ljava/lang/CharSequence;
     390: putfield      #155                // Field android/support/v4/app/c.q:Ljava/lang/CharSequence;
     393: aload         6
     395: aload_0
     396: getfield      #91                 // Field j:Ljava/util/ArrayList;
     399: putfield      #158                // Field android/support/v4/app/c.r:Ljava/util/ArrayList;
     402: aload         6
     404: aload_0
     405: getfield      #93                 // Field k:Ljava/util/ArrayList;
     408: putfield      #161                // Field android/support/v4/app/c.s:Ljava/util/ArrayList;
     411: aload         6
     413: aload_0
     414: getfield      #95                 // Field l:Z
     417: putfield      #164                // Field android/support/v4/app/c.t:Z
     420: aload         6
     422: iconst_1
     423: invokevirtual #219                // Method android/support/v4/app/c.a:(I)V
     426: aload         6
     428: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #224                // class java/lang/RuntimeException
       3: dup
       4: ldc           #226                // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #229                // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
