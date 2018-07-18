using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UnidadResidencial.Interfaces;

namespace UnidadResidencial
{
    [Serializable]
    class FalsoRepositorio
    {
        List<IModelo> unidades = new List<IModelo>();

        public FalsoRepositorio() {
            unidades.Add(new UnidadResidencial("A001", "Barrio Probre"));
            unidades.Add(new UnidadResidencial("A002", "Luces de tu casa"));
            unidades.Add(new UnidadResidencial("A003", "Nuevo Kongo"));
            unidades.Add(new UnidadResidencial("A004", "Don Ramon"));
        }


        public string[] Add(string id, string description) {
            UnidadResidencial u1 = new UnidadResidencial(id, description);
            this.unidades.Add(u1);
            return GetAll();
        }

        public UnidadResidencial Search(string id)
        {
            UnidadResidencial found = new UnidadResidencial();
            foreach (UnidadResidencial u in unidades)
            {
                if (u.id == id)
                {
                    found = u;
                }
            }
            return found;
        }

        public void Remove(string id) {
            UnidadResidencial remover = new UnidadResidencial();
            foreach (UnidadResidencial u in unidades) {
                if (u.id == id) {
                    remover = u;
                }
            }
            unidades.Remove(remover);
        }

        public string[] GetAll() {
            string[] cadena = new string[unidades.Count];
            int i = 0;
            foreach (UnidadResidencial u in unidades)
            {
                cadena[i] = u.id + " " + u.description;
                i++;
            }
            return cadena;
        }
    }
}
