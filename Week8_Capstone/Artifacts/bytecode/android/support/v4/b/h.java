public class android.support.v4.b.h {
  public static java.io.File a(android.content.Context);
    Code:
       0: new           #10                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #14                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_3
       8: aload_3
       9: ldc           #16                 // String .font
      11: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_3
      16: invokestatic  #26                 // Method android/os/Process.myPid:()I
      19: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      22: pop
      23: aload_3
      24: ldc           #31                 // String -
      26: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_3
      31: invokestatic  #34                 // Method android/os/Process.myTid:()I
      34: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      37: pop
      38: aload_3
      39: ldc           #31                 // String -
      41: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      44: pop
      45: aload_3
      46: invokevirtual #38                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      49: astore_3
      50: iconst_0
      51: istore_1
      52: iload_1
      53: bipush        100
      55: if_icmpge     123
      58: aload_0
      59: invokevirtual #44                 // Method android/content/Context.getCacheDir:()Ljava/io/File;
      62: astore        4
      64: new           #10                 // class java/lang/StringBuilder
      67: dup
      68: invokespecial #14                 // Method java/lang/StringBuilder."<init>":()V
      71: astore        5
      73: aload         5
      75: aload_3
      76: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: aload         5
      82: iload_1
      83: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      86: pop
      87: new           #46                 // class java/io/File
      90: dup
      91: aload         4
      93: aload         5
      95: invokevirtual #38                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      98: invokespecial #49                 // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
     101: astore        4
     103: aload         4
     105: invokevirtual #53                 // Method java/io/File.createNewFile:()Z
     108: istore_2
     109: iload_2
     110: ifeq          116
     113: aload         4
     115: areturn
     116: iload_1
     117: iconst_1
     118: iadd
     119: istore_1
     120: goto          52
     123: aconst_null
     124: areturn
     125: astore        4
     127: goto          116
    Exception table:
       from    to  target type
         103   109   125   Class java/io/IOException

  public static java.nio.ByteBuffer a(android.content.Context, android.content.res.Resources, int);
    Code:
       0: aload_0
       1: invokestatic  #57                 // Method a:(Landroid/content/Context;)Ljava/io/File;
       4: astore_0
       5: aload_0
       6: ifnonnull     11
       9: aconst_null
      10: areturn
      11: aload_0
      12: aload_1
      13: iload_2
      14: invokestatic  #60                 // Method a:(Ljava/io/File;Landroid/content/res/Resources;I)Z
      17: istore_3
      18: iload_3
      19: ifne          29
      22: aload_0
      23: invokevirtual #63                 // Method java/io/File.delete:()Z
      26: pop
      27: aconst_null
      28: areturn
      29: aload_0
      30: invokestatic  #66                 // Method a:(Ljava/io/File;)Ljava/nio/ByteBuffer;
      33: astore_1
      34: aload_0
      35: invokevirtual #63                 // Method java/io/File.delete:()Z
      38: pop
      39: aload_1
      40: areturn
      41: astore_1
      42: aload_0
      43: invokevirtual #63                 // Method java/io/File.delete:()Z
      46: pop
      47: aload_1
      48: athrow
    Exception table:
       from    to  target type
          11    18    41   any
          29    34    41   any

  public static java.nio.ByteBuffer a(android.content.Context, android.os.CancellationSignal, android.net.Uri);
    Code:
       0: aload_0
       1: invokevirtual #73                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
       4: astore_0
       5: aload_0
       6: aload_2
       7: ldc           #75                 // String r
       9: aload_1
      10: invokevirtual #81                 // Method android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
      13: astore_2
      14: aload_2
      15: ifnonnull     28
      18: aload_2
      19: ifnull        26
      22: aload_2
      23: invokevirtual #86                 // Method android/os/ParcelFileDescriptor.close:()V
      26: aconst_null
      27: areturn
      28: new           #88                 // class java/io/FileInputStream
      31: dup
      32: aload_2
      33: invokevirtual #92                 // Method android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
      36: invokespecial #95                 // Method java/io/FileInputStream."<init>":(Ljava/io/FileDescriptor;)V
      39: astore        5
      41: aload         5
      43: invokevirtual #99                 // Method java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
      46: astore_0
      47: aload_0
      48: invokevirtual #105                // Method java/nio/channels/FileChannel.size:()J
      51: lstore_3
      52: aload_0
      53: getstatic     #111                // Field java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
      56: lconst_0
      57: lload_3
      58: invokevirtual #115                // Method java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
      61: astore_0
      62: aload         5
      64: ifnull        72
      67: aload         5
      69: invokevirtual #116                // Method java/io/FileInputStream.close:()V
      72: aload_2
      73: ifnull        80
      76: aload_2
      77: invokevirtual #86                 // Method android/os/ParcelFileDescriptor.close:()V
      80: aload_0
      81: areturn
      82: astore_1
      83: aconst_null
      84: astore_0
      85: goto          92
      88: astore_0
      89: aload_0
      90: athrow
      91: astore_1
      92: aload         5
      94: ifnull        125
      97: aload_0
      98: ifnull        120
     101: aload         5
     103: invokevirtual #116                // Method java/io/FileInputStream.close:()V
     106: goto          125
     109: astore        5
     111: aload_0
     112: aload         5
     114: invokestatic  #121                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
     117: goto          125
     120: aload         5
     122: invokevirtual #116                // Method java/io/FileInputStream.close:()V
     125: aload_1
     126: athrow
     127: astore_0
     128: aconst_null
     129: astore_1
     130: goto          137
     133: astore_1
     134: aload_1
     135: athrow
     136: astore_0
     137: aload_2
     138: ifnull        165
     141: aload_1
     142: ifnull        161
     145: aload_2
     146: invokevirtual #86                 // Method android/os/ParcelFileDescriptor.close:()V
     149: goto          165
     152: astore_2
     153: aload_1
     154: aload_2
     155: invokestatic  #121                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
     158: goto          165
     161: aload_2
     162: invokevirtual #86                 // Method android/os/ParcelFileDescriptor.close:()V
     165: aload_0
     166: athrow
     167: astore_0
     168: aconst_null
     169: areturn
    Exception table:
       from    to  target type
           5    14   167   Class java/io/IOException
          22    26   167   Class java/io/IOException
          28    41   133   Class java/lang/Throwable
          28    41   127   any
          41    62    88   Class java/lang/Throwable
          41    62    82   any
          67    72   133   Class java/lang/Throwable
          67    72   127   any
          76    80   167   Class java/io/IOException
          89    91    91   any
         101   106   109   Class java/lang/Throwable
         101   106   127   any
         111   117   133   Class java/lang/Throwable
         111   117   127   any
         120   125   133   Class java/lang/Throwable
         120   125   127   any
         125   127   133   Class java/lang/Throwable
         125   127   127   any
         134   136   136   any
         145   149   152   Class java/lang/Throwable
         145   149   167   Class java/io/IOException
         153   158   167   Class java/io/IOException
         161   165   167   Class java/io/IOException
         165   167   167   Class java/io/IOException

  public static void a(java.io.Closeable);
    Code:
       0: aload_0
       1: ifnull        10
       4: aload_0
       5: invokeinterface #128,  1          // InterfaceMethod java/io/Closeable.close:()V
      10: return
      11: astore_0
      12: return
    Exception table:
       from    to  target type
           4    10    11   Class java/io/IOException

  public static boolean a(java.io.File, android.content.res.Resources, int);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #134                // Method android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
       5: astore_1
       6: aload_0
       7: aload_1
       8: invokestatic  #137                // Method a:(Ljava/io/File;Ljava/io/InputStream;)Z
      11: istore_3
      12: aload_1
      13: invokestatic  #139                // Method a:(Ljava/io/Closeable;)V
      16: iload_3
      17: ireturn
      18: astore_0
      19: goto          25
      22: astore_0
      23: aconst_null
      24: astore_1
      25: aload_1
      26: invokestatic  #139                // Method a:(Ljava/io/Closeable;)V
      29: aload_0
      30: athrow
    Exception table:
       from    to  target type
           0     6    22   any
           6    12    18   any

  public static boolean a(java.io.File, java.io.InputStream);
    Code:
       0: aconst_null
       1: astore        4
       3: aconst_null
       4: astore_3
       5: new           #141                // class java/io/FileOutputStream
       8: dup
       9: aload_0
      10: iconst_0
      11: invokespecial #144                // Method java/io/FileOutputStream."<init>":(Ljava/io/File;Z)V
      14: astore_0
      15: sipush        1024
      18: newarray       byte
      20: astore_3
      21: aload_1
      22: aload_3
      23: invokevirtual #150                // Method java/io/InputStream.read:([B)I
      26: istore_2
      27: iload_2
      28: iconst_m1
      29: if_icmpeq     42
      32: aload_0
      33: aload_3
      34: iconst_0
      35: iload_2
      36: invokevirtual #154                // Method java/io/FileOutputStream.write:([BII)V
      39: goto          21
      42: aload_0
      43: invokestatic  #139                // Method a:(Ljava/io/Closeable;)V
      46: iconst_1
      47: ireturn
      48: astore_1
      49: aload_0
      50: astore_3
      51: aload_1
      52: astore_0
      53: goto          120
      56: astore_1
      57: goto          68
      60: astore_0
      61: goto          120
      64: astore_1
      65: aload         4
      67: astore_0
      68: aload_0
      69: astore_3
      70: new           #10                 // class java/lang/StringBuilder
      73: dup
      74: invokespecial #14                 // Method java/lang/StringBuilder."<init>":()V
      77: astore        4
      79: aload_0
      80: astore_3
      81: aload         4
      83: ldc           #156                // String Error copying resource contents to temp file:
      85: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      88: pop
      89: aload_0
      90: astore_3
      91: aload         4
      93: aload_1
      94: invokevirtual #159                // Method java/io/IOException.getMessage:()Ljava/lang/String;
      97: invokevirtual #20                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     100: pop
     101: aload_0
     102: astore_3
     103: ldc           #161                // String TypefaceCompatUtil
     105: aload         4
     107: invokevirtual #38                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     110: invokestatic  #167                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     113: pop
     114: aload_0
     115: invokestatic  #139                // Method a:(Ljava/io/Closeable;)V
     118: iconst_0
     119: ireturn
     120: aload_3
     121: invokestatic  #139                // Method a:(Ljava/io/Closeable;)V
     124: aload_0
     125: athrow
    Exception table:
       from    to  target type
           5    15    64   Class java/io/IOException
           5    15    60   any
          15    21    56   Class java/io/IOException
          15    21    48   any
          21    27    56   Class java/io/IOException
          21    27    48   any
          32    39    56   Class java/io/IOException
          32    39    48   any
          70    79    60   any
          81    89    60   any
          91   101    60   any
         103   114    60   any
}
