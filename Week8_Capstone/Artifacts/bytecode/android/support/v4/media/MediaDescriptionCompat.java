public final class android.support.v4.media.MediaDescriptionCompat implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/media/MediaDescriptionCompat$1
       3: dup
       4: invokespecial #33                 // Method android/support/v4/media/MediaDescriptionCompat$1."<init>":()V
       7: putstatic     #35                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.MediaDescriptionCompat(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #38                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #44                 // Method android/os/Parcel.readString:()Ljava/lang/String;
       9: putfield      #46                 // Field a:Ljava/lang/String;
      12: aload_0
      13: getstatic     #51                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      16: aload_1
      17: invokeinterface #57,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      22: checkcast     #59                 // class java/lang/CharSequence
      25: putfield      #61                 // Field b:Ljava/lang/CharSequence;
      28: aload_0
      29: getstatic     #51                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      32: aload_1
      33: invokeinterface #57,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      38: checkcast     #59                 // class java/lang/CharSequence
      41: putfield      #63                 // Field c:Ljava/lang/CharSequence;
      44: aload_0
      45: getstatic     #51                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      48: aload_1
      49: invokeinterface #57,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      54: checkcast     #59                 // class java/lang/CharSequence
      57: putfield      #65                 // Field d:Ljava/lang/CharSequence;
      60: aload_0
      61: aload_1
      62: aconst_null
      63: invokevirtual #69                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
      66: checkcast     #71                 // class android/graphics/Bitmap
      69: putfield      #73                 // Field e:Landroid/graphics/Bitmap;
      72: aload_0
      73: aload_1
      74: aconst_null
      75: invokevirtual #69                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
      78: checkcast     #75                 // class android/net/Uri
      81: putfield      #77                 // Field f:Landroid/net/Uri;
      84: aload_0
      85: aload_1
      86: invokevirtual #81                 // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
      89: putfield      #83                 // Field g:Landroid/os/Bundle;
      92: aload_0
      93: aload_1
      94: aconst_null
      95: invokevirtual #69                 // Method android/os/Parcel.readParcelable:(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
      98: checkcast     #75                 // class android/net/Uri
     101: putfield      #85                 // Field h:Landroid/net/Uri;
     104: return

  android.support.v4.media.MediaDescriptionCompat(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.graphics.Bitmap, android.net.Uri, android.os.Bundle, android.net.Uri);
    Code:
       0: aload_0
       1: invokespecial #38                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #46                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #61                 // Field b:Ljava/lang/CharSequence;
      14: aload_0
      15: aload_3
      16: putfield      #63                 // Field c:Ljava/lang/CharSequence;
      19: aload_0
      20: aload         4
      22: putfield      #65                 // Field d:Ljava/lang/CharSequence;
      25: aload_0
      26: aload         5
      28: putfield      #73                 // Field e:Landroid/graphics/Bitmap;
      31: aload_0
      32: aload         6
      34: putfield      #77                 // Field f:Landroid/net/Uri;
      37: aload_0
      38: aload         7
      40: putfield      #83                 // Field g:Landroid/os/Bundle;
      43: aload_0
      44: aload         8
      46: putfield      #85                 // Field h:Landroid/net/Uri;
      49: return

  public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object);
    Code:
       0: aconst_null
       1: astore_3
       2: aconst_null
       3: astore_2
       4: aload_3
       5: astore_1
       6: aload_0
       7: ifnull        201
      10: aload_3
      11: astore_1
      12: getstatic     #93                 // Field android/os/Build$VERSION.SDK_INT:I
      15: bipush        21
      17: if_icmplt     201
      20: new           #10                 // class android/support/v4/media/MediaDescriptionCompat$a
      23: dup
      24: invokespecial #94                 // Method android/support/v4/media/MediaDescriptionCompat$a."<init>":()V
      27: astore        4
      29: aload         4
      31: aload_0
      32: invokestatic  #99                 // Method android/support/v4/media/a.a:(Ljava/lang/Object;)Ljava/lang/String;
      35: invokevirtual #102                // Method android/support/v4/media/MediaDescriptionCompat$a.a:(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$a;
      38: pop
      39: aload         4
      41: aload_0
      42: invokestatic  #105                // Method android/support/v4/media/a.b:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      45: invokevirtual #108                // Method android/support/v4/media/MediaDescriptionCompat$a.a:(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$a;
      48: pop
      49: aload         4
      51: aload_0
      52: invokestatic  #110                // Method android/support/v4/media/a.c:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      55: invokevirtual #112                // Method android/support/v4/media/MediaDescriptionCompat$a.b:(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$a;
      58: pop
      59: aload         4
      61: aload_0
      62: invokestatic  #114                // Method android/support/v4/media/a.d:(Ljava/lang/Object;)Ljava/lang/CharSequence;
      65: invokevirtual #116                // Method android/support/v4/media/MediaDescriptionCompat$a.c:(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$a;
      68: pop
      69: aload         4
      71: aload_0
      72: invokestatic  #119                // Method android/support/v4/media/a.e:(Ljava/lang/Object;)Landroid/graphics/Bitmap;
      75: invokevirtual #122                // Method android/support/v4/media/MediaDescriptionCompat$a.a:(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$a;
      78: pop
      79: aload         4
      81: aload_0
      82: invokestatic  #125                // Method android/support/v4/media/a.f:(Ljava/lang/Object;)Landroid/net/Uri;
      85: invokevirtual #128                // Method android/support/v4/media/MediaDescriptionCompat$a.a:(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$a;
      88: pop
      89: aload_0
      90: invokestatic  #131                // Method android/support/v4/media/a.g:(Ljava/lang/Object;)Landroid/os/Bundle;
      93: astore_3
      94: aload_3
      95: ifnonnull     103
      98: aconst_null
      99: astore_1
     100: goto          113
     103: aload_3
     104: ldc           #133                // String android.support.v4.media.description.MEDIA_URI
     106: invokevirtual #139                // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
     109: checkcast     #75                 // class android/net/Uri
     112: astore_1
     113: aload_1
     114: ifnull        149
     117: aload_3
     118: ldc           #141                // String android.support.v4.media.description.NULL_BUNDLE_FLAG
     120: invokevirtual #145                // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
     123: ifeq          137
     126: aload_3
     127: invokevirtual #149                // Method android/os/Bundle.size:()I
     130: iconst_2
     131: if_icmpne     137
     134: goto          151
     137: aload_3
     138: ldc           #133                // String android.support.v4.media.description.MEDIA_URI
     140: invokevirtual #153                // Method android/os/Bundle.remove:(Ljava/lang/String;)V
     143: aload_3
     144: ldc           #141                // String android.support.v4.media.description.NULL_BUNDLE_FLAG
     146: invokevirtual #153                // Method android/os/Bundle.remove:(Ljava/lang/String;)V
     149: aload_3
     150: astore_2
     151: aload         4
     153: aload_2
     154: invokevirtual #156                // Method android/support/v4/media/MediaDescriptionCompat$a.a:(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$a;
     157: pop
     158: aload_1
     159: ifnull        172
     162: aload         4
     164: aload_1
     165: invokevirtual #158                // Method android/support/v4/media/MediaDescriptionCompat$a.b:(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$a;
     168: pop
     169: goto          190
     172: getstatic     #93                 // Field android/os/Build$VERSION.SDK_INT:I
     175: bipush        23
     177: if_icmplt     190
     180: aload         4
     182: aload_0
     183: invokestatic  #162                // Method android/support/v4/media/b.h:(Ljava/lang/Object;)Landroid/net/Uri;
     186: invokevirtual #158                // Method android/support/v4/media/MediaDescriptionCompat$a.b:(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$a;
     189: pop
     190: aload         4
     192: invokevirtual #165                // Method android/support/v4/media/MediaDescriptionCompat$a.a:()Landroid/support/v4/media/MediaDescriptionCompat;
     195: astore_1
     196: aload_1
     197: aload_0
     198: putfield      #167                // Field i:Ljava/lang/Object;
     201: aload_1
     202: areturn

  public java.lang.Object a();
    Code:
       0: aload_0
       1: getfield      #167                // Field i:Ljava/lang/Object;
       4: ifnonnull     159
       7: getstatic     #93                 // Field android/os/Build$VERSION.SDK_INT:I
      10: bipush        21
      12: if_icmpge     18
      15: goto          159
      18: invokestatic  #172                // Method android/support/v4/media/a$a.a:()Ljava/lang/Object;
      21: astore_3
      22: aload_3
      23: aload_0
      24: getfield      #46                 // Field a:Ljava/lang/String;
      27: invokestatic  #175                // Method android/support/v4/media/a$a.a:(Ljava/lang/Object;Ljava/lang/String;)V
      30: aload_3
      31: aload_0
      32: getfield      #61                 // Field b:Ljava/lang/CharSequence;
      35: invokestatic  #178                // Method android/support/v4/media/a$a.a:(Ljava/lang/Object;Ljava/lang/CharSequence;)V
      38: aload_3
      39: aload_0
      40: getfield      #63                 // Field c:Ljava/lang/CharSequence;
      43: invokestatic  #180                // Method android/support/v4/media/a$a.b:(Ljava/lang/Object;Ljava/lang/CharSequence;)V
      46: aload_3
      47: aload_0
      48: getfield      #65                 // Field d:Ljava/lang/CharSequence;
      51: invokestatic  #182                // Method android/support/v4/media/a$a.c:(Ljava/lang/Object;Ljava/lang/CharSequence;)V
      54: aload_3
      55: aload_0
      56: getfield      #73                 // Field e:Landroid/graphics/Bitmap;
      59: invokestatic  #185                // Method android/support/v4/media/a$a.a:(Ljava/lang/Object;Landroid/graphics/Bitmap;)V
      62: aload_3
      63: aload_0
      64: getfield      #77                 // Field f:Landroid/net/Uri;
      67: invokestatic  #188                // Method android/support/v4/media/a$a.a:(Ljava/lang/Object;Landroid/net/Uri;)V
      70: aload_0
      71: getfield      #83                 // Field g:Landroid/os/Bundle;
      74: astore_2
      75: aload_2
      76: astore_1
      77: getstatic     #93                 // Field android/os/Build$VERSION.SDK_INT:I
      80: bipush        23
      82: if_icmpge     125
      85: aload_2
      86: astore_1
      87: aload_0
      88: getfield      #85                 // Field h:Landroid/net/Uri;
      91: ifnull        125
      94: aload_2
      95: astore_1
      96: aload_2
      97: ifnonnull     115
     100: new           #135                // class android/os/Bundle
     103: dup
     104: invokespecial #189                // Method android/os/Bundle."<init>":()V
     107: astore_1
     108: aload_1
     109: ldc           #141                // String android.support.v4.media.description.NULL_BUNDLE_FLAG
     111: iconst_1
     112: invokevirtual #193                // Method android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
     115: aload_1
     116: ldc           #133                // String android.support.v4.media.description.MEDIA_URI
     118: aload_0
     119: getfield      #85                 // Field h:Landroid/net/Uri;
     122: invokevirtual #197                // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
     125: aload_3
     126: aload_1
     127: invokestatic  #200                // Method android/support/v4/media/a$a.a:(Ljava/lang/Object;Landroid/os/Bundle;)V
     130: getstatic     #93                 // Field android/os/Build$VERSION.SDK_INT:I
     133: bipush        23
     135: if_icmplt     146
     138: aload_3
     139: aload_0
     140: getfield      #85                 // Field h:Landroid/net/Uri;
     143: invokestatic  #204                // Method android/support/v4/media/b$a.b:(Ljava/lang/Object;Landroid/net/Uri;)V
     146: aload_0
     147: aload_3
     148: invokestatic  #207                // Method android/support/v4/media/a$a.a:(Ljava/lang/Object;)Ljava/lang/Object;
     151: putfield      #167                // Field i:Ljava/lang/Object;
     154: aload_0
     155: getfield      #167                // Field i:Ljava/lang/Object;
     158: areturn
     159: aload_0
     160: getfield      #167                // Field i:Ljava/lang/Object;
     163: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: new           #211                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #212                // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #61                 // Field b:Ljava/lang/CharSequence;
      13: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #218                // String ,
      20: invokevirtual #221                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: getfield      #63                 // Field c:Ljava/lang/CharSequence;
      29: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: ldc           #218                // String ,
      36: invokevirtual #221                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: aload_0
      42: getfield      #65                 // Field d:Ljava/lang/CharSequence;
      45: invokevirtual #216                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      48: pop
      49: aload_1
      50: invokevirtual #223                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      53: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: getstatic     #93                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmpge     79
       8: aload_1
       9: aload_0
      10: getfield      #46                 // Field a:Ljava/lang/String;
      13: invokevirtual #228                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: aload_0
      17: getfield      #61                 // Field b:Ljava/lang/CharSequence;
      20: aload_1
      21: iload_2
      22: invokestatic  #231                // Method android/text/TextUtils.writeToParcel:(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
      25: aload_0
      26: getfield      #63                 // Field c:Ljava/lang/CharSequence;
      29: aload_1
      30: iload_2
      31: invokestatic  #231                // Method android/text/TextUtils.writeToParcel:(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
      34: aload_0
      35: getfield      #65                 // Field d:Ljava/lang/CharSequence;
      38: aload_1
      39: iload_2
      40: invokestatic  #231                // Method android/text/TextUtils.writeToParcel:(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
      43: aload_1
      44: aload_0
      45: getfield      #73                 // Field e:Landroid/graphics/Bitmap;
      48: iload_2
      49: invokevirtual #235                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      52: aload_1
      53: aload_0
      54: getfield      #77                 // Field f:Landroid/net/Uri;
      57: iload_2
      58: invokevirtual #235                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      61: aload_1
      62: aload_0
      63: getfield      #83                 // Field g:Landroid/os/Bundle;
      66: invokevirtual #239                // Method android/os/Parcel.writeBundle:(Landroid/os/Bundle;)V
      69: aload_1
      70: aload_0
      71: getfield      #85                 // Field h:Landroid/net/Uri;
      74: iload_2
      75: invokevirtual #235                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      78: return
      79: aload_0
      80: invokevirtual #240                // Method a:()Ljava/lang/Object;
      83: aload_1
      84: iload_2
      85: invokestatic  #243                // Method android/support/v4/media/a.a:(Ljava/lang/Object;Landroid/os/Parcel;I)V
      88: return
}
