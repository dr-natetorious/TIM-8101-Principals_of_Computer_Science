public abstract class android.support.v4.media.session.b$a extends android.os.Binder implements android.support.v4.media.session.b {
  public static android.support.v4.media.session.b a(android.os.IBinder);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_0
       7: ldc           #12                 // String android.support.v4.media.session.IMediaSession
       9: invokeinterface #18,  2           // InterfaceMethod android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
      14: astore_1
      15: aload_1
      16: ifnull        31
      19: aload_1
      20: instanceof    #6                  // class android/support/v4/media/session/b
      23: ifeq          31
      26: aload_1
      27: checkcast     #6                  // class android/support/v4/media/session/b
      30: areturn
      31: new           #9                  // class android/support/v4/media/session/b$a$a
      34: dup
      35: aload_0
      36: invokespecial #22                 // Method android/support/v4/media/session/b$a$a."<init>":(Landroid/os/IBinder;)V
      39: areturn

  public android.os.IBinder asBinder();
    Code:
       0: aload_0
       1: areturn

  public boolean onTransact(int, android.os.Parcel, android.os.Parcel, int);
    Code:
       0: new           #29                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #31                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #36                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
