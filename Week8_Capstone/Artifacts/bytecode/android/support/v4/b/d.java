class android.support.v4.b.d extends android.support.v4.b.g {
  android.support.v4.b.d();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method android/support/v4/b/g."<init>":()V
       4: return

  public android.graphics.Typeface a(android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int);
    Code:
       0: aload_3
       1: arraylength
       2: iconst_1
       3: if_icmpge     8
       6: aconst_null
       7: areturn
       8: aload_0
       9: aload_3
      10: iload         4
      12: invokevirtual #70                 // Method a:([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
      15: astore_3
      16: aload_1
      17: invokevirtual #76                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      20: astore        5
      22: aload         5
      24: aload_3
      25: invokevirtual #81                 // Method android/support/v4/f/b$b.a:()Landroid/net/Uri;
      28: ldc           #83                 // String r
      30: aload_2
      31: invokevirtual #89                 // Method android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
      34: astore_3
      35: aload_0
      36: aload_3
      37: invokespecial #91                 // Method a:(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
      40: astore_2
      41: aload_2
      42: ifnull        70
      45: aload_2
      46: invokevirtual #95                 // Method java/io/File.canRead:()Z
      49: ifne          55
      52: goto          70
      55: aload_2
      56: invokestatic  #101                // Method android/graphics/Typeface.createFromFile:(Ljava/io/File;)Landroid/graphics/Typeface;
      59: astore_1
      60: aload_3
      61: ifnull        68
      64: aload_3
      65: invokevirtual #104                // Method android/os/ParcelFileDescriptor.close:()V
      68: aload_1
      69: areturn
      70: new           #106                // class java/io/FileInputStream
      73: dup
      74: aload_3
      75: invokevirtual #110                // Method android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
      78: invokespecial #113                // Method java/io/FileInputStream."<init>":(Ljava/io/FileDescriptor;)V
      81: astore        5
      83: aload_0
      84: aload_1
      85: aload         5
      87: invokespecial #116                // Method android/support/v4/b/g.a:(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
      90: astore_1
      91: aload         5
      93: ifnull        101
      96: aload         5
      98: invokevirtual #117                // Method java/io/FileInputStream.close:()V
     101: aload_3
     102: ifnull        109
     105: aload_3
     106: invokevirtual #104                // Method android/os/ParcelFileDescriptor.close:()V
     109: aload_1
     110: areturn
     111: astore_1
     112: aconst_null
     113: astore_2
     114: goto          121
     117: astore_2
     118: aload_2
     119: athrow
     120: astore_1
     121: aload         5
     123: ifnull        154
     126: aload_2
     127: ifnull        149
     130: aload         5
     132: invokevirtual #117                // Method java/io/FileInputStream.close:()V
     135: goto          154
     138: astore        5
     140: aload_2
     141: aload         5
     143: invokestatic  #122                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
     146: goto          154
     149: aload         5
     151: invokevirtual #117                // Method java/io/FileInputStream.close:()V
     154: aload_1
     155: athrow
     156: astore_1
     157: aconst_null
     158: astore_2
     159: goto          166
     162: astore_2
     163: aload_2
     164: athrow
     165: astore_1
     166: aload_3
     167: ifnull        194
     170: aload_2
     171: ifnull        190
     174: aload_3
     175: invokevirtual #104                // Method android/os/ParcelFileDescriptor.close:()V
     178: goto          194
     181: astore_3
     182: aload_2
     183: aload_3
     184: invokestatic  #122                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
     187: goto          194
     190: aload_3
     191: invokevirtual #104                // Method android/os/ParcelFileDescriptor.close:()V
     194: aload_1
     195: athrow
     196: astore_1
     197: aconst_null
     198: areturn
    Exception table:
       from    to  target type
          22    35   196   Class java/io/IOException
          35    41   162   Class java/lang/Throwable
          35    41   156   any
          45    52   162   Class java/lang/Throwable
          45    52   156   any
          55    60   162   Class java/lang/Throwable
          55    60   156   any
          64    68   196   Class java/io/IOException
          70    83   162   Class java/lang/Throwable
          70    83   156   any
          83    91   117   Class java/lang/Throwable
          83    91   111   any
          96   101   162   Class java/lang/Throwable
          96   101   156   any
         105   109   196   Class java/io/IOException
         118   120   120   any
         130   135   138   Class java/lang/Throwable
         130   135   156   any
         140   146   162   Class java/lang/Throwable
         140   146   156   any
         149   154   162   Class java/lang/Throwable
         149   154   156   any
         154   156   162   Class java/lang/Throwable
         154   156   156   any
         163   165   165   any
         174   178   181   Class java/lang/Throwable
         174   178   196   Class java/io/IOException
         182   187   196   Class java/io/IOException
         190   194   196   Class java/io/IOException
         194   196   196   Class java/io/IOException
}
