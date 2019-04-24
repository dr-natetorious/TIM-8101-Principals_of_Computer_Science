class android.support.v4.app.ae {
  static {};
    Code:
       0: new           #4                  // class java/lang/Object
       3: dup
       4: invokespecial #16                 // Method java/lang/Object."<init>":()V
       7: putstatic     #18                 // Field a:Ljava/lang/Object;
      10: new           #4                  // class java/lang/Object
      13: dup
      14: invokespecial #16                 // Method java/lang/Object."<init>":()V
      17: putstatic     #20                 // Field d:Ljava/lang/Object;
      20: return

  public static android.os.Bundle a(android.app.Notification$Builder, android.support.v4.app.ac$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #27                 // Method android/support/v4/app/ac$a.a:()I
       5: aload_1
       6: invokevirtual #30                 // Method android/support/v4/app/ac$a.b:()Ljava/lang/CharSequence;
       9: aload_1
      10: invokevirtual #33                 // Method android/support/v4/app/ac$a.c:()Landroid/app/PendingIntent;
      13: invokevirtual #39                 // Method android/app/Notification$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
      16: pop
      17: new           #41                 // class android/os/Bundle
      20: dup
      21: aload_1
      22: invokevirtual #44                 // Method android/support/v4/app/ac$a.d:()Landroid/os/Bundle;
      25: invokespecial #47                 // Method android/os/Bundle."<init>":(Landroid/os/Bundle;)V
      28: astore_0
      29: aload_1
      30: invokevirtual #51                 // Method android/support/v4/app/ac$a.f:()[Landroid/support/v4/app/ag;
      33: ifnull        49
      36: aload_0
      37: ldc           #53                 // String android.support.remoteInputs
      39: aload_1
      40: invokevirtual #51                 // Method android/support/v4/app/ac$a.f:()[Landroid/support/v4/app/ag;
      43: invokestatic  #56                 // Method a:([Landroid/support/v4/app/ag;)[Landroid/os/Bundle;
      46: invokevirtual #60                 // Method android/os/Bundle.putParcelableArray:(Ljava/lang/String;[Landroid/os/Parcelable;)V
      49: aload_1
      50: invokevirtual #63                 // Method android/support/v4/app/ac$a.g:()[Landroid/support/v4/app/ag;
      53: ifnull        69
      56: aload_0
      57: ldc           #65                 // String android.support.dataRemoteInputs
      59: aload_1
      60: invokevirtual #63                 // Method android/support/v4/app/ac$a.g:()[Landroid/support/v4/app/ag;
      63: invokestatic  #56                 // Method a:([Landroid/support/v4/app/ag;)[Landroid/os/Bundle;
      66: invokevirtual #60                 // Method android/os/Bundle.putParcelableArray:(Ljava/lang/String;[Landroid/os/Parcelable;)V
      69: aload_0
      70: ldc           #67                 // String android.support.allowGeneratedReplies
      72: aload_1
      73: invokevirtual #71                 // Method android/support/v4/app/ac$a.e:()Z
      76: invokevirtual #75                 // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
      79: aload_0
      80: areturn

  public static android.os.Bundle a(android.app.Notification);
    Code:
       0: getstatic     #18                 // Field a:Ljava/lang/Object;
       3: astore_3
       4: aload_3
       5: monitorenter
       6: getstatic     #82                 // Field c:Z
       9: ifeq          16
      12: aload_3
      13: monitorexit
      14: aconst_null
      15: areturn
      16: getstatic     #84                 // Field b:Ljava/lang/reflect/Field;
      19: ifnonnull     67
      22: ldc           #86                 // class android/app/Notification
      24: ldc           #88                 // String extras
      26: invokevirtual #94                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      29: astore_1
      30: ldc           #41                 // class android/os/Bundle
      32: aload_1
      33: invokevirtual #100                // Method java/lang/reflect/Field.getType:()Ljava/lang/Class;
      36: invokevirtual #104                // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
      39: ifne          58
      42: ldc           #106                // String NotificationCompat
      44: ldc           #108                // String Notification.extras field is not of type Bundle
      46: invokestatic  #113                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
      49: pop
      50: iconst_1
      51: putstatic     #82                 // Field c:Z
      54: aload_3
      55: monitorexit
      56: aconst_null
      57: areturn
      58: aload_1
      59: iconst_1
      60: invokevirtual #117                // Method java/lang/reflect/Field.setAccessible:(Z)V
      63: aload_1
      64: putstatic     #84                 // Field b:Ljava/lang/reflect/Field;
      67: getstatic     #84                 // Field b:Ljava/lang/reflect/Field;
      70: aload_0
      71: invokevirtual #121                // Method java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
      74: checkcast     #41                 // class android/os/Bundle
      77: astore_2
      78: aload_2
      79: astore_1
      80: aload_2
      81: ifnonnull     100
      84: new           #41                 // class android/os/Bundle
      87: dup
      88: invokespecial #122                // Method android/os/Bundle."<init>":()V
      91: astore_1
      92: getstatic     #84                 // Field b:Ljava/lang/reflect/Field;
      95: aload_0
      96: aload_1
      97: invokevirtual #126                // Method java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
     100: aload_3
     101: monitorexit
     102: aload_1
     103: areturn
     104: ldc           #106                // String NotificationCompat
     106: ldc           #128                // String Unable to access notification extras
     108: aload_0
     109: invokestatic  #131                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     112: pop
     113: goto          116
     116: iconst_1
     117: putstatic     #82                 // Field c:Z
     120: aload_3
     121: monitorexit
     122: aconst_null
     123: areturn
     124: astore_0
     125: aload_3
     126: monitorexit
     127: aload_0
     128: athrow
     129: astore_0
     130: goto          104
     133: astore_0
     134: goto          104
    Exception table:
       from    to  target type
           6    14   124   any
          16    54   133   Class java/lang/IllegalAccessException
          16    54   129   Class java/lang/NoSuchFieldException
          16    54   124   any
          54    56   124   any
          58    67   133   Class java/lang/IllegalAccessException
          58    67   129   Class java/lang/NoSuchFieldException
          58    67   124   any
          67    78   133   Class java/lang/IllegalAccessException
          67    78   129   Class java/lang/NoSuchFieldException
          67    78   124   any
          84   100   133   Class java/lang/IllegalAccessException
          84   100   129   Class java/lang/NoSuchFieldException
          84   100   124   any
         100   102   124   any
         104   113   124   any
         116   122   124   any
         125   127   124   any

  public static android.util.SparseArray<android.os.Bundle> a(java.util.List<android.os.Bundle>);
    Code:
       0: aload_0
       1: invokeinterface #213,  1          // InterfaceMethod java/util/List.size:()I
       6: istore_2
       7: aconst_null
       8: astore_3
       9: iconst_0
      10: istore_1
      11: iload_1
      12: iload_2
      13: if_icmpge     70
      16: aload_0
      17: iload_1
      18: invokeinterface #216,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      23: checkcast     #41                 // class android/os/Bundle
      26: astore        5
      28: aload_3
      29: astore        4
      31: aload         5
      33: ifnull        60
      36: aload_3
      37: astore        4
      39: aload_3
      40: ifnonnull     52
      43: new           #218                // class android/util/SparseArray
      46: dup
      47: invokespecial #219                // Method android/util/SparseArray."<init>":()V
      50: astore        4
      52: aload         4
      54: iload_1
      55: aload         5
      57: invokevirtual #223                // Method android/util/SparseArray.put:(ILjava/lang/Object;)V
      60: iload_1
      61: iconst_1
      62: iadd
      63: istore_1
      64: aload         4
      66: astore_3
      67: goto          11
      70: aload_3
      71: areturn
}
