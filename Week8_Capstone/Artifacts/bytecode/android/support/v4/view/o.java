public class android.support.v4.view.o {
  public android.support.v4.view.o(android.view.ViewGroup);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/view/ViewGroup;
       9: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:I
       4: ireturn

  public void a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_0
       3: invokevirtual #23                 // Method a:(Landroid/view/View;I)V
       6: return

  public void a(android.view.View, int);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #19                 // Field b:I
       5: return

  public void a(android.view.View, android.view.View, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iconst_0
       5: invokevirtual #27                 // Method a:(Landroid/view/View;Landroid/view/View;II)V
       8: return

  public void a(android.view.View, android.view.View, int, int);
    Code:
       0: aload_0
       1: iload_3
       2: putfield      #19                 // Field b:I
       5: return
}
