final class android.support.v4.app.s implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.app.s> CREATOR;

  final java.lang.String a;

  final int b;

  final boolean c;

  final int d;

  final int e;

  final java.lang.String f;

  final boolean g;

  final boolean h;

  final android.os.Bundle i;

  final boolean j;

  android.os.Bundle k;

  android.support.v4.app.i l;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/app/s$1
       3: dup
       4: invokespecial #33                 // Method android/support/v4/app/s$1."<init>":()V
       7: putstatic     #35                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.app.s(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #38                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #44                 // Method android/os/Parcel.readString:()Ljava/lang/String;
       9: putfield      #46                 // Field a:Ljava/lang/String;
      12: aload_0
      13: aload_1
      14: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      17: putfield      #52                 // Field b:I
      20: aload_1
      21: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      24: istore_2
      25: iconst_0
      26: istore        4
      28: iload_2
      29: ifeq          37
      32: iconst_1
      33: istore_3
      34: goto          39
      37: iconst_0
      38: istore_3
      39: aload_0
      40: iload_3
      41: putfield      #54                 // Field c:Z
      44: aload_0
      45: aload_1
      46: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      49: putfield      #56                 // Field d:I
      52: aload_0
      53: aload_1
      54: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      57: putfield      #58                 // Field e:I
      60: aload_0
      61: aload_1
      62: invokevirtual #44                 // Method android/os/Parcel.readString:()Ljava/lang/String;
      65: putfield      #60                 // Field f:Ljava/lang/String;
      68: aload_1
      69: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      72: ifeq          80
      75: iconst_1
      76: istore_3
      77: goto          82
      80: iconst_0
      81: istore_3
      82: aload_0
      83: iload_3
      84: putfield      #62                 // Field g:Z
      87: aload_1
      88: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
      91: ifeq          99
      94: iconst_1
      95: istore_3
      96: goto          101
      99: iconst_0
     100: istore_3
     101: aload_0
     102: iload_3
     103: putfield      #64                 // Field h:Z
     106: aload_0
     107: aload_1
     108: invokevirtual #68                 // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
     111: putfield      #70                 // Field i:Landroid/os/Bundle;
     114: iload         4
     116: istore_3
     117: aload_1
     118: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     121: ifeq          126
     124: iconst_1
     125: istore_3
     126: aload_0
     127: iload_3
     128: putfield      #72                 // Field j:Z
     131: aload_0
     132: aload_1
     133: invokevirtual #68                 // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
     136: putfield      #74                 // Field k:Landroid/os/Bundle;
     139: return

  android.support.v4.app.s(android.support.v4.app.i);
    Code:
       0: aload_0
       1: invokespecial #38                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #79                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       9: invokevirtual #84                 // Method java/lang/Class.getName:()Ljava/lang/String;
      12: putfield      #46                 // Field a:Ljava/lang/String;
      15: aload_0
      16: aload_1
      17: getfield      #89                 // Field android/support/v4/app/i.mIndex:I
      20: putfield      #52                 // Field b:I
      23: aload_0
      24: aload_1
      25: getfield      #92                 // Field android/support/v4/app/i.mFromLayout:Z
      28: putfield      #54                 // Field c:Z
      31: aload_0
      32: aload_1
      33: getfield      #95                 // Field android/support/v4/app/i.mFragmentId:I
      36: putfield      #56                 // Field d:I
      39: aload_0
      40: aload_1
      41: getfield      #98                 // Field android/support/v4/app/i.mContainerId:I
      44: putfield      #58                 // Field e:I
      47: aload_0
      48: aload_1
      49: getfield      #101                // Field android/support/v4/app/i.mTag:Ljava/lang/String;
      52: putfield      #60                 // Field f:Ljava/lang/String;
      55: aload_0
      56: aload_1
      57: getfield      #104                // Field android/support/v4/app/i.mRetainInstance:Z
      60: putfield      #62                 // Field g:Z
      63: aload_0
      64: aload_1
      65: getfield      #107                // Field android/support/v4/app/i.mDetached:Z
      68: putfield      #64                 // Field h:Z
      71: aload_0
      72: aload_1
      73: getfield      #110                // Field android/support/v4/app/i.mArguments:Landroid/os/Bundle;
      76: putfield      #70                 // Field i:Landroid/os/Bundle;
      79: aload_0
      80: aload_1
      81: getfield      #113                // Field android/support/v4/app/i.mHidden:Z
      84: putfield      #72                 // Field j:Z
      87: return

  public android.support.v4.app.i a(android.support.v4.app.m, android.support.v4.app.k, android.support.v4.app.i, android.support.v4.app.p, android.arch.lifecycle.p);
    Code:
       0: aload_0
       1: getfield      #116                // Field l:Landroid/support/v4/app/i;
       4: ifnonnull     254
       7: aload_1
       8: invokevirtual #121                // Method android/support/v4/app/m.i:()Landroid/content/Context;
      11: astore        6
      13: aload_0
      14: getfield      #70                 // Field i:Landroid/os/Bundle;
      17: ifnull        32
      20: aload_0
      21: getfield      #70                 // Field i:Landroid/os/Bundle;
      24: aload         6
      26: invokevirtual #127                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
      29: invokevirtual #133                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      32: aload_2
      33: ifnull        59
      36: aload_2
      37: aload         6
      39: aload_0
      40: getfield      #46                 // Field a:Ljava/lang/String;
      43: aload_0
      44: getfield      #70                 // Field i:Landroid/os/Bundle;
      47: invokevirtual #138                // Method android/support/v4/app/k.a:(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/i;
      50: astore_2
      51: aload_0
      52: aload_2
      53: putfield      #116                // Field l:Landroid/support/v4/app/i;
      56: goto          76
      59: aload         6
      61: aload_0
      62: getfield      #46                 // Field a:Ljava/lang/String;
      65: aload_0
      66: getfield      #70                 // Field i:Landroid/os/Bundle;
      69: invokestatic  #141                // Method android/support/v4/app/i.instantiate:(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/i;
      72: astore_2
      73: goto          51
      76: aload_0
      77: getfield      #74                 // Field k:Landroid/os/Bundle;
      80: ifnull        106
      83: aload_0
      84: getfield      #74                 // Field k:Landroid/os/Bundle;
      87: aload         6
      89: invokevirtual #127                // Method android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
      92: invokevirtual #133                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      95: aload_0
      96: getfield      #116                // Field l:Landroid/support/v4/app/i;
      99: aload_0
     100: getfield      #74                 // Field k:Landroid/os/Bundle;
     103: putfield      #144                // Field android/support/v4/app/i.mSavedFragmentState:Landroid/os/Bundle;
     106: aload_0
     107: getfield      #116                // Field l:Landroid/support/v4/app/i;
     110: aload_0
     111: getfield      #52                 // Field b:I
     114: aload_3
     115: invokevirtual #148                // Method android/support/v4/app/i.setIndex:(ILandroid/support/v4/app/i;)V
     118: aload_0
     119: getfield      #116                // Field l:Landroid/support/v4/app/i;
     122: aload_0
     123: getfield      #54                 // Field c:Z
     126: putfield      #92                 // Field android/support/v4/app/i.mFromLayout:Z
     129: aload_0
     130: getfield      #116                // Field l:Landroid/support/v4/app/i;
     133: iconst_1
     134: putfield      #151                // Field android/support/v4/app/i.mRestored:Z
     137: aload_0
     138: getfield      #116                // Field l:Landroid/support/v4/app/i;
     141: aload_0
     142: getfield      #56                 // Field d:I
     145: putfield      #95                 // Field android/support/v4/app/i.mFragmentId:I
     148: aload_0
     149: getfield      #116                // Field l:Landroid/support/v4/app/i;
     152: aload_0
     153: getfield      #58                 // Field e:I
     156: putfield      #98                 // Field android/support/v4/app/i.mContainerId:I
     159: aload_0
     160: getfield      #116                // Field l:Landroid/support/v4/app/i;
     163: aload_0
     164: getfield      #60                 // Field f:Ljava/lang/String;
     167: putfield      #101                // Field android/support/v4/app/i.mTag:Ljava/lang/String;
     170: aload_0
     171: getfield      #116                // Field l:Landroid/support/v4/app/i;
     174: aload_0
     175: getfield      #62                 // Field g:Z
     178: putfield      #104                // Field android/support/v4/app/i.mRetainInstance:Z
     181: aload_0
     182: getfield      #116                // Field l:Landroid/support/v4/app/i;
     185: aload_0
     186: getfield      #64                 // Field h:Z
     189: putfield      #107                // Field android/support/v4/app/i.mDetached:Z
     192: aload_0
     193: getfield      #116                // Field l:Landroid/support/v4/app/i;
     196: aload_0
     197: getfield      #72                 // Field j:Z
     200: putfield      #113                // Field android/support/v4/app/i.mHidden:Z
     203: aload_0
     204: getfield      #116                // Field l:Landroid/support/v4/app/i;
     207: aload_1
     208: getfield      #154                // Field android/support/v4/app/m.d:Landroid/support/v4/app/o;
     211: putfield      #157                // Field android/support/v4/app/i.mFragmentManager:Landroid/support/v4/app/o;
     214: getstatic     #161                // Field android/support/v4/app/o.a:Z
     217: ifeq          254
     220: new           #163                // class java/lang/StringBuilder
     223: dup
     224: invokespecial #164                // Method java/lang/StringBuilder."<init>":()V
     227: astore_1
     228: aload_1
     229: ldc           #166                // String Instantiated fragment
     231: invokevirtual #170                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     234: pop
     235: aload_1
     236: aload_0
     237: getfield      #116                // Field l:Landroid/support/v4/app/i;
     240: invokevirtual #173                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     243: pop
     244: ldc           #175                // String FragmentManager
     246: aload_1
     247: invokevirtual #178                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     250: invokestatic  #184                // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
     253: pop
     254: aload_0
     255: getfield      #116                // Field l:Landroid/support/v4/app/i;
     258: aload         4
     260: putfield      #188                // Field android/support/v4/app/i.mChildNonConfig:Landroid/support/v4/app/p;
     263: aload_0
     264: getfield      #116                // Field l:Landroid/support/v4/app/i;
     267: aload         5
     269: putfield      #192                // Field android/support/v4/app/i.mViewModelStore:Landroid/arch/lifecycle/p;
     272: aload_0
     273: getfield      #116                // Field l:Landroid/support/v4/app/i;
     276: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: new           #197                // class java/lang/RuntimeException
       3: dup
       4: ldc           #199                // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #204                // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
