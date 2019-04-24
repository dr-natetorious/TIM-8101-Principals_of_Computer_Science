public final class ryey.easer.core.log.d extends ryey.easer.core.log.b {
  public static final ryey.easer.core.log.d$a CREATOR;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/log/d$a
       3: dup
       4: aconst_null
       5: invokespecial #20                 // Method ryey/easer/core/log/d$a."<init>":(La/b/b/a;)V
       8: putstatic     #22                 // Field CREATOR:Lryey/easer/core/log/d$a;
      11: return

  protected ryey.easer.core.log.d(android.os.Parcel);
    Code:
       0: aload_1
       1: ldc           #26                 // String parcel
       3: invokestatic  #31                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: invokespecial #33                 // Method ryey/easer/core/log/b."<init>":(Landroid/os/Parcel;)V
      11: aload_1
      12: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      15: astore_3
      16: aload_3
      17: ldc           #41                 // String parcel.readString()
      19: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      22: aload_0
      23: aload_3
      24: putfield      #45                 // Field b:Ljava/lang/String;
      27: aload_1
      28: invokevirtual #49                 // Method android/os/Parcel.readByte:()B
      31: ifle          39
      34: iconst_1
      35: istore_2
      36: goto          41
      39: iconst_0
      40: istore_2
      41: aload_0
      42: iload_2
      43: putfield      #51                 // Field c:Z
      46: aload_0
      47: aload_1
      48: invokevirtual #39                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      51: putfield      #53                 // Field d:Ljava/lang/String;
      54: return

  public ryey.easer.core.log.d(java.lang.String, boolean, java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #56                 // String scriptName
       3: invokestatic  #31                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload         4
       9: lconst_0
      10: iconst_2
      11: aconst_null
      12: invokespecial #59                 // Method ryey/easer/core/log/b."<init>":(Ljava/lang/String;JILa/b/b/a;)V
      15: aload_0
      16: aload_1
      17: putfield      #45                 // Field b:Ljava/lang/String;
      20: aload_0
      21: iload_2
      22: putfield      #51                 // Field c:Z
      25: aload_0
      26: aload_3
      27: putfield      #53                 // Field d:Ljava/lang/String;
      30: return

  public final java.lang.String e();
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Ljava/lang/String;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #64                 // Method ryey/easer/core/log/b.equals:(Ljava/lang/Object;)Z
       5: ifne          10
       8: iconst_0
       9: ireturn
      10: aload_1
      11: ifnonnull     24
      14: new           #66                 // class a/b
      17: dup
      18: ldc           #68                 // String null cannot be cast to non-null type ryey.easer.core.log.ScriptSatisfactionLog
      20: invokespecial #71                 // Method a/b."<init>":(Ljava/lang/String;)V
      23: athrow
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/core/log/d
      28: astore_1
      29: aload_0
      30: getfield      #45                 // Field b:Ljava/lang/String;
      33: aload_1
      34: getfield      #45                 // Field b:Ljava/lang/String;
      37: invokestatic  #76                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      40: ifne          45
      43: iconst_0
      44: ireturn
      45: aload_0
      46: getfield      #51                 // Field c:Z
      49: aload_0
      50: getfield      #51                 // Field c:Z
      53: if_icmpeq     58
      56: iconst_0
      57: ireturn
      58: aload_0
      59: getfield      #53                 // Field d:Ljava/lang/String;
      62: aload_1
      63: getfield      #53                 // Field d:Ljava/lang/String;
      66: invokestatic  #76                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      69: ifne          74
      72: iconst_0
      73: ireturn
      74: iconst_1
      75: ireturn

  public final boolean f();
    Code:
       0: aload_0
       1: getfield      #51                 // Field c:Z
       4: ireturn

  public final java.lang.String g();
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:Ljava/lang/String;
       4: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: invokespecial #83                 // Method ryey/easer/core/log/b.hashCode:()I
       4: istore_2
       5: aload_0
       6: getfield      #45                 // Field b:Ljava/lang/String;
       9: invokevirtual #86                 // Method java/lang/String.hashCode:()I
      12: istore_3
      13: aload_0
      14: getfield      #51                 // Field c:Z
      17: invokestatic  #92                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      20: invokevirtual #95                 // Method java/lang/Object.hashCode:()I
      23: istore        4
      25: aload_0
      26: getfield      #53                 // Field d:Ljava/lang/String;
      29: astore        5
      31: aload         5
      33: ifnull        45
      36: aload         5
      38: invokevirtual #86                 // Method java/lang/String.hashCode:()I
      41: istore_1
      42: goto          47
      45: iconst_0
      46: istore_1
      47: iload_2
      48: bipush        31
      50: imul
      51: iload_3
      52: iadd
      53: bipush        31
      55: imul
      56: iload         4
      58: iadd
      59: bipush        31
      61: imul
      62: iload_1
      63: iadd
      64: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #99                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #101                // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #104                // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
