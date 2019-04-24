public class android.support.v7.widget.LinearLayoutManager$d implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v7.widget.LinearLayoutManager$d> CREATOR;

  int a;

  int b;

  boolean c;

  static {};
    Code:
       0: new           #11                 // class android/support/v7/widget/LinearLayoutManager$d$1
       3: dup
       4: invokespecial #24                 // Method android/support/v7/widget/LinearLayoutManager$d$1."<init>":()V
       7: putstatic     #26                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.v7.widget.LinearLayoutManager$d();
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: return

  android.support.v7.widget.LinearLayoutManager$d(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #35                 // Method android/os/Parcel.readInt:()I
       9: putfield      #37                 // Field a:I
      12: aload_0
      13: aload_1
      14: invokevirtual #35                 // Method android/os/Parcel.readInt:()I
      17: putfield      #39                 // Field b:I
      20: aload_1
      21: invokevirtual #35                 // Method android/os/Parcel.readInt:()I
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
      39: putfield      #41                 // Field c:Z
      42: return

  public android.support.v7.widget.LinearLayoutManager$d(android.support.v7.widget.LinearLayoutManager$d);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: getfield      #37                 // Field a:I
       9: putfield      #37                 // Field a:I
      12: aload_0
      13: aload_1
      14: getfield      #39                 // Field b:I
      17: putfield      #39                 // Field b:I
      20: aload_0
      21: aload_1
      22: getfield      #41                 // Field c:Z
      25: putfield      #41                 // Field c:Z
      28: return

  boolean a();
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:I
       4: iflt          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  void b();
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #37                 // Field a:I
       5: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #48                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #50                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #55                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
