using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UnidadResidencial.Interfaces;

namespace UnidadResidencial
{
    [Serializable]
    public class UnidadResidencial:IModelo
    {
        public string id { set; get;}
        public string description { set; get;}

        public UnidadResidencial() { }

        public UnidadResidencial(string id, string description) {
            this.id = id;
            this.description = description;
        }
    }
}
