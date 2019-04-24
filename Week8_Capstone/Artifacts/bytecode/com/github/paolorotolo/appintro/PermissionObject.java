public class com.github.paolorotolo.appintro.PermissionObject {
  java.lang.String[] permission;

  int position;

  public com.github.paolorotolo.appintro.PermissionObject(java.lang.String[], int);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field permission:[Ljava/lang/String;
       9: aload_0
      10: iload_2
      11: putfield      #17                 // Field position:I
      14: return

  public java.lang.String[] getPermission();
    Code:
       0: aload_0
       1: getfield      #15                 // Field permission:[Ljava/lang/String;
       4: areturn

  public int getPosition();
    Code:
       0: aload_0
       1: getfield      #17                 // Field position:I
       4: ireturn
}
