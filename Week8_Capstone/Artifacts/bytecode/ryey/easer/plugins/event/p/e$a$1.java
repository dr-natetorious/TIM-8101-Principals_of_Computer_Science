final class ryey.easer.plugins.event.p.e$a$1 implements android.os.Parcelable$Creator<ryey.easer.plugins.event.p.e$a> {
  ryey.easer.plugins.event.p.e$a$1();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: return

  public ryey.easer.plugins.event.p.e$a a(android.os.Parcel);
    Code:
       0: new           #9                  // class ryey/easer/plugins/event/p/e$a
       3: dup
       4: aload_1
       5: aconst_null
       6: invokespecial #21                 // Method ryey/easer/plugins/event/p/e$a."<init>":(Landroid/os/Parcel;Lryey/easer/plugins/event/p/e$1;)V
       9: areturn

  public ryey.easer.plugins.event.p.e$a[] a(int);
    Code:
       0: iload_1
       1: anewarray     #9                  // class ryey/easer/plugins/event/p/e$a
       4: areturn

  public java.lang.Object createFromParcel(android.os.Parcel);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #26                 // Method a:(Landroid/os/Parcel;)Lryey/easer/plugins/event/p/e$a;
       5: areturn

  public java.lang.Object[] newArray(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #30                 // Method a:(I)[Lryey/easer/plugins/event/p/e$a;
       5: areturn
}
