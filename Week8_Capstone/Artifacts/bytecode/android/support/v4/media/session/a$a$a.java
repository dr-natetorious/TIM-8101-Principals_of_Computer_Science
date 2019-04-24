class android.support.v4.media.session.a$a$a implements android.support.v4.media.session.a {
  android.support.v4.media.session.a$a$a(android.os.IBinder);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/os/IBinder;
       9: return

  public void a();
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: aload_1
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/os/IBinder;
      14: iconst_2
      15: aload_1
      16: aconst_null
      17: iconst_1
      18: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      23: pop
      24: aload_1
      25: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      28: return
      29: astore_2
      30: aload_1
      31: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      34: aload_2
      35: athrow
    Exception table:
       from    to  target type
           4    24    29   any

  public void a(int);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_2
      11: iload_1
      12: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: bipush        9
      21: aload_2
      22: aconst_null
      23: iconst_1
      24: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      29: pop
      30: aload_2
      31: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      34: return
      35: astore_3
      36: aload_2
      37: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      40: aload_3
      41: athrow
    Exception table:
       from    to  target type
           4    30    35   any

  public void a(android.os.Bundle);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_1
      11: ifnull        28
      14: aload_2
      15: iconst_1
      16: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_1
      20: aload_2
      21: iconst_0
      22: invokevirtual #50                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      25: goto          33
      28: aload_2
      29: iconst_0
      30: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: bipush        7
      39: aload_2
      40: aconst_null
      41: iconst_1
      42: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      47: pop
      48: aload_2
      49: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      52: return
      53: astore_1
      54: aload_2
      55: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      58: aload_1
      59: athrow
    Exception table:
       from    to  target type
           4    10    53   any
          14    25    53   any
          28    33    53   any
          33    48    53   any

  public void a(android.support.v4.media.MediaMetadataCompat);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_1
      11: ifnull        28
      14: aload_2
      15: iconst_1
      16: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_1
      20: aload_2
      21: iconst_0
      22: invokevirtual #54                 // Method android/support/v4/media/MediaMetadataCompat.writeToParcel:(Landroid/os/Parcel;I)V
      25: goto          33
      28: aload_2
      29: iconst_0
      30: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: iconst_4
      38: aload_2
      39: aconst_null
      40: iconst_1
      41: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      46: pop
      47: aload_2
      48: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      51: return
      52: astore_1
      53: aload_2
      54: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      57: aload_1
      58: athrow
    Exception table:
       from    to  target type
           4    10    52   any
          14    25    52   any
          28    33    52   any
          33    47    52   any

  public void a(android.support.v4.media.session.ParcelableVolumeInfo);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_1
      11: ifnull        28
      14: aload_2
      15: iconst_1
      16: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_1
      20: aload_2
      21: iconst_0
      22: invokevirtual #58                 // Method android/support/v4/media/session/ParcelableVolumeInfo.writeToParcel:(Landroid/os/Parcel;I)V
      25: goto          33
      28: aload_2
      29: iconst_0
      30: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: bipush        8
      39: aload_2
      40: aconst_null
      41: iconst_1
      42: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      47: pop
      48: aload_2
      49: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      52: return
      53: astore_1
      54: aload_2
      55: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      58: aload_1
      59: athrow
    Exception table:
       from    to  target type
           4    10    53   any
          14    25    53   any
          28    33    53   any
          33    48    53   any

  public void a(android.support.v4.media.session.PlaybackStateCompat);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_1
      11: ifnull        28
      14: aload_2
      15: iconst_1
      16: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_1
      20: aload_2
      21: iconst_0
      22: invokevirtual #62                 // Method android/support/v4/media/session/PlaybackStateCompat.writeToParcel:(Landroid/os/Parcel;I)V
      25: goto          33
      28: aload_2
      29: iconst_0
      30: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: iconst_3
      38: aload_2
      39: aconst_null
      40: iconst_1
      41: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      46: pop
      47: aload_2
      48: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      51: return
      52: astore_1
      53: aload_2
      54: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      57: aload_1
      58: athrow
    Exception table:
       from    to  target type
           4    10    52   any
          14    25    52   any
          28    33    52   any
          33    47    52   any

  public void a(java.lang.CharSequence);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_1
      11: ifnull        28
      14: aload_2
      15: iconst_1
      16: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_1
      20: aload_2
      21: iconst_0
      22: invokestatic  #68                 // Method android/text/TextUtils.writeToParcel:(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
      25: goto          33
      28: aload_2
      29: iconst_0
      30: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: bipush        6
      39: aload_2
      40: aconst_null
      41: iconst_1
      42: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      47: pop
      48: aload_2
      49: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      52: return
      53: astore_1
      54: aload_2
      55: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      58: aload_1
      59: athrow
    Exception table:
       from    to  target type
           4    10    53   any
          14    25    53   any
          28    33    53   any
          33    48    53   any

  public void a(java.lang.String, android.os.Bundle);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: aload_3
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_3
      11: aload_1
      12: invokevirtual #72                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      15: aload_2
      16: ifnull        33
      19: aload_3
      20: iconst_1
      21: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_2
      25: aload_3
      26: iconst_0
      27: invokevirtual #50                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      30: goto          38
      33: aload_3
      34: iconst_0
      35: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      38: aload_0
      39: getfield      #17                 // Field a:Landroid/os/IBinder;
      42: iconst_1
      43: aload_3
      44: aconst_null
      45: iconst_1
      46: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload_3
      53: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      56: return
      57: astore_1
      58: aload_3
      59: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      62: aload_1
      63: athrow
    Exception table:
       from    to  target type
           4    15    57   any
          19    30    57   any
          33    38    57   any
          38    52    57   any

  public void a(java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem>);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_2
      11: aload_1
      12: invokevirtual #76                 // Method android/os/Parcel.writeTypedList:(Ljava/util/List;)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: iconst_5
      20: aload_2
      21: aconst_null
      22: iconst_1
      23: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      33: return
      34: astore_1
      35: aload_2
      36: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      39: aload_1
      40: athrow
    Exception table:
       from    to  target type
           4    29    34   any

  public void a(boolean);
    Code:
       0: new           #81                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #83                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #87                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow

  public android.os.IBinder asBinder();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/os/IBinder;
       4: areturn

  public void b();
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: aload_1
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/os/IBinder;
      14: bipush        13
      16: aload_1
      17: aconst_null
      18: iconst_1
      19: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      24: pop
      25: aload_1
      26: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      29: return
      30: astore_2
      31: aload_1
      32: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      35: aload_2
      36: athrow
    Exception table:
       from    to  target type
           4    25    30   any

  public void b(int);
    Code:
       0: invokestatic  #24                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: aload_2
       5: ldc           #26                 // String android.support.v4.media.session.IMediaControllerCallback
       7: invokevirtual #30                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      10: aload_2
      11: iload_1
      12: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: bipush        12
      21: aload_2
      22: aconst_null
      23: iconst_1
      24: invokeinterface #36,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      29: pop
      30: aload_2
      31: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      34: return
      35: astore_3
      36: aload_2
      37: invokevirtual #39                 // Method android/os/Parcel.recycle:()V
      40: aload_3
      41: athrow
    Exception table:
       from    to  target type
           4    30    35   any

  public void b(boolean);
    Code:
       0: new           #81                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #83                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #87                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow
}
