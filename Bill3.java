// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Ascend {
   public Ascend() {
   }

   public static void main(String[] var0) {
      int var1 = Integer.parseInt(var0[0]);
      int var2 = Integer.parseInt(var0[1]);
      int var3 = Integer.parseInt(var0[2]);
      int var4 = Math.min(var1, var2);
      var4 = Math.min(var4, var3);
      if (var4 == var1) {
         System.err.println("" + var1 + " " + Math.min(var2, var3) + " " + Math.max(var2, var3));
      } else if (var4 == var2) {
         System.err.println("" + var2 + " " + Math.min(var1, var3) + " " + Math.max(var1, var3));
      } else if (var4 == var3) {
         System.err.println("" + var3 + " " + Math.min(var1, var2) + " " + Math.max(var1, var2));
      }

   }
}
