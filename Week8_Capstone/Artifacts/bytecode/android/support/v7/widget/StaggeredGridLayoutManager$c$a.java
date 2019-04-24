class android.support.v7.widget.StaggeredGridLayoutManager$c$a implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v7.widget.StaggeredGridLayoutManager$c$a> CREATOR;

  int a;

  int b;

  int[] c;

  boolean d;

  static {};
    Code:
       0: new           #14                 // class android/support/v7/widget/StaggeredGridLayoutManager$c$a$1
       3: dup
       4: invokespecial #27                 // Method android/support/v7/widget/StaggeredGridLayoutManager$c$a$1."<init>":()V
       7: putstatic     #29                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v7.widget.StaggeredGridLayoutManager$c$a();
    Code:
       0: aload_0
       1: invokespecial #31                 // Method java/lang/Object."<init>":()V
       4: return

  android.support.v7.widget.StaggeredGridLayoutManager$c$a(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #38                 // Method android/os/Parcel.readInt:()I
       9: putfield      #40                 // Field a:I
      12: aload_0
      13: aload_1
      14: invokevirtual #38                 // Method android/os/Parcel.readInt:()I
      17: putfield      #42                 // Field b:I
      20: aload_1
      21: invokevirtual #38                 // Method android/os/Parcel.readInt:()I
      24: istore_2
      25: iconst_1
      26: istore_3
      27: iload_2
      28: iconst_1
      29: if_icmpne     35
      32: goto          37
      35: iconst_0
      36: istore_3
      37: aload_0
      38: iload_3
      39: putfield      #44                 // Field d:Z
      42: aload_1
      43: invokevirtual #38                 // Method android/os/Parcel.readInt:()I
      46: istore_2
      47: iload_2
      48: ifle          66
      51: aload_0
      52: iload_2
      53: newarray       int
      55: putfield      #46                 // Field c:[I
      58: aload_1
      59: aload_0
      60: getfield      #46                 // Field c:[I
      63: invokevirtual #50                 // Method android/os/Parcel.readIntArray:([I)V
      66: return

  int a(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field c:[I
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #46                 // Field c:[I
      13: iload_1
      14: iaload
      15: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: new           #56                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #57                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #59                 // String FullSpanItem{mPosition=
      11: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #40                 // Field a:I
      20: invokevirtual #66                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #68                 // String , mGapDir=
      27: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #42                 // Field b:I
      36: invokevirtual #66                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #70                 // String , mHasUnwantedGapAfter=
      43: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #44                 // Field d:Z
      52: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: ldc           #75                 // String , mGapPerSpan=
      59: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: aload_0
      65: getfield      #46                 // Field c:[I
      68: invokestatic  #80                 // Method java/util/Arrays.toString:([I)Ljava/lang/String;
      71: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      74: pop
      75: aload_1
      76: bipush        125
      78: invokevirtual #83                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      81: pop
      82: aload_1
      83: invokevirtual #85                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      86: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #89                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #91                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #96                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
