using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UnidadResidencial.Interfaces;

namespace UnidadResidencial.Controladoras
{
    interface IControladora
    {
        void VerificarUsuario(String data);
        void Create(IModelo m);
        void Delete(IModelo m);
        void Modify(IModelo m);
        void Search(IModelo m);
    }
}
