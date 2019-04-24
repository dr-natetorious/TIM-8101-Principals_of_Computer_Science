class android.support.v4.media.session.b$a$a implements android.support.v4.media.session.b {
  android.support.v4.media.session.b$a$a(android.os.IBinder);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/os/IBinder;
       9: return

  public void a(int);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_2
      15: iload_1
      16: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_0
      20: getfield      #17                 // Field a:Landroid/os/IBinder;
      23: bipush        44
      25: aload_2
      26: aload_3
      27: iconst_0
      28: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      33: pop
      34: aload_3
      35: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      38: aload_3
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_2
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: return
      47: astore        4
      49: aload_3
      50: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      53: aload_2
      54: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      57: aload         4
      59: athrow
    Exception table:
       from    to  target type
           8    38    47   any

  public void a(int, int, java.lang.String);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore        4
       5: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       8: astore        5
      10: aload         4
      12: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      14: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      17: aload         4
      19: iload_1
      20: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      23: aload         4
      25: iload_2
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload         4
      31: aload_3
      32: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      35: aload_0
      36: getfield      #17                 // Field a:Landroid/os/IBinder;
      39: bipush        11
      41: aload         4
      43: aload         5
      45: iconst_0
      46: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload         5
      54: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      57: aload         5
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload         4
      64: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      67: return
      68: astore_3
      69: aload         5
      71: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      74: aload         4
      76: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      79: aload_3
      80: athrow
    Exception table:
       from    to  target type
          10    57    68   any

  public void a(long);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: lload_1
      17: invokevirtual #54                 // Method android/os/Parcel.writeLong:(J)V
      20: aload_0
      21: getfield      #17                 // Field a:Landroid/os/IBinder;
      24: bipush        17
      26: aload_3
      27: aload         4
      29: iconst_0
      30: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      35: pop
      36: aload         4
      38: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      41: aload         4
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: aload_3
      47: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      50: return
      51: astore        5
      53: aload         4
      55: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload         5
      64: athrow
    Exception table:
       from    to  target type
           9    41    51   any

  public void a(android.net.Uri, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_1
      16: ifnull        33
      19: aload_3
      20: iconst_1
      21: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_1
      25: aload_3
      26: iconst_0
      27: invokevirtual #61                 // Method android/net/Uri.writeToParcel:(Landroid/os/Parcel;I)V
      30: goto          38
      33: aload_3
      34: iconst_0
      35: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      38: aload_2
      39: ifnull        56
      42: aload_3
      43: iconst_1
      44: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      47: aload_2
      48: aload_3
      49: iconst_0
      50: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      53: goto          61
      56: aload_3
      57: iconst_0
      58: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      61: aload_0
      62: getfield      #17                 // Field a:Landroid/os/IBinder;
      65: bipush        36
      67: aload_3
      68: aload         4
      70: iconst_0
      71: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      76: pop
      77: aload         4
      79: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      82: aload         4
      84: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      87: aload_3
      88: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      91: return
      92: astore_1
      93: aload         4
      95: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      98: aload_3
      99: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     102: aload_1
     103: athrow
    Exception table:
       from    to  target type
           9    15    92   any
          19    30    92   any
          33    38    92   any
          42    53    92   any
          56    61    92   any
          61    82    92   any

  public void a(android.support.v4.media.MediaDescriptionCompat);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_1
      15: ifnull        32
      18: aload_2
      19: iconst_1
      20: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      23: aload_1
      24: aload_2
      25: iconst_0
      26: invokevirtual #68                 // Method android/support/v4/media/MediaDescriptionCompat.writeToParcel:(Landroid/os/Parcel;I)V
      29: goto          37
      32: aload_2
      33: iconst_0
      34: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      37: aload_0
      38: getfield      #17                 // Field a:Landroid/os/IBinder;
      41: bipush        41
      43: aload_2
      44: aload_3
      45: iconst_0
      46: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload_3
      53: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      56: aload_3
      57: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      60: aload_2
      61: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      64: return
      65: astore_1
      66: aload_3
      67: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      70: aload_2
      71: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      74: aload_1
      75: athrow
    Exception table:
       from    to  target type
           8    14    65   any
          18    29    65   any
          32    37    65   any
          37    56    65   any

  public void a(android.support.v4.media.MediaDescriptionCompat, int);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_1
      16: ifnull        33
      19: aload_3
      20: iconst_1
      21: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_1
      25: aload_3
      26: iconst_0
      27: invokevirtual #68                 // Method android/support/v4/media/MediaDescriptionCompat.writeToParcel:(Landroid/os/Parcel;I)V
      30: goto          38
      33: aload_3
      34: iconst_0
      35: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      38: aload_3
      39: iload_2
      40: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      43: aload_0
      44: getfield      #17                 // Field a:Landroid/os/IBinder;
      47: bipush        42
      49: aload_3
      50: aload         4
      52: iconst_0
      53: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      58: pop
      59: aload         4
      61: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      64: aload         4
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: return
      74: astore_1
      75: aload         4
      77: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      80: aload_3
      81: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      84: aload_1
      85: athrow
    Exception table:
       from    to  target type
           9    15    74   any
          19    30    74   any
          33    38    74   any
          38    64    74   any

  public void a(android.support.v4.media.RatingCompat);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_1
      15: ifnull        32
      18: aload_2
      19: iconst_1
      20: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      23: aload_1
      24: aload_2
      25: iconst_0
      26: invokevirtual #73                 // Method android/support/v4/media/RatingCompat.writeToParcel:(Landroid/os/Parcel;I)V
      29: goto          37
      32: aload_2
      33: iconst_0
      34: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      37: aload_0
      38: getfield      #17                 // Field a:Landroid/os/IBinder;
      41: bipush        25
      43: aload_2
      44: aload_3
      45: iconst_0
      46: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload_3
      53: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      56: aload_3
      57: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      60: aload_2
      61: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      64: return
      65: astore_1
      66: aload_3
      67: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      70: aload_2
      71: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      74: aload_1
      75: athrow
    Exception table:
       from    to  target type
           8    14    65   any
          18    29    65   any
          32    37    65   any
          37    56    65   any

  public void a(android.support.v4.media.RatingCompat, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_1
      16: ifnull        33
      19: aload_3
      20: iconst_1
      21: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_1
      25: aload_3
      26: iconst_0
      27: invokevirtual #73                 // Method android/support/v4/media/RatingCompat.writeToParcel:(Landroid/os/Parcel;I)V
      30: goto          38
      33: aload_3
      34: iconst_0
      35: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      38: aload_2
      39: ifnull        56
      42: aload_3
      43: iconst_1
      44: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      47: aload_2
      48: aload_3
      49: iconst_0
      50: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      53: goto          61
      56: aload_3
      57: iconst_0
      58: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      61: aload_0
      62: getfield      #17                 // Field a:Landroid/os/IBinder;
      65: bipush        51
      67: aload_3
      68: aload         4
      70: iconst_0
      71: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      76: pop
      77: aload         4
      79: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      82: aload         4
      84: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      87: aload_3
      88: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      91: return
      92: astore_1
      93: aload         4
      95: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      98: aload_3
      99: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     102: aload_1
     103: athrow
    Exception table:
       from    to  target type
           9    15    92   any
          19    30    92   any
          33    38    92   any
          42    53    92   any
          56    61    92   any
          61    82    92   any

  public void a(android.support.v4.media.session.a);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_1
      15: ifnull        71
      18: aload_1
      19: invokeinterface #81,  1           // InterfaceMethod android/support/v4/media/session/a.asBinder:()Landroid/os/IBinder;
      24: astore_1
      25: goto          28
      28: aload_2
      29: aload_1
      30: invokevirtual #84                 // Method android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: iconst_3
      38: aload_2
      39: aload_3
      40: iconst_0
      41: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      46: pop
      47: aload_3
      48: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      51: aload_3
      52: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      55: aload_2
      56: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      59: return
      60: astore_1
      61: aload_3
      62: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      65: aload_2
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_1
      70: athrow
      71: aconst_null
      72: astore_1
      73: goto          28
    Exception table:
       from    to  target type
           8    14    60   any
          18    25    60   any
          28    51    60   any

  public void a(java.lang.String, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: aload_1
      17: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      20: aload_2
      21: ifnull        38
      24: aload_3
      25: iconst_1
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload_2
      30: aload_3
      31: iconst_0
      32: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      35: goto          43
      38: aload_3
      39: iconst_0
      40: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      43: aload_0
      44: getfield      #17                 // Field a:Landroid/os/IBinder;
      47: bipush        34
      49: aload_3
      50: aload         4
      52: iconst_0
      53: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      58: pop
      59: aload         4
      61: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      64: aload         4
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: return
      74: astore_1
      75: aload         4
      77: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      80: aload_3
      81: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      84: aload_1
      85: athrow
    Exception table:
       from    to  target type
           9    20    74   any
          24    35    74   any
          38    43    74   any
          43    64    74   any

  public void a(java.lang.String, android.os.Bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore        4
       5: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       8: astore        5
      10: aload         4
      12: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      14: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      17: aload         4
      19: aload_1
      20: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      23: aload_2
      24: ifnull        43
      27: aload         4
      29: iconst_1
      30: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      33: aload_2
      34: aload         4
      36: iconst_0
      37: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      40: goto          49
      43: aload         4
      45: iconst_0
      46: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      49: aload_3
      50: ifnull        69
      53: aload         4
      55: iconst_1
      56: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      59: aload_3
      60: aload         4
      62: iconst_0
      63: invokevirtual #89                 // Method android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper.writeToParcel:(Landroid/os/Parcel;I)V
      66: goto          75
      69: aload         4
      71: iconst_0
      72: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      75: aload_0
      76: getfield      #17                 // Field a:Landroid/os/IBinder;
      79: iconst_1
      80: aload         4
      82: aload         5
      84: iconst_0
      85: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      90: pop
      91: aload         5
      93: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      96: aload         5
      98: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     101: aload         4
     103: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     106: return
     107: astore_1
     108: aload         5
     110: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     113: aload         4
     115: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     118: aload_1
     119: athrow
    Exception table:
       from    to  target type
          10    23   107   any
          27    40   107   any
          43    49   107   any
          53    66   107   any
          69    75   107   any
          75    96   107   any

  public void a(boolean);
    Code:
       0: new           #92                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #94                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #98                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow

  public boolean a();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: astore        5
      21: iconst_0
      22: istore_2
      23: aload         5
      25: iconst_5
      26: aload_3
      27: aload         4
      29: iconst_0
      30: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      35: pop
      36: aload         4
      38: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      41: aload         4
      43: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      46: istore_1
      47: iload_1
      48: ifeq          53
      51: iconst_1
      52: istore_2
      53: aload         4
      55: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: iload_2
      63: ireturn
      64: astore        5
      66: aload         4
      68: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      71: aload_3
      72: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      75: aload         5
      77: athrow
    Exception table:
       from    to  target type
           9    21    64   any
          23    47    64   any

  public boolean a(android.view.KeyEvent);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore        4
       5: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       8: astore        5
      10: aload         4
      12: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      14: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      17: iconst_1
      18: istore_3
      19: aload_1
      20: ifnull        39
      23: aload         4
      25: iconst_1
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload_1
      30: aload         4
      32: iconst_0
      33: invokevirtual #107                // Method android/view/KeyEvent.writeToParcel:(Landroid/os/Parcel;I)V
      36: goto          45
      39: aload         4
      41: iconst_0
      42: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      45: aload_0
      46: getfield      #17                 // Field a:Landroid/os/IBinder;
      49: iconst_2
      50: aload         4
      52: aload         5
      54: iconst_0
      55: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      60: pop
      61: aload         5
      63: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      66: aload         5
      68: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      71: istore_2
      72: iload_2
      73: ifeq          79
      76: goto          81
      79: iconst_0
      80: istore_3
      81: aload         5
      83: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      86: aload         4
      88: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      91: iload_3
      92: ireturn
      93: astore_1
      94: aload         5
      96: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      99: aload         4
     101: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     104: aload_1
     105: athrow
    Exception table:
       from    to  target type
          10    17    93   any
          23    36    93   any
          39    45    93   any
          45    72    93   any

  public android.os.IBinder asBinder();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/os/IBinder;
       4: areturn

  public java.lang.String b();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        6
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #112                // Method android/os/Parcel.readString:()Ljava/lang/String;
      37: astore_3
      38: aload_2
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_1
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: aload_3
      47: areturn
      48: astore_3
      49: aload_2
      50: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      53: aload_1
      54: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      57: aload_3
      58: athrow
    Exception table:
       from    to  target type
           8    38    48   any

  public void b(int);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_2
      15: iload_1
      16: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_0
      20: getfield      #17                 // Field a:Landroid/os/IBinder;
      23: bipush        39
      25: aload_2
      26: aload_3
      27: iconst_0
      28: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      33: pop
      34: aload_3
      35: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      38: aload_3
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_2
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: return
      47: astore        4
      49: aload_3
      50: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      53: aload_2
      54: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      57: aload         4
      59: athrow
    Exception table:
       from    to  target type
           8    38    47   any

  public void b(int, int, java.lang.String);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore        4
       5: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       8: astore        5
      10: aload         4
      12: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      14: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      17: aload         4
      19: iload_1
      20: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      23: aload         4
      25: iload_2
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload         4
      31: aload_3
      32: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      35: aload_0
      36: getfield      #17                 // Field a:Landroid/os/IBinder;
      39: bipush        12
      41: aload         4
      43: aload         5
      45: iconst_0
      46: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload         5
      54: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      57: aload         5
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload         4
      64: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      67: return
      68: astore_3
      69: aload         5
      71: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      74: aload         4
      76: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      79: aload_3
      80: athrow
    Exception table:
       from    to  target type
          10    57    68   any

  public void b(long);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: lload_1
      17: invokevirtual #54                 // Method android/os/Parcel.writeLong:(J)V
      20: aload_0
      21: getfield      #17                 // Field a:Landroid/os/IBinder;
      24: bipush        24
      26: aload_3
      27: aload         4
      29: iconst_0
      30: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      35: pop
      36: aload         4
      38: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      41: aload         4
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: aload_3
      47: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      50: return
      51: astore        5
      53: aload         4
      55: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload         5
      64: athrow
    Exception table:
       from    to  target type
           9    41    51   any

  public void b(android.net.Uri, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_1
      16: ifnull        33
      19: aload_3
      20: iconst_1
      21: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      24: aload_1
      25: aload_3
      26: iconst_0
      27: invokevirtual #61                 // Method android/net/Uri.writeToParcel:(Landroid/os/Parcel;I)V
      30: goto          38
      33: aload_3
      34: iconst_0
      35: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      38: aload_2
      39: ifnull        56
      42: aload_3
      43: iconst_1
      44: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      47: aload_2
      48: aload_3
      49: iconst_0
      50: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      53: goto          61
      56: aload_3
      57: iconst_0
      58: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      61: aload_0
      62: getfield      #17                 // Field a:Landroid/os/IBinder;
      65: bipush        16
      67: aload_3
      68: aload         4
      70: iconst_0
      71: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      76: pop
      77: aload         4
      79: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      82: aload         4
      84: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      87: aload_3
      88: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      91: return
      92: astore_1
      93: aload         4
      95: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      98: aload_3
      99: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
     102: aload_1
     103: athrow
    Exception table:
       from    to  target type
           9    15    92   any
          19    30    92   any
          33    38    92   any
          42    53    92   any
          56    61    92   any
          61    82    92   any

  public void b(android.support.v4.media.MediaDescriptionCompat);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_1
      15: ifnull        32
      18: aload_2
      19: iconst_1
      20: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      23: aload_1
      24: aload_2
      25: iconst_0
      26: invokevirtual #68                 // Method android/support/v4/media/MediaDescriptionCompat.writeToParcel:(Landroid/os/Parcel;I)V
      29: goto          37
      32: aload_2
      33: iconst_0
      34: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      37: aload_0
      38: getfield      #17                 // Field a:Landroid/os/IBinder;
      41: bipush        43
      43: aload_2
      44: aload_3
      45: iconst_0
      46: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      51: pop
      52: aload_3
      53: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      56: aload_3
      57: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      60: aload_2
      61: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      64: return
      65: astore_1
      66: aload_3
      67: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      70: aload_2
      71: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      74: aload_1
      75: athrow
    Exception table:
       from    to  target type
           8    14    65   any
          18    29    65   any
          32    37    65   any
          37    56    65   any

  public void b(android.support.v4.media.session.a);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_1
      15: ifnull        71
      18: aload_1
      19: invokeinterface #81,  1           // InterfaceMethod android/support/v4/media/session/a.asBinder:()Landroid/os/IBinder;
      24: astore_1
      25: goto          28
      28: aload_2
      29: aload_1
      30: invokevirtual #84                 // Method android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
      33: aload_0
      34: getfield      #17                 // Field a:Landroid/os/IBinder;
      37: iconst_4
      38: aload_2
      39: aload_3
      40: iconst_0
      41: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      46: pop
      47: aload_3
      48: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      51: aload_3
      52: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      55: aload_2
      56: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      59: return
      60: astore_1
      61: aload_3
      62: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      65: aload_2
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_1
      70: athrow
      71: aconst_null
      72: astore_1
      73: goto          28
    Exception table:
       from    to  target type
           8    14    60   any
          18    25    60   any
          28    51    60   any

  public void b(java.lang.String, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: aload_1
      17: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      20: aload_2
      21: ifnull        38
      24: aload_3
      25: iconst_1
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload_2
      30: aload_3
      31: iconst_0
      32: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      35: goto          43
      38: aload_3
      39: iconst_0
      40: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      43: aload_0
      44: getfield      #17                 // Field a:Landroid/os/IBinder;
      47: bipush        35
      49: aload_3
      50: aload         4
      52: iconst_0
      53: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      58: pop
      59: aload         4
      61: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      64: aload         4
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: return
      74: astore_1
      75: aload         4
      77: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      80: aload_3
      81: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      84: aload_1
      85: athrow
    Exception table:
       from    to  target type
           9    20    74   any
          24    35    74   any
          38    43    74   any
          43    64    74   any

  public void b(boolean);
    Code:
       0: new           #92                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #94                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #98                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow

  public java.lang.String c();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        7
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #112                // Method android/os/Parcel.readString:()Ljava/lang/String;
      37: astore_3
      38: aload_2
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_1
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: aload_3
      47: areturn
      48: astore_3
      49: aload_2
      50: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      53: aload_1
      54: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      57: aload_3
      58: athrow
    Exception table:
       from    to  target type
           8    38    48   any

  public void c(int);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_2
      15: iload_1
      16: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      19: aload_0
      20: getfield      #17                 // Field a:Landroid/os/IBinder;
      23: bipush        48
      25: aload_2
      26: aload_3
      27: iconst_0
      28: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      33: pop
      34: aload_3
      35: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      38: aload_3
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_2
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: return
      47: astore        4
      49: aload_3
      50: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      53: aload_2
      54: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      57: aload         4
      59: athrow
    Exception table:
       from    to  target type
           8    38    47   any

  public void c(java.lang.String, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: aload_1
      17: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      20: aload_2
      21: ifnull        38
      24: aload_3
      25: iconst_1
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload_2
      30: aload_3
      31: iconst_0
      32: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      35: goto          43
      38: aload_3
      39: iconst_0
      40: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      43: aload_0
      44: getfield      #17                 // Field a:Landroid/os/IBinder;
      47: bipush        14
      49: aload_3
      50: aload         4
      52: iconst_0
      53: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      58: pop
      59: aload         4
      61: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      64: aload         4
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: return
      74: astore_1
      75: aload         4
      77: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      80: aload_3
      81: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      84: aload_1
      85: athrow
    Exception table:
       from    to  target type
           9    20    74   any
          24    35    74   any
          38    43    74   any
          43    64    74   any

  public android.app.PendingIntent d();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        8
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: ifeq          56
      40: getstatic     #121                // Field android/app/PendingIntent.CREATOR:Landroid/os/Parcelable$Creator;
      43: aload_3
      44: invokeinterface #127,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      49: checkcast     #117                // class android/app/PendingIntent
      52: astore_1
      53: goto          58
      56: aconst_null
      57: astore_1
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      66: aload_1
      67: areturn
      68: astore_1
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: aload_2
      74: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      77: aload_1
      78: athrow
    Exception table:
       from    to  target type
           8    53    68   any

  public void d(java.lang.String, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: aload_1
      17: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      20: aload_2
      21: ifnull        38
      24: aload_3
      25: iconst_1
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload_2
      30: aload_3
      31: iconst_0
      32: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      35: goto          43
      38: aload_3
      39: iconst_0
      40: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      43: aload_0
      44: getfield      #17                 // Field a:Landroid/os/IBinder;
      47: bipush        15
      49: aload_3
      50: aload         4
      52: iconst_0
      53: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      58: pop
      59: aload         4
      61: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      64: aload         4
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: return
      74: astore_1
      75: aload         4
      77: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      80: aload_3
      81: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      84: aload_1
      85: athrow
    Exception table:
       from    to  target type
           9    20    74   any
          24    35    74   any
          38    43    74   any
          43    64    74   any

  public long e();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: bipush        9
      21: aload_3
      22: aload         4
      24: iconst_0
      25: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      30: pop
      31: aload         4
      33: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      36: aload         4
      38: invokevirtual #132                // Method android/os/Parcel.readLong:()J
      41: lstore_1
      42: aload         4
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_3
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: lload_1
      52: lreturn
      53: astore        5
      55: aload         4
      57: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      60: aload_3
      61: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      64: aload         5
      66: athrow
    Exception table:
       from    to  target type
           9    42    53   any

  public void e(java.lang.String, android.os.Bundle);
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_3
      16: aload_1
      17: invokevirtual #50                 // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      20: aload_2
      21: ifnull        38
      24: aload_3
      25: iconst_1
      26: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      29: aload_2
      30: aload_3
      31: iconst_0
      32: invokevirtual #64                 // Method android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
      35: goto          43
      38: aload_3
      39: iconst_0
      40: invokevirtual #34                 // Method android/os/Parcel.writeInt:(I)V
      43: aload_0
      44: getfield      #17                 // Field a:Landroid/os/IBinder;
      47: bipush        26
      49: aload_3
      50: aload         4
      52: iconst_0
      53: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      58: pop
      59: aload         4
      61: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      64: aload         4
      66: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: return
      74: astore_1
      75: aload         4
      77: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      80: aload_3
      81: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      84: aload_1
      85: athrow
    Exception table:
       from    to  target type
           9    20    74   any
          24    35    74   any
          38    43    74   any
          43    64    74   any

  public android.support.v4.media.session.ParcelableVolumeInfo f();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        10
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: ifeq          56
      40: getstatic     #137                // Field android/support/v4/media/session/ParcelableVolumeInfo.CREATOR:Landroid/os/Parcelable$Creator;
      43: aload_3
      44: invokeinterface #127,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      49: checkcast     #136                // class android/support/v4/media/session/ParcelableVolumeInfo
      52: astore_1
      53: goto          58
      56: aconst_null
      57: astore_1
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      66: aload_1
      67: areturn
      68: astore_1
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: aload_2
      74: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      77: aload_1
      78: athrow
    Exception table:
       from    to  target type
           8    53    68   any

  public android.support.v4.media.MediaMetadataCompat g();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        27
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: ifeq          56
      40: getstatic     #142                // Field android/support/v4/media/MediaMetadataCompat.CREATOR:Landroid/os/Parcelable$Creator;
      43: aload_3
      44: invokeinterface #127,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      49: checkcast     #141                // class android/support/v4/media/MediaMetadataCompat
      52: astore_1
      53: goto          58
      56: aconst_null
      57: astore_1
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      66: aload_1
      67: areturn
      68: astore_1
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: aload_2
      74: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      77: aload_1
      78: athrow
    Exception table:
       from    to  target type
           8    53    68   any

  public android.support.v4.media.session.PlaybackStateCompat h();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        28
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: ifeq          56
      40: getstatic     #147                // Field android/support/v4/media/session/PlaybackStateCompat.CREATOR:Landroid/os/Parcelable$Creator;
      43: aload_3
      44: invokeinterface #127,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      49: checkcast     #146                // class android/support/v4/media/session/PlaybackStateCompat
      52: astore_1
      53: goto          58
      56: aconst_null
      57: astore_1
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      66: aload_1
      67: areturn
      68: astore_1
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: aload_2
      74: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      77: aload_1
      78: athrow
    Exception table:
       from    to  target type
           8    53    68   any

  public java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> i();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        29
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: getstatic     #152                // Field android/support/v4/media/session/MediaSessionCompat$QueueItem.CREATOR:Landroid/os/Parcelable$Creator;
      37: invokevirtual #156                // Method android/os/Parcel.createTypedArrayList:(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
      40: astore_3
      41: aload_2
      42: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      45: aload_1
      46: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      49: aload_3
      50: areturn
      51: astore_3
      52: aload_2
      53: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      56: aload_1
      57: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      60: aload_3
      61: athrow
    Exception table:
       from    to  target type
           8    41    51   any

  public java.lang.CharSequence j();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        30
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: ifeq          56
      40: getstatic     #165                // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      43: aload_3
      44: invokeinterface #127,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      49: checkcast     #167                // class java/lang/CharSequence
      52: astore_1
      53: goto          58
      56: aconst_null
      57: astore_1
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      66: aload_1
      67: areturn
      68: astore_1
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: aload_2
      74: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      77: aload_1
      78: athrow
    Exception table:
       from    to  target type
           8    53    68   any

  public android.os.Bundle k();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        31
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: ifeq          56
      40: getstatic     #170                // Field android/os/Bundle.CREATOR:Landroid/os/Parcelable$Creator;
      43: aload_3
      44: invokeinterface #127,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      49: checkcast     #63                 // class android/os/Bundle
      52: astore_1
      53: goto          58
      56: aconst_null
      57: astore_1
      58: aload_3
      59: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      62: aload_2
      63: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      66: aload_1
      67: areturn
      68: astore_1
      69: aload_3
      70: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      73: aload_2
      74: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      77: aload_1
      78: athrow
    Exception table:
       from    to  target type
           8    53    68   any

  public int l();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        32
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: istore_1
      38: aload_3
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_2
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: iload_1
      47: ireturn
      48: astore        4
      50: aload_3
      51: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      54: aload_2
      55: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      58: aload         4
      60: athrow
    Exception table:
       from    to  target type
           8    38    48   any

  public boolean m();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: astore        5
      21: iconst_0
      22: istore_2
      23: aload         5
      25: bipush        45
      27: aload_3
      28: aload         4
      30: iconst_0
      31: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      36: pop
      37: aload         4
      39: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      42: aload         4
      44: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      47: istore_1
      48: iload_1
      49: ifeq          54
      52: iconst_1
      53: istore_2
      54: aload         4
      56: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      59: aload_3
      60: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      63: iload_2
      64: ireturn
      65: astore        5
      67: aload         4
      69: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      72: aload_3
      73: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      76: aload         5
      78: athrow
    Exception table:
       from    to  target type
           9    21    65   any
          23    48    65   any

  public int n();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        37
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: istore_1
      38: aload_3
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_2
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: iload_1
      47: ireturn
      48: astore        4
      50: aload_3
      51: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      54: aload_2
      55: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      58: aload         4
      60: athrow
    Exception table:
       from    to  target type
           8    38    48   any

  public boolean o();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_3
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore        4
       9: aload_3
      10: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      12: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      15: aload_0
      16: getfield      #17                 // Field a:Landroid/os/IBinder;
      19: astore        5
      21: iconst_0
      22: istore_2
      23: aload         5
      25: bipush        38
      27: aload_3
      28: aload         4
      30: iconst_0
      31: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      36: pop
      37: aload         4
      39: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      42: aload         4
      44: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      47: istore_1
      48: iload_1
      49: ifeq          54
      52: iconst_1
      53: istore_2
      54: aload         4
      56: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      59: aload_3
      60: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      63: iload_2
      64: ireturn
      65: astore        5
      67: aload         4
      69: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      72: aload_3
      73: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      76: aload         5
      78: athrow
    Exception table:
       from    to  target type
           9    21    65   any
          23    48    65   any

  public int p();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_2
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_3
       8: aload_2
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        47
      20: aload_2
      21: aload_3
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_3
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_3
      34: invokevirtual #103                // Method android/os/Parcel.readInt:()I
      37: istore_1
      38: aload_3
      39: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      42: aload_2
      43: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      46: iload_1
      47: ireturn
      48: astore        4
      50: aload_3
      51: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      54: aload_2
      55: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      58: aload         4
      60: athrow
    Exception table:
       from    to  target type
           8    38    48   any

  public void q();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        33
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void r();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        13
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void s();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        18
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void t();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        19
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void u();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        20
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void v();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        21
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void w();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        22
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any

  public void x();
    Code:
       0: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       3: astore_1
       4: invokestatic  #25                 // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
       7: astore_2
       8: aload_1
       9: ldc           #27                 // String android.support.v4.media.session.IMediaSession
      11: invokevirtual #31                 // Method android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
      14: aload_0
      15: getfield      #17                 // Field a:Landroid/os/IBinder;
      18: bipush        23
      20: aload_1
      21: aload_2
      22: iconst_0
      23: invokeinterface #40,  5           // InterfaceMethod android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
      28: pop
      29: aload_2
      30: invokevirtual #43                 // Method android/os/Parcel.readException:()V
      33: aload_2
      34: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      37: aload_1
      38: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      41: return
      42: astore_3
      43: aload_2
      44: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      47: aload_1
      48: invokevirtual #46                 // Method android/os/Parcel.recycle:()V
      51: aload_3
      52: athrow
    Exception table:
       from    to  target type
           8    33    42   any
}
