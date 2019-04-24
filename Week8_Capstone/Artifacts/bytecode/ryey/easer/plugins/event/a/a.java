public class ryey.easer.plugins.event.a.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.a.a> CREATOR;

  java.lang.Integer a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/a/a$1
       3: dup
       4: invokespecial #18                 // Method ryey/easer/plugins/event/a/a$1."<init>":()V
       7: putstatic     #20                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.a.a(android.os.Parcel, ryey.easer.plugins.event.a.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  public ryey.easer.plugins.event.a.a(java.lang.Integer);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #25                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aload_1
      11: putfield      #25                 // Field a:Ljava/lang/Integer;
      14: return

  ryey.easer.plugins.event.a.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #25                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aload_1
      11: aload_2
      12: iload_3
      13: invokevirtual #44                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      16: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #48                 // Field ryey/easer/plugins/event/a/a$2.a:[I
       3: aload_1
       4: invokevirtual #53                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #25                 // Field a:Ljava/lang/Integer;
      13: invokestatic  #58                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      16: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #48                 // Field ryey/easer/plugins/event/a/a$2.a:[I
       3: aload_2
       4: invokevirtual #53                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: aload_0
      10: aload_1
      11: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      14: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      17: putfield      #25                 // Field a:Ljava/lang/Integer;
      20: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Ljava/lang/Integer;
       4: invokevirtual #66                 // Method java/lang/Integer.intValue:()I
       7: ifeq          26
      10: aload_0
      11: getfield      #25                 // Field a:Ljava/lang/Integer;
      14: invokevirtual #66                 // Method java/lang/Integer.intValue:()I
      17: iconst_2
      18: if_icmpne     24
      21: goto          26
      24: iconst_0
      25: ireturn
      26: iconst_1
      27: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        34
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/a/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #25                 // Field a:Ljava/lang/Integer;
      17: aload_1
      18: checkcast     #2                  // class ryey/easer/plugins/event/a/a
      21: getfield      #25                 // Field a:Ljava/lang/Integer;
      24: invokevirtual #73                 // Method java/lang/Integer.equals:(Ljava/lang/Object;)Z
      27: ifne          32
      30: iconst_0
      31: ireturn
      32: iconst_1
      33: ireturn
      34: iconst_0
      35: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #25                 // Field a:Ljava/lang/Integer;
       5: invokevirtual #66                 // Method java/lang/Integer.intValue:()I
       8: invokevirtual #79                 // Method android/os/Parcel.writeInt:(I)V
      11: return
}
