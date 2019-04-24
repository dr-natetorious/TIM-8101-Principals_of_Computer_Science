public final class ryey.easer.core.log.e extends ryey.easer.core.log.b {
  public static final ryey.easer.core.log.e$a CREATOR;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/log/e$a
       3: dup
       4: aconst_null
       5: invokespecial #19                 // Method ryey/easer/core/log/e$a."<init>":(La/b/b/a;)V
       8: putstatic     #21                 // Field CREATOR:Lryey/easer/core/log/e$a;
      11: return

  public ryey.easer.core.log.e(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #25                 // String parcel
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: invokespecial #32                 // Method ryey/easer/core/log/b."<init>":(Landroid/os/Parcel;)V
      11: aload_1
      12: invokevirtual #38                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      15: astore_3
      16: aload_3
      17: ldc           #40                 // String parcel.readString()
      19: invokestatic  #42                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      22: aload_0
      23: aload_3
      24: putfield      #44                 // Field b:Ljava/lang/String;
      27: aload_1
      28: invokevirtual #48                 // Method android/os/Parcel.readByte:()B
      31: ifle          39
      34: iconst_1
      35: istore_2
      36: goto          41
      39: iconst_0
      40: istore_2
      41: aload_0
      42: iload_2
      43: putfield      #50                 // Field c:Z
      46: return

  public ryey.easer.core.log.e(java.lang.String, boolean, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #53                 // String serviceName
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_3
       8: lconst_0
       9: iconst_2
      10: aconst_null
      11: invokespecial #56                 // Method ryey/easer/core/log/b."<init>":(Ljava/lang/String;JILa/b/b/a;)V
      14: aload_0
      15: aload_1
      16: putfield      #44                 // Field b:Ljava/lang/String;
      19: aload_0
      20: iload_2
      21: putfield      #50                 // Field c:Z
      24: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public final java.lang.String e();
    Code:
       0: aload_0
       1: getfield      #44                 // Field b:Ljava/lang/String;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #63                 // Method ryey/easer/core/log/b.equals:(Ljava/lang/Object;)Z
       5: ifne          10
       8: iconst_0
       9: ireturn
      10: aload_1
      11: ifnonnull     24
      14: new           #65                 // class a/b
      17: dup
      18: ldc           #67                 // String null cannot be cast to non-null type ryey.easer.core.log.ServiceLog
      20: invokespecial #70                 // Method a/b."<init>":(Ljava/lang/String;)V
      23: athrow
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/core/log/e
      28: astore_1
      29: aload_0
      30: getfield      #44                 // Field b:Ljava/lang/String;
      33: aload_1
      34: getfield      #44                 // Field b:Ljava/lang/String;
      37: invokestatic  #73                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      40: iconst_1
      41: ixor
      42: ifeq          47
      45: iconst_0
      46: ireturn
      47: aload_0
      48: getfield      #50                 // Field c:Z
      51: aload_1
      52: getfield      #50                 // Field c:Z
      55: if_icmpeq     60
      58: iconst_0
      59: ireturn
      60: iconst_1
      61: ireturn

  public final boolean f();
    Code:
       0: aload_0
       1: getfield      #50                 // Field c:Z
       4: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokespecial #78                 // Method ryey/easer/core/log/b.hashCode:()I
       4: bipush        31
       6: imul
       7: aload_0
       8: getfield      #44                 // Field b:Ljava/lang/String;
      11: invokevirtual #81                 // Method java/lang/String.hashCode:()I
      14: iadd
      15: bipush        31
      17: imul
      18: aload_0
      19: getfield      #50                 // Field c:Z
      22: invokestatic  #87                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      25: invokevirtual #90                 // Method java/lang/Object.hashCode:()I
      28: iadd
      29: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #94                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #96                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #99                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
