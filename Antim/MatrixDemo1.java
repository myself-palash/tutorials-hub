class Matrix
{
   int mat[][];
   Matrix(int k[][])
   {
     int i=0,j=0;
     int l=k.length;
     mat=new int [l][l];
     for(i=0;i<l;i++)
     {
       for(j=0;j<l;j++)
       {
         mat[i][j]=k[i][j];
       }
     }
   }

   Matrix(int k)
   {
     mat=new int[k][k];
   }
   Matrix(Matrix m)
   {
     mat=new int[m.mat.length][m.mat.length];
     int i,j;
     for(i=0;i<mat.length;i++)
     {
       for(j=0;j<mat.length;j++)
        {
          mat[i][j]=m.mat[i][j];
        }
      }
   }
   void setMatrix(int a[][])
   {
     int i,j;
     for(i=0;i<a.length;i++)
	{
 	  for(j=0;j<a.length;j++)
    {
      mat[i][j]=a[i][j];
    }
  }
}
int[][] getMatrix()
{
  return mat;
}
Matrix addMatrix(Matrix m)
{
  int i,j;
	Matrix q=new Matrix(m);
  for(i=0;i<m.mat.length;i++)
  {
	   for(j=0;j<m.mat.length;j++)
     {
       q.mat[i][j]=mat[i][j]+m.mat[i][j];
       System.out.print("\t"+q.mat[i][j]);
     }
     System.out.println("");
	}
  return q;
}
}
class MatrixDemo1
{
  public static void main(String args[])
   {
     int p[][];
     int b[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
     int n=3;
     Matrix m1=new Matrix(b);
     Matrix m2=new Matrix(m1);
     m2.setMatrix(b);
     Matrix m3=new Matrix(m2);
     p=m3.getMatrix();
     m3=m1.addMatrix(m2);
    }
}
