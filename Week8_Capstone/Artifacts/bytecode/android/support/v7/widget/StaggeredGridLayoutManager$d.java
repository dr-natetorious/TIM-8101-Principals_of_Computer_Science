public class android.support.v7.widget.StaggeredGridLayoutManager$d implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v7.widget.StaggeredGridLayoutManager$d> CREATOR;

  int a;

  int b;

  int c;

  int[] d;

  int e;

  int[] f;

  java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$c$a> g;

  boolean h;

  boolean i;

  boolean j;

  static {};
    Code:
       0: new           #11                 // class android/support/v7/widget/StaggeredGridLayoutManager$d$1
       3: dup
       4: invokespecial #33                 // Method android/support/v7/widget/StaggeredGridLayoutManager$d$1."<init>":()V
       7: putstatic     #35                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.v7.widget.StaggeredGridLayoutManager$d();
    Code:
       0: aload_0
       1: invokespecial #37                 // Method java/lang/Object."<init>":()V
       4: return

  android.support.v7.widget.StaggeredGridLayoutManager$d(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #37                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
       9: putfield      #46                 // Field a:I
      12: aload_0
      13: aload_1
      14: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
      17: putfield      #48                 // Field b:I
      20: aload_0
      21: aload_1
      22: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
      25: putfield      #50                 // Field c:I
      28: aload_0
      29: getfield      #50                 // Field c:I
      32: ifle          53
      35: aload_0
      36: aload_0
      37: getfield      #50                 // Field c:I
      40: newarray       int
      42: putfield      #52                 // Field d:[I
      45: aload_1
      46: aload_0
      47: getfield      #52                 // Field d:[I
      50: invokevirtual #56                 // Method android/os/Parcel.readIntArray:([I)V
      53: aload_0
      54: aload_1
      55: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
      58: putfield      #58                 // Field e:I
      61: aload_0
      62: getfield      #58                 // Field e:I
      65: ifle          86
      68: aload_0
      69: aload_0
      70: getfield      #58                 // Field e:I
      73: newarray       int
      75: putfield      #60                 // Field f:[I
      78: aload_1
      79: aload_0
      80: getfield      #60                 // Field f:[I
      83: invokevirtual #56                 // Method android/os/Parcel.readIntArray:([I)V
      86: aload_1
      87: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
      90: istore_2
      91: iconst_0
      92: istore        4
      94: iload_2
      95: iconst_1
      96: if_icmpne     104
      99: iconst_1
     100: istore_3
     101: goto          106
     104: iconst_0
     105: istore_3
     106: aload_0
     107: iload_3
     108: putfield      #62                 // Field h:Z
     111: aload_1
     112: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
     115: iconst_1
     116: if_icmpne     124
     119: iconst_1
     120: istore_3
     121: goto          126
     124: iconst_0
     125: istore_3
     126: aload_0
     127: iload_3
     128: putfield      #64                 // Field i:Z
     131: iload         4
     133: istore_3
     134: aload_1
     135: invokevirtual #44                 // Method android/os/Parcel.readInt:()I
     138: iconst_1
     139: if_icmpne     144
     142: iconst_1
     143: istore_3
     144: aload_0
     145: iload_3
     146: putfield      #66                 // Field j:Z
     149: aload_0
     150: aload_1
     151: ldc           #68                 // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
     153: invokevirtual #74                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
     156: invokevirtual #78                 // Method android/os/Parcel.readArrayList:(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
     159: putfield      #80                 // Field g:Ljava/util/List;
     162: return

  public android.support.v7.widget.StaggeredGridLayoutManager$d(android.support.v7.widget.StaggeredGridLayoutManager$d);
    Code:
       0: aload_0
       1: invokespecial #37                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: getfield      #50                 // Field c:I
       9: putfield      #50                 // Field c:I
      12: aload_0
      13: aload_1
      14: getfield      #46                 // Field a:I
      17: putfield      #46                 // Field a:I
      20: aload_0
      21: aload_1
      22: getfield      #48                 // Field b:I
      25: putfield      #48                 // Field b:I
      28: aload_0
      29: aload_1
      30: getfield      #52                 // Field d:[I
      33: putfield      #52                 // Field d:[I
      36: aload_0
      37: aload_1
      38: getfield      #58                 // Field e:I
      41: putfield      #58                 // Field e:I
      44: aload_0
      45: aload_1
      46: getfield      #60                 // Field f:[I
      49: putfield      #60                 // Field f:[I
      52: aload_0
      53: aload_1
      54: getfield      #62                 // Field h:Z
      57: putfield      #62                 // Field h:Z
      60: aload_0
      61: aload_1
      62: getfield      #64                 // Field i:Z
      65: putfield      #64                 // Field i:Z
      68: aload_0
      69: aload_1
      70: getfield      #66                 // Field j:Z
      73: putfield      #66                 // Field j:Z
      76: aload_0
      77: aload_1
      78: getfield      #80                 // Field g:Ljava/util/List;
      81: putfield      #80                 // Field g:Ljava/util/List;
      84: return

  void a();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #52                 // Field d:[I
       5: aload_0
       6: iconst_0
       7: putfield      #50                 // Field c:I
      10: aload_0
      11: iconst_0
      12: putfield      #58                 // Field e:I
      15: aload_0
      16: aconst_null
      17: putfield      #60                 // Field f:[I
      20: aload_0
      21: aconst_null
      22: putfield      #80                 // Field g:Ljava/util/List;
      25: return

  void b();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #52                 // Field d:[I
       5: aload_0
       6: iconst_0
       7: putfield      #50                 // Field c:I
      10: aload_0
      11: iconst_m1
      12: putfield      #46                 // Field a:I
      15: aload_0
      16: iconst_m1
      17: putfield      #48                 // Field b:I
      20: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #86                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #88                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #93                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
