public class ryey.easer.commons.local_plugin.b.b implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.commons.local_plugin.b.b> CREATOR;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/commons/local_plugin/b/b$1
       3: dup
       4: invokespecial #19                 // Method ryey/easer/commons/local_plugin/b/b$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public ryey.easer.commons.local_plugin.b.b();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #25                 // class java/util/HashMap
       8: dup
       9: invokespecial #26                 // Method java/util/HashMap."<init>":()V
      12: putfield      #28                 // Field a:Ljava/util/HashMap;
      15: return

  ryey.easer.commons.local_plugin.b.b(android.os.Parcel, ryey.easer.commons.local_plugin.b.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  public java.util.Map<java.lang.String, java.lang.String> a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/HashMap;
       4: areturn

  public ryey.easer.commons.local_plugin.b.c a(android.os.Bundle);
    Code:
       0: new           #25                 // class java/util/HashMap
       3: dup
       4: invokespecial #26                 // Method java/util/HashMap."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #28                 // Field a:Ljava/util/HashMap;
      12: invokevirtual #52                 // Method java/util/HashMap.keySet:()Ljava/util/Set;
      15: invokeinterface #58,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      20: astore_3
      21: aload_3
      22: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      27: ifeq          76
      30: aload_3
      31: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      36: checkcast     #70                 // class java/lang/String
      39: astore        4
      41: aload_1
      42: aload_0
      43: getfield      #28                 // Field a:Ljava/util/HashMap;
      46: aload         4
      48: invokevirtual #74                 // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      51: checkcast     #70                 // class java/lang/String
      54: invokevirtual #80                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      57: astore        5
      59: aload         5
      61: ifnull        21
      64: aload_2
      65: aload         4
      67: aload         5
      69: invokevirtual #84                 // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      72: pop
      73: goto          21
      76: new           #86                 // class ryey/easer/commons/local_plugin/b/c
      79: dup
      80: aload_2
      81: invokespecial #89                 // Method ryey/easer/commons/local_plugin/b/c."<init>":(Ljava/util/HashMap;)V
      84: areturn

  public void a(java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/HashMap;
       4: aload_1
       5: aload_2
       6: invokevirtual #84                 // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #28                 // Field a:Ljava/util/HashMap;
       5: invokevirtual #98                 // Method android/os/Parcel.writeMap:(Ljava/util/Map;)V
       8: return
}
