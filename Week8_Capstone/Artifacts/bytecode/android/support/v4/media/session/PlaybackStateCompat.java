public final class android.support.v4.media.session.PlaybackStateCompat implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR;

  final int a;

  final long b;

  final long c;

  final float d;

  final long e;

  final int f;

  final java.lang.CharSequence g;

  final long h;

  java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> i;

  final long j;

  final android.os.Bundle k;

  static {};
    Code:
       0: new           #8                  // class android/support/v4/media/session/PlaybackStateCompat$1
       3: dup
       4: invokespecial #41                 // Method android/support/v4/media/session/PlaybackStateCompat$1."<init>":()V
       7: putstatic     #43                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.session.PlaybackStateCompat(int, long, long, float, long, int, java.lang.CharSequence, long, java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction>, long, android.os.Bundle);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #48                 // Field a:I
       9: aload_0
      10: lload_2
      11: putfield      #50                 // Field b:J
      14: aload_0
      15: lload         4
      17: putfield      #52                 // Field c:J
      20: aload_0
      21: fload         6
      23: putfield      #54                 // Field d:F
      26: aload_0
      27: lload         7
      29: putfield      #56                 // Field e:J
      32: aload_0
      33: iload         9
      35: putfield      #58                 // Field f:I
      38: aload_0
      39: aload         10
      41: putfield      #60                 // Field g:Ljava/lang/CharSequence;
      44: aload_0
      45: lload         11
      47: putfield      #62                 // Field h:J
      50: aload_0
      51: new           #64                 // class java/util/ArrayList
      54: dup
      55: aload         13
      57: invokespecial #67                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      60: putfield      #69                 // Field i:Ljava/util/List;
      63: aload_0
      64: lload         14
      66: putfield      #71                 // Field j:J
      69: aload_0
      70: aload         16
      72: putfield      #73                 // Field k:Landroid/os/Bundle;
      75: return

  android.support.v4.media.session.PlaybackStateCompat(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #82                 // Method android/os/Parcel.readInt:()I
       9: putfield      #48                 // Field a:I
      12: aload_0
      13: aload_1
      14: invokevirtual #86                 // Method android/os/Parcel.readLong:()J
      17: putfield      #50                 // Field b:J
      20: aload_0
      21: aload_1
      22: invokevirtual #90                 // Method android/os/Parcel.readFloat:()F
      25: putfield      #54                 // Field d:F
      28: aload_0
      29: aload_1
      30: invokevirtual #86                 // Method android/os/Parcel.readLong:()J
      33: putfield      #62                 // Field h:J
      36: aload_0
      37: aload_1
      38: invokevirtual #86                 // Method android/os/Parcel.readLong:()J
      41: putfield      #52                 // Field c:J
      44: aload_0
      45: aload_1
      46: invokevirtual #86                 // Method android/os/Parcel.readLong:()J
      49: putfield      #56                 // Field e:J
      52: aload_0
      53: getstatic     #95                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
      56: aload_1
      57: invokeinterface #101,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      62: checkcast     #103                // class java/lang/CharSequence
      65: putfield      #60                 // Field g:Ljava/lang/CharSequence;
      68: aload_0
      69: aload_1
      70: getstatic     #104                // Field android/support/v4/media/session/PlaybackStateCompat$CustomAction.CREATOR:Landroid/os/Parcelable$Creator;
      73: invokevirtual #108                // Method android/os/Parcel.createTypedArrayList:(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
      76: putfield      #69                 // Field i:Ljava/util/List;
      79: aload_0
      80: aload_1
      81: invokevirtual #86                 // Method android/os/Parcel.readLong:()J
      84: putfield      #71                 // Field j:J
      87: aload_0
      88: aload_1
      89: invokevirtual #112                // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
      92: putfield      #73                 // Field k:Landroid/os/Bundle;
      95: aload_0
      96: aload_1
      97: invokevirtual #82                 // Method android/os/Parcel.readInt:()I
     100: putfield      #58                 // Field f:I
     103: return

  public static android.support.v4.media.session.PlaybackStateCompat a(java.lang.Object);
    Code:
       0: aconst_null
       1: astore_3
       2: aconst_null
       3: astore_2
       4: aload_3
       5: astore_1
       6: aload_0
       7: ifnull        144
      10: aload_3
      11: astore_1
      12: getstatic     #118                // Field android/os/Build$VERSION.SDK_INT:I
      15: bipush        21
      17: if_icmplt     144
      20: aload_0
      21: invokestatic  #123                // Method android/support/v4/media/session/e.h:(Ljava/lang/Object;)Ljava/util/List;
      24: astore_3
      25: aload_3
      26: ifnull        81
      29: new           #64                 // class java/util/ArrayList
      32: dup
      33: aload_3
      34: invokeinterface #128,  1          // InterfaceMethod java/util/List.size:()I
      39: invokespecial #131                // Method java/util/ArrayList."<init>":(I)V
      42: astore_1
      43: aload_3
      44: invokeinterface #135,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      49: astore_3
      50: aload_3
      51: invokeinterface #141,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      56: ifeq          78
      59: aload_1
      60: aload_3
      61: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      66: invokestatic  #148                // Method android/support/v4/media/session/PlaybackStateCompat$CustomAction.a:(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
      69: invokeinterface #152,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      74: pop
      75: goto          50
      78: goto          83
      81: aconst_null
      82: astore_1
      83: getstatic     #118                // Field android/os/Build$VERSION.SDK_INT:I
      86: bipush        22
      88: if_icmplt     96
      91: aload_0
      92: invokestatic  #157                // Method android/support/v4/media/session/f.a:(Ljava/lang/Object;)Landroid/os/Bundle;
      95: astore_2
      96: new           #2                  // class android/support/v4/media/session/PlaybackStateCompat
      99: dup
     100: aload_0
     101: invokestatic  #160                // Method android/support/v4/media/session/e.a:(Ljava/lang/Object;)I
     104: aload_0
     105: invokestatic  #163                // Method android/support/v4/media/session/e.b:(Ljava/lang/Object;)J
     108: aload_0
     109: invokestatic  #165                // Method android/support/v4/media/session/e.c:(Ljava/lang/Object;)J
     112: aload_0
     113: invokestatic  #168                // Method android/support/v4/media/session/e.d:(Ljava/lang/Object;)F
     116: aload_0
     117: invokestatic  #170                // Method android/support/v4/media/session/e.e:(Ljava/lang/Object;)J
     120: iconst_0
     121: aload_0
     122: invokestatic  #173                // Method android/support/v4/media/session/e.f:(Ljava/lang/Object;)Ljava/lang/CharSequence;
     125: aload_0
     126: invokestatic  #175                // Method android/support/v4/media/session/e.g:(Ljava/lang/Object;)J
     129: aload_1
     130: aload_0
     131: invokestatic  #177                // Method android/support/v4/media/session/e.i:(Ljava/lang/Object;)J
     134: aload_2
     135: invokespecial #179                // Method "<init>":(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V
     138: astore_1
     139: aload_1
     140: aload_0
     141: putfield      #181                // Field l:Ljava/lang/Object;
     144: aload_1
     145: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: new           #186                // class java/lang/StringBuilder
       3: dup
       4: ldc           #188                // String PlaybackState {
       6: invokespecial #191                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
       9: astore_1
      10: aload_1
      11: ldc           #193                // String state=
      13: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: aload_0
      19: getfield      #48                 // Field a:I
      22: invokevirtual #200                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      25: pop
      26: aload_1
      27: ldc           #202                // String , position=
      29: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: aload_0
      35: getfield      #50                 // Field b:J
      38: invokevirtual #205                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      41: pop
      42: aload_1
      43: ldc           #207                // String , buffered position=
      45: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      48: pop
      49: aload_1
      50: aload_0
      51: getfield      #52                 // Field c:J
      54: invokevirtual #205                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      57: pop
      58: aload_1
      59: ldc           #209                // String , speed=
      61: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      64: pop
      65: aload_1
      66: aload_0
      67: getfield      #54                 // Field d:F
      70: invokevirtual #212                // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      73: pop
      74: aload_1
      75: ldc           #214                // String , updated=
      77: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      80: pop
      81: aload_1
      82: aload_0
      83: getfield      #62                 // Field h:J
      86: invokevirtual #205                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      89: pop
      90: aload_1
      91: ldc           #216                // String , actions=
      93: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      96: pop
      97: aload_1
      98: aload_0
      99: getfield      #56                 // Field e:J
     102: invokevirtual #205                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
     105: pop
     106: aload_1
     107: ldc           #218                // String , error code=
     109: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     112: pop
     113: aload_1
     114: aload_0
     115: getfield      #58                 // Field f:I
     118: invokevirtual #200                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     121: pop
     122: aload_1
     123: ldc           #220                // String , error message=
     125: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     128: pop
     129: aload_1
     130: aload_0
     131: getfield      #60                 // Field g:Ljava/lang/CharSequence;
     134: invokevirtual #223                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
     137: pop
     138: aload_1
     139: ldc           #225                // String , custom actions=
     141: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     144: pop
     145: aload_1
     146: aload_0
     147: getfield      #69                 // Field i:Ljava/util/List;
     150: invokevirtual #228                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     153: pop
     154: aload_1
     155: ldc           #230                // String , active item id=
     157: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     160: pop
     161: aload_1
     162: aload_0
     163: getfield      #71                 // Field j:J
     166: invokevirtual #205                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
     169: pop
     170: aload_1
     171: ldc           #232                // String }
     173: invokevirtual #197                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     176: pop
     177: aload_1
     178: invokevirtual #234                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     181: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #48                 // Field a:I
       5: invokevirtual #239                // Method android/os/Parcel.writeInt:(I)V
       8: aload_1
       9: aload_0
      10: getfield      #50                 // Field b:J
      13: invokevirtual #243                // Method android/os/Parcel.writeLong:(J)V
      16: aload_1
      17: aload_0
      18: getfield      #54                 // Field d:F
      21: invokevirtual #247                // Method android/os/Parcel.writeFloat:(F)V
      24: aload_1
      25: aload_0
      26: getfield      #62                 // Field h:J
      29: invokevirtual #243                // Method android/os/Parcel.writeLong:(J)V
      32: aload_1
      33: aload_0
      34: getfield      #52                 // Field c:J
      37: invokevirtual #243                // Method android/os/Parcel.writeLong:(J)V
      40: aload_1
      41: aload_0
      42: getfield      #56                 // Field e:J
      45: invokevirtual #243                // Method android/os/Parcel.writeLong:(J)V
      48: aload_0
      49: getfield      #60                 // Field g:Ljava/lang/CharSequence;
      52: aload_1
      53: iload_2
      54: invokestatic  #250                // Method android/text/TextUtils.writeToParcel:(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
      57: aload_1
      58: aload_0
      59: getfield      #69                 // Field i:Ljava/util/List;
      62: invokevirtual #254                // Method android/os/Parcel.writeTypedList:(Ljava/util/List;)V
      65: aload_1
      66: aload_0
      67: getfield      #71                 // Field j:J
      70: invokevirtual #243                // Method android/os/Parcel.writeLong:(J)V
      73: aload_1
      74: aload_0
      75: getfield      #73                 // Field k:Landroid/os/Bundle;
      78: invokevirtual #258                // Method android/os/Parcel.writeBundle:(Landroid/os/Bundle;)V
      81: aload_1
      82: aload_0
      83: getfield      #58                 // Field f:I
      86: invokevirtual #239                // Method android/os/Parcel.writeInt:(I)V
      89: return
}
