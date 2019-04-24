class android.support.v4.b.g implements android.support.v4.b.c$a {
  android.support.v4.b.g();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: return

  public android.graphics.Typeface a(android.content.Context, android.content.res.Resources, int, java.lang.String, int);
    Code:
       0: aload_1
       1: invokestatic  #56                 // Method android/support/v4/b/h.a:(Landroid/content/Context;)Ljava/io/File;
       4: astore_1
       5: aload_1
       6: ifnonnull     11
       9: aconst_null
      10: areturn
      11: aload_1
      12: aload_2
      13: iload_3
      14: invokestatic  #59                 // Method android/support/v4/b/h.a:(Ljava/io/File;Landroid/content/res/Resources;I)Z
      17: istore        6
      19: iload         6
      21: ifne          31
      24: aload_1
      25: invokevirtual #65                 // Method java/io/File.delete:()Z
      28: pop
      29: aconst_null
      30: areturn
      31: aload_1
      32: invokevirtual #69                 // Method java/io/File.getPath:()Ljava/lang/String;
      35: invokestatic  #75                 // Method android/graphics/Typeface.createFromFile:(Ljava/lang/String;)Landroid/graphics/Typeface;
      38: astore_2
      39: aload_1
      40: invokevirtual #65                 // Method java/io/File.delete:()Z
      43: pop
      44: aload_2
      45: areturn
      46: astore_2
      47: aload_1
      48: invokevirtual #65                 // Method java/io/File.delete:()Z
      51: pop
      52: aload_2
      53: athrow
      54: aload_1
      55: invokevirtual #65                 // Method java/io/File.delete:()Z
      58: pop
      59: aconst_null
      60: areturn
      61: astore_2
      62: goto          54
    Exception table:
       from    to  target type
          11    19    61   Class java/lang/RuntimeException
          11    19    46   any
          31    39    61   Class java/lang/RuntimeException
          31    39    46   any

  public android.graphics.Typeface a(android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int);
    Code:
       0: aload_3
       1: arraylength
       2: istore        5
       4: aconst_null
       5: astore        6
       7: iload         5
       9: iconst_1
      10: if_icmpge     15
      13: aconst_null
      14: areturn
      15: aload_0
      16: aload_3
      17: iload         4
      19: invokevirtual #81                 // Method a:([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
      22: astore_2
      23: aload_1
      24: invokevirtual #87                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      27: aload_2
      28: invokevirtual #92                 // Method android/support/v4/f/b$b.a:()Landroid/net/Uri;
      31: invokevirtual #98                 // Method android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
      34: astore_2
      35: aload_0
      36: aload_1
      37: aload_2
      38: invokevirtual #101                // Method a:(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
      41: astore_1
      42: aload_2
      43: invokestatic  #104                // Method android/support/v4/b/h.a:(Ljava/io/Closeable;)V
      46: aload_1
      47: areturn
      48: astore_3
      49: aload_2
      50: astore_1
      51: aload_3
      52: astore_2
      53: goto          60
      56: astore_2
      57: aload         6
      59: astore_1
      60: aload_1
      61: invokestatic  #104                // Method android/support/v4/b/h.a:(Ljava/io/Closeable;)V
      64: aload_2
      65: athrow
      66: aconst_null
      67: astore_2
      68: aload_2
      69: invokestatic  #104                // Method android/support/v4/b/h.a:(Ljava/io/Closeable;)V
      72: aconst_null
      73: areturn
      74: astore_1
      75: goto          66
      78: astore_1
      79: goto          68
    Exception table:
       from    to  target type
          23    35    74   Class java/io/IOException
          23    35    56   any
          35    42    78   Class java/io/IOException
          35    42    48   any

  public android.graphics.Typeface a(android.content.Context, android.support.v4.a.a.a$b, android.content.res.Resources, int);
    Code:
       0: aload_0
       1: aload_2
       2: iload         4
       4: invokespecial #107                // Method a:(Landroid/support/v4/a/a/a$b;I)Landroid/support/v4/a/a/a$c;
       7: astore_2
       8: aload_2
       9: ifnonnull     14
      12: aconst_null
      13: areturn
      14: aload_1
      15: aload_3
      16: aload_2
      17: invokevirtual #111                // Method android/support/v4/a/a/a$c.d:()I
      20: aload_2
      21: invokevirtual #113                // Method android/support/v4/a/a/a$c.a:()Ljava/lang/String;
      24: iload         4
      26: invokestatic  #117                // Method android/support/v4/b/c.a:(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
      29: areturn

  protected android.graphics.Typeface a(android.content.Context, java.io.InputStream);
    Code:
       0: aload_1
       1: invokestatic  #56                 // Method android/support/v4/b/h.a:(Landroid/content/Context;)Ljava/io/File;
       4: astore_1
       5: aload_1
       6: ifnonnull     11
       9: aconst_null
      10: areturn
      11: aload_1
      12: aload_2
      13: invokestatic  #120                // Method android/support/v4/b/h.a:(Ljava/io/File;Ljava/io/InputStream;)Z
      16: istore_3
      17: iload_3
      18: ifne          28
      21: aload_1
      22: invokevirtual #65                 // Method java/io/File.delete:()Z
      25: pop
      26: aconst_null
      27: areturn
      28: aload_1
      29: invokevirtual #69                 // Method java/io/File.getPath:()Ljava/lang/String;
      32: invokestatic  #75                 // Method android/graphics/Typeface.createFromFile:(Ljava/lang/String;)Landroid/graphics/Typeface;
      35: astore_2
      36: aload_1
      37: invokevirtual #65                 // Method java/io/File.delete:()Z
      40: pop
      41: aload_2
      42: areturn
      43: astore_2
      44: aload_1
      45: invokevirtual #65                 // Method java/io/File.delete:()Z
      48: pop
      49: aload_2
      50: athrow
      51: aload_1
      52: invokevirtual #65                 // Method java/io/File.delete:()Z
      55: pop
      56: aconst_null
      57: areturn
      58: astore_2
      59: goto          51
    Exception table:
       from    to  target type
          11    17    58   Class java/lang/RuntimeException
          11    17    43   any
          28    36    58   Class java/lang/RuntimeException
          28    36    43   any

  protected android.support.v4.f.b$b a(android.support.v4.f.b$b[], int);
    Code:
       0: aload_1
       1: iload_2
       2: new           #8                  // class android/support/v4/b/g$1
       5: dup
       6: aload_0
       7: invokespecial #121                // Method android/support/v4/b/g$1."<init>":(Landroid/support/v4/b/g;)V
      10: invokestatic  #30                 // Method a:([Ljava/lang/Object;ILandroid/support/v4/b/g$a;)Ljava/lang/Object;
      13: checkcast     #89                 // class android/support/v4/f/b$b
      16: areturn
}
